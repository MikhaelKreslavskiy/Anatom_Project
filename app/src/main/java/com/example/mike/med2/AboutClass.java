package com.example.mike.med2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class AboutClass extends Activity {
    protected Button butgame;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.nerv_system);
        butgame=(Button) findViewById(R.id.button3);

        butgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutClass.this, Game.class);
                startActivity(intent);
            }
        });
    }


    public void onClick(View view) {
        Intent intent = new Intent(AboutClass.this, Brain.class);
        startActivity(intent);

    }

    }



