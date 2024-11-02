package com.example.cs394hw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cs394hw1.adapter.CharacterListAdapter
import com.example.cs394hw1.data.DataSource
import com.example.cs394hw1.model.Character

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listOfCharacters = createCharactersList(13)

        recyclerView.adapter = CharacterListAdapter(listOfCharacters)
    }

    private fun createCharactersList(size: Int): MutableList<Character> {
        val listOfNames = DataSource(this).getNamesList()
        val listOfDescriptions = DataSource(this).getDescriptionsList()
        val listOfAppearances = DataSource(this).getAppearancesList()
        val listOfImgSrcs = DataSource(this).getImagesList();

        val listOfCharacters = mutableListOf<Character>()
        for (a in 0..size) {
            val character = Character(listOfNames[a], listOfDescriptions[a], listOfAppearances[a],listOfImgSrcs[a])
            listOfCharacters.add(character)
        }
        return listOfCharacters
    }
}