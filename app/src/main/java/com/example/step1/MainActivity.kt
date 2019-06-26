package com.example.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countButton = findViewById<Button>(R.id.countbutton)
        val countEquation = View.OnClickListener {
            val x2arg = findViewById<EditText>(R.id.x2arg).text.toString().toFloat()
            val xarg = findViewById<EditText>(R.id.xarg).text.toString().toFloat()
            val freearg = findViewById<EditText>(R.id.freearg).text.toString().toFloat()
            val Disc: Float
            val a1 : Float
            val a2 : Float
            Disc = (xarg*xarg - 4*x2arg*freearg)
            if (Disc < 0) {
                Toast.makeText(this@MainActivity, "Ошибка, пирожочек", Toast.LENGTH_SHORT).show()
            }else{
                if (Disc == 0f){
                    a1 = (-xarg + kotlin.math.sqrt(Disc))/(2*x2arg)
                    Toast.makeText(this@MainActivity, "$a1", Toast.LENGTH_SHORT).show()
                }else {
                    a1 = (-xarg + kotlin.math.sqrt(Disc)) / (2 * x2arg)
                    a2 = (-xarg - kotlin.math.sqrt(Disc)) / (2 * x2arg)
                    Toast.makeText(this@MainActivity, "$a1, $a2", Toast.LENGTH_SHORT).show()
                }
            }

        }
        countButton.setOnClickListener(countEquation)
    }
}
