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
      <!--<el-form-item label="年龄" prop="age">
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
      <el-form-item label="文化程度" prop="education">
        <el-input
          v-model="queryParams.education"
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
      <el-form-item label="吸食毒品种类" prop="drugType">
        <el-input
          v-model="queryParams.drugType"
          placeholder="请输入吸食毒品种类"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
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
      <el-form-item label="入所后曾患何种疾病及治疗情况" prop="treatment">
        <el-input
          v-model="queryParams.treatment"
          placeholder="请输入入所后曾患何种疾病及治疗情况"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="身高" prop="height">
        <el-input
          v-model="queryParams.height"
          placeholder="请输入身高"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="体重" prop="weight">
        <el-input
          v-model="queryParams.weight"
          placeholder="请输入体重"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="血压" prop="bloodPressure">
        <el-input
          v-model="queryParams.bloodPressure"
          placeholder="请输入血压"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发育" prop="development">
        <el-input
          v-model="queryParams.development"
          placeholder="请输入发育"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="神智" prop="mind">
        <el-input
          v-model="queryParams.mind"
          placeholder="请输入神智"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="语言" prop="language">
        <el-input
          v-model="queryParams.language"
          placeholder="请输入语言"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="应答" prop="answer">
        <el-input
          v-model="queryParams.answer"
          placeholder="请输入应答"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="步态" prop="gait">
        <el-input
          v-model="queryParams.gait"
          placeholder="请输入步态"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="皮肤粘膜" prop="skinMucous">
        <el-input
          v-model="queryParams.skinMucous"
          placeholder="请输入皮肤粘膜"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="淋巴结" prop="lymphGland">
        <el-input
          v-model="queryParams.lymphGland"
          placeholder="请输入淋巴结"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="头面部" prop="headFace">
        <el-input
          v-model="queryParams.headFace"
          placeholder="请输入头面部"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="颈部" prop="neck">
        <el-input
          v-model="queryParams.neck"
          placeholder="请输入颈部"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="胸廓" prop="chest">
        <el-input
          v-model="queryParams.chest"
          placeholder="请输入胸廓"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="心脏" prop="heart">
        <el-input
          v-model="queryParams.heart"
          placeholder="请输入心脏"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="肺" prop="lung">
        <el-input
          v-model="queryParams.lung"
          placeholder="请输入肺"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="腹部" prop="abdomen">
        <el-input
          v-model="queryParams.abdomen"
          placeholder="请输入腹部"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="脊柱" prop="spine">
        <el-input
          v-model="queryParams.spine"
          placeholder="请输入脊柱"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="四肢" prop="limb">
        <el-input
          v-model="queryParams.limb"
          placeholder="请输入四肢"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="神经系统" prop="nervousSystem">
        <el-input
          v-model="queryParams.nervousSystem"
          placeholder="请输入神经系统"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="视力" prop="vision">
        <el-input
          v-model="queryParams.vision"
          placeholder="请输入视力"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="听力" prop="hearing">
        <el-input
          v-model="queryParams.hearing"
          placeholder="请输入听力"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="龋齿" prop="toothDecay">
        <el-input
          v-model="queryParams.toothDecay"
          placeholder="请输入龋齿"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="脱落" prop="fallOff">
        <el-input
          v-model="queryParams.fallOff"
          placeholder="请输入脱落"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="其他体检内容 	" prop="otherPE">
        <el-input
          v-model="queryParams.otherPE"
          placeholder="请输入其他体检内容 	"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="结论" prop="conclusion">
        <el-input
          v-model="queryParams.conclusion"
          placeholder="请输入结论"
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
      </el-form-item>
      -->
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
          v-hasPermi="['healthrecords:healthout:add']"
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
          v-hasPermi="['healthrecords:healthout:edit']"
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
          v-hasPermi="['healthrecords:healthout:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleImport"
          v-hasPermi="['healthrecords:healthout:import']"
        >导入
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['healthrecords:healthout:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="healthoutList" @selection-change="handleSelectionChange">
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
      <el-table-column label="文化程度" align="center" prop="education"/>
      <el-table-column label="强制隔离戒毒开始日期" align="center" prop="startTime" width="180">
      </el-table-column>
      <el-table-column label="强制隔离戒毒结束日期" align="center" prop="endingTime" width="180">
      </el-table-column>
      <el-table-column label="入所时间" align="center" prop="enterTime" width="180">
      </el-table-column>
      <el-table-column label="吸食毒品种类" align="center" prop="drugType"/>
      <el-table-column label="原居住地" align="center" prop="formerResidence"/>
      <el-table-column label="入所后曾患何种疾病及治疗情况" align="center" prop="treatment"/>
      <el-table-column label="身高" align="center" prop="height"/>
      <el-table-column label="体重" align="center" prop="weight"/>
      <el-table-column label="血压" align="center" prop="bloodPressure"/>
      <el-table-column label="发育" align="center" prop="development"/>
      <el-table-column label="神智" align="center" prop="mind"/>
      <el-table-column label="语言" align="center" prop="language"/>
      <el-table-column label="应答" align="center" prop="answer"/>
      <el-table-column label="步态" align="center" prop="gait"/>
      <el-table-column label="皮肤粘膜" align="center" prop="skinMucous"/>
      <el-table-column label="淋巴结" align="center" prop="lymphGland"/>
      <el-table-column label="头面部" align="center" prop="headFace"/>
      <el-table-column label="颈部" align="center" prop="neck"/>
      <el-table-column label="胸廓" align="center" prop="chest"/>
      <el-table-column label="心脏" align="center" prop="heart"/>
      <el-table-column label="肺" align="center" prop="lung"/>
      <el-table-column label="腹部" align="center" prop="abdomen"/>
      <el-table-column label="脊柱" align="center" prop="spine"/>
      <el-table-column label="四肢" align="center" prop="limb"/>
      <el-table-column label="神经系统" align="center" prop="nervousSystem"/>
      <el-table-column label="视力" align="center" prop="vision"/>
      <el-table-column label="听力" align="center" prop="hearing"/>
      <el-table-column label="龋齿" align="center" prop="toothDecay"/>
      <el-table-column label="脱落" align="center" prop="fallOff"/>
      <el-table-column label="其他体检内容 	" align="center" prop="otherPE"/>
      <el-table-column label="结论" align="center" prop="conclusion"/>
      <el-table-column label="备注" align="center" prop="remarks"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['healthrecords:healthout:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['healthrecords:healthout:remove']"
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

    <!-- 添加或修改出所健康状况对话框 -->
    <el-dialog :title="title" :visible.sync="open" append-to-body>
      <el-row :gutter="20">
        <el-form ref="form" :model="form" :rules="rules" width="800px" label-width="80px">

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
            <el-form-item label="文化程度" prop="education">
              <el-input v-model="form.education" placeholder="请输入文化程度"/>
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-row gutter="20">
              <el-col :span="10">
                <el-form-item label="强制隔离戒毒开始日期" prop="startTime" label-width="175px">
                  <el-date-picker clearable size="small" style="width: 200px"
                                  v-model="form.startTime"
                                  type="datetime"
                                  value-format="yyyy-MM-dd HH:mm:ss"
                                  placeholder="选择强制隔离戒毒开始日期">
                  </el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="10">
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
          <el-col :span="24">
            <el-row :gutter="20">
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
                <el-form-item label="吸食毒品种类" prop="drugType" label-width="100px">
                  <el-input v-model="form.drugType" placeholder="请输入吸食毒品种类"/>
                </el-form-item>
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="24">
            <el-row :gutter="20">
              <el-col :span="6">
                <el-form-item label="原居住地" prop="formerResidence">
                  <el-input v-model="form.formerResidence" placeholder="请输入原居住地"/>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入所后曾患何种疾病及治疗情况" prop="treatment" label-width="250px">
                  <el-input v-model="form.treatment" placeholder="请输入入所后曾患何种疾病及治疗情况"/>
                </el-form-item>
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="6">
            <el-form-item label="身高" prop="height">
              <el-input v-model="form.height" placeholder="请输入身高"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="体重" prop="weight">
              <el-input v-model="form.weight" placeholder="请输入体重"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="血压" prop="bloodPressure">
              <el-input v-model="form.bloodPressure" placeholder="请输入血压"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="发育" prop="development">
              <el-input v-model="form.development" placeholder="请输入发育"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="神智" prop="mind">
              <el-input v-model="form.mind" placeholder="请输入神智"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="语言" prop="language">
              <el-input v-model="form.language" placeholder="请输入语言"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="应答" prop="answer">
              <el-input v-model="form.answer" placeholder="请输入应答"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="步态" prop="gait">
              <el-input v-model="form.gait" placeholder="请输入步态"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="皮肤粘膜" prop="skinMucous">
              <el-input v-model="form.skinMucous" placeholder="请输入皮肤粘膜"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="淋巴结" prop="lymphGland">
              <el-input v-model="form.lymphGland" placeholder="请输入淋巴结"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="头面部" prop="headFace">
              <el-input v-model="form.headFace" placeholder="请输入头面部"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="颈部" prop="neck">
              <el-input v-model="form.neck" placeholder="请输入颈部"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="胸廓" prop="chest">
              <el-input v-model="form.chest" placeholder="请输入胸廓"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="心脏" prop="heart">
              <el-input v-model="form.heart" placeholder="请输入心脏"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="肺" prop="lung">
              <el-input v-model="form.lung" placeholder="请输入肺"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="腹部" prop="abdomen">
              <el-input v-model="form.abdomen" placeholder="请输入腹部"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="脊柱" prop="spine">
              <el-input v-model="form.spine" placeholder="请输入脊柱"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="四肢" prop="limb">
              <el-input v-model="form.limb" placeholder="请输入四肢"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="神经系统" prop="nervousSystem">
              <el-input v-model="form.nervousSystem" placeholder="请输入神经系统"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="视力" prop="vision">
              <el-input v-model="form.vision" placeholder="请输入视力"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="听力" prop="hearing">
              <el-input v-model="form.hearing" placeholder="请输入听力"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="龋齿" prop="toothDecay">
              <el-input v-model="form.toothDecay" placeholder="请输入龋齿"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="脱落" prop="fallOff">
              <el-input v-model="form.fallOff" placeholder="请输入脱落"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="其他体检内容 	" prop="otherPE">
              <el-input v-model="form.otherPE" placeholder="请输入其他体检内容 	"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="结论" prop="conclusion">
              <el-input v-model="form.conclusion" placeholder="请输入结论"/>
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
    <!-- 用户导入出所健康状况对话框 -->
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
    listHealthout,
    getHealthout,
    delHealthout,
    addHealthout,
    updateHealthout,
    exportHealthout,
    importHealthout
  } from '@/api/healthrecords/healthout'

  import { getToken } from '@/utils/auth'

  export default {
    name: 'Healthout',
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
        // 出所健康状况表格数据
        healthoutList: [],
        // 弹出层标题
        title: '',
        // 是否显示弹出层
        open: false,
        // 查询参数
        queryParams: {
          pageNum: 1,
          pageSize: 10,
          fileNum: null,
          name: null,
          age: null,
          marriage: null,
          education: null,
          startTime: null,
          endingTime: null,
          enterTime: null,
          drugType: null,
          formerResidence: null,
          treatment: null,
          height: null,
          weight: null,
          bloodPressure: null,
          development: null,
          mind: null,
          language: null,
          answer: null,
          gait: null,
          skinMucous: null,
          lymphGland: null,
          headFace: null,
          neck: null,
          chest: null,
          heart: null,
          lung: null,
          abdomen: null,
          spine: null,
          limb: null,
          nervousSystem: null,
          vision: null,
          hearing: null,
          toothDecay: null,
          fallOff: null,
          otherPE: null,
          conclusion: null,
          remarks: null
        },
        // 表单参数
        form: {},
        // 表单校验
        rules: {
          name: [
            { required: true, message: '姓名不能为空', trigger: 'blur' }
          ]
        },
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
          url: process.env.VUE_APP_BASE_API + '/healthrecords/healthout/importData'
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      /** 查询出所健康状况列表 */
      getList() {
        this.loading = true
        listHealthout(this.queryParams).then(response => {
          this.healthoutList = response.rows
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
          education: null,
          startTime: null,
          endingTime: null,
          enterTime: null,
          drugType: null,
          formerResidence: null,
          treatment: null,
          height: null,
          weight: null,
          bloodPressure: null,
          development: null,
          mind: null,
          language: null,
          answer: null,
          gait: null,
          skinMucous: null,
          lymphGland: null,
          headFace: null,
          neck: null,
          chest: null,
          heart: null,
          lung: null,
          abdomen: null,
          spine: null,
          limb: null,
          nervousSystem: null,
          vision: null,
          hearing: null,
          toothDecay: null,
          fallOff: null,
          otherPE: null,
          conclusion: null,
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
        this.title = '添加出所健康状况'
      },
      /** 修改按钮操作 */
      handleUpdate(row) {
        this.reset()
        const id = row.id || this.ids
        getHealthout(id).then(response => {
          this.form = response.data
          this.open = true
          this.title = '修改出所健康状况'
        })
      },
      /** 提交按钮 */
      submitForm() {
        this.$refs['form'].validate(valid => {
          if (valid) {
            if (this.form.id != null) {
              updateHealthout(this.form).then(response => {
                this.msgSuccess('修改成功')
                this.open = false
                this.getList()
              })
            } else {
              addHealthout(this.form).then(response => {
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
        this.$confirm('是否确认删除出所健康状况编号为"' + ids + '"的数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return delHealthout(ids)
        }).then(() => {
          this.getList()
          this.msgSuccess('删除成功')
        })
      },
      /** 导出按钮操作 */
      handleExport() {
        const queryParams = this.queryParams
        this.$confirm('是否确认导出所有出所健康状况数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return exportHealthout(queryParams)
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
        importHealthout().then(response => {
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
