package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button button,button5;
    ImageView imageView,imageView11,imageView22,imageView33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button2);
        button5 = findViewById(R.id.button3);
        imageView = findViewById(R.id.imageView2);
        imageView11 = findViewById(R.id.imageView3);
        imageView22 = findViewById(R.id.imageView4);
        imageView33 = findViewById(R.id.imageView5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent1);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"此功能暂未开通",Toast.LENGTH_SHORT).show();
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"此功能暂未开通",Toast.LENGTH_SHORT).show();
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"此功能暂未开通",Toast.LENGTH_SHORT).show();
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"此功能暂未开通",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
