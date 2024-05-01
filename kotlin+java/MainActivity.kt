package com.example.geodash


import android.content.Intent
import android.widget.Toast

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.geodash.ui.theme.GeodashTheme
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            //onClickBtnJoueur(it)
            // Add your code here to handle the button click event
            // This code will be executed when the button is clicked
            // code below : when we click the button, another page open
//            val Intent = Intent(this,MainActivity2::class.java)
//            startActivity(Intent)
//         }
        }
    }
//    fun onClickBtnJoueur(V)

}

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        sv_wrapper.setOnScrollChangeListener { y, scrollx, scrollY, oldScrollX, oldScrollY ->
//            val totalScrollLength : sv_wrapper.getChildAt(0).height - sv_wrapper.height
//            progressBar.apply {
//                max = totalScrollLength
//                progress = scrollY
//            }
//        }
//    }
//}

//// derniere question chat gpt
//import android.content.Context
//import android.graphics.Canvas
//import android.graphics.Color
//import android.graphics.Paint
//import android.graphics.RectF
//import android.util.AttributeSet
//import android.view.View
//import kotlin.random.Random
//
//class GameView(context: Context, attrs: AttributeSet) : View(context, attrs) {
//
//    private val backgroundPaint = Paint().apply {
//        color = Color.WHITE // Set background color
//    }
//
//    private val obstaclePaint = Paint().apply {
//        color = Color.BLACK // Set obstacle color
//    }
//
//    // Variables for background scrolling
//    private var backgroundSpeed = 5
//    private var backgroundPosition = 0
//
//    // Variables for obstacle generation
//    private var obstacleWidth = 100f
//    private var obstacleGap = 400f
//    private var obstacles = mutableListOf<Obstacle>()
//
//    init {
//        generateObstacles()
//    }
//
//    override fun onDraw(canvas: Canvas) {
//        super.onDraw(canvas)
//
//        // Draw background
//        drawBackground(canvas)
//
//        // Draw obstacles
//        drawObstacles(canvas)
//
//        // Update background position
//        backgroundPosition += backgroundSpeed
//        if (backgroundPosition >= width) {
//            backgroundPosition = 0
//        }
//
//        // Move obstacles horizontally
//        obstacles.forEach { it.moveX(-backgroundSpeed) }
//
//        // Remove off-screen obstacles
//        obstacles.removeAll { it.rect.right <= 0 }
//
//        // Generate new obstacles if needed
//        if (obstacles.isEmpty() || obstacles.last().rect.right <= width - obstacleGap) {
//            generateObstacles()
//        }
//
//        // Schedule a redraw
//        invalidate()
//    }
//
//    private fun drawBackground(canvas: Canvas) {
//        val rect = RectF(backgroundPosition.toFloat(), 0f, (backgroundPosition + width).toFloat(), height.toFloat())
//        canvas.drawRect(rect, backgroundPaint)
//    }
//
//    private fun drawObstacles(canvas: Canvas) {
//        obstacles.forEach { obstacle ->
//            canvas.drawRect(obstacle.rect, obstaclePaint)
//        }
//    }
//
//    private fun generateObstacles() {
//        val obstacleHeight = Random.nextInt(height / 4, height / 2).toFloat()
//        val obstacleTop = Random.nextInt(0, height - obstacleHeight).toFloat()
//        val obstacle = Obstacle(width.toFloat(), obstacleTop, obstacleWidth, obstacleHeight)
//        obstacles.add(obstacle)
//    }
//
//    data class Obstacle(var x: Float, val y: Float, val width: Float, val height: Float) {
//        val rect: RectF = RectF(x, y, x + width, y + height)
//
//        fun moveX(deltaX: Int) {
//            x += deltaX
//            rect.left += deltaX
//            rect.right += deltaX
//        }
//    }
//}
