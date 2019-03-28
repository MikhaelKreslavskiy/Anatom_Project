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
        Intent intent = new Intent(MainActivity.this, BodyStructure.class);

        switch (view.getId()) {

            case R.id.nerv_system:
              intent.putExtra("choice",1);
                break;
            case R.id.endocryn_system:
                intent.putExtra("choice",2);
                break;
            case R.id.oporno_dvig_apparat:
                intent.putExtra("choice",3);
                break;
            case R.id.pishevat_system:
                intent.putExtra("choice",4);
                break;
            case R.id.mochevyd_system:
                intent.putExtra("choice",5);
                break;
            case R.id.sensor_system:
                intent.putExtra("choice",6);
                break;
        }

       startActivity(intent);
    }
}
