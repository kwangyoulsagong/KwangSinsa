package com.example.kwangsinsa

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.net.URL

class shoppingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_page)
        var numbers=intent.getStringExtra("key")
        var banner=findViewById<TextView>(R.id.textView87)
        var bannerText=findViewById<TextView>(R.id.textView88)
        var company=findViewById<TextView>(R.id.textView91)
        var infot=findViewById<TextView>(R.id.info)
        var bannert1=findViewById<TextView>(R.id.bannert1)
        var bannert2=findViewById<TextView>(R.id.bannert2)
        var bannert3=findViewById<TextView>(R.id.bannert3)
        var bannertsale=findViewById<TextView>(R.id.bannersale)
        var bannerimg=findViewById<ImageView>(R.id.bannerimg)
        var infoimg1=findViewById<ImageView>(R.id.infoimg1)
        var infoimg2=findViewById<ImageView>(R.id.infoimg2)
        var infoimg3=findViewById<ImageView>(R.id.infoimg3)
        var infoimg4=findViewById<ImageView>(R.id.infoimg4)

        when(numbers){
            "0" ->{banner.setBackgroundColor(Color.parseColor("#dddddd"))
            bannerText.text="GOODLIFEWORKS"
            bannerText.setTextColor(Color.BLACK)
            company.text=""
            infot.text="한정판매\n" +
                    "무신사 스토어를 포함한 제한된 판매처에서만 구매 가능한 상품입니다.\n" +
                    "조회수(1개월 갱신)\t      5.5만 회 이상\n" +
                    "누적판매(1년 갱신)도움말 보기\t     500개 이상\n" +
                    "품번 / 브랜드\t   23SSGJ02BK / GLW\n" +
                    "시즌도움말 보기 / 성별\t  2023 SS / 남성여성\n" +
                    "출고 정보도움말 보기\t     02.13 출고\n" +
                    "배송 정보\t  국내 배송 / 입점사 배송 / CJ대한통운"
            bannert1.text="아우터 > 트러커 재킷 (굿라이프웍스)"
            bannert2.text="히든 스트링 크롭 데님자켓 블랙"
            bannert3.text="HIDDEN STRING CROP DENIM JACKET BLACK"
            bannertsale.text="56,235~69,000원"
            bannerimg.setImageResource(R.drawable.o)
            infoimg4.setImageResource(R.drawable.rnof)
            infoimg1.setImageResource(R.drawable.rnoo)
            infoimg2.setImageResource(R.drawable.rnot)
            infoimg3.setImageResource(R.drawable.rnoth)
            }
            "1" ->{
                bannerText.text="Magoodgan"

                company.text=""
                infot.text="한정판매\n" +
                        "무신사 스토어를 포함한 제한된 판매처에서만 구매 가능한 상품입니다.\n" +
                        "조회수(1개월 갱신)\t    4.4만 회 이상\n" +
                        "누적판매(1년 갱신)도움말 보기\t    900개 이상\n" +
                        "품번 / 브랜드\t  MFB_7505_31_22C / MAGOODGAN\n" +
                        "시즌도움말 보기 / 성별\t 2022 FW / 남성여성\n" +
                        "출고 정보도움말 보기\t   02.28 출고\n" +
                        "배송 정보\t  국내 배송 / 입점사 배송"
                bannert1.text="바지 > 데님 팬츠 (맥우드건)"
                bannert2.text="파번 7505 카펜터 와이드핏 미디움인디고 데님팬츠"
                bannert3.text=""
                bannertsale.text="65,704~68,808원"
                bannerimg.setImageResource(R.drawable.pant)
                infoimg4.setImageResource(R.drawable.rntf)
                infoimg1.setImageResource(R.drawable.rnto)
                infoimg2.setImageResource(R.drawable.rntt)
                infoimg3.setImageResource(R.drawable.rntth)
            }
            "2" ->{
                bannerText.text="NB"
                banner.setBackgroundColor(Color.RED)
                company.text=""
                infot.text="조회수(1개월 갱신)\\t    3.1천 회 이상\\n\" +\n" +
                        "                        \"누적판매(1년 갱신)도움말 보기\\t   50개 미만\\n\" +\n" +
                        "                        \"품번 / 브랜드\\t  NBNPC4W962_19 / NEW BALANCE\\n\" +\n" +
                        "                        \"시즌도움말 보기 / 성별\\t  2022 FW / 여성\\n\" +\n" +
                        "                        \"출고 정보도움말 보기\\t   결제 3일 이내 출고\\n\" +\n" +
                        "                        \"배송 정보\\t  국내 배송 / 입점사 배송 / 롯데택배\\n\" +\n" +
                        "                        \"2/16(목) 도착 예정"
                bannert1.text="아우터 > 롱패딩/롱헤비 아우터 (뉴발란스)"
                bannert2.text="NBNPC4W962 / [연아다운] WOMEN 에센셜 롱구스다운(BLACK)"
                bannert3.text=""
                bannertsale.text="392,535 ~ 429,000원"
                bannerimg.setImageResource(R.drawable.r)
                infoimg4.setImageResource(R.drawable.rnthf)
                infoimg1.setImageResource(R.drawable.rntho)
                infoimg2.setImageResource(R.drawable.rntht)
                infoimg3.setImageResource(R.drawable.rnthth)
            }
        }
    }
}