package com.andi.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CardHeroAdapter(val listHero:ArrayList<Hero>):RecyclerView.Adapter<CardHeroAdapter.CardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CardViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_card_hero,parent,false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val hero = listHero[position]
        holder.imgPhoto.setImageResource(hero.photo)
        holder.tvDetail.text=hero.detail
        holder.tvName.text=hero.name

        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context,"Favorite "+listHero[holder.absoluteAdapterPosition].name,Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listHero[holder.absoluteAdapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listHero[holder.absoluteAdapterPosition].name, Toast.LENGTH_SHORT).show() }
    }


    override fun getItemCount(): Int {
        return listHero.size
    }

    class CardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}