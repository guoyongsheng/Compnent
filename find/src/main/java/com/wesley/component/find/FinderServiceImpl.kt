package com.wesley.component.find

import com.wesley.common.common.service.IFinderService

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
class FinderServiceImpl: IFinderService {


    override fun getFinderContent(): String {
        return "这个是真正的内容"
    }
}