package com.example.kwangsinsa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class slideradapter(private val c: Context): PagerAdapter() {
    private lateinit var li: LayoutInflater// 인플레이터

    val image= arrayOf(
        R.drawable.m1,
        R.drawable.f,
        R.drawable.b,
        R.drawable.newjins,
        R.drawable.p,
        R.drawable.z,
        R.drawable.winter,
        R.drawable.e
    )
    val recommendTitle= arrayOf(
        "데일리 스웨트 & 후드",
        "휴대용 세재 반격 세일 ",
        "F/W23 컴공스럽다를 듣고싶은 패션",
        "NewJeans Love MUSINSA",
        "저스틴 비버를 능가하는 '힙' 패션",
        "누가봐도 홀릴수있는 댄디한 남자 패션",
        "아울렛 강추위 패딩 특가",
        "수리남 대통령이 쓰던 이탈리안 장인이 만든 나폴레옹 안경"
    )
    // 페이지뷰와 생성된페이지가 일치하는지
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun getCount(): Int {
        return image.size
        return recommendTitle.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        li=c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater// Context to inflater
        //슬라이더 xml 에서 인플레이터로 뷰 만듬
        val sliderView=li!!.inflate(R.layout.slider,null)
        val imageview=sliderView.findViewById(R.id.imageView) as ImageView
        val title=sliderView.findViewById(R.id.Topid)as TextView
        val page=sliderView.findViewById(R.id.page)as TextView
        //이미지 position 해당하는이미지 설정
        imageview.setImageResource(image[position])
        title.setText(recommendTitle[position])
        page.text=(position+1).toString()+" "+"/"+" "+"8"
        //
        container.addView(sliderView,0)
        return sliderView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.invalidate()
    }
}