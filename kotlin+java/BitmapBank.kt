package com.example.geodash

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class BitmapBank(resources: Resources) {

    private lateinit var backround_game: Bitmap

    init {
        backround_game = BitmapFactory.decodeResource(resources, R.drawable.backround_game)
    }

    fun getBackround_game(): Bitmap {
        return backround_game
    }

    fun getBackroundWidth(): Int {
        return backround_game.width
    }

    fun getBackroundHeight(): Int {
        return backround_game.height
    }
}

