package com.jo.asyncview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val handler: Handler = Handler(Looper.getMainLooper())
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateText()
    }

    private fun updateText() {
        count++
        findViewById<TextView>(R.id.tv_test).text = count.toString()
        handler.postDelayed({
            updateText()
        }, 15L)
    }
}