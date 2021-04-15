import request from '@/utils/request'

// 查询入所健康状况列表
export function listHealthin(query) {
  return request({
    url: '/healthrecords/healthin/list',
    method: 'get',
    params: query
  })
}

// 查询入所健康状况详细
export function getHealthin(id) {
  return request({
    url: '/healthrecords/healthin/' + id,
    method: 'get'
  })
}

// 新增入所健康状况
export function addHealthin(data) {
  return request({
    url: '/healthrecords/healthin',
    method: 'post',
    data: data
  })
}

// 修改入所健康状况
export function updateHealthin(data) {
  return request({
    url: '/healthrecords/healthin',
    method: 'put',
    data: data
  })
}

// 删除入所健康状况
export function delHealthin(id) {
  return request({
    url: '/healthrecords/healthin/' + id,
    method: 'delete'
  })
}

// 导出入所健康状况
export function exportHealthin(query) {
  return request({
    url: '/healthrecords/healthin/export',
    method: 'get',
    params: query
  })
}
// 下载定期健康状况导入模板
export function importHealthin() {
  return request({
    url: '/healthrecords/healthin/importTemplate',
    method: 'get'
  })
}
