package com.example.musicapp.baza_danych

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import kotlinx.android.synthetic.main.menu_recy_view_2.view.*
import java.io.IOException

class navi_view_recy_view_2_adapter: RecyclerView.Adapter<MyViewHolder>()
{
    override fun onCreateViewHolder(viewgroup: ViewGroup, id: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(viewgroup.context)
        val menu_p = layoutInflater.inflate(R.layout.menu_recy_view_2, viewgroup, false)
        return MyViewHolder(menu_p)
    }

    val TAG: String = "TAG"

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = holder.view.text_menu_1
        val image = holder.view.menu_image_1

       // //image.setImageResource()

        try {
            name.setText(Menu_database_1.names_menu_1[position])
        }catch (e: java.lang.IndexOutOfBoundsException){
            name.setText("XD WICNCEJ TEGO NIE MILI")
        }

        try {

            val context: Context = image.getContext()
            val id: Int = context.getResources().getIdentifier(Menu_database_1.image_names_menu_1[position].toString(), "drawable", context.getPackageName())
            image.setImageResource(id)
        }catch (e: IndexOutOfBoundsException){
            Log.d(TAG,e.toString())

            val context: Context = image.getContext()
            val id: Int = context.getResources().getIdentifier("@mipmap/tfujstary_round", "drawable", context.getPackageName())
            image.setImageResource(id)
        }
    }

    override fun getItemCount(): Int {
        return Menu_database_1.names_menu_1.size
        //return  32
    }
}
class MyViewHolder(val view: View): RecyclerView.ViewHolder(view)