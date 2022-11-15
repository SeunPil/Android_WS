package com.example.wsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ramotion.foldingcell.FoldingCell;

public class MainActivity extends AppCompatActivity {

    Button btn_test;
    EditText edit_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get our folding cell
        final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
        // attach click listener to folding cell
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });
    }
}