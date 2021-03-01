package com.wesley.common.common

import com.wesley.common.common.emptyservice.DefaultFinderServiceImpl
import com.wesley.common.common.service.IFinderService

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
object ServiceFactory {


    private var finderService: IFinderService? = null


    fun initFinderService(finderService: IFinderService) {
        this.finderService = finderService
    }

    fun getFinderService(): IFinderService {
        return finderService ?: return DefaultFinderServiceImpl()
    }

    fun getFinderContent(): String {
        return getFinderService().getFinderContent()
    }
}