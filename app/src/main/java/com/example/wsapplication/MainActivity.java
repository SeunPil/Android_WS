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
    ArrayList<String> list;
    ViewFlipper v_flipper;
    RecyclerView recyclerView;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.re_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        adapter = new Adapter();
        for (int i = 0; i < 100; i ++) {
            String str = i + "번째 아이템";
            adapter.setArrayData(str);
        }

        recyclerView.setAdapter(adapter);

        int images[] = {
                R.drawable.img01,
                R.drawable.img02,
                R.drawable.img03
        };

        v_flipper = findViewById(R.id.image_slide);

        for(int image : images) {
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