import request from '@/utils/request'

// 查询定期健康状况列表
export function listHealthcheck(query) {
  return request({
    url: '/healthrecords/healthcheck/list',
    method: 'get',
    params: query
  })
}

// 查询定期健康状况详细
export function getHealthcheck(fileNum) {
  return request({
    url: '/healthrecords/healthcheck/' + fileNum,
    method: 'get'
  })
}

// 新增定期健康状况
export function addHealthcheck(data) {
  return request({
    url: '/healthrecords/healthcheck',
    method: 'post',
    data: data
  })
}

// 修改定期健康状况
export function updateHealthcheck(data) {
  return request({
    url: '/healthrecords/healthcheck',
    method: 'put',
    data: data
  })
}

// 删除定期健康状况
export function delHealthcheck(fileNum) {
  return request({
    url: '/healthrecords/healthcheck/' + fileNum,
    method: 'delete'
  })
}

// 导出定期健康状况
export function exportHealthcheck(query) {
  return request({
    url: '/healthrecords/healthcheck/export',
    method: 'get',
    params: query
  })
}

// 下载定期健康状况导入模板
export function importHealthcheck() {
  return request({
    url: '/healthrecords/healthcheck/importTemplate',
    method: 'get'
  })
}
