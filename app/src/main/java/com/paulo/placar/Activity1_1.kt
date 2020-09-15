package com.paulo.placar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*

class Activity1_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1_1)




        btn_lal.setOnClickListener() {
            lal()
        }

        btn_nyk.setOnClickListener() {
            nyk()
        }

        btn_gsw.setOnClickListener() {
            gsw()
        }
        btn_cb.setOnClickListener() {
            cb()
        }

    }



    fun lal() {
        var intent = intent
        var time1 = intent.getStringExtra("Time1")
        var time_a = time1
        var time_b = btn_lal.text.toString()
        if (time_a != time_b) {
            val intent = Intent(this@Activity1_1, MainActivity::class.java)
            intent.putExtra("Time2", time_b)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
    }

    fun nyk(){
        var intent = intent
        var time1 = intent.getStringExtra("Time1")
        var time_a = time1
        var time_b = btn_nyk.text.toString()
        if (time_a != time_b) {
            val intent = Intent(this@Activity1_1, MainActivity::class.java)
            intent.putExtra("Time2", time_b)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
    }

    fun gsw(){
        var intent = intent
        var time1 = intent.getStringExtra("Time1")
        var time_a = time1
        var time_b = btn_gsw.text.toString()
        if (time_a != time_b){
            val intent = Intent(this@Activity1_1, MainActivity::class.java)
            intent.putExtra("Time2", time_b)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
    }

    fun cb(){
        var intent = intent
        var time1 = intent.getStringExtra("Time1")
        var time_a = time1
        var time_b = btn_cb.text.toString()
        if (time_a != time_b){
            val intent = Intent(this@Activity1_1, MainActivity::class.java)
            intent.putExtra("Time2", time_b)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
    }
}


