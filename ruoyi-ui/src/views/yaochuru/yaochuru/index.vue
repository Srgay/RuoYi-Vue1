<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="年月日" prop="date">
        <el-date-picker clearable size="small" style="width: 200px"
                        v-model="queryParams.date"
                        type="datetime"
                        value-format="yyyy-MM-dd HH:mm:ss"
                        placeholder="选择年月日">
        </el-date-picker>
      </el-form-item>
      <!-- <el-form-item label="年月日" prop="time">
         <el-date-picker clearable size="small" style="width: 200px"
                         v-model="queryParams.time"
                         type="datetime"
                         value-format="yyyy-MM-dd HH:mm:ss"
                         placeholder="选择年月日">
         </el-date-picker>
       </el-form-item>-->
      <el-form-item label="药品名称" prop="yname">
        <el-input
          v-model="queryParams.yname"
          placeholder="请输入药品名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单位" prop="company">
        <el-input
          v-model="queryParams.company"
          placeholder="请输入单位"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数量" prop="numbers">
        <el-input
          v-model="queryParams.numbers"
          placeholder="请输入数量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单价" prop="price">
        <el-input
          v-model="queryParams.price"
          placeholder="请输入单价"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="总价" prop="total">
        <el-input
          v-model="queryParams.total"
          placeholder="请输入总价"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="remakes">
        <el-input
          v-model="queryParams.remakes"
          placeholder="请输入备注"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="合计" prop="allTotal">
        <el-input
          v-model="queryParams.allTotal"
          placeholder="请输入合计"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="经办人" prop="agent">
        <el-input
          v-model="queryParams.agent"
          placeholder="请输入经办人"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="审核人" prop="reviewer">
        <el-input
          v-model="queryParams.reviewer"
          placeholder="请输入审核人"
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
          v-hasPermi="['yaochuru:yaochuru:add']"
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
          v-hasPermi="['yaochuru:yaochuru:edit']"
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
          v-hasPermi="['yaochuru:yaochuru:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleImport"
          v-hasPermi="['yaochuru:yaochuru:import']"
        >导入
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['yaochuru:yaochuru:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="yaochuruList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="序号" align="center" prop="id">
        <template slot-scope="scope">
          <a @click="handleUpdate(scope.row)">{{scope.row.id}}</a>
        </template>
      </el-table-column>
      <el-table-column label="年月日" align="center" prop="date" width="200px">

      </el-table-column>
      <!--<el-table-column label="年月日" align="center" prop="time" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.time, '{y}-{m}-{d} {HH}:{mm}:{ss}') }}</span>
        </template>
      </el-table-column>-->
      <el-table-column label="药品名称" align="center" prop="yname"/>
      <el-table-column label="单位" align="center" prop="company"/>
      <el-table-column label="数量" align="center" prop="numbers"/>
      <el-table-column label="单价" align="center" prop="price"/>
      <el-table-column label="总价" align="center" prop="total"/>
      <el-table-column label="备注" align="center" prop="remakes"/>
      <el-table-column label="合计" align="center" prop="allTotal"/>
      <el-table-column label="经办人" align="center" prop="agent"/>
      <el-table-column label="审核人" align="center" prop="reviewer"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['yaochuru:yaochuru:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['yaochuru:yaochuru:remove']"
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

    <!-- 添加或修改药品出入库对话框 -->
    <el-dialog :title="title" :visible.sync="open" append-to-body>
      <el-row :gutter="20">
        <el-form ref="form" :model="form" :rules="rules" width="800px" label-width="80px">
          <el-col :span="6">
          </el-col>
          <el-col :span="12">
            <el-form-item label="年月日" prop="date">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.date"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择年月日">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <!--<el-col :span="6">
                  <el-form-item label="年月日" prop="time">
                    <el-date-picker clearable size="small" style="width: 200px"
                      v-model="form.time"
                      type="datetime"
                      value-format="yyyy-MM-dd HH:mm:ss"
                      placeholder="选择年月日">
                    </el-date-picker>
                  </el-form-item>
          </el-col>-->
          <el-col :span="6">
            <el-form-item label="药品名称" prop="yname">
              <el-input v-model="form.yname" placeholder="请输入药品名称"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="单位" prop="company">
              <el-input v-model="form.company" placeholder="请输入单位"/>
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-row :gutter="20">
              <el-col :span="6">
                <el-form-item label="数量" prop="numbers">
                  <el-input v-model="form.numbers" placeholder="请输入数量" @change="form.total=form.numbers*form.price"/>
                </el-form-item>
              </el-col>
              <el-col :span="6">
                <el-form-item label="单价" prop="price">
                  <el-input v-model="form.price" placeholder="请输入单价" @change="form.total=form.numbers*form.price"/>
                </el-form-item>
              </el-col>
              <el-col :span="6">
                <el-form-item label="总价" prop="total">
                  <el-input v-model="form.total" placeholder="请输入总价"/>
                </el-form-item>
              </el-col>
            </el-row>
          </el-col>

          <el-col :span="6">
            <el-form-item label="备注" prop="remakes">
              <el-input v-model="form.remakes" placeholder="请输入备注"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="合计" prop="allTotal">
              <el-input v-model="form.allTotal" placeholder="请输入合计"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="经办人" prop="agent">
              <el-input v-model="form.agent" placeholder="请输入经办人"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="审核人" prop="reviewer">
              <el-input v-model="form.reviewer" placeholder="请输入审核人"/>
            </el-form-item>
          </el-col>
        </el-form>
      </el-row>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入药品出入库对话框 -->
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
    listYaochuru,
    getYaochuru,
    delYaochuru,
    addYaochuru,
    updateYaochuru,
    exportYaochuru,
    importYaochuru
  } from '@/api/yaochuru/yaochuru'
  import { getToken } from '@/utils/auth'

  export default {
    name: 'Yaochuru',
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
        // 药品出入库表格数据
        yaochuruList: [],
        // 弹出层标题
        title: '',
        // 是否显示弹出层
        open: false,
        // 查询参数
        queryParams: {
          pageNum: 1,
          pageSize: 10,
          date: null,
          time: null,
          yname: null,
          company: null,
          numbers: null,
          price: null,
          total: null,
          remakes: null,
          allTotal: null,
          agent: null,
          reviewer: null
        },
        // 表单参数
        form: {
          total :1,
          numbers:1,
          price: 1

        },
        // 表单校验
        rules: {}
        ,
        // 用户导入参数
        upload: {
          // 是否显示弹出层（用户导入）
          open: false,
          // 弹出层标题（用户导入）
          title:
            '',
          // 是否禁用上传
          isUploading:
            false,
          // 是否更新已经存在的用户数据
          updateSupport:
            0,
          // 设置上传的请求头部
          headers:
            {
              Authorization: 'Bearer ' + getToken()
            }
          ,
          // 上传的地址
          url: process.env.VUE_APP_BASE_API + '/yaochuru/yaochuru/importData'
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      /** 查询药品出入库列表 */
      getList() {
        this.loading = true
        listYaochuru(this.queryParams).then(response => {
          this.yaochuruList = response.rows
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
          date: null,
          time: null,
          yname: null,
          company: null,
          numbers: null,
          price: null,
          total: null,
          remakes: null,
          allTotal: null,
          agent: null,
          reviewer: null
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
        this.title = '添加药品出入库'
      },
      /** 修改按钮操作 */
      handleUpdate(row) {
        this.reset()
        const id = row.id || this.ids
        getYaochuru(id).then(response => {
          this.form = response.data
          this.open = true
          this.title = '修改药品出入库'
        })
      },
      /** 提交按钮 */
      submitForm() {
        this.$refs['form'].validate(valid => {
          if (valid) {
            if (this.form.id != null) {
              updateYaochuru(this.form).then(response => {
                this.msgSuccess('修改成功')
                this.open = false
                this.getList()
              })
            } else {
              addYaochuru(this.form).then(response => {
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
        this.$confirm('是否确认删除药品出入库编号为"' + ids + '"的数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return delYaochuru(ids)
        }).then(() => {
          this.getList()
          this.msgSuccess('删除成功')
        })
      },
      /** 导出按钮操作 */
      handleExport() {
        const queryParams = this.queryParams
        this.$confirm('是否确认导出所有药品出入库数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return exportYaochuru(queryParams)
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
        importSpeechTemplate().then(response => {
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
      },
    }
  }
</script>
