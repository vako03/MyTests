package com.example.mytests

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    Log.i("MYTAG","MainActivity : OnCreate")

        val mainText = findViewById<TextView>(R.id.tvHello)
        val enterName = findViewById<EditText>(R.id.etName)
        val button = findViewById<Button>(R.id.btnSubmit)
        val offersButton = findViewById<Button>(R.id.bynOffers)

        var enteredName = ""
        button.setOnClickListener {
         enteredName = enterName.text.toString()
            if (enteredName == "") {
                offersButton.visibility=INVISIBLE
                mainText.text=""
                Toast.makeText(
                    this@MainActivity, "Please," +
                            "enter your name", Toast.LENGTH_SHORT
                ).show()

            } else {
                val welcomeText = "WELCOME $enteredName"
                Log.i("MYTAG",welcomeText)
                mainText.text = welcomeText
                enterName.text.clear()

                offersButton.visibility=VISIBLE
            }
        }
        offersButton.setOnClickListener {
            val intent = Intent(this,SecondAvtivity::class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity : OnStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity : OnCResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity : OnPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity : OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity : OnDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")

    }
}