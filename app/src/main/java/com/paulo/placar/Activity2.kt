package com.paulo.placar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        var intent = intent
        var placar1 = intent.getIntExtra("Placar1", 0)
        var time1 = intent.getStringExtra("Time1")
        var placar2 = intent.getIntExtra("Placar2", 0)
        var time2 = intent.getStringExtra("Time2" )

        if (placar1 > placar2 || placar2 > placar1) {
            if (placar1 > placar2) {
                if((placar1 - placar2) == 1){
                    txt_vencedor.text =
                        "O "+ time1 +" é o Vencedor com uma diferença de " + (placar1 - placar2) + " ponto"

                }
                else{
                txt_vencedor.text =
                    "O "+ time1 +" é o Vencedor com uma diferença de " + (placar1 - placar2) + " pontos"
                }
            }
            else if((placar2 - placar1) == 1) {
                txt_vencedor.text =
                    "O " + time2 + " é o Vencedor com uma diferença de " + (placar2 - placar1) + " ponto"
            }
            else{
                txt_vencedor.text =
                    "O "+ time2 +" é o Vencedor com uma diferença de " + (placar2 - placar1) + " pontos"
                }
            }
        }
    }