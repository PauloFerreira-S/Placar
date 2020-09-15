package com.paulo.placar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        var intent = intent
        var time1 = intent.getIntExtra("Time1", 0)
        var time2 = intent.getIntExtra("Time2", 0)
        if (time1 > time2 || time2 > time1) {
            if (time1 > time2) {
                txt_vencedor.text =
                    "O Time A é o Vencedor com uma diferença de " + (time1 - time2) + " pontos"
            } else {
                txt_vencedor.text =
                    "O Time B é o Vencedor com uma diferença de " + (time2 - time1) + " pontos"
            }
        }
    }
}