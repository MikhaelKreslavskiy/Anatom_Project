package com.example.mike.med2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class AboutClass extends AppCompatActivity {
    protected Button butgame;
    boolean flag=false;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.nerv_system);
        final TranslateAnimation animation = new TranslateAnimation(-500, 300, 50, 50);
        animation.setDuration(1000);
        animation.setFillAfter(true);

        final Button btnTranslate = (Button)findViewById(R.id.translate);
        Button button=(Button)findViewById(R.id.body);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == false) {
                    btnTranslate.startAnimation(animation);
                    flag = true;

                }
            }
        });
    }


}



