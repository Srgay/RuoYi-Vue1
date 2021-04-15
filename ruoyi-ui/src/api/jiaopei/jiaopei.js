import request from '@/utils/request'

// 查询教育培训列表
export function listJiaopei(query) {
  return request({
    url: '/jiaopei/jiaopei/list',
    method: 'get',
    params: query
  })
}

// 查询教育培训详细
export function getJiaopei(id) {
  return request({
    url: '/jiaopei/jiaopei/' + id,
    method: 'get'
  })
}

// 新增教育培训
export function addJiaopei(data) {
  return request({
    url: '/jiaopei/jiaopei',
    method: 'post',
    data: data
  })
}

// 修改教育培训
export function updateJiaopei(data) {
  return request({
    url: '/jiaopei/jiaopei',
    method: 'put',
    data: data
  })
}

// 删除教育培训
export function delJiaopei(id) {
  return request({
    url: '/jiaopei/jiaopei/' + id,
    method: 'delete'
  })
}

// 导出教育培训
export function exportJiaopei(query) {
  return request({
    url: '/jiaopei/jiaopei/export',
    method: 'get',
    params: query
  })
}

// 下载教育培训导入模板
export function importJiaopei() {
  return request({
    url: '/jiaopei/jiaopei/importTemplate',
    method: 'get'
  })
}
