package com.wesley.component.find

import android.app.Application
import com.wesley.common.common.BaseApplication
import com.wesley.common.common.ServiceFactory

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
class FindApplication : BaseApplication() {

    override fun initApplication(app: Application) {
        ServiceFactory.initFinderService(FinderServiceImpl())
    }


    override fun onCreate() {
        super.onCreate()
        initApplication(this)
    }
}