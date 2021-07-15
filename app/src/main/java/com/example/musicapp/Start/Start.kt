package com.example.musicapp.Start

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicapp.Info.Info
import com.example.musicapp.R
import com.example.musicapp.Settings.Settings
import com.example.musicapp.SharedPreferences.Constans
import com.example.musicapp.SharedPreferences.SharedPreferencesHelper
import com.example.musicapp.Start.Models.SongModel
import com.example.musicapp.baza_danych.navi_view_racy_view_2_adapter
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import kotlinx.android.synthetic.main.activity_start.*
import java.io.File
import com.karumi.dexter.listener.single.PermissionListener



class Start : AppCompatActivity(), PermissionListener {

    private lateinit var preferencesProvider: SharedPreferencesHelper

    //lateinit var items: ArrayList<String>
    var songModelData:ArrayList<SongModel> = ArrayList()
    var listView: ListView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        runtimePermission()
        Songsss_list_and_more()


        preferencesProvider = SharedPreferencesHelper(applicationContext)
        if (preferencesProvider.getBoolean(Constans.DARK_MODE)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }


        //tworzenie context dla Start.kt i uruhomienie animacji dla ikony w menu
        shap_image_View.startAnimation(
            AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.rotate_menu_app_ico
            )
        )

        //utworzenie i załączenie adaptera dla recycler view
        val adater = navi_view_racy_view_2_adapter()
        recy_view_navi_view_1.layoutManager = GridLayoutManager(this, 2)
        recy_view_navi_view_1.adapter = adater

        //displaySong()


        //ustawienie click listenera dla recycler view
        adater.setOnItemClickListener(object : navi_view_racy_view_2_adapter.onItemClickListener {
            override fun onItemClick(position: Int) {

                //-----------------------------------------------------------------------

                if (position == 0) {

                }

                //-----------------------------------------------------------------------

                if (position == 1) {

                }

                //-----------------------------------------------------------------------

                if (position == 2) {

                }

                //-----------------------------------------------------------------------

                if (position == 3) {

                    val Settings: Intent = Intent(applicationContext, Settings::class.java)
                    startActivity(Settings)
                }

                //-----------------------------------------------------------------------


                if (position == 4) {
                    val Info: Intent = Intent(applicationContext, Info::class.java)
                    startActivity(Info)
                }


                //if (position == 4){}


            }
        })


    }

    override fun onPermissionGranted(p0: PermissionGrantedResponse?) {
        Songsss_list_and_more()
    }

    override fun onPermissionDenied(p0: PermissionDeniedResponse?) {

    }

    override fun onPermissionRationaleShouldBeShown(p0: PermissionRequest?, p1: PermissionToken?) {

    }

    fun runtimePermission() {
        Dexter.withContext(this)
            .withPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            .withListener(this)
            .check()
    }

    fun Songsss_list_and_more(){
        var songCursor: Cursor? = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
        null,null,null,null)

        while (songCursor!=null && songCursor.moveToNext()){
            var songName = songCursor.getString(songCursor.getColumnIndex(MediaStore.Audio.Media.TITLE))
            songModelData.add(SongModel(songName))
        }

        val adater_music_lis = Music_revi_adapter(songModelData)
        listView_songs.layoutManager = LinearLayoutManager(this)
        listView_songs.adapter = adater_music_lis

    }

}





