package com.paulo.placar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = intent
        var time1 = intent.getStringExtra("Time1")
        var time2 = intent.getStringExtra("Time2")
        textView.text = time1.toString()
        textView2.text = time2.toString()

        //Botões do time A
        btn_a3.setOnClickListener(){
            a_tres_pontos()
        }
        btn_a2.setOnClickListener(){
            a_dois_pontos()
        }
        btn_a1.setOnClickListener(){
            a_um_pontos()
        }
        btn_an1.setOnClickListener(){
            a_neg_pontos()
        }

        //Botões do time B
        btn_b3.setOnClickListener(){
            b_tres_pontos()
        }
        btn_b2.setOnClickListener(){
            b_dois_pontos()
        }
        btn_b1.setOnClickListener(){
            b_um_pontos()
        }
        btn_bn1.setOnClickListener(){
            b_neg_pontos()
        }
        btn_reset.setOnClickListener {
            reset()
        }
        btn_finalizar.setOnClickListener(){
            finalizar()
        }


    }
    fun a_tres_pontos(){
        var pont = txt_aplacar.text.toString().toInt() + 3
        txt_aplacar.text = pont.toString()
    }
    fun a_dois_pontos(){
        var pont = txt_aplacar.text.toString().toInt() + 2
        txt_aplacar.text = pont.toString()
    }
    fun a_um_pontos(){
        var pont = txt_aplacar.text.toString().toInt() + 1
        txt_aplacar.text = pont.toString()
    }
    fun a_neg_pontos(){
        var pont = txt_aplacar.text.toString().toInt()
        if (pont >= 1){
            pont--
            txt_aplacar.text = pont.toString()
        }
    }

    fun b_tres_pontos(){
        var pont = txt_bplacar.text.toString().toInt() + 3
        txt_bplacar.text = pont.toString()
    }
    fun b_dois_pontos(){
        var pont = txt_bplacar.text.toString().toInt() + 2
        txt_bplacar.text = pont.toString()
    }
    fun b_um_pontos(){
        var pont = txt_bplacar.text.toString().toInt() + 1
        txt_bplacar.text = pont.toString()
    }
    fun b_neg_pontos(){
        var pont = txt_bplacar.text.toString().toInt()
        if (pont >= 1){
            pont--
            txt_bplacar.text = pont.toString()
        }
    }
    fun reset(){
        var pont:String = "0"
        txt_aplacar.text = pont
        txt_bplacar.text = pont
    }
    fun finalizar(){
        var time1 = intent.getStringExtra("Time1")
        var time2 = intent.getStringExtra("Time2")
        var placar1 = txt_aplacar.text.toString().toInt()
        var placar2 = txt_bplacar.text.toString().toInt()
        val intent = Intent(this@MainActivity, Activity2::class.java)
        intent.putExtra("Placar1", placar1)
        intent.putExtra("Placar2", placar2)
        intent.putExtra("Time2", time2)
        intent.putExtra("Time1", time1)
        startActivity(intent)
    }

}
