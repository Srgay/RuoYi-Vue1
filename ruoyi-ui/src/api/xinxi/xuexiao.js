import request from '@/utils/request'

// 查询学校信息列表
export function listXuexiao(query) {
  return request({
    url: '/xinxi/xuexiao/list',
    method: 'get',
    params: query
  })
}

// 查询学校信息详细
export function getXuexiao(xid) {
  return request({
    url: '/xinxi/xuexiao/' + xid,
    method: 'get'
  })
}

// 新增学校信息
export function addXuexiao(data) {
  return request({
    url: '/xinxi/xuexiao',
    method: 'post',
    data: data
  })
}

// 修改学校信息
export function updateXuexiao(data) {
  return request({
    url: '/xinxi/xuexiao',
    method: 'put',
    data: data
  })
}

// 删除学校信息
export function delXuexiao(xid) {
  return request({
    url: '/xinxi/xuexiao/' + xid,
    method: 'delete'
  })
}

// 导出学校信息
export function exportXuexiao(query) {
  return request({
    url: '/xinxi/xuexiao/export',
    method: 'get',
    params: query
  })
}

// 下载学校信息导入模板
export function importXuexiao() {
  return request({
    url: '/xinxi/xuexiao/importTemplate',
    method: 'get'
  })
}
