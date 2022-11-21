package com.example.wsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<PhRecyclerItem> arrayList = new ArrayList<>();
    ViewFlipper v_flipper;
    RecyclerView recyclerView;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.re_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        adapter = new Adapter(arrayList);



        recyclerView.setAdapter(adapter);

        // 배너에 들어갈 사진 ( 배열 인덱스 순으로 아이템 생성 )
        int banner_images[] = {
                R.drawable.banner_1,
                R.drawable.banner_2,
                R.drawable.banner_3,
                R.drawable.banner_4,
                R.drawable.banner_5,
                R.drawable.banner_6
        };

        // RerecylcelerView에 들어갈 사진 ( 배열 인덱스 순으로 아이템 생성 )
        int images[] = {
                R.drawable.ramyeon,
                R.drawable.jjagle,
                R.drawable.ddekbokki,
                R.drawable.egg,
                R.drawable.egg_source,
                R.drawable.smart_source,
                R.drawable.jeyook,
                R.drawable.egg_jorim
        };

        // RerecylcelerView에 들어갈 설명 ( 배열 인덱스 순으로 아이템 생성 )
        String texts[] = {
                "분식집 라면 어렵지 않아요!\n재료 : 라면, 양파, 대파, 계란\n\n 평점: 4.7 (245 Review)",
                "초간단 짜글이 찌개 만들기!\n재료 : 스팸, 양파, 대파, 고춧가루 등\n\n 평점: 4.3 (227 Review)",
                "엽기 떡볶이 90% 레시피!\n재료 : 떡, 양념장(상세레시피 참조) 등\n\n 평점: 4.8 (443 Review)",
                "치즈 좔좔 고퀄 계란말이\n재료 : 계란, 치즈, 소금 \n\n 평점: 4.3 (112 Review)",
                "밥도둑 초간단 간장계란밥\n재료 : 계란, 간장, 소금, 대파 \n\n 평점: 4.9 (558 Review)",
                "만능 고추장 양념장 \n재료 : 다진 고기, 고추장, 간장 \n\n 평점: 4.25 (221 Review)",
                "대충 볶아 제육볶음\n재료 : 돼지고기, 양념장(상세레시피 참조) 등 \n\n 평점: 4.76 (889 Review)",
                "간장게장 말고 장조림\n재료 : 계란, 간장 양념(상세레시피 참조) 등 \n\n 평점: 4.6 (564 Review)"

        };
        // RerecylcelerView에 들어갈 제목 ( 배열 인덱스 순으로 아이템 생성 )
        String title[] = {
                "분식집 5분 따라잡기!",
                "초간단 스팸 짜글이",
                "싱크로율 90% 엽기 떡볶이",
                "고퀄리티 치즈 계란말이",
                "밥도둑 간장계란밥",
                "만능 고추장 양념장",
                "10분 제육볶음",
                "간장 계란 장조림"
        };

        // RerecylcelerView에 들어갈 제목 ( 배열 인덱스 순으로 아이템 생성 )

        // 사진 , 설명 , 제목 순으로 입력
        for(int i = 0; i < images.length ; i ++) {
        arrayList.add(new PhRecyclerItem(images[i], texts[i], title[i]));
        }


        v_flipper = findViewById(R.id.image_slide);

        for(int image : banner_images) {
            flipperImages(image);
        }

        // get our folding cell
        Toolbar toolbar = (Toolbar) findViewById(R.id.board_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    // 이미지 슬라이더 구현 메서드
    public void flipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);      // 이미지 추가
        v_flipper.setFlipInterval(4000);       // 자동 이미지 슬라이드 딜레이시간(1000 당 1초)
        v_flipper.setAutoStart(true);          // 자동 시작 유무 설정

        // animation
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }


}