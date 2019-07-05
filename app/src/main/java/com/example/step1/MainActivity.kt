package com.example.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
            // Check if the text fields are empty (otherwise casting to float results in crash)
            if (x2arg.toString().isEmpty() || xarg.toString().isEmpty() || freearg.toString().isEmpty()) {
                Toast.makeText(this@MainActivity, "Поля не могут быть пустыми", Toast.LENGTH_LONG).show()
            }
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
