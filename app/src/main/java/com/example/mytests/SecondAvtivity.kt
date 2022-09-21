package com.example.mytests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class SecondAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_avtivity)
        Log.i("MYTAG","SecondActivity : OnCResume")

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)

        val message = "$userName , you will ger free access to all the content for one month"

        textView.text=message
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","SecondActivity : OnStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","SecondActivity : OnCResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","SecondActivity : OnPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","SecondActivity : OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","SecondActivity : OnDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","SecondActivity : OnRestart")

    }
}
