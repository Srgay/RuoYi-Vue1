package com.ruoyi.common.utils.poi;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.apache.commons.collections4.Get;
import org.apache.commons.io.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class WordUtil<T> extends ExcelUtil<T> {
    private static final Logger log = LoggerFactory.getLogger(WordUtil.class);
    /**
     * 导入导出数据列表
     */
    private List<T> list;

    /**
     * 注解列表
     */
    private List<Object[]> fields;

    private String wordName;

    private String mainFilePath;

    public WordUtil(Class<T> clazz) {
        super(clazz);
    }

    public AjaxResult exportWord(List<T> list, String sheetName, String mainFilePath) throws FileNotFoundException {
        init(list, sheetName, Excel.Type.EXPORT);
        this.mainFilePath = getAbsoluteFile(mainFilePath);
        return exportWord();
    }

    /**
     * 对list数据源将其里面的数据导入到Word表单
     *
     * @return 结果
     */
    public AjaxResult exportWord() throws FileNotFoundException {
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(getAbsoluteFile(encodingFilename("word"))));
        try {
            // 取出一共有多少个sheet.
            for (int index = 0; index <= list.size(); index++) {
                XWPFDocument word = createWord(mainFilePath);
                Map map = new HashMap();
                T vo = (T) list.get(index);
                // 字段转换map
                for (Object[] os : fields) {
                    Field field = (Field) os[0];
                    Excel excel = (Excel) os[1];
                    // 设置实体类私有属性可访问
                    field.setAccessible(true);
                    addMap(excel, vo, field, map);
                }
                fillWordData(word, map);
                String filename = encodingFilename(list.get(index));
                //OutputStream dest = new FileOutputStream(getAbsoluteFile(filename));
                zip.putNextEntry(new ZipEntry(filename));
                BufferedOutputStream bos=new BufferedOutputStream(zip);
                word.write(zip);
                word.close();
                //dest.close();
            }
            String filename = encodingFilename(wordName);
            zip.close();
            return AjaxResult.success(filename);
        } catch (Exception e) {
            log.error("导出Excel异常{}", e.getMessage());
            throw new CustomException("导出Excel失败，请联系网站管理员！");
        } finally {
            if (zip != null) {
                IOUtils.closeQuietly(zip);
            }
        }
    }

    private String encodingFilename(T t) {
        String name = "";
        try {
            name = (String) clazz.getDeclaredField("name").get(t);
        } catch (Exception e) {
            try {
                name = (String) clazz.getDeclaredField("fileNum;").get(t);
            } catch (Exception e1) {
                try {
                    name = (String) clazz.getDeclaredField("id").get(t);
                } catch (Exception e2) {

                }
            }
        }
        String filename = UUID.randomUUID().toString() + "_" + name + ".docx";
        return filename;
    }

    private void fillWordData(XWPFDocument word, Map map) {

    }

    private XWPFDocument createWord(String mainFilePath) throws IOException, InvalidFormatException {
        File mainFile = new File(mainFilePath);
        InputStream in = new FileInputStream(mainFile);
        OPCPackage srcPackage = OPCPackage.open(in);
        XWPFDocument doc = new XWPFDocument(srcPackage);
        return doc;
    }

    private void addMap(Excel attr, T vo, Field field, Map map) throws Exception {
        // 根据Excel中设置情况决定是否导出,有些情况需要保持为空,希望用户填写这一列.
        if (attr.isExport()) {
            // 用于读取对象中的属性
            Object value = getTargetValue(vo, field, attr);
            String dateFormat = attr.dateFormat();
            String readConverterExp = attr.readConverterExp();
            String separator = attr.separator();
            String dictType = attr.dictType();
            if (StringUtils.isNotEmpty(dateFormat) && StringUtils.isNotNull(value)) {
                map.put(attr.name(), DateUtils.parseDateToStr(dateFormat, (Date) value));
            } else if (StringUtils.isNotEmpty(readConverterExp) && StringUtils.isNotNull(value)) {
                map.put(attr.name(), convertByExp(Convert.toStr(value), readConverterExp, separator));
            } else if (StringUtils.isNotEmpty(dictType) && StringUtils.isNotNull(value)) {
                map.put(attr.name(), convertDictByExp(Convert.toStr(value), dictType, separator));
            } else if (value instanceof BigDecimal && -1 != attr.scale()) {
                map.put(attr.name(), (((BigDecimal) value).setScale(attr.scale(), attr.roundingMode())).toString());
            } else {
                // 设置列类型
                map.put(attr.name(), value);
            }
        }
    }


}
