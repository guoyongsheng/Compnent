package com.wesley.component.find

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
@Route(path = "/find/findActivity")
class FindActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.finder_activity_find)
    }
}