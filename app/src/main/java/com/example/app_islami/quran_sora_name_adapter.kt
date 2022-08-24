package com.example.app_islami


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.app_islami.R

class quran_sora_name_adapter(val list: Array<String>) : Adapter<quran_sora_name_adapter.Sora_name_viewholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Sora_name_viewholder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.sora_name_recycler_view,parent,false)
      return Sora_name_viewholder(view)
    }

    override fun onBindViewHolder(holder: Sora_name_viewholder, position: Int) {
        holder.sora_name_textview.setText(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Sora_name_viewholder(val itemView : View) :RecyclerView.ViewHolder(itemView){
        //lateinit var sura_name_textview:TextView
       var sora_name_textview:TextView= itemView.findViewById(R.id.sora_name_recycler_view_title)


    }
}