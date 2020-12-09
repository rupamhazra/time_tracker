package com.example.testapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlarmOnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_on)

        var mp = MediaPlayer.create(applicationContext,R.raw.wake_up)
        mp.start()

        val myBtn = findViewById<Button>(R.id.buttonStop)
        myBtn.setOnClickListener {
            mp.stop()
        }
    }
}