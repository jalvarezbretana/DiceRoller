package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var ballImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        ballImage = findViewById(R.id.ball_image)
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(7) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.ball1
            2 -> R.drawable.ball2
            3 -> R.drawable.ball3
            4 -> R.drawable.ball4
            5 -> R.drawable.ball5
            6 -> R.drawable.ball6
            else -> R.drawable.ball7
        }

        ballImage.setImageResource(drawableResource)
    }
}