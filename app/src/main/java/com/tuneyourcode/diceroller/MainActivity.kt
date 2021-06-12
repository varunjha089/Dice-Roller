package com.tuneyourcode.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is how you can interact with
//        val textView: TextView = findViewById(R.id.result_text);
//        textView.text = "this is new text"

        val rollButton: Button = findViewById(R.id.roll_button);
        // https://developer.android.com/reference/android/view/View.OnClickListener
        rollButton.setOnClickListener{
            // https://developer.android.com/guide/topics/ui/notifiers/toasts
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text);
        val randomInt = Random().nextInt(6) + 1

        resultText.text = randomInt.toString();
    }
}