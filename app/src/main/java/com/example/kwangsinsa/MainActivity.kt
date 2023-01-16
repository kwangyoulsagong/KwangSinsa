package com.example.kwangsinsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.FrameLayout
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private var current =0
    val handler=Handler(Looper.getMainLooper()){
        setslide()
        true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager=findViewById(R.id.container)
        viewPager.adapter=slideradapter(this)



        val thread =Thread(NextPage())
        thread.start()
        findViewById<Button>(R.id.button9).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.one,rank())
                addToBackStack(null)
                commit()
            }
        }
    }
    fun setslide(){
        if(current==5){
            current=0
        }
        else{
            viewPager.setCurrentItem(current++,true)
        }
    }
    inner class NextPage:Runnable{
        override fun run() {
            while(true){
                Thread.sleep(3000)
                handler.sendEmptyMessage(0)
            }

        }
    }
}