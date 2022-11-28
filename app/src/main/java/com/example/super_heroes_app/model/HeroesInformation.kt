package com.example.super_heroes_app.model

import com.example.super_heroes_app.R

object HeroesRepo{
    val heroes = listOf(
        Hero(
            nameRes = R.string.name_hero1,
            descriptionRes = R.string.description_hero1,
            imageRes = R.drawable.android_superhero1
        ),
        Hero(
            nameRes = R.string.name_hero2,
            descriptionRes = R.string.description_hero2,
            imageRes = R.drawable.android_superhero2
        ),
        Hero(
            nameRes = R.string.name_hero3,
            descriptionRes = R.string.description_hero3,
            imageRes = R.drawable.android_superhero3
        ),
        Hero(
            nameRes = R.string.name_hero4,
            descriptionRes = R.string.description_hero4,
            imageRes = R.drawable.android_superhero4
        ),
        Hero(
            nameRes = R.string.name_hero5,
            descriptionRes = R.string.description_hero5,
            imageRes = R.drawable.android_superhero5
        ),
        Hero(
            nameRes = R.string.name_hero6,
            descriptionRes = R.string.description_hero6,
            imageRes = R.drawable.android_superhero6
        )
    )
}