package com.example.colourchange

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

   // @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val textView:TextView=findViewById(R.id.textView)
         val tv:ConstraintLayout=findViewById(R.id.tv)

        tv.setOnClickListener {

            val color= Color.argb(255,Random.nextInt(255),Random.nextInt(255),Random.nextInt(255))
            textView.animate().apply{

                x(Random.nextInt(304).toFloat())
                y(Random.nextInt(682).toFloat())

            }
            textView.setTextColor(color*2)

            textView.setTextSize(Random.nextInt(20,50).toFloat())
            textView.rotation= Random.nextInt(90,360).toFloat()



            tv.setBackgroundColor(color)
        }

    }
}
