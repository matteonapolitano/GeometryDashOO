package com.example.geodashoo

import android.content.Context
import android.media.MediaPlayer

class MusicPlayer(private val context: Context) {
    private var mediaPlayer: MediaPlayer? = null

    fun playMusic(resourceId: Int) {
        stopMusic() // Stop currently playing music
        mediaPlayer = MediaPlayer.create(context, resourceId)
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()
    }

    fun stopMusic() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
