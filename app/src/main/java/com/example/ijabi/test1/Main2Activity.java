package com.example.ijabi.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void f2pp(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.f2pp);
        startActivity(intent);
    }

    public void f2(View view)
    {/*
        src = "@drawable/f2";
        intent.putExtra("src", src);*/
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.f2);
        startActivity(intent);
    }


    public void bf2f(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.bf2f);
        startActivity(intent);
    }

    public void f(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.f);
        startActivity(intent);
    }

    public void lf(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.images);
        startActivity(intent);
    }
}

