package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show1);

        TextView textView;
        textView = findViewById(R.id.textView2);

        Button backbutton;
        backbutton = findViewById(R.id.button2);

        Intent intent = getIntent();
        String c_name = intent.getStringExtra("Cityname");
        textView.setText(c_name);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}