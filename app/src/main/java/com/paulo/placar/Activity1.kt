package com.paulo.placar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*


class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        btn_lal.setOnClickListener(){
            var time_a = btn_lal.text.toString()
            val intent = Intent(this@Activity1, Activity1_1::class.java)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
        btn_nyk.setOnClickListener(){
            var time_a = btn_nyk.text.toString()
            val intent = Intent(this@Activity1, Activity1_1::class.java)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
        btn_gsw.setOnClickListener(){
            var time_a = btn_gsw.text.toString()
            val intent = Intent(this@Activity1, Activity1_1::class.java)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }
        btn_cb.setOnClickListener(){
            var time_a = btn_cb.text.toString()
            val intent = Intent(this@Activity1, Activity1_1::class.java)
            intent.putExtra("Time1", time_a)
            startActivity(intent)
        }

    }
}