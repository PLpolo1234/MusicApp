package com.example.musicapp.baza_danych

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import kotlinx.android.synthetic.main.menu_recy_view_2.view.*

class navi_view_recy_view_2_adapter: RecyclerView.Adapter<MyViewHolder>()
{
    override fun onCreateViewHolder(viewgroup: ViewGroup, id: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(viewgroup.context)
        val menu_p = layoutInflater.inflate(R.layout.menu_recy_view_2, viewgroup, false)
        return MyViewHolder(menu_p)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = holder.view.text_menu_1
        val image = holder.view.menu_image_1

        name.setText(Menu_database_1.names_menu_1[position])
       // //image.setImageResource()
       // val context: Context = image.getContext()
       // val id: Int = context.getResources().getIdentifier(Menu_database_1.image_names_menu_1.toString(), "drawable", context.getPackageName())
       // image.setImageResource(id)
    }

    override fun getItemCount(): Int {
        return 2
    }
}
class MyViewHolder(val view: View): RecyclerView.ViewHolder(view)