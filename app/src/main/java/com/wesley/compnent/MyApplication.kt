package com.wesley.compnent

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.wesley.common.common.ApplicationConfig
import com.wesley.common.common.BaseApplication
import java.lang.Exception

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
class MyApplication : BaseApplication() {

    override fun initApplication(app: Application) {

        val config = ApplicationConfig.APPLICATION_PATH
        for (path in config) {
            try {
                val clazz = Class.forName(path)
                val application = clazz.newInstance() as? BaseApplication ?: continue
                application.initApplication(app)
            } catch (e: Exception) {

            }
        }
    }


    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            ARouter.openDebug()
            ARouter.openLog()
        }

        ARouter.init(this)

        initApplication(this)
    }
}