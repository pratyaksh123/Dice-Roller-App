package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var textview:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.dice_image)
        textview=findViewById(R.id.dice_Result_Text)
        val button: Button = findViewById(R.id.rollButton)
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val num = Random().nextInt(6) + 1
        val imageResource = when (num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        textview.text=num.toString()
        imageView.setImageResource(imageResource)
    }
}
