package com.kadirhankeles.ikilizar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var dice1Image : ImageView   //lateinit var başka yerde de kullanacağımızı gösterir. başka yerde kullanmayacak olsaydık val yazabilirdik.
    lateinit var dice2Image : ImageView
    lateinit var diceButton: Button
    lateinit var diceView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice1Image = findViewById(R.id.dice1Image)
        dice2Image = findViewById(R.id.dice2Image)
        diceButton = findViewById(R.id.diceButton)
        diceView = findViewById(R.id.diceView)

    }

    fun rollDice (view: View ){
        val randomNumber1 = (1..6).random()
        val randomNumber2 = (1..6).random()
        val total = randomNumber1+randomNumber2
        val diceNumber1 = when(randomNumber1) { //zar numaralarına fotoğraf ataması yaptık.
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        val diceNumber2 = when(randomNumber2) { //zar numaralarına fotoğraf ataması yaptık.
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        dice1Image.setImageResource(diceNumber1) //Sayıya göre fotoğrafı ayarlama kısmı
        dice2Image.setImageResource(diceNumber2)
        diceView.setText("Sum of Dice: "+total)
    }
}