<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="档案号" prop="fileNum">
        <el-input
          v-model="queryParams.fileNum"
          placeholder="请输入档案号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="姓名" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入姓名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!--      <el-form-item label="年龄" prop="age">
              <el-input
                v-model="queryParams.age"
                placeholder="请输入年龄"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="婚否" prop="marriage">
              <el-input
                v-model="queryParams.marriage"
                placeholder="请输入婚否"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="文化程度" prop="educa">
              <el-input
                v-model="queryParams.educa"
                placeholder="请输入文化程度"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="强制隔离戒毒开始日期" prop="startTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="queryParams.startTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择强制隔离戒毒开始日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="强制隔离戒毒结束日期" prop="endingTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="queryParams.endingTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择强制隔离戒毒结束日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="入所时间" prop="enterTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="queryParams.enterTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择入所时间">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="原居住地" prop="formerResidence">
              <el-input
                v-model="queryParams.formerResidence"
                placeholder="请输入原居住地"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="民族" prop="race">
              <el-input
                v-model="queryParams.race"
                placeholder="请输入民族"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="首次吸毒原因" prop="firstReason">
              <el-input
                v-model="queryParams.firstReason"
                placeholder="请输入首次吸毒原因"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="毒品种类" prop="drugType">
              <el-select v-model="queryParams.drugType" placeholder="请选择毒品种类" clearable size="small">
                <el-option
                  v-for="item in drugTypes"
                  :key="item.value"
                  :label="item.label" s
                  :value="item.value">
                </el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="使用方法" prop="usageMethod">
              <el-input
                v-model="queryParams.usageMethod"
                placeholder="请输入使用方法"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="是否共用注射器" prop="gyzhusheqi">
              <el-input
                v-model="queryParams.gyzhusheqi"
                placeholder="请输入是否共用注射器"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="乙肝筛查" prop="bScreening">
              <el-input
                v-model="queryParams.bScreening"
                placeholder="请输入乙肝筛查"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="丙肝筛查" prop="cScreening">
              <el-input
                v-model="queryParams.cScreening"
                placeholder="请输入丙肝筛查"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="性病筛查" prop="stdScreening">
              <el-input
                v-model="queryParams.stdScreening"
                placeholder="请输入性病筛查"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="艾滋病筛查" prop="aidsScreening">
              <el-input
                v-model="queryParams.aidsScreening"
                placeholder="请输入艾滋病筛查"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>
            <el-form-item label="备注" prop="remarks">
              <el-input
                v-model="queryParams.remarks"
                placeholder="请输入备注"
                clearable
                size="small"
                @keyup.enter.native="handleQuery"
              />
            </el-form-item>-->
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['healthrecords:chuanshai:add']"
        >新增
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['healthrecords:chuanshai:edit']"
        >修改
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['healthrecords:chuanshai:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleImport"
          v-hasPermi="['healthrecords:chuanshai:import']"
        >导入
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['healthrecords:chuanshai:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="chuanshaiList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="序号" align="center" prop="id"/>
      <el-table-column label="档案号" align="center" prop="fileNum">
        <template slot-scope="scope">
          <a @click="handleUpdate(scope.row)">{{scope.row.fileNum}}</a>
        </template>
      </el-table-column>
      <el-table-column label="姓名" align="center" prop="name"/>
      <el-table-column label="年龄" align="center" prop="age"/>
      <el-table-column label="婚否" align="center" prop="marriage"/>
      <el-table-column label="文化程度" align="center" prop="educa"/>
      <el-table-column label="强制隔离戒毒开始日期" align="center" prop="startTime" width="180">

      </el-table-column>
      <el-table-column label="强制隔离戒毒结束日期" align="center" prop="endingTime" width="180">

      </el-table-column>
      <el-table-column label="入所时间" align="center" prop="enterTime" width="180">

      </el-table-column>
      <el-table-column label="原居住地" align="center" prop="formerResidence"/>
      <el-table-column label="民族" align="center" prop="race"/>
      <el-table-column label="首次吸毒原因" align="center" prop="firstReason"/>
      <el-table-column label="毒品种类" align="center" prop="drugType"/>
      <el-table-column label="使用方法" align="center" prop="usageMethod"/>
      <el-table-column label="是否共用注射器" align="center" prop="gyzhusheqi"/>
      <el-table-column label="乙肝筛查" align="center" prop="bScreening"/>
      <el-table-column label="丙肝筛查" align="center" prop="cScreening"/>
      <el-table-column label="性病筛查" align="center" prop="stdScreening"/>
      <el-table-column label="艾滋病筛查" align="center" prop="aidsScreening"/>
      <el-table-column label="备注" align="center" prop="remarks"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['healthrecords:chuanshai:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['healthrecords:chuanshai:remove']"
          >删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改传染病筛选对话框 -->
    <el-dialog :title="title" :visible.sync="open" append-to-body>
      <el-row :gutter="20">
        <el-form ref="form" :model="form" :rules="rules" width="800px" label-width="80px">
          <el-col :span="6">
          </el-col>
          <el-col :span="6">
            <el-form-item label="档案号" prop="fileNum">
              <el-input v-model="form.fileNum" placeholder="请输入档案号"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="姓名" prop="name">
              <el-input v-model="form.name" placeholder="请输入姓名"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="年龄" prop="age">
              <el-input v-model="form.age" placeholder="请输入年龄"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="婚否" prop="marriage">
              <el-input v-model="form.marriage" placeholder="请输入婚否"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="文化程度" prop="educa">
              <el-input v-model="form.educa" placeholder="请输入文化程度"/>
            </el-form-item>
          </el-col>

          <el-col :span="24">
            <el-row :gutter="20">
              <el-col :span="12">
                <el-form-item label="强制隔离戒毒开始日期" prop="startTime" label-width="175px">
                  <el-date-picker clearable size="small" style="width: 200px"
                                  v-model="form.startTime"
                                  type="datetime"
                                  value-format="yyyy-MM-dd HH:mm:ss"
                                  placeholder="选择强制隔离戒毒开始日期">
                  </el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="强制隔离戒毒结束日期" prop="endingTime" label-width="175px">
                  <el-date-picker clearable size="small" style="width: 200px"
                                  v-model="form.endingTime"
                                  type="datetime"
                                  value-format="yyyy-MM-dd HH:mm:ss"
                                  placeholder="选择强制隔离戒毒结束日期">
                  </el-date-picker>
                </el-form-item>
              </el-col>
            </el-row>
          </el-col>

          <el-col :span="10">
            <el-form-item label="入所时间" prop="enterTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.enterTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择入所时间">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="原居住地" prop="formerResidence">
              <el-input v-model="form.formerResidence" placeholder="请输入原居住地"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="民族" prop="race">
              <el-input v-model="form.race" placeholder="请输入民族"/>
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-row :gutter="20">
              <el-col :span="8">
                <el-form-item label="首次吸毒原因" prop="firstReason" label-width="125px">
                  <el-input v-model="form.firstReason" placeholder="请输入首次吸毒原因"/>
                </el-form-item>
              </el-col>
              <el-col :span="6">
                <el-form-item label="毒品种类" prop="drugType">
                  <el-select v-model="form.drugType" placeholder="请选择毒品种类">
                    <el-option
                      v-for="item in drugTypes"
                      :key="item.value"
                      :label="item.label" s
                      :value="item.value">
                    </el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="6">
                <el-form-item label="使用方法" prop="usageMethod">
                  <el-input v-model="form.usageMethod" placeholder="请输入使用方法"/>
                </el-form-item>
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="6">
            <el-form-item label="是否共用注射器" prop="gyzhusheqi" label-width="125px">
              <el-input v-model="form.gyzhusheqi" placeholder="请输入是否共用注射器"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="乙肝筛查" prop="bScreening">
              <el-input v-model="form.bScreening" placeholder="请输入乙肝筛查"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="丙肝筛查" prop="cScreening">
              <el-input v-model="form.cScreening" placeholder="请输入丙肝筛查"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="性病筛查" prop="stdScreening">
              <el-input v-model="form.stdScreening" placeholder="请输入性病筛查"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="艾滋病筛查" prop="aidsScreening" label-width="125px">
              <el-input v-model="form.aidsScreening" placeholder="请输入艾滋病筛查"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="备注" prop="remarks">
              <el-input v-model="form.remarks" placeholder="请输入备注"/>
            </el-form-item>
          </el-col>
        </el-form>
      </el-row>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入传染病筛选对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px">
      <el-upload
        ref="upload"
        :limit="1"
        accept=".xlsx, .xls"
        :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport"
        :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress"
        :on-success="handleFileSuccess"
        :auto-upload="false"
        drag
      >
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">
          将文件拖到此处，或
          <em>点击上传</em>
        </div>
        <div class="el-upload__tip" slot="tip">
          <!--<el-checkbox v-model="upload.updateSupport"/>
          是否更新已经存在的用户数据-->
          <el-link type="info" style="font-size:12px" @click="importTemplate">下载模板</el-link>
        </div>
        <div class="el-upload__tip" style="color:red" slot="tip">提示：仅允许导入“xls”或“xlsx”格式文件！</div>
      </el-upload>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitFileForm">确 定</el-button>
        <el-button @click="upload.open = false">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import {
    listChuanshai,
    getChuanshai,
    delChuanshai,
    addChuanshai,
    updateChuanshai,
    exportChuanshai,
    importChuanshai
  } from '@/api/healthrecords/chuanshai'

  import { getToken } from '@/utils/auth'

  export default {
    name: 'Chuanshai',
    data() {
      return {
        // 遮罩层
        loading: true,
        // 选中数组
        ids: [],
        // 非单个禁用
        single: true,
        // 非多个禁用
        multiple: true,
        // 显示搜索条件
        showSearch: true,
        // 总条数
        total: 0,
        // 传染病筛选表格数据
        chuanshaiList: [],
        // 弹出层标题
        title: '',
        // 是否显示弹出层
        open: false,
        //单选参数
        drugTypes: [{
          value: '选项1',
          label: '1'
        }, {
          value: '选项2',
          label: '1'
        }]
        ,
        // 查询参数
        queryParams: {
          pageNum: 1,
          pageSize: 10,
          fileNum: null,
          name: null,
          age: null,
          marriage: null,
          educa: null,
          startTime: null,
          endingTime: null,
          enterTime: null,
          formerResidence: null,
          race: null,
          firstReason: null,
          drugType: null,
          usageMethod: null,
          gyzhusheqi: null,
          bScreening: null,
          cScreening: null,
          stdScreening: null,
          aidsScreening: null,
          remarks: null
        },
        // 表单参数
        form: {},
        // 表单校验
        rules: {},
        // 用户导入参数
        upload: {
          // 是否显示弹出层（用户导入）
          open: false,
          // 弹出层标题（用户导入）
          title: '',
          // 是否禁用上传
          isUploading: false,
          // 是否更新已经存在的用户数据
          updateSupport: 0,
          // 设置上传的请求头部
          headers: { Authorization: 'Bearer ' + getToken() },
          // 上传的地址
          url: process.env.VUE_APP_BASE_API + '/healthrecords/chuanshai/importData'
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      /** 查询传染病筛选列表 */
      getList() {
        this.loading = true
        listChuanshai(this.queryParams).then(response => {
          this.chuanshaiList = response.rows
          this.total = response.total
          this.loading = false
        })
      },
      // 取消按钮
      cancel() {
        this.open = false
        this.reset()
      },
      // 表单重置
      reset() {
        this.form = {
          id: null,
          fileNum: null,
          name: null,
          age: null,
          marriage: null,
          educa: null,
          startTime: null,
          endingTime: null,
          enterTime: null,
          formerResidence: null,
          race: null,
          firstReason: null,
          drugType: null,
          usageMethod: null,
          gyzhusheqi: null,
          bScreening: null,
          cScreening: null,
          stdScreening: null,
          aidsScreening: null,
          remarks: null
        }
        this.resetForm('form')
      },
      /** 搜索按钮操作 */
      handleQuery() {
        this.queryParams.pageNum = 1
        this.getList()
      },
      /** 重置按钮操作 */
      resetQuery() {
        this.resetForm('queryForm')
        this.handleQuery()
      },
      // 多选框选中数据
      handleSelectionChange(selection) {
        this.ids = selection.map(item => item.id)
        this.single = selection.length !== 1
        this.multiple = !selection.length
      },
      /** 新增按钮操作 */
      handleAdd() {
        this.reset()
        this.open = true
        this.title = '添加传染病筛选'
      },
      /** 修改按钮操作 */
      handleUpdate(row) {
        this.reset()
        const id = row.id || this.ids
        getChuanshai(id).then(response => {
          this.form = response.data
          this.open = true
          this.title = '修改传染病筛选'
        })
      },
      /** 提交按钮 */
      submitForm() {
        this.$refs['form'].validate(valid => {
          if (valid) {
            if (this.form.id != null) {
              updateChuanshai(this.form).then(response => {
                this.msgSuccess('修改成功')
                this.open = false
                this.getList()
              })
            } else {
              addChuanshai(this.form).then(response => {
                this.msgSuccess('新增成功')
                this.open = false
                this.getList()
              })
            }
          }
        })
      },
      /** 删除按钮操作 */
      handleDelete(row) {
        const ids = row.id || this.ids
        this.$confirm('是否确认删除传染病筛选编号为"' + ids + '"的数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return delChuanshai(ids)
        }).then(() => {
          this.getList()
          this.msgSuccess('删除成功')
        })
      },
      /** 导出按钮操作 */
      handleExport() {
        const queryParams = this.queryParams
        this.$confirm('是否确认导出所有传染病筛选数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return exportChuanshai(queryParams)
        }).then(response => {
          this.download(response.msg)
        })
      },
      /** 导入按钮操作 */
      handleImport() {
        this.upload.title = '用户导入'
        this.upload.open = true
      },
      /** 下载模板操作 */
      importTemplate() {
        importChuanshai().then(response => {
          this.download(response.msg)
        })
      },
      // 文件上传中处理
      handleFileUploadProgress(event, file, fileList) {
        this.upload.isUploading = true
      },
      // 文件上传成功处理
      handleFileSuccess(response, file, fileList) {
        this.upload.open = false
        this.upload.isUploading = false
        this.$refs.upload.clearFiles()
        this.$alert(response.msg, '导入结果', { dangerouslyUseHTMLString: true })
        this.getList()
      },
      // 提交上传文件
      submitFileForm() {
        this.$refs.upload.submit()
      }
    }
  }
</script>
