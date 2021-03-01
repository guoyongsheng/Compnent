package com.wesley.component.home

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
class HomeApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }

        ARouter.init(this)
    }
}