package com.example.mike.med2.info_about_organs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mike.med2.R;
import com.example.mike.med2.fragments_of_descriptions.Brain_fragment;

public class InfoBreathSystemActivity extends AppCompatActivity {
    private Brain_fragment brainFragment;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        brainFragment=new Brain_fragment();
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        transaction.add(R.id.container,brainFragment);
        transaction.commit();

    }
}

