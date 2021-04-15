import request from '@/utils/request'

// 查询外诊记录列表
export function listWaizhen(query) {
  return request({
    url: '/healthrecords/waizhen/list',
    method: 'get',
    params: query
  })
}

// 查询外诊记录详细
export function getWaizhen(id) {
  return request({
    url: '/healthrecords/waizhen/' + id,
    method: 'get'
  })
}

// 新增外诊记录
export function addWaizhen(data) {
  return request({
    url: '/healthrecords/waizhen',
    method: 'post',
    data: data
  })
}

// 修改外诊记录
export function updateWaizhen(data) {
  return request({
    url: '/healthrecords/waizhen',
    method: 'put',
    data: data
  })
}

// 删除外诊记录
export function delWaizhen(id) {
  return request({
    url: '/healthrecords/waizhen/' + id,
    method: 'delete'
  })
}

// 导出外诊记录
export function exportWaizhen(query) {
  return request({
    url: '/healthrecords/waizhen/export',
    method: 'get',
    params: query
  })
}

// 下载外诊记录导入模板
export function importWaizhen() {
  return request({
    url: '/healthrecords/waizhen/importTemplate',
    method: 'get'
  })
}
