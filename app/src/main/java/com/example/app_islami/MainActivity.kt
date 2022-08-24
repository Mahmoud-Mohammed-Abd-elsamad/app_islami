package com.example.app_islami

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mHandler = Handler()
        val monitor: Runnable = Runnable {
            // do my stuff
            //mHandler.postDelayed(startmethodactivity(), 1000) // 1 second   private  var handler = Handler()
        }
    }

    private fun startmethodactivity() {
        val intent = Intent(this, Home_screen::class.java)
        startActivity(intent)
        finish()

    }
}