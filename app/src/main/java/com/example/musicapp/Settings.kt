package com.example.musicapp

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

       //val TAG: String = "TAG"

       //val appSettingPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
       //val sharedPrefsEdit: SharedPreferences.Editor = appSettingPrefs.edit()
       //val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode", false)



        button1.setOnClickListener {
            // 3
            val isNightTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            // 4
            when (isNightTheme)
            {
                Configuration.UI_MODE_NIGHT_YES ->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Configuration.UI_MODE_NIGHT_NO ->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }


        xd.setOnClickListener(View.OnClickListener {

            val test: Intent = Intent(applicationContext, test1::class.java)
            startActivity(test)

        })

        main_fff.setOnClickListener(View.OnClickListener {

            val test: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(test)

        })


    }






}
