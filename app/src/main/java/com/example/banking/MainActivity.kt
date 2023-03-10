package com.example.banking

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.widget.TextView

//private lateinit var textView: TextView

class MainActivity : AppCompatActivity() {

    private lateinit var but_plus: Button
    private lateinit var but_minus: Button
    private lateinit var but_reset: Button
    private lateinit var tvalue: TextView
    private var mValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //textView = findViewById(R.id.textView)
        setContentView(R.layout.activity_main)

        tvalue = findViewById(R.id.count)

        findViewById<Button?>(R.id.plus_button).setOnClickListener {
            mValue++
            tvalue.setText(mValue.toString())


        }
        findViewById<Button?>(R.id.minus_button).setOnClickListener {
            mValue--
            tvalue.setText(mValue.toString())
        }
        //but_reset =
        findViewById<Button?>(R.id.reset_button).setOnClickListener {
            mValue=0
            tvalue.setText(mValue.toString())
//            Toast.make(v, "Counter was reset", Snackbar.LENGTH_SHORT)
//                .setAction("Undo") { ignored ->
//                    mValue = oldValue
//                    updateValue()
//                }
//                .show()
Toast.makeText(this, "Reset was successful", Toast.LENGTH_SHORT).show()

        }
    }

//    fun toastMe(view: View) {
//        // val myToast = Toast.makeText(this, message, duration);
//        val myToast = Toast.makeText(this, "Сияй звездочкой!", Toast.LENGTH_SHORT)
//        myToast.show()
//        //count = 0
//    }
//
//    fun countMe (view: View) {
//        // Get the value of the text view
//        val countString = textView.text.toString()
//        // Convert value to a number and increment it
//        var count: Int = Integer.parseInt(countString)
//        count++
//        // Display the new value in the text view. textView.
//        textView.text = count.toString();
//    }
}