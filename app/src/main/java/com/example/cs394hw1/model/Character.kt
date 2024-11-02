package com.example.cs394hw1.model

import java.io.Serializable

data class Character(
    val name: String,
    val description: String,
    val appearsInList: String,
    val imgSrc: String
):Serializable

