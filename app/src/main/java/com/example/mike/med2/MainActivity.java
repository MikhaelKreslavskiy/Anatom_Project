package com.example.mike.med2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import android.support.design.widget.BottomNavigationView;

import com.example.mike.med2.info_about_organs.InfoBreathSystemActivity;

public class MainActivity extends AppCompatActivity {
private FragmentSystem fragmentSystem=new FragmentSystem();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.body:
                        change(fragmentSystem);
                        return true;
                }
                return  false;
            }
        });
    }


    public void onClick(View view) {
       fragmentSystem.OnClick(view);
    }


    public void YellowClick(View view) {
    }

    public void GreenClick(View view) {
    }

    public void RedClick(View view) {
    }

    public void BlueClick(View view) {
    }


    public void change(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }
}