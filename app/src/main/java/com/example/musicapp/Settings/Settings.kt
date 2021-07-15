package com.example.musicapp.Settings

import android.content.ContentValues
import android.content.SharedPreferences
import android.content.res.Configuration
import android.database.Cursor
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
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


//        var songCursor: Cursor? = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
//        null,null,null,null)
//
//        while (songCursor!=null && songCursor.moveToNext()){
//            var songName = songCursor.getString(songCursor.getColumnIndex(MediaStore.Audio.Media.TITLE))
//            var songAuthor = songCursor.getString(songCursor.getColumnIndex(MediaStore.Audio.Media.ARTIST))
//
//        }



        back_bt.setOnClickListener {
            onBackPressed()
        }



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

}
