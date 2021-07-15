package com.example.musicapp.SharedPreferences

import android.content.Context

class  SharedPreferencesHelper(context: Context){

    private val sharedPreferences = context.getSharedPreferences("Settings",0)

    fun putBoolean(key: String, value: Boolean){
        sharedPreferences.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String): Boolean{
        return sharedPreferences.getBoolean(key, false)
    }



    fun putString(key: String, value: String){
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String? {
        return sharedPreferences.getString(key, null)
    }



    fun putInt(key: String, value: Int){
        sharedPreferences.edit().putInt(key, value).apply()
    }

    fun getInt(key: String): Int{
        return sharedPreferences.getInt(key, 0)
    }




}
