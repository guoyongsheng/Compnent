package com.wesley.component.home

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.wesley.common.common.ServiceFactory

/**
 * 作者: wesley
 * 时间: 2021/3/1
 * 描述:
 */
@Route(path = "/home/homeActivity")
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
    }

    private fun init() {
        val button = findViewById<Button>(R.id.btn_to_find)
        val tvName = findViewById<TextView>(R.id.tvName)
        button.setOnClickListener {

//            ARouter.getInstance().build("/find/findActivity")
//                .navigation()

            tvName.text = ServiceFactory.getFinderContent()
        }
    }
}