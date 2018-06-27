package com.ww.rxjavastudy

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ww.rxjavastudy.chapter02.ChapterActivity02
import com.ww.rxjavastudy.chapter03.ChapterActivity03
import com.ww.rxjavastudy.chapter04.ChapterActivity04
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn02.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, ChapterActivity02::class.java)
            startActivity(intent)

        }
        btn03.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, ChapterActivity03::class.java)
            startActivity(intent)
        }
        btn04.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, ChapterActivity04::class.java)
            startActivity(intent)
        }
    }
}
