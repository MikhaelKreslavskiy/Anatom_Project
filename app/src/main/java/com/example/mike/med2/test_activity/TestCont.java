package com.example.mike.med2.test_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.mike.med2.R;
import com.example.mike.med2.test_activity.TestBrainFirst;

import java.util.Random;

public class TestCont extends AppCompatActivity {
    TestBrainFirst testBrainFirst=new TestBrainFirst();
    public static int money;
    public  static int result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_container);
        result=0;
        change(testBrainFirst);
    }
    public void change(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.test_cont,fragment).commit();
    }

    public void onClick(View view) {
        testBrainFirst.onClick(view);
    }
    public int randomer()
    {
        Random random=new Random();
        return random.nextInt(3);
    }

}
