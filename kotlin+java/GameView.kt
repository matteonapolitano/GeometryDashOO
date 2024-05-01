package com.example.geodash

import android.content.Context
import android.view.SurfaceHolder
import android.view.SurfaceView

class GameView(context: Context) : SurfaceView(context), SurfaceHolder.Callback {

    private lateinit var gameThread: GameThread

    init {
        holder.addCallback(this)
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        // Implement this method based on your needs
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
        var retry = true
        while (retry) {
            try {
                gameThread.join()
                retry = false
            } catch (e: InterruptedException) {
                // Handle the exception
            }
        }
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        if (!gameThread.isRunning) {
            gameThread = GameThread(holder)
            gameThread.start()
        } else {
            gameThread.start()
        }
    }

    fun initView() {
        val holder = holder
        holder.addCallback(this)
        isFocusable = true

        gameThread = GameThread(holder)
    }
}


