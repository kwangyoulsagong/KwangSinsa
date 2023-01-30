package com.example.kwangsinsa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class boutiqueslider(private val c: Context): PagerAdapter(){
    private lateinit var li: LayoutInflater// 인플레이터

    val image= arrayOf(
        R.drawable.b1,
        R.drawable.b2,
        R.drawable.b3,
        R.drawable.b4,
        R.drawable.b5,
        R.drawable.b6,


        )
    val recommendTitle= arrayOf(
        "NewJeans Love MUSINSA",
        "세터 23 S/S 컬렉션",
        "23.65 WINTER 방한 아이템",
        "올해의 그루밍, 1월의 맨즈 뷰티",
        "무신사 스탠다드 캐주얼 팬츠",
        "커버낫 23 S/S 컬렉션",
        "데일리 스웨트 & 후드",
        "미키 마우스 특별전 기념 굿즈",
        "하이드아웃 얼리버드 세일",
        "아울렛 알파 인더스트리 업데이트",
        "케주얼 원데이: 리트리버클럽",
        "낫포너드 인기 팬츠",
        "셀럽이 선택한 브랜드, 클로브",
        "우리가 새벽을 달리는 이유",
        "LUCID DREAM 이바다 컬렉션",
        "폴로 랄프 로렌 AO 컬렉션",
        "살로몬 스포츠 스타일 ACS+ OG",
        "엑스톤즈 23 S/S 컬렉션",
        "낫포너드 인기 팬츠",
        "아울렛 강추위 패딩 특가",

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
        val sliderView=li!!.inflate(R.layout.sliderboutique,null)
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