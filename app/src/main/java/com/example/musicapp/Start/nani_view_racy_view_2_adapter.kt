package com.example.musicapp.baza_danych

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.Start.Menu_database_1
import kotlinx.android.synthetic.main.menu_recy_view_2.view.*

class navi_view_racy_view_2_adapter: RecyclerView.Adapter<MyViewHolder>()
{

    private var meda_1 = Menu_database_1.image_names_menu_1
    private lateinit var mListener : onItemClickListener

    interface onItemClickListener
    {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener)
    {
        mListener = listener
    }



    override fun onCreateViewHolder(viewgroup: ViewGroup, id: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(viewgroup.context)
        val menu_p = layoutInflater.inflate(R.layout.menu_recy_view_2, viewgroup, false)


        return MyViewHolder(menu_p, mListener)
    }

    private val tag: String = "TAG"



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = holder.view.text_menu_1
        val image = holder.view.menu_image_1
        val context_name: Context = name.getContext()
        val context_image: Context = image.context


        try {


            lateinit var menu_texts_1: String

            if(position==0){ menu_texts_1 = context_name.getString(R.string.The_lasts)}
            if(position==1){ menu_texts_1 = context_name.getString(R.string.Loved)}
            if(position==2){ menu_texts_1 = context_name.getString(R.string.Playlist)}
            if(position==3){ menu_texts_1 = context_name.getString(R.string.Settings)}
            if(position==4){ menu_texts_1 = context_name.getString(R.string.Info)}

            name.text = menu_texts_1

        }catch (e: java.lang.IndexOutOfBoundsException){
            name.text = context_name.getString(R.string.No_more)
        }

        try {
            val id: Int = context_image.resources.getIdentifier("@drawable/"+ meda_1[position], "drawable", context_image.packageName)
            image.setImageResource(id)

        }catch (e: IndexOutOfBoundsException){
            Log.d(tag,e.toString())
            val id: Int = context_image.resources.getIdentifier("@mipmap/tfujstary_round", "drawable", context_image.packageName)
            image.setImageResource(id)
        }
    }

    override fun getItemCount(): Int {
        return meda_1.size
        //return  2
    }
}
class MyViewHolder(val view: View, listener: navi_view_racy_view_2_adapter.onItemClickListener): RecyclerView.ViewHolder(view)
{

    init {
        view.setOnClickListener{

            listener.onItemClick(adapterPosition)

        }
    }
}