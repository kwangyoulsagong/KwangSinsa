package com.example.kwangsinsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class msshoppingpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_msshoppingpage)
        var numbers=intent.getStringExtra("key")
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
            "0" ->{infot.text="무신사 스토어에서만 단독 판매하는 상품입니다.\n" +
                    "조회수(1개월 갱신)\t                                1.3만 회 이상\n" +
                    "누적판매(1년 갱신)도움말 보기\t                      200개 이상\n" +
                    "품번 / 브랜드\t       MMBNJ892-WC / MUSINSA STANDARD\n" +
                    "시즌도움말 보기 / 성별\t                  2023 SS / 남성\n" +
                    "출고 정보도움말 보기\t                    결제 3일 이내 출고\n" +
                    "배송 정보\t     국내 배송 / 무신사 직배송 / CJ대한통운";
            bannert2.text="CONE 오버사이즈 데님 블루종 재킷 [워시드 블랙]";
            bannert3.text="CONE OVERSIZE DENIM BLOUSON JACKET [WASHED BLACK]";
            bannertsale.text="97,101 ~ 107,890원";
            bannerimg.setImageResource(R.drawable.r1);
            infoimg1.setImageResource(R.drawable.oneone);
            infoimg2.setImageResource(R.drawable.onetwo);
            infoimg3.setImageResource(R.drawable.onethree);
            infoimg4.setImageResource(R.drawable.onefour)}
            "1" ->{infot.text=
                "무신사 스토어에서만 단독 판매하는 상품입니다.\n" +
                        "조회수(1개월 갱신)\t                  6.9천 회 이상\n" +
                        "누적판매(1년 갱신)도움말 보기\t          100개 이상\n" +
                        "품번 / 브랜드\t                        MMBNJ891-DI / MUSINSA STANDARD\n" +
                        "시즌도움말 보기 / 성별\t                                2023 SS / 남성\n" +
                        "출고 정보도움말 보기\t                                 결제 3일 이내 출고\n" +
                        "배송 정보\t                               국내 배송 / 무신사 직배송 / CJ대한통운"}
            "2" ->{infot.text="무신사 스토어에서만 단독 판매하는 상품입니다.\n" +
                    "조회수(1개월 갱신)\t             5.3천 회 이상\n" +
                    "누적판매(1년 갱신)도움말 보기\t                  100개 이상\n" +
                    "품번 / 브랜드\t       MMBNP894-DI / MUSINSA STANDARD\n" +
                    "시즌도움말 보기 / 성별\t       2023 SS / 남성\n" +
                    "출고 정보도움말 보기\t     결제 3일 이내 출고\n" +
                    "배송 정보\t       국내 배송 / 무신사 직배송 / CJ대한통운";
                bannert1.text="바지 > 데님 팬츠 (무신사 스탠다드)";
                bannert2.text="CONE 스트레이트 데님 팬츠 [딥 인디고]";
                bannert3.text="CONE STRAIGHT DENIM PANTS [DEEP INDIGO]";
                bannertsale.text="~ 80,890원";
                bannerimg.setImageResource(R.drawable.r3);
                infoimg1.setImageResource(R.drawable.twoone);
                infoimg2.setImageResource(R.drawable.sixtwo);
                infoimg3.setImageResource(R.drawable.sixthree);
                infoimg4.setImageResource(R.drawable.sixfour)}
            "3" ->{infot.text="무신사 스토어에서만 단독 판매하는 상품입니다.\n" +
                    "조회수(1개월 갱신)\t         8.8천 회 이상\n" +
                    "누적판매(1년 갱신)도움말 보기\t      100개 이상\n" +
                    "품번 / 브랜드\t    MMBNP893-AK / MUSINSA STANDARD\n" +
                    "시즌도움말 보기 / 성별\t    2023 SS / 남성\n" +
                    "출고 정보도움말 보기\t    결제 3일 이내 출고\n" +
                    "배송 정보\t    국내 배송 / 무신사 직배송 / CJ대한통운";
                bannert1.text="바지 > 데님 팬츠 (무신사 스탠다드)";
                bannert2.text="CONE 딥 턱 커브드 데님 팬츠 [로우 블랙]";
                bannert3.text="CONE DEEP TUCK CURVED DENIM PANTS [RAW BLACK]";
                bannertsale.text="~ 80,890원";
                bannerimg.setImageResource(R.drawable.r4);
                infoimg1.setImageResource(R.drawable.twoone);
                infoimg2.setImageResource(R.drawable.threetwo);
                infoimg3.setImageResource(R.drawable.threethree);
                infoimg4.setImageResource(R.drawable.threefour)}
            "6" ->{infot.text="무신사 단독\n" +
                    "무신사 스토어에서만 단독 판매하는 상품입니다.\n" +
                    "조회수(1개월 갱신)\t                 5천 회 이상\n" +
                    "누적판매(1년 갱신)도움말 보기\t              100개 이상\n" +
                    "품번 / 브랜드\t       MMBNJ891-WC / MUSINSA STANDARD\n" +
                    "시즌도움말 보기 / 성별\t       2023 SS / 남성\n" +
                    "출고 정보도움말 보기\t       결제 3일 이내 출고\n" +
                    "배송 정보\t    국내 배송 / 무신사 직배송 / CJ대한통운";
                bannert2.text="CONE 플리츠 데님 트러커 재킷 [워시드 블랙]";
                bannert3.text="CONE PLEATS DENIM TRUCKER JACKET [WASHED BLACK]";
                bannertsale.text="89,001 ~ 98,890원";
                bannerimg.setImageResource(R.drawable.r7);
                infoimg1.setImageResource(R.drawable.twoone);
                infoimg2.setImageResource(R.drawable.twotwo);
                infoimg3.setImageResource(R.drawable.twothree);
                infoimg4.setImageResource(R.drawable.twofor)}

        }
    }
}