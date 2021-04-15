import request from '@/utils/request'

// 查询毒品检查列表
export function listDujian(query) {
  return request({
    url: '/dujian/dujian/list',
    method: 'get',
    params: query
  })
}

// 查询毒品检查详细
export function getDujian(id) {
  return request({
    url: '/dujian/dujian/' + id,
    method: 'get'
  })
}

// 新增毒品检查
export function addDujian(data) {
  return request({
    url: '/dujian/dujian',
    method: 'post',
    data: data
  })
}

// 修改毒品检查
export function updateDujian(data) {
  return request({
    url: '/dujian/dujian',
    method: 'put',
    data: data
  })
}

// 删除毒品检查
export function delDujian(id) {
  return request({
    url: '/dujian/dujian/' + id,
    method: 'delete'
  })
}

// 导出毒品检查
export function exportDujian(query) {
  return request({
    url: '/dujian/dujian/export',
    method: 'get',
    params: query
  })
}

// 下载毒品检查导入模板
export function importDujian() {
  return request({
    url: '/dujian/dujian/importTemplate',
    method: 'get'
  })
}
