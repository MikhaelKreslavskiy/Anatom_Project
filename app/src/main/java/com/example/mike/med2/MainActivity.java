package com.example.mike.med2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        BodyStructure body;

        switch (view.getId()) {

            case R.id.nerv_system:
               body=new BodyStructure(1);
                break;
            case R.id.endocryn_system:
             body=new BodyStructure(2);

                break;
        }
        Intent intent = new Intent(MainActivity.this, BodyStructure.class);
       startActivity(intent);
    }
}
