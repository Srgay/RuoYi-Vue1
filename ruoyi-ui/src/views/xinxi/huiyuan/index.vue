<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="姓名" prop="hname">
        <el-input
          v-model="queryParams.hname"
          placeholder="请输入姓名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户名" prop="husername">
        <el-input
          v-model="queryParams.husername"
          placeholder="请输入用户名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="密码" prop="hpassword">
        <el-input
          v-model="queryParams.hpassword"
          placeholder="请输入密码"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文理" prop="hwenli">
        <el-input
          v-model="queryParams.hwenli"
          placeholder="请输入文理"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="分数" prop="hfenshu">
        <el-input
          v-model="queryParams.hfenshu"
          placeholder="请输入分数"
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
          v-hasPermi="['xinxi:huiyuan:add']"
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
          v-hasPermi="['xinxi:huiyuan:edit']"
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
          v-hasPermi="['xinxi:huiyuan:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleImport"
          v-hasPermi="['xinxi:huiyuan:import']"
        >导入
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['xinxi:huiyuan:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="huiyuanList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="id" align="center" prop="hid"/>
      <el-table-column label="姓名" align="center" prop="hname"/>
      <el-table-column label="用户名" align="center" prop="husername"/>
      <el-table-column label="密码" align="center" prop="hpassword"/>
      <el-table-column label="文理" align="center" prop="hwenli"/>
      <el-table-column label="分数" align="center" prop="hfenshu"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['xinxi:huiyuan:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['xinxi:huiyuan:remove']"
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

    <!-- 添加或修改会员信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-row :gutter="40">
        <el-form ref="form" :model="form" :rules="rules" label-width="80px">
          <el-col :span="15">
          </el-col>
          <el-col :span="15">
            <el-form-item label="姓名" prop="hname">
              <el-input v-model="form.hname" placeholder="请输入姓名"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="用户名" prop="husername">
              <el-input v-model="form.husername" placeholder="请输入用户名"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="密码" prop="hpassword">
              <el-input v-model="form.hpassword" placeholder="请输入密码"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="文理" prop="hwenli">
              <el-input v-model="form.hwenli" placeholder="请输入文理"/>
            </el-form-item>
          </el-col>
          <el-col :span="15">
            <el-form-item label="分数" prop="hfenshu">
              <el-input v-model="form.hfenshu" placeholder="请输入分数"/>
            </el-form-item>
          </el-col>
        </el-form>
      </el-row>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入会员信息对话框 -->
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
        listHuiyuan,
        getHuiyuan,
        delHuiyuan,
        addHuiyuan,
        updateHuiyuan,
        exportHuiyuan,
        importHuiyuan
    } from "@/api/xinxi/huiyuan";

    import {getToken} from "@/utils/auth";

    export default {
        name: "Huiyuan",
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
                // 会员信息表格数据
                huiyuanList: [],
                // 弹出层标题
                title: "",
                // 是否显示弹出层
                open: false,
                // 查询参数
                queryParams: {
                    pageNum: 1,
                    pageSize: 10,
                    hname: null,
                    husername: null,
                    hpassword: null,
                    hwenli: null,
                    hfenshu: null
                },
                // 表单参数
                form: {},
                // 表单校验
                rules: {
                    hwenli: [
                        {required: true, message: "文理不能为空", trigger: "blur"}
                    ],
                    hfenshu: [
                        {required: true, message: "分数不能为空", trigger: "blur"}
                    ]
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
                    url: process.env.VUE_APP_BASE_API + "/xinxi/huiyuan/importData"
                },
            };
        },
        created() {
            this.getList();
        },
        methods: {
            /** 查询会员信息列表 */
            getList() {
                this.loading = true;
                listHuiyuan(this.queryParams).then(response => {
                    this.huiyuanList = response.rows;
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
                    hid: null,
                    hname: null,
                    husername: null,
                    hpassword: null,
                    hwenli: null,
                    hfenshu: null
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
                this.ids = selection.map(item => item.hid)
                this.single = selection.length !== 1
                this.multiple = !selection.length
            },
            /** 新增按钮操作 */
            handleAdd() {
                this.reset();
                this.open = true;
                this.title = "添加会员信息";
            },
            /** 修改按钮操作 */
            handleUpdate(row) {
                this.reset();
                const hid = row.hid || this.ids
                getHuiyuan(hid).then(response => {
                    this.form = response.data;
                    this.open = true;
                    this.title = "修改会员信息";
                });
            },
            /** 提交按钮 */
            submitForm() {
                this.$refs["form"].validate(valid => {
                    if (valid) {
                        if (this.form.hid != null) {
                            updateHuiyuan(this.form).then(response => {
                                this.msgSuccess("修改成功");
                                this.open = false;
                                this.getList();
                            });
                        } else {
                            addHuiyuan(this.form).then(response => {
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
                const hids = row.hid || this.ids;
                this.$confirm('是否确认删除会员信息编号为"' + hids + '"的数据项?', "警告", {
                    confirmButtonText: "确定",
                    cancelButtonText: "取消",
                    type: "warning"
                }).then(function () {
                    return delHuiyuan(hids);
                }).then(() => {
                    this.getList();
                    this.msgSuccess("删除成功");
                })
            },
            /** 导出按钮操作 */
            handleExport() {
                const queryParams = this.queryParams;
                this.$confirm('是否确认导出所有会员信息数据项?', "警告", {
                    confirmButtonText: "确定",
                    cancelButtonText: "取消",
                    type: "warning"
                }).then(function () {
                    return exportHuiyuan(queryParams);
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
                importHuiyuan().then(response => {
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
