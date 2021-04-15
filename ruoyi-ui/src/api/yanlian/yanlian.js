import request from '@/utils/request'

// 查询应急演练列表
export function listYanlian(query) {
  return request({
    url: '/yanlian/yanlian/list',
    method: 'get',
    params: query
  })
}

// 查询应急演练详细
export function getYanlian(id) {
  return request({
    url: '/yanlian/yanlian/' + id,
    method: 'get'
  })
}

// 新增应急演练
export function addYanlian(data) {
  return request({
    url: '/yanlian/yanlian',
    method: 'post',
    data: data
  })
}

// 修改应急演练
export function updateYanlian(data) {
  return request({
    url: '/yanlian/yanlian',
    method: 'put',
    data: data
  })
}

// 删除应急演练
export function delYanlian(id) {
  return request({
    url: '/yanlian/yanlian/' + id,
    method: 'delete'
  })
}

// 导出应急演练
export function exportYanlian(query) {
  return request({
    url: '/yanlian/yanlian/export',
    method: 'get',
    params: query
  })
}

// 下载应急演练导入模板
export function importYanlian() {
  return request({
    url: '/yanlian/yanlian/importTemplate',
    method: 'get'
  })
}
