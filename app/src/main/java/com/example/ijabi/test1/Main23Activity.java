package com.example.ijabi.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main23Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
    }

    public void cf2pp(View view)
    {
        Intent intent = new Intent(Main23Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.cf2pp);
        startActivity(intent);
    }

    public void cf2(View view)
    {/*
        src = "@drawable/f2";
        intent.putExtra("src", src);*/
        Intent intent = new Intent(Main23Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.cf2);
        startActivity(intent);
    }


    public void cbf2f(View view)
    {
        Intent intent = new Intent(Main23Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.cbf2f);
        startActivity(intent);
    }

    public void cf(View view)
    {
        Intent intent = new Intent(Main23Activity.this, Main22Activity.class);
        intent.putExtra("src",R.drawable.cf);
        startActivity(intent);
    }

    public void clf(View view)
    {
        Intent intent = new Intent(Main23Activity.this, Main22Activity.class);
        intent.putExtra("src", R.drawable.clf);
        startActivity(intent);
    }
}

