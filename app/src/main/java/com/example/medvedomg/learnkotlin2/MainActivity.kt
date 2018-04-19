package com.example.medvedomg.learnkotlin2

import android.animation.Animator
import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "scrollview height : ${scrollView.height}")
        Log.d("TAG", "image height : ${image.height}")

        scrollView.isScrollable = false
        Handler().postDelayed({
            //            scrollView.smoothScrollTo(0, image.height)
            val object222: ObjectAnimator = ObjectAnimator.ofInt(scrollView, "scrollY", 0, image.height)
            object222.repeatCount = 100
            object222.addListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator) {
                    // Do nothing.
                }

                override fun onAnimationEnd(animation: Animator) {
                    scrollView.scrollTo(0, 0)
                }

                override fun onAnimationCancel(animation: Animator) {
                }

                override fun onAnimationRepeat(animation: Animator) {
                    // Do nothing.
                }
            })
            object222.start()
        }, 3000)



        scrollView.setOnTouchListener { view, motionEvent ->
            Log.d("TAG", "")
            false
        }
        Log.d("TAG", "scrollView.maxScrollAmount : ${scrollView.maxScrollAmount}")

    }

}
