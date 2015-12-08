package com.example.ijabi.test1;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main22Activity extends AppCompatActivity
{
    ImageView imgsrc;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        imgsrc = (ImageView)findViewById(R.id.imge);

        int imageId = getIntent().getIntExtra("src", 0);

//Image background
        imgsrc.setImageResource(imageId);

        //String grabImagePath = getIntent().getStringExtra("src");
        //imgsrc.setImageBitmap(BitmapFactory.decodeFile(grabImagePath));
    }
}