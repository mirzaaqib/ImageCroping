package com.example.nscpl_aqib.imagecroping;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static com.example.nscpl_aqib.imagecroping.R.id.imgv1;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(imgv1);
        final Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.sample_image);
        Bitmap croppedBmp = Bitmap.createBitmap(bitmap, 10,10,bitmap.getWidth()-20,bitmap.getHeight()-300);
        imageView.setImageBitmap(croppedBmp);
    }
}
