package com.example.mike.med2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.mike.med2.fragments_of_system.EndocrynFragment;
import com.example.mike.med2.fragments_of_system.MochevydSystemFragment;
import com.example.mike.med2.fragments_of_system.NervSystemFragment;
import com.example.mike.med2.fragments_of_system.OporniyDvigFragment;
import com.example.mike.med2.fragments_of_system.PischevaritSystemFragment;
import com.example.mike.med2.fragments_of_system.SensorSystemFragment;

public class BodyStructure extends AppCompatActivity {
    private NervSystemFragment nervSystemFragment;
    private EndocrynFragment endocrynFragment;
    private PischevaritSystemFragment pischevaritSystemFragment;
    private OporniyDvigFragment oporniyDvigFragment;
    private SensorSystemFragment sensorSystemFragment;
    private MochevydSystemFragment mochevydSystemFragment;


    private FragmentManager manager;
    private FragmentTransaction transaction;
   private int choice;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.body_structure_layout);
choice=getIntent().getExtras().getInt("choice");
        nervSystemFragment=new NervSystemFragment();
        endocrynFragment=new EndocrynFragment();
        mochevydSystemFragment=new MochevydSystemFragment();
        sensorSystemFragment=new SensorSystemFragment();
        oporniyDvigFragment=new OporniyDvigFragment();
        pischevaritSystemFragment=new PischevaritSystemFragment();

        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        switch (choice)
        {
            case 1:
                transaction.add(R.id.container,nervSystemFragment);
                break;
            case 2:
                transaction.add(R.id.container,endocrynFragment);
                break;
            case 3:
                transaction.add(R.id.container,oporniyDvigFragment);
                break;
            case 4:
                transaction.add(R.id.container,pischevaritSystemFragment);
                break;
            case 5:
                transaction.add(R.id.container,mochevydSystemFragment);
                break;
            case 6:
                transaction.add(R.id.container,sensorSystemFragment);
                break;

        }

transaction.commit();

    }



}



