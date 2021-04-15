import request from '@/utils/request'

// 查询就诊记录列表
export function listJiuzhen(query) {
  return request({
    url: '/healthrecords/jiuzhen/list',
    method: 'get',
    params: query
  })
}

// 查询就诊记录详细
export function getJiuzhen(id) {
  return request({
    url: '/healthrecords/jiuzhen/' + id,
    method: 'get'
  })
}

// 新增就诊记录
export function addJiuzhen(data) {
  return request({
    url: '/healthrecords/jiuzhen',
    method: 'post',
    data: data
  })
}

// 修改就诊记录
export function updateJiuzhen(data) {
  return request({
    url: '/healthrecords/jiuzhen',
    method: 'put',
    data: data
  })
}

// 删除就诊记录
export function delJiuzhen(id) {
  return request({
    url: '/healthrecords/jiuzhen/' + id,
    method: 'delete'
  })
}

// 导出就诊记录
export function exportJiuzhen(query) {
  return request({
    url: '/healthrecords/jiuzhen/export',
    method: 'get',
    params: query
  })
}

// 下载就诊记录导入模板
export function importJiuzhen() {
  return request({
    url: '/healthrecords/jiuzhen/importTemplate',
    method: 'get'
  })
}
