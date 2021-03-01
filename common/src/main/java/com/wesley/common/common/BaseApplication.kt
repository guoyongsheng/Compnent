package com.wesley.common.common

import android.app.Application

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
abstract class BaseApplication: Application() {


    abstract fun initApplication(app: Application)
}