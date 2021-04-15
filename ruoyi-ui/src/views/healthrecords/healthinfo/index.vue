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
      <!--  <el-form-item label="年龄" prop="age">
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
          <el-input
            v-model="queryParams.drugType"
            placeholder="请输入毒品种类"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="合成药物" prop="syntheticDrugs">
          <el-input
            v-model="queryParams.syntheticDrugs"
            placeholder="请输入合成药物"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="毒品来源" prop="drugFrom">
          <el-input
            v-model="queryParams.drugFrom"
            placeholder="请输入毒品来源"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
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
        <el-form-item label="首次吸毒时间" prop="firstDrugTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="queryParams.firstDrugTime"
            type="datetime"
            value-format="yyyy-MM-dd HH:mm:ss"
            placeholder="选择首次吸毒时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="成瘾时间" prop="addictionTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="queryParams.addictionTime"
            type="datetime"
            value-format="yyyy-MM-dd HH:mm:ss"
            placeholder="选择成瘾时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="末次吸毒时间" prop="lastDrugTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="queryParams.lastDrugTime"
            type="datetime"
            value-format="yyyy-MM-dd HH:mm:ss"
            placeholder="选择末次吸毒时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="平均每日用量" prop="dailyUse">
          <el-input
            v-model="queryParams.dailyUse"
            placeholder="请输入平均每日用量"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="使用毒品后的主观感受" prop="subMind">
          <el-input
            v-model="queryParams.subMind"
            placeholder="请输入使用毒品后的主观感受"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="使用毒品以来精神及行为的改变" prop="mindChange">
          <el-input
            v-model="queryParams.mindChange"
            placeholder="请输入使用毒品以来精神及行为的改变"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="戒毒症状" prop="symptom">
          <el-input
            v-model="queryParams.symptom"
            placeholder="请输入戒毒症状"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="戒毒次数" prop="symptomTimes">
          <el-input
            v-model="queryParams.symptomTimes"
            placeholder="请输入戒毒次数"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="何处戒毒" prop="whereDet">
          <el-input
            v-model="queryParams.whereDet"
            placeholder="请输入何处戒毒"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="复吸时间" prop="relapseTime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="queryParams.relapseTime"
            type="datetime"
            value-format="yyyy-MM-dd HH:mm:ss"
            placeholder="选择复吸时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="吸食方法" prop="relapseWay">
          <el-input
            v-model="queryParams.relapseWay"
            placeholder="请输入吸食方法"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="复吸原因" prop="relapseReason">
          <el-input
            v-model="queryParams.relapseReason"
            placeholder="请输入复吸原因"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="既往病史" prop="medicalHistory">
          <el-input
            v-model="queryParams.medicalHistory"
            placeholder="请输入既往病史"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="治疗措施" prop="treatment">
          <el-input
            v-model="queryParams.treatment"
            placeholder="请输入治疗措施"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="有无治愈" prop="cureOrnot">
          <el-input
            v-model="queryParams.cureOrnot"
            placeholder="请输入有无治愈"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="近期有无吞食异物" prop="swallowOrnot">
          <el-input
            v-model="queryParams.swallowOrnot"
            placeholder="请输入近期有无吞食异物"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="异物类型" prop="swallowType">
          <el-input
            v-model="queryParams.swallowType"
            placeholder="请输入异物类型"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="既往有无外伤、受伤情况" prop="injureOrnot">
          <el-input
            v-model="queryParams.injureOrnot"
            placeholder="请输入既往有无外伤、受伤情况"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="皮肤有无瘢痕" prop="scarOrnot">
          <el-input
            v-model="queryParams.scarOrnot"
            placeholder="请输入皮肤有无瘢痕"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="有无手术" prop="operationOrnot">
          <el-input
            v-model="queryParams.operationOrnot"
            placeholder="请输入有无手术"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="有无家族精神病史" prop="mentalillnessOrnot">
          <el-input
            v-model="queryParams.mentalillnessOrnot"
            placeholder="请输入有无家族精神病史"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="何种疾病" prop="diseaseType">
          <el-input
            v-model="queryParams.diseaseType"
            placeholder="请输入何种疾病"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="有无纹身" prop="tattooOrnot">
          <el-input
            v-model="queryParams.tattooOrnot"
            placeholder="请输入有无纹身"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="纹身位置" prop="tattooPosition">
          <el-input
            v-model="queryParams.tattooPosition"
            placeholder="请输入纹身位置"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="其他补充内容" prop="supplement">
          <el-input
            v-model="queryParams.supplement"
            placeholder="请输入其他补充内容"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="主要抚养者" prop="foster">
          <el-input
            v-model="queryParams.foster"
            placeholder="请输入主要抚养者"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="在校学习成绩" prop="grade">
          <el-input
            v-model="queryParams.grade"
            placeholder="请输入在校学习成绩"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="性格" prop="character">
          <el-input
            v-model="queryParams.character"
            placeholder="请输入性格"
            clearable
            size="small"
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="生活特殊嗜好" prop="hobby">
          <el-input
            v-model="queryParams.hobby"
            placeholder="请输入生活特殊嗜好"
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
          v-hasPermi="['healthrecords:healthinfo:add']"
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
          v-hasPermi="['healthrecords:healthinfo:edit']"
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
          v-hasPermi="['healthrecords:healthinfo:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleImport"
          v-hasPermi="['healthrecords:healthinfo:import']"
        >导入
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['healthrecords:healthinfo:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="healthinfoList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
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
      <el-table-column label="原居住地" align="center" prop="formerResidence"/>
      <el-table-column label="民族" align="center" prop="race"/>
      <el-table-column label="首次吸毒原因" align="center" prop="firstReason"/>
      <el-table-column label="毒品种类" align="center" prop="drugType"/>
      <el-table-column label="合成药物" align="center" prop="syntheticDrugs"/>
      <el-table-column label="毒品来源" align="center" prop="drugFrom"/>
      <el-table-column label="使用方法" align="center" prop="usageMethod"/>
      <el-table-column label="是否共用注射器" align="center" prop="gyzhusheqi"/>
      <el-table-column label="首次吸毒时间" align="center" prop="firstDrugTime" width="180">

      </el-table-column>
      <el-table-column label="成瘾时间" align="center" prop="addictionTime" width="180">

      </el-table-column>
      <el-table-column label="末次吸毒时间" align="center" prop="lastDrugTime" width="180">

      </el-table-column>
      <el-table-column label="平均每日用量" align="center" prop="dailyUse"/>
      <el-table-column label="使用毒品后的主观感受" align="center" prop="subMind"/>
      <el-table-column label="使用毒品以来精神及行为的改变" align="center" prop="mindChange"/>
      <el-table-column label="戒毒症状" align="center" prop="symptom"/>
      <el-table-column label="戒毒次数" align="center" prop="symptomTimes"/>
      <el-table-column label="何处戒毒" align="center" prop="whereDet"/>
      <el-table-column label="复吸时间" align="center" prop="relapseTime" width="180">

      </el-table-column>
      <el-table-column label="吸食方法" align="center" prop="relapseWay"/>
      <el-table-column label="复吸原因" align="center" prop="relapseReason"/>
      <el-table-column label="既往病史" align="center" prop="medicalHistory"/>
      <el-table-column label="治疗措施" align="center" prop="treatment"/>
      <el-table-column label="有无治愈" align="center" prop="cureOrnot"/>
      <el-table-column label="近期有无吞食异物" align="center" prop="swallowOrnot"/>
      <el-table-column label="异物类型" align="center" prop="swallowType"/>
      <el-table-column label="既往有无外伤、受伤情况" align="center" prop="injureOrnot"/>
      <el-table-column label="皮肤有无瘢痕" align="center" prop="scarOrnot"/>
      <el-table-column label="有无手术" align="center" prop="operationOrnot"/>
      <el-table-column label="有无家族精神病史" align="center" prop="mentalillnessOrnot"/>
      <el-table-column label="何种疾病" align="center" prop="diseaseType"/>
      <el-table-column label="有无纹身" align="center" prop="tattooOrnot"/>
      <el-table-column label="纹身位置" align="center" prop="tattooPosition"/>
      <el-table-column label="其他补充内容" align="center" prop="supplement"/>
      <el-table-column label="主要抚养者" align="center" prop="foster"/>
      <el-table-column label="在校学习成绩" align="center" prop="grade"/>
      <el-table-column label="性格" align="center" prop="character"/>
      <el-table-column label="生活特殊嗜好" align="center" prop="hobby"/>
      <el-table-column label="备注" align="center" prop="remarks"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['healthrecords:healthinfo:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['healthrecords:healthinfo:remove']"
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

    <!-- 添加或修改戒毒情况对话框 -->
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
          <el-col :span="6">
            <el-form-item label="强制隔离戒毒开始日期" prop="startTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.startTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择强制隔离戒毒开始日期">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="强制隔离戒毒结束日期" prop="endingTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.endingTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择强制隔离戒毒结束日期">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
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
          <el-col :span="6">
            <el-form-item label="首次吸毒原因" prop="firstReason">
              <el-input v-model="form.firstReason" placeholder="请输入首次吸毒原因"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="毒品种类" prop="drugType">
              <el-input v-model="form.drugType" placeholder="请输入毒品种类"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="合成药物" prop="syntheticDrugs">
              <el-input v-model="form.syntheticDrugs" placeholder="请输入合成药物"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="毒品来源" prop="drugFrom">
              <el-input v-model="form.drugFrom" placeholder="请输入毒品来源"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="使用方法" prop="usageMethod">
              <el-input v-model="form.usageMethod" placeholder="请输入使用方法"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="是否共用注射器" prop="gyzhusheqi">
              <el-input v-model="form.gyzhusheqi" placeholder="请输入是否共用注射器"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="首次吸毒时间" prop="firstDrugTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.firstDrugTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择首次吸毒时间">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="成瘾时间" prop="addictionTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.addictionTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择成瘾时间">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="末次吸毒时间" prop="lastDrugTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.lastDrugTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择末次吸毒时间">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="平均每日用量" prop="dailyUse">
              <el-input v-model="form.dailyUse" placeholder="请输入平均每日用量"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="使用毒品后的主观感受" prop="subMind">
              <el-input v-model="form.subMind" placeholder="请输入使用毒品后的主观感受"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="使用毒品以来精神及行为的改变" prop="mindChange">
              <el-input v-model="form.mindChange" placeholder="请输入使用毒品以来精神及行为的改变"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="戒毒症状" prop="symptom">
              <el-input v-model="form.symptom" placeholder="请输入戒毒症状"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="戒毒次数" prop="symptomTimes">
              <el-input v-model="form.symptomTimes" placeholder="请输入戒毒次数"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="何处戒毒" prop="whereDet">
              <el-input v-model="form.whereDet" placeholder="请输入何处戒毒"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="复吸时间" prop="relapseTime">
              <el-date-picker clearable size="small" style="width: 200px"
                              v-model="form.relapseTime"
                              type="datetime"
                              value-format="yyyy-MM-dd HH:mm:ss"
                              placeholder="选择复吸时间">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="吸食方法" prop="relapseWay">
              <el-input v-model="form.relapseWay" placeholder="请输入吸食方法"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="复吸原因" prop="relapseReason">
              <el-input v-model="form.relapseReason" placeholder="请输入复吸原因"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="既往病史" prop="medicalHistory">
              <el-input v-model="form.medicalHistory" placeholder="请输入既往病史"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="治疗措施" prop="treatment">
              <el-input v-model="form.treatment" placeholder="请输入治疗措施"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="有无治愈" prop="cureOrnot">
              <el-input v-model="form.cureOrnot" placeholder="请输入有无治愈"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="近期有无吞食异物" prop="swallowOrnot">
              <el-input v-model="form.swallowOrnot" placeholder="请输入近期有无吞食异物"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="异物类型" prop="swallowType">
              <el-input v-model="form.swallowType" placeholder="请输入异物类型"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="既往有无外伤、受伤情况" prop="injureOrnot">
              <el-input v-model="form.injureOrnot" placeholder="请输入既往有无外伤、受伤情况"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="皮肤有无瘢痕" prop="scarOrnot">
              <el-input v-model="form.scarOrnot" placeholder="请输入皮肤有无瘢痕"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="有无手术" prop="operationOrnot">
              <el-input v-model="form.operationOrnot" placeholder="请输入有无手术"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="有无家族精神病史" prop="mentalillnessOrnot">
              <el-input v-model="form.mentalillnessOrnot" placeholder="请输入有无家族精神病史"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="何种疾病" prop="diseaseType">
              <el-input v-model="form.diseaseType" placeholder="请输入何种疾病"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="有无纹身" prop="tattooOrnot">
              <el-input v-model="form.tattooOrnot" placeholder="请输入有无纹身"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="纹身位置" prop="tattooPosition">
              <el-input v-model="form.tattooPosition" placeholder="请输入纹身位置"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="其他补充内容" prop="supplement">
              <el-input v-model="form.supplement" placeholder="请输入其他补充内容"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="主要抚养者" prop="foster">
              <el-input v-model="form.foster" placeholder="请输入主要抚养者"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="在校学习成绩" prop="grade">
              <el-input v-model="form.grade" placeholder="请输入在校学习成绩"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="性格" prop="character">
              <el-input v-model="form.character" placeholder="请输入性格"/>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="生活特殊嗜好" prop="hobby">
              <el-input v-model="form.hobby" placeholder="请输入生活特殊嗜好"/>
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
    <!-- 用户导入戒毒情况对话框 -->
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
    listHealthinfo,
    getHealthinfo,
    delHealthinfo,
    addHealthinfo,
    updateHealthinfo,
    exportHealthinfo,
    importHealthinfo
  } from '@/api/healthrecords/healthinfo'

  import { getToken } from '@/utils/auth'

  export default {
    name: 'Healthinfo',
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
        // 戒毒情况表格数据
        healthinfoList: [],
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
          formerResidence: null,
          race: null,
          firstReason: null,
          drugType: null,
          syntheticDrugs: null,
          drugFrom: null,
          usageMethod: null,
          gyzhusheqi: null,
          firstDrugTime: null,
          addictionTime: null,
          lastDrugTime: null,
          dailyUse: null,
          subMind: null,
          mindChange: null,
          symptom: null,
          symptomTimes: null,
          whereDet: null,
          relapseTime: null,
          relapseWay: null,
          relapseReason: null,
          medicalHistory: null,
          treatment: null,
          cureOrnot: null,
          swallowOrnot: null,
          swallowType: null,
          injureOrnot: null,
          scarOrnot: null,
          operationOrnot: null,
          mentalillnessOrnot: null,
          diseaseType: null,
          tattooOrnot: null,
          tattooPosition: null,
          supplement: null,
          foster: null,
          grade: null,
          character: null,
          hobby: null,
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
          url: process.env.VUE_APP_BASE_API + '/healthrecords/healthinfo/importData'
        },
        flag : false
      }
    },
    created() {
      this.getList()
    },
    methods: {
      /** 查询戒毒情况列表 */
      getList() {
        this.loading = true
        listHealthinfo(this.queryParams).then(response => {
          this.healthinfoList = response.rows
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
          fileNum: null,
          name: null,
          age: null,
          marriage: null,
          education: null,
          startTime: null,
          endingTime: null,
          enterTime: null,
          formerResidence: null,
          race: null,
          firstReason: null,
          drugType: null,
          syntheticDrugs: null,
          drugFrom: null,
          usageMethod: null,
          gyzhusheqi: null,
          firstDrugTime: null,
          addictionTime: null,
          lastDrugTime: null,
          dailyUse: null,
          subMind: null,
          mindChange: null,
          symptom: null,
          symptomTimes: null,
          whereDet: null,
          relapseTime: null,
          relapseWay: null,
          relapseReason: null,
          medicalHistory: null,
          treatment: null,
          cureOrnot: null,
          swallowOrnot: null,
          swallowType: null,
          injureOrnot: null,
          scarOrnot: null,
          operationOrnot: null,
          mentalillnessOrnot: null,
          diseaseType: null,
          tattooOrnot: null,
          tattooPosition: null,
          supplement: null,
          foster: null,
          grade: null,
          character: null,
          hobby: null,
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
        this.ids = selection.map(item => item.fileNum)
        this.single = selection.length !== 1
        this.multiple = !selection.length
      },
      /** 新增按钮操作 */
      handleAdd() {
        this.flag=true
        this.reset()
        this.open = true
        this.title = '添加戒毒情况'
      },
      /** 修改按钮操作 */
      handleUpdate(row) {
        this.reset()
        const fileNum = row.fileNum || this.ids
        getHealthinfo(fileNum).then(response => {
          this.form = response.data
          this.open = true
          this.title = '修改戒毒情况'
        })
      },
      /** 提交按钮 */
      submitForm() {
        this.$refs['form'].validate(valid => {
          if (valid) {
            /*if (this.form.fileNum != null) {
              updateHealthinfo(this.form).then(response => {
                this.msgSuccess('修改成功')
                this.open = false
                this.getList()
              })
            } else {
              addHealthinfo(this.form).then(response => {
                this.msgSuccess('新增成功')
                this.open = false
                this.getList()
              })
            }*/
            if (this.flag) {
              addHealthinfo(this.form).then(response => {
                this.msgSuccess('新增成功')
                this.open = false
                this.getList()
                this.flag=false
              })
            } else {
              updateHealthinfo(this.form).then(response => {
                this.msgSuccess('修改成功')
                this.open = false
                this.getList()
              })
            }
          }
        })
      },
      /** 删除按钮操作 */
      handleDelete(row) {
        const fileNums = row.fileNum || this.ids
        this.$confirm('是否确认删除戒毒情况编号为"' + fileNums + '"的数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return delHealthinfo(fileNums)
        }).then(() => {
          this.getList()
          this.msgSuccess('删除成功')
        })
      },
      /** 导出按钮操作 */
      handleExport() {
        const queryParams = this.queryParams
        this.$confirm('是否确认导出所有戒毒情况数据项?', '警告', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(function() {
          return exportHealthinfo(queryParams)
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
        importHealthinfo().then(response => {
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
