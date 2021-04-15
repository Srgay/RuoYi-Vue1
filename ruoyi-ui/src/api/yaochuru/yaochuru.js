import request from '@/utils/request'

// 查询药品出入库列表
export function listYaochuru(query) {
  return request({
    url: '/yaochuru/yaochuru/list',
    method: 'get',
    params: query
  })
}

// 查询药品出入库详细
export function getYaochuru(id) {
  return request({
    url: '/yaochuru/yaochuru/' + id,
    method: 'get'
  })
}

// 新增药品出入库
export function addYaochuru(data) {
  return request({
    url: '/yaochuru/yaochuru',
    method: 'post',
    data: data
  })
}

// 修改药品出入库
export function updateYaochuru(data) {
  return request({
    url: '/yaochuru/yaochuru',
    method: 'put',
    data: data
  })
}

// 删除药品出入库
export function delYaochuru(id) {
  return request({
    url: '/yaochuru/yaochuru/' + id,
    method: 'delete'
  })
}

// 导出药品出入库
export function exportYaochuru(query) {
  return request({
    url: '/yaochuru/yaochuru/export',
    method: 'get',
    params: query
  })
}

// 下载药品出入库导入模板
export function importYaochuru() {
  return request({
    url: '/yaochuru/yaochuru/importTemplate',
    method: 'get'
  })
}
