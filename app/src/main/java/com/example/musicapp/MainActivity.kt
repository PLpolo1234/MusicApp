package com.example.musicapp

import android.app.Activity
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val b = findViewById<>()



//       val appSettingPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
//       val sharedPrefsEdit: SharedPreferences.Editor = appSettingPrefs.edit()
//       val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode", false)

//       if(isNightModeOn){
//          AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//           button4.text = "Disable Dark Mode"
//        else {
//          AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//               button4.text = "Enable Dark Mode"


//               button4.setOnClickListener(View.OnClickListener {
//          if(isNightModeOn){
//              AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//              sharedPrefsEdit.putBoolean("NightMode", false)
//              sharedPrefsEdit.apply()

//          } else {
//              AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//              sharedPrefsEdit.putBoolean("NightMode", true)
//              sharedPrefsEdit.apply()

//          }


//       })

    }
}