package com.example.musicapp.Start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.musicapp.Info.Info
import com.example.musicapp.baza_danych.navi_view_racy_view_2_adapter
import kotlinx.android.synthetic.main.activity_start.*
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatDelegate
import com.example.musicapp.R
import com.example.musicapp.Settings.Settings
import com.example.musicapp.SharedPreferences.Constans
import com.example.musicapp.SharedPreferences.SharedPreferencesHelper
import kotlinx.android.synthetic.main.activity_settings.*
import kotlin.properties.Delegates



class Start : AppCompatActivity() {

    private lateinit var preferencesProvider: SharedPreferencesHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        preferencesProvider = SharedPreferencesHelper(applicationContext)
        if(preferencesProvider.getBoolean(Constans.DARK_MODE)){
           AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
           AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }


        //val dbHelper = SettingsDataBaseHelper(applicationContext)
        //val db = dbHelper.writableDatabase

       //saveData(applicationContext)


        //tworzenie context dla Start.kt i uruhomienie animacji dla ikony w menu
        shap_image_View.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_menu_app_ico))

        //utworzenie i załączenie adaptera dla recycler view
        val adater = navi_view_racy_view_2_adapter()
        recy_view_navi_view_1.layoutManager = GridLayoutManager(this, 2)
        recy_view_navi_view_1.adapter = adater

        //ustawienie click listenera dla recycler view
        adater.setOnItemClickListener(object : navi_view_racy_view_2_adapter.onItemClickListener {
            override fun onItemClick(position: Int) {

                //val context: Context = layout_menu_1.getContext()
                //val id: Int = context.getResources().getIdentifier("@drawable/circle_of_pain_clicked", "drawable", context.getPackageName())
                //layout_menu_1.setBackgroundResource(id)


                //-----------------------------------------------------------------------

                if (position == 0)
                {

                }

                //-----------------------------------------------------------------------

                if (position == 1)
                {

                }

                //-----------------------------------------------------------------------

                if (position == 2)
                {

                }

                //-----------------------------------------------------------------------

                if (position == 3)
                {

                    val Settings: Intent = Intent(applicationContext, Settings::class.java)
                    startActivity(Settings)
                }

                //-----------------------------------------------------------------------


                if (position == 4)
                {
                    val Info: Intent = Intent(applicationContext, Info::class.java)
                    startActivity(Info)
                }


                //if (position == 4){}



            }
        })


        //loadData()
       // updateView()

    }

    override fun onResume() {
        super.onResume()

    }








}