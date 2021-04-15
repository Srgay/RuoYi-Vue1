import request from '@/utils/request'

// 查询戒毒情况列表
export function listHealthinfo(query) {
  return request({
    url: '/healthrecords/healthinfo/list',
    method: 'get',
    params: query
  })
}

// 查询戒毒情况详细
export function getHealthinfo(fileNum) {
  return request({
    url: '/healthrecords/healthinfo/' + fileNum,
    method: 'get'
  })
}

// 新增戒毒情况
export function addHealthinfo(data) {
  return request({
    url: '/healthrecords/healthinfo',
    method: 'post',
    data: data
  })
}

// 修改戒毒情况
export function updateHealthinfo(data) {
  return request({
    url: '/healthrecords/healthinfo',
    method: 'put',
    data: data
  })
}

// 删除戒毒情况
export function delHealthinfo(fileNum) {
  return request({
    url: '/healthrecords/healthinfo/' + fileNum,
    method: 'delete'
  })
}

// 导出戒毒情况
export function exportHealthinfo(query) {
  return request({
    url: '/healthrecords/healthinfo/export',
    method: 'get',
    params: query
  })
}

// 下载戒毒情况导入模板
export function importHealthinfo() {
  return request({
    url: '/healthrecords/healthinfo/importTemplate',
    method: 'get'
  })
}
