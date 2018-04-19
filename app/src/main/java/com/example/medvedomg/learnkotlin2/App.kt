package com.example.medvedomg.learnkotlin2

import android.app.Application
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*


class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }

//    var screenCenterX = resources.displayMetrics.widthPixels.div(2).toDouble()
//    val screenCenterY = resources.displayMetrics.heightPixels.div(2).toDouble()
//    val maxHypo = Math.hypot(screenCenterX, screenCenterY)
//
//
//    var alpha = 1.0
//    Log.d("TAG", "width : ${imageView.width}")
//
//    var xCoOrdinate: Float = 0F
//    var yCoOrdinate: Float = 0F
//
//    imageView.setOnTouchListener { view, event ->
//        /**
//         * Calculate hypo value of current imageview position according to center
//         */
//        val centerYPos = imageView.y + imageView.height / 2
//        val centerXPos = imageView.x + imageView.width / 2
//        val a = resources.displayMetrics.widthPixels.div(2) - centerXPos
//        val b = -centerYPos
//        val hypo = Math.hypot(a.toDouble(), b.toDouble())
//
//
//        /**
//         * change alpha of background of layout
//         */
//        alpha = (hypo * 255).div(maxHypo)
//        if (alpha < 255)
//            view.background.alpha = 255 - alpha.toInt()
//
//        when (event.getActionMasked()) {
//            MotionEvent.ACTION_DOWN -> {
//                xCoOrdinate = imageView.getX() - event.getRawX()
//                yCoOrdinate = imageView.getY() - event.getRawY()
//            }
//            MotionEvent.ACTION_MOVE -> imageView.animate().x(event.getRawX() + xCoOrdinate).y(event.getRawY() + yCoOrdinate).setDuration(0).start()
//            MotionEvent.ACTION_UP -> {
//                if (alpha > 70) {
//                    supportFinishAfterTransition()
//                    false
//                } else {
//                    imageView.animate().x(0.toFloat()).y(screenCenterY as Float - imageView.getHeight() / 2).setDuration(100).start()
//                    view.background.alpha = 255
//                }
//                false
//            }
//            else ->  false
//        }
//        true
//    }
}