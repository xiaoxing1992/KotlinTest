package com.kotlin.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.usercenter.R
import kotlinx.android.synthetic.main.content_resgiter.*
import org.jetbrains.anko.toast

class ResgiterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgiter)

        bt_land.setOnClickListener {
            toast("ss")
        }
    }

}
