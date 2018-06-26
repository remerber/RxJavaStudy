package com.ww.rxjavastudy

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ww.rxjavastudy.chapter02.ChapterActivity02
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn02.setOnClickListener {
            val intent= Intent()
            intent.setClass(this, ChapterActivity02::class.java)
            startActivity(intent)

        }
    }
}
