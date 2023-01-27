package com.example.kwangsinsa

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
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
        var btnarray= arrayOf<Button>(
            findViewById(R.id.button8),
            findViewById(R.id.button9),
            findViewById(R.id.button10),
            findViewById(R.id.button11))
        var fragmentarray= arrayOf<Fragment>(recommend(),rank())
        btnarray[0].paint!!.isUnderlineText=true
        val thread =Thread(NextPage())
        thread.start()
        for(i in btnarray.indices){
            btnarray[i].setOnClickListener{
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.one, fragmentarray[i])
                    addToBackStack(null)
                    commit()
                    for(j in btnarray.indices){
                        btnarray[j].setTextColor(Color.parseColor("#BDB7B7"))
                        btnarray[j].paint!!.isUnderlineText=false
                    }
                    btnarray[i].setTextColor(Color.parseColor("#070707"))
                    btnarray[i].paint!!.isUnderlineText=true


                }
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