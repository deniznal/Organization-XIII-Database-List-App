package com.example.cs394hw1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.cs394hw1.model.Character
import com.example.cs394hw1.databinding.CharacterActivityDetailBinding

class CharacterDetailActivity : AppCompatActivity() {
    private val CHARACTER_KEY = "CHARACTER"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: CharacterActivityDetailBinding = DataBindingUtil.setContentView(this, R.layout.character_activity_detail)
        val pickedCharacter = intent.getSerializableExtra(CHARACTER_KEY) as Character


        binding.character = pickedCharacter
        val drawableId = resources.getIdentifier(pickedCharacter.imgSrc, "drawable", packageName)
        binding.imageView.setImageResource(drawableId)
    }
}