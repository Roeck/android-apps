package com.example.rons9n.barlette

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val barList = arrayListOf("Fat Cat","Ty's","Pieces","Flamming Saddles","Rebar","Draught 55","GYM Bar","Therapy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
           val random = Random()
            val randomBar = random.nextInt(barList.count())
            selectedBarTxt.text = barList [randomBar]

        }

        addBarBtn.setOnClickListener {
            val newBar = addBarTxt.text.toString()

            barList.add(newBar)
            addBarTxt.text.clear()
            println(barList)
        }


    }
}