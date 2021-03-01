package com.wesley.compnent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        val button = findViewById<Button>(R.id.btn_to_home)
        button.setOnClickListener {

            ARouter.getInstance().build("/home/homeActivity").navigation()
        }
    }
}