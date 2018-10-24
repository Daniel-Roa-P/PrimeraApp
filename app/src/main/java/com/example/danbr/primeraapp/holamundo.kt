package com.example.danbr.primeraapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.holamundo.*

class holamundo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.holamundo)

        button.setOnClickListener {

            if(button.getText()=="Iniciar"){

            button.setText("Hola mundo")

            }else if(button.getText()=="Hola mundo"){

                button.setText("Iniciar")

            }
        }
    }

}
