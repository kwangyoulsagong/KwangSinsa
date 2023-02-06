package com.example.kwangsinsa

import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.size
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import java.nio.file.Files.size


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
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
        var textviewbtn= arrayOf<TextView>(findViewById(R.id.textView30))
        var classarr= arrayOf(boutique())
        for(i in textviewbtn.indices){
            textviewbtn[i].setOnClickListener{
                var intent= Intent(this,classarr[i]::class.java)
                startActivity(intent)
            }
        }
        var ranknum= arrayOf<TextView>(findViewById(R.id.textView53),findViewById(R.id.textView54),findViewById(R.id.textView57),
            findViewById(R.id.textView68),findViewById(R.id.textView71),findViewById(R.id.textView74),findViewById(R.id.textView77),
            findViewById(R.id.textView80),findViewById(R.id.textView83),findViewById(R.id.textView86))

        var rankimagecont= arrayOf<ImageView>(findViewById(R.id.imageView5),findViewById(R.id.imageView6),findViewById(R.id.imageView9),
            findViewById(R.id.imageView10),findViewById(R.id.imageView11),findViewById(R.id.imageView15),findViewById(R.id.imageView16),
            findViewById(R.id.imageView17),findViewById(R.id.imageView18),findViewById(R.id.imageView19))

        var rankimage= arrayOf(
            R.drawable.r1,
            R.drawable.r2,
            R.drawable.r3,
            R.drawable.r4,
            R.drawable.r5,
            R.drawable.r6,
            R.drawable.r7,
            R.drawable.r8,
            R.drawable.r9,
            R.drawable.r10)


        for(i in ranknum.indices){
            ranknum[i].text="${i+1}"
            rankimagecont[i].setImageResource(rankimage[i])
            rankimagecont[i].setOnClickListener{
                var intent= Intent(this,msshoppingpage::class.java)
                intent.putExtra("key",i.toString())
                startActivity(intent)
            }
        }
    }
    fun setslide(){
        if(viewPager.getCurrentItem()<19){
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }else{
            viewPager.setCurrentItem(0);
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