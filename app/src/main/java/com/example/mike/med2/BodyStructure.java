package com.example.mike.med2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mike.med2.fragments.EndocrynFragment;
import com.example.mike.med2.fragments.NervSystemFragment;

public class BodyStructure extends FragmentActivity {
    private NervSystemFragment nervSystemFragment;
    private EndocrynFragment endocrynFragment;
    private FragmentManager manager;
    private FragmentTransaction transaction;
   private int choice=1;


    public BodyStructure(NervSystemFragment nervSystemFragment) {
        this.nervSystemFragment = nervSystemFragment;
    }

    public BodyStructure(int choice) {
        this.choice = choice;
    }

    public int getChoice(int choice) {
        return choice;
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
int a=choice;
        setContentView(R.layout.body_structure_layout);

        nervSystemFragment=new NervSystemFragment();
        endocrynFragment=new EndocrynFragment();
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        switch (a)
        {
            case 1:
                transaction.add(R.id.container,nervSystemFragment);
                break;
            case 2:
                transaction.add(R.id.container,endocrynFragment);

        }

transaction.commit();

    }



}



