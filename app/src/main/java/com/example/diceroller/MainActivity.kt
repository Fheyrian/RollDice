package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.Utility.GeneralUtility
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var diceImage : ImageView
//    lateinit var diceImage2 : ImageView

    lateinit var variable1 : String

    var viewModel = MainActivityViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
        initVariables()
        initFunctions()
    }

    fun initListeners(){
        roll_button.setOnClickListener {
            viewModel.save()
            dice_image1.setImageResource(getRandomImage())
            dice_image2.setImageResource(getRandomImage())
        }

        dice_image1.setOnClickListener {
//            var generalUtility = GeneralUtility()
//            var date = generalUtility.getDate()
        }

    }

    fun initVariables(){
        variable1 = "ini variable 1"
    }

    fun initFunctions(){
        rollDice()
    }

    private fun rollDice(){
        dice_image1.setImageResource(getRandomImage())
        dice_image2.setImageResource(getRandomImage())
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()


        //lesson 2, dice number
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()

//        val diceImage : ImageView = findViewById(R.id.dice_image1)

        //          val drawableResource = when (randomInt)
//        diceImage.setImageResource(drawableResource)
    }

    private fun getRandomImage() : Int{
        val randomInt = (1..6).random()

        return when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

//    private fun countup(){
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
//
//        val resultText : TextView = findViewById(R.id.result_text)
//
//        if (resultText.text == "Hello World!"){
//            resultText.text = "1"
//        } else {
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6){
//                resultInt += 1
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}