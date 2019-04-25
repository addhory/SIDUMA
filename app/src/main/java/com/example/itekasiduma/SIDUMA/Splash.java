package com.example.itekasiduma.SIDUMA;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Splash extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    ImageView itkImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        constraintLayout = findViewById(R.id.mConstraintSplash);
        itkImage = findViewById(R.id.mImageITK);
        Animation mAnimation = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        constraintLayout.startAnimation(mAnimation);
        itkImage.startAnimation(mAnimation);

        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(5000);
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }
}
