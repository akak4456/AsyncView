package com.jo.asyncview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class VerySlowSyncView(context: Context, attrs :AttributeSet? = null) : View(context ,attrs) {

    private var sum: Long = 0L
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.run {
            verySlowOperation()
            drawRect(0f,0f,100f,100f, Paint().apply {
                color = Color.RED
            })
        }
    }

    private fun verySlowOperation() {
        for(i in 0 until 1000000000) {
            sum += i.toLong()
        }
    }
}