<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="学校名称" prop="xname">
        <el-input
          v-model="queryParams.xname"
          placeholder="请输入学校名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地区" prop="xdiqu">
        <el-input
          v-model="queryParams.xdiqu"
          placeholder="请输入地区"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="类型" prop="xleixing">
        <el-input
          v-model="queryParams.xleixing"
          placeholder="请输入类型"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="理科分数" prop="xlike">
        <el-input
          v-model="queryParams.xlike"
          placeholder="请输入理科分数"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文科分数" prop="xwenke">
        <el-input
          v-model="queryParams.xwenke"
          placeholder="请输入文科分数"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="理科最低分" prop="xllow">
        <el-input
          v-model="queryParams.xllow"
          placeholder="请输入理科最低分"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="理科最高分" prop="xlhigh">
        <el-input
          v-model="queryParams.xlhigh"
          placeholder="请输入理科最高分"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文科最低分" prop="xwlow">
        <el-input
          v-model="queryParams.xwlow"
          placeholder="请输入文科最低分"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文科最高分" prop="xwhigh">
        <el-input
          v-model="queryParams.xwhigh"
          placeholder="请输入文科最高分"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
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
          v-hasPermi="['xinxi:xuexiao:add']"
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
          v-hasPermi="['xinxi:xuexiao:edit']"
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
          v-hasPermi="['xinxi:xuexiao:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleImport"
          v-hasPermi="['xinxi:xuexiao:import']"
        >导入
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['xinxi:xuexiao:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="xuexiaoList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="id" align="center" prop="xid"/>
      <el-table-column label="学校名称" align="center" prop="xname"/>
      <el-table-column label="地区" align="center" prop="xdiqu"/>
      <el-table-column label="类型" align="center" prop="xleixing"/>
      <el-table-column label="理科分数" align="center" prop="xlike"/>
      <el-table-column label="文科分数" align="center" prop="xwenke"/>
      <el-table-column label="理科最低分" align="center" prop="xllow"/>
      <el-table-column label="理科最高分" align="center" prop="xlhigh"/>
      <el-table-column label="文科最低分" align="center" prop="xwlow"/>
      <el-table-column label="文科最高分" align="center" prop="xwhigh"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['xinxi:xuexiao:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['xinxi:xuexiao:remove']"
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

    <!-- 添加或修改学校信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-row :gutter="40">
        <el-form ref="form" :model="form" :rules="rules" label-width="80px">
          <el-col :span="15">
          </el-col>
          <el-col :span="15">
            <el-form-item label="学校名称" prop="xname">
              <el-input v-model="form.xname" placeholder="请输入学校名称"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="地区" prop="xdiqu">
              <el-input v-model="form.xdiqu" placeholder="请输入地区"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="类型" prop="xleixing">
              <el-input v-model="form.xleixing" placeholder="请输入类型"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="理科分数" prop="xlike">
              <el-input v-model="form.xlike" placeholder="请输入理科分数"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="文科分数" prop="xwenke">
              <el-input v-model="form.xwenke" placeholder="请输入文科分数"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="理科最低分" prop="xllow">
              <el-input v-model="form.xllow" placeholder="请输入理科最低分"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="理科最高分" prop="xlhigh">
              <el-input v-model="form.xlhigh" placeholder="请输入理科最高分"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="文科最低分" prop="xwlow">
              <el-input v-model="form.xwlow" placeholder="请输入文科最低分"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="文科最高分" prop="xwhigh">
              <el-input v-model="form.xwhigh" placeholder="请输入文科最高分"/>
            </el-form-item>
          </el-col>
        </el-form>
      </el-row>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入学校信息对话框 -->
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
        listXuexiao,
        getXuexiao,
        delXuexiao,
        addXuexiao,
        updateXuexiao,
        exportXuexiao,
        importXuexiao
    } from "@/api/xinxi/xuexiao";

    import {getToken} from "@/utils/auth";

    export default {
        name: "Xuexiao",
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
                // 学校信息表格数据
                xuexiaoList: [],
                // 弹出层标题
                title: "",
                // 是否显示弹出层
                open: false,
                // 查询参数
                queryParams: {
                    pageNum: 1,
                    pageSize: 10,
                    xname: null,
                    xdiqu: null,
                    xleixing: null,
                    xlike: null,
                    xwenke: null,
                    xllow: null,
                    xlhigh: null,
                    xwlow: null,
                    xwhigh: null
                },
                // 表单参数
                form: {},
                // 表单校验
                rules: {
                    xllow: [
                        {required: true, message: "理科最低分不能为空", trigger: "blur"}
                    ],
                },
                // 用户导入参数
                upload: {
                    // 是否显示弹出层（用户导入）
                    open: false,
                    // 弹出层标题（用户导入）
                    title: "",
                    // 是否禁用上传
                    isUploading: false,
                    // 是否更新已经存在的用户数据
                    updateSupport: 0,
                    // 设置上传的请求头部
                    headers: {Authorization: "Bearer " + getToken()},
                    // 上传的地址
                    url: process.env.VUE_APP_BASE_API + "/xinxi/xuexiao/importData"
                },
            };
        },
        created() {
            this.getList();
        },
        methods: {
            /** 查询学校信息列表 */
            getList() {
                this.loading = true;
                listXuexiao(this.queryParams).then(response => {
                    this.xuexiaoList = response.rows;
                    this.total = response.total;
                    this.loading = false;
                });
            },
            // 取消按钮
            cancel() {
                this.open = false;
                this.reset();
            },
            // 表单重置
            reset() {
                this.form = {
                    xid: null,
                    xname: null,
                    xdiqu: null,
                    xleixing: null,
                    xlike: null,
                    xwenke: null,
                    xllow: null,
                    xlhigh: null,
                    xwlow: null,
                    xwhigh: null
                };
                this.resetForm("form");
            },
            /** 搜索按钮操作 */
            handleQuery() {
                this.queryParams.pageNum = 1;
                this.getList();
            },
            /** 重置按钮操作 */
            resetQuery() {
                this.resetForm("queryForm");
                this.handleQuery();
            },
            // 多选框选中数据
            handleSelectionChange(selection) {
                this.ids = selection.map(item => item.xid)
                this.single = selection.length !== 1
                this.multiple = !selection.length
            },
            /** 新增按钮操作 */
            handleAdd() {
                this.reset();
                this.open = true;
                this.title = "添加学校信息";
            },
            /** 修改按钮操作 */
            handleUpdate(row) {
                this.reset();
                const xid = row.xid || this.ids
                getXuexiao(xid).then(response => {
                    this.form = response.data;
                    console.log(response.data);
                    console.log(this.form);
                    this.open = true;
                    this.title = "修改学校信息";
                });
            },
            /** 提交按钮 */
            submitForm() {
                this.$refs["form"].validate(valid => {
                    if (valid) {
                        if (this.form.xid != null) {
                            updateXuexiao(this.form).then(response => {
                                this.msgSuccess("修改成功");
                                this.open = false;
                                this.getList();
                            });
                        } else {
                            addXuexiao(this.form).then(response => {
                                this.msgSuccess("新增成功");
                                this.open = false;
                                this.getList();
                            });
                        }
                    }
                });
            },
            /** 删除按钮操作 */
            handleDelete(row) {
                const xids = row.xid || this.ids;
                this.$confirm('是否确认删除学校信息编号为"' + xids + '"的数据项?', "警告", {
                    confirmButtonText: "确定",
                    cancelButtonText: "取消",
                    type: "warning"
                }).then(function () {
                    return delXuexiao(xids);
                }).then(() => {
                    this.getList();
                    this.msgSuccess("删除成功");
                })
            },
            /** 导出按钮操作 */
            handleExport() {
                const queryParams = this.queryParams;
                this.$confirm('是否确认导出所有学校信息数据项?', "警告", {
                    confirmButtonText: "确定",
                    cancelButtonText: "取消",
                    type: "warning"
                }).then(function () {
                    return exportXuexiao(queryParams);
                }).then(response => {
                    this.download(response.msg);
                })
            },
            /** 导入按钮操作 */
            handleImport() {
                this.upload.title = "用户导入";
                this.upload.open = true;
            },
            /** 下载模板操作 */
            importTemplate() {
                importXuexiao().then(response => {
                    this.download(response.msg);
                });
            },
            // 文件上传中处理
            handleFileUploadProgress(event, file, fileList) {
                this.upload.isUploading = true;
            },
            // 文件上传成功处理
            handleFileSuccess(response, file, fileList) {
                this.upload.open = false;
                this.upload.isUploading = false;
                this.$refs.upload.clearFiles();
                this.$alert(response.msg, "导入结果", {dangerouslyUseHTMLString: true});
                this.getList();
            },
            // 提交上传文件
            submitFileForm() {
                this.$refs.upload.submit();
            }
        }
    };
</script>
