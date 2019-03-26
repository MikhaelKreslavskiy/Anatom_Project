package com.example.mike.med2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BodyStructure extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.body_structure_layout);

///Animation anim=(Animation) AnimationUtils.loadAnimation(this,R.anim.trans);
      Button brain = (Button)findViewById(R.id.brain);


       /// brain.startAnimation(anim);

       brain.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(BodyStructure.this,Brain.class);
               startActivity(intent);

           }
       });



    }




}



