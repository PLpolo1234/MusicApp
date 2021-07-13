package com.example.musicapp.Settings

import android.content.ContentValues
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.musicapp.R
import com.example.musicapp.SharedPreferences.Constans
import com.example.musicapp.SharedPreferences.SharedPreferencesHelper
import kotlinx.android.synthetic.main.activity_settings.*
import kotlin.properties.Delegates

class Settings : AppCompatActivity() {

    val SHARED_PREFS = "sharedPrefs"
    val DARK_MODE = "dark_mode"

    private lateinit var preferencesProvider: SharedPreferencesHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        preferencesProvider = SharedPreferencesHelper(applicationContext)
        if(preferencesProvider.getBoolean(Constans.DARK_MODE)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            night_mode.isChecked = true
        }else{
            night_mode.isChecked = false
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }


        night_mode.setOnCheckedChangeListener { compoundButton, onSwitch ->
            preferencesProvider.putBoolean(Constans.DARK_MODE,night_mode.isChecked)
            if (night_mode.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume hehehe")
    }


    //fun saveData(){
    //    val sharedPreferences: SharedPreferences = this.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE)
    //    val editor: SharedPreferences.Editor = sharedPreferences.edit()
//
    //    editor.putBoolean(DARK_MODE, night_mode.isChecked())
    //    editor.apply()
    //}
//
    //fun loadData(){
    //    val sharedPreferences: SharedPreferences = this.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE)
    //    setting_dark_mode = sharedPreferences.getBoolean(DARK_MODE, false)
    //}
//
    //fun updateView(){
    //    night_mode.isChecked = setting_dark_mode
    //    if (setting_dark_mode==true){
    //        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    //    }
    //    if (setting_dark_mode==false){
    //        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    //    }
    //}





}
