package com.example.kwangsinsa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class slideradapter (private val c: Context): PagerAdapter() {
    private lateinit var li: LayoutInflater// 인플레이터

    val image= arrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e
    )
    // 페이지뷰와 생성된페이지가 일치하는지
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun getCount(): Int {
        return image.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        li=c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater// Context to inflater
        //슬라이더 xml 에서 인플레이터로 뷰 만듬
        val sliderView=li!!.inflate(R.layout.slider,null)
        val imageview=sliderView.findViewById(R.id.imageView) as ImageView
        //이미지 position 해당하는이미지 설정
        imageview.setImageResource(image[position])
        //
        container.addView(sliderView,0)
        return sliderView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.invalidate()
    }
}