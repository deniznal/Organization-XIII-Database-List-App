package com.example.cs394hw1.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cs394hw1.CharacterDetailActivity
import com.example.cs394hw1.R
import com.example.cs394hw1.model.Character

class CharacterListAdapter(val listOfCharacters: MutableList<Character>) : RecyclerView.Adapter<CharacterListAdapter.ItemViewHolder>(){
    class ItemViewHolder(val item: View): RecyclerView.ViewHolder(item) {
        val textView = item.findViewById<TextView>(R.id.name)

        private val CHARACTER_KEY = "CHARACTER"
        lateinit var character: Character

        init {
            item.setOnClickListener {
                val intent = Intent(item.context, CharacterDetailActivity::class.java)
                intent.putExtra(CHARACTER_KEY, character)
                item.context.startActivity(intent)
            }
        }
        fun bind(character: Character) {
            this.character = character
            textView.text = character.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.character_item_layout, parent, false)
        return ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val character = listOfCharacters[position]
        holder.bind(character)
    }

    override fun getItemCount(): Int {
        return listOfCharacters.size
    }

}
