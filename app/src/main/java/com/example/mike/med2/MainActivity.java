package com.example.mike.med2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mike.med2.info_about_organs.InfoBreathSystemActivity;

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
            case R.id.breath_system:
                intent.putExtra("choice",7);
                break;
            case R.id.cyrculyatornaya_system:
                intent.putExtra("choice",8);
                break;
            case R.id.pokrovnaya_system:
                intent.putExtra("choice",9);
                break;
        }

       startActivity(intent);

    }
    private void InfoIntent()
    {
        Intent intent=new Intent(MainActivity.this,InfoBreathSystemActivity.class);
        startActivity(intent);
    }

    public void BlueClick(View view) {
        Toast.makeText(getApplicationContext(),"Системы воспроизводства(Эндодермальные)",Toast.LENGTH_LONG).show();
    }

    public void RedClick(View view) {
        Toast.makeText(getApplicationContext(),"Системы поддержки(мезодермальные) ",Toast.LENGTH_LONG).show();
    }



    public void GreenClick(View view) {
        Toast.makeText(getApplicationContext()," Системы восприятия(эктодермальные) ",Toast.LENGTH_LONG).show();


    }

    public void YellowClick(View view) {
        Toast.makeText(getApplicationContext(),"Эндокринная система ",Toast.LENGTH_LONG).show();
    }
}
