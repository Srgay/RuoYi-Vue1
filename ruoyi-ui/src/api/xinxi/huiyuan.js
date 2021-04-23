import request from '@/utils/request'

// 查询会员信息列表
export function listHuiyuan(query) {
  return request({
    url: '/xinxi/huiyuan/list',
    method: 'get',
    params: query
  })
}

// 查询会员信息详细
export function getHuiyuan(hid) {
  return request({
    url: '/xinxi/huiyuan/' + hid,
    method: 'get'
  })
}

// 新增会员信息
export function addHuiyuan(data) {
  return request({
    url: '/xinxi/huiyuan',
    method: 'post',
    data: data
  })
}

// 修改会员信息
export function updateHuiyuan(data) {
  return request({
    url: '/xinxi/huiyuan',
    method: 'put',
    data: data
  })
}

// 删除会员信息
export function delHuiyuan(hid) {
  return request({
    url: '/xinxi/huiyuan/' + hid,
    method: 'delete'
  })
}

// 导出会员信息
export function exportHuiyuan(query) {
  return request({
    url: '/xinxi/huiyuan/export',
    method: 'get',
    params: query
  })
}

// 下载会员信息导入模板
export function importHuiyuan() {
  return request({
    url: '/xinxi/huiyuan/importTemplate',
    method: 'get'
  })
}
