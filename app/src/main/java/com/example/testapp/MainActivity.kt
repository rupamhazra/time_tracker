 package com.example.testapp

import android.app.AlarmManager
import android.app.PendingIntent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
 import android.content.Intent
 import android.content.Context




 class MainActivity : AppCompatActivity() {

    lateinit var context: Context
     lateinit var alarmManager: AlarmManager

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         context=this
         alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

         val myBtn = findViewById<Button>(R.id.button1)
         val myTxt = findViewById<TextView>(R.id.textView2)




         myBtn.setOnClickListener {

             myTxt.text = "Text is changed"
             var sec = 10
             var i = Intent(context, MyBrodcastReceiver::class.java)
             var pi = PendingIntent.getBroadcast(context,0,i,PendingIntent.FLAG_UPDATE_CURRENT)


             alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (sec*1000),pi)


             Toast.makeText(applicationContext, "Alarm is set for $sec Seconds", Toast.LENGTH_SHORT).show();

         }




     }


}


