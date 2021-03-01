package com.wesley.common.common.emptyservice

import com.wesley.common.common.service.IFinderService

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
class DefaultFinderServiceImpl: IFinderService {


    override fun getFinderContent(): String {
        return "这个是发现页面默认的值"
    }



}