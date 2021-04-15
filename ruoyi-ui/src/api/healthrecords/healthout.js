import request from '@/utils/request'

// 查询出所健康状况列表
export function listHealthout(query) {
  return request({
    url: '/healthrecords/healthout/list',
    method: 'get',
    params: query
  })
}

// 查询出所健康状况详细
export function getHealthout(id) {
  return request({
    url: '/healthrecords/healthout/' + id,
    method: 'get'
  })
}

// 新增出所健康状况
export function addHealthout(data) {
  return request({
    url: '/healthrecords/healthout',
    method: 'post',
    data: data
  })
}

// 修改出所健康状况
export function updateHealthout(data) {
  return request({
    url: '/healthrecords/healthout',
    method: 'put',
    data: data
  })
}

// 删除出所健康状况
export function delHealthout(id) {
  return request({
    url: '/healthrecords/healthout/' + id,
    method: 'delete'
  })
}

// 导出出所健康状况
export function exportHealthout(query) {
  return request({
    url: '/healthrecords/healthout/export',
    method: 'get',
    params: query
  })
}

// 下载出所健康状况导入模板
export function importHealthout() {
  return request({
    url: '/healthrecords/healthout/importTemplate',
    method: 'get'
  })
}
