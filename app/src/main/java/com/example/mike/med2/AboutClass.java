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

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.nerv_system);

///Animation anim=(Animation) AnimationUtils.loadAnimation(this,R.anim.trans);
      Button brain = (Button)findViewById(R.id.brain);


       /// brain.startAnimation(anim);

       brain.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(AboutClass.this,Brain.class);
               startActivity(intent);

           }
       });



    }




}



