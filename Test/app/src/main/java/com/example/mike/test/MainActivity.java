package com.example.mike.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView)findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            boolean itemFirst = true;
            @Override
            public void onClick(View v) {
                if(itemFirst)
                {
                    ((ImageView) v).setImageResource(R.drawable.second);
                    itemFirst=false;
                }
                else
                {
                    ((ImageView) v).setImageResource(R.drawable.first);
                    itemFirst=true;
                }

            }
        });
    }
}
