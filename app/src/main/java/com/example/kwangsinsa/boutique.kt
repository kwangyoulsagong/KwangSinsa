package com.example.kwangsinsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class boutique : AppCompatActivity() {
    private lateinit var bqPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boutique)
        bqPager=findViewById(R.id.container2)
        bqPager.adapter=boutiqueslider(this)
    }
}