package com.example.estudioforlabo6.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.estudio_corto.Pojos.Pokemon
import com.example.estudio_corto.R


class pokemonAdapter(var pokemons: List<Pokemon>): RecyclerView.Adapter<pokemonAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): pokemonAdapter.ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    override fun onBindViewHolder(p0: pokemonAdapter.ViewHolder, p1: Int) {
        p0.bind(pokemons[p1])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private lateinit var pokemon: Pokemon

        fun bind(pokemon: Pokemon) = with(itemView) {
            pokemon
        }
    }

}