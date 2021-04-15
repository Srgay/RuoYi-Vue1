import request from '@/utils/request'

// 查询传染病筛选列表
export function listChuanshai(query) {
  return request({
    url: '/healthrecords/chuanshai/list',
    method: 'get',
    params: query
  })
}

// 查询传染病筛选详细
export function getChuanshai(id) {
  return request({
    url: '/healthrecords/chuanshai/' + id,
    method: 'get'
  })
}

// 新增传染病筛选
export function addChuanshai(data) {
  return request({
    url: '/healthrecords/chuanshai',
    method: 'post',
    data: data
  })
}

// 修改传染病筛选
export function updateChuanshai(data) {
  return request({
    url: '/healthrecords/chuanshai',
    method: 'put',
    data: data
  })
}

// 删除传染病筛选
export function delChuanshai(id) {
  return request({
    url: '/healthrecords/chuanshai/' + id,
    method: 'delete'
  })
}

// 导出传染病筛选
export function exportChuanshai(query) {
  return request({
    url: '/healthrecords/chuanshai/export',
    method: 'get',
    params: query
  })
}

// 下载传染病筛选导入模板
export function importChuanshai() {
  return request({
    url: '/healthrecords/chuanshai/importTemplate',
    method: 'get'
  })
}
