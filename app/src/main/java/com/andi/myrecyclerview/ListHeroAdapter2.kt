package com.andi.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHeroAdapter2(private val listHero:ArrayList<Hero> ):RecyclerView.Adapter<ListHeroAdapter2.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view:View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_hero2,viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]
        holder.imgFoto.setImageResource(hero.photo)
        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgFoto : ImageView = itemView.findViewById(R.id.tv_img_item)

    }
}