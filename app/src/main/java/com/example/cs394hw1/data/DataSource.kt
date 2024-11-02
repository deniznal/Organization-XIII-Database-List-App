package com.example.cs394hw1.data

import android.content.Context
import com.example.cs394hw1.R

class DataSource(val context: Context) {
    fun getNamesList(): List<String> {
        return context.resources.getStringArray(R.array.character_names).toList()
    }

    fun getDescriptionsList(): List<String> {
        return context.resources.getStringArray(R.array.character_descriptions).toList()
    }

    fun getAppearancesList(): List<String> {
        return context.resources.getStringArray(R.array.character_appearances).toList()
    }

    fun getImagesList(): List<String> {
        return context.resources.getStringArray(R.array.character_images).toList()
    }
}