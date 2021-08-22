package com.guigoverso.treinamento.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var dice: Dice
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        dice = Dice(6)
        rollButton.setOnClickListener { rollDice() }
        rollDice()
    }

    private fun rollDice() {
        findViewById<ImageView>(R.id.dice_image).setImageResource(
            when(dice.roll()) {
              1 -> R.drawable.dice_1
              2 -> R.drawable.dice_2
              3 -> R.drawable.dice_3
              4 -> R.drawable.dice_4
              5 -> R.drawable.dice_5
              else -> R.drawable.dice_6
            }
        )
    }
}