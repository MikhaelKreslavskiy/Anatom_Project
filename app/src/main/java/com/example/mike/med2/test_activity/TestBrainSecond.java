package com.example.mike.med2.test_activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mike.med2.R;
import com.example.mike.med2.fragments_of_descriptions.Brain_fragment;

public class TestBrainSecond extends AppCompatActivity  {
    public RadioButton right;
    public RadioButton bad1;
    public RadioButton bad2;
    public RadioButton bad3;
    public RadioGroup radioGroup;
    public TextView question;
    private Brain_fragment brainFragment;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    public View v;
    public TestCont testCont = new TestCont();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_brain_first);

        final TextView question = (TextView) findViewById(R.id.question);

        question.setText("Сколько литров кислорода проходит сквозь легкие каждый день");
        switch (testCont.randomer()) {
            case 0:
                right = (RadioButton) findViewById(R.id.var1);
                bad1 = (RadioButton) findViewById(R.id.var2);
                bad2 = (RadioButton) findViewById(R.id.var3);
                bad3 = (RadioButton) findViewById(R.id.var4);

                right.setText("10");
                bad1.setText("20");
                bad2.setText("30");
                bad3.setText("40");
                break;


            case 1:

                right = (RadioButton) findViewById(R.id.var2);
                bad1 = (RadioButton) findViewById(R.id.var3);
                bad2 = (RadioButton) findViewById(R.id.var4);
                bad3 = (RadioButton) findViewById(R.id.var1);

                right.setText("10");
                bad1.setText("20");
                bad2.setText("30");
                bad3.setText("40");
                break;
            case 2:

                right = (RadioButton) findViewById(R.id.var3);
                bad1 = (RadioButton) findViewById(R.id.var2);
                bad2 = (RadioButton) findViewById(R.id.var1);
                bad3 = (RadioButton) findViewById(R.id.var4);

                right.setText("10");
                bad1.setText("20");
                bad2.setText("30");
                bad3.setText("40");
                break;
            case 3:
                right = (RadioButton) findViewById(R.id.var4);
                bad1 = (RadioButton) findViewById(R.id.var1);
                bad2 = (RadioButton) findViewById(R.id.var2);
                bad3 = (RadioButton) findViewById(R.id.var3);

                right.setText("10");
                bad1.setText("20");
                bad2.setText("30");
                bad3.setText("40");
                break;
        }

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v) {
                testCont.result++;
                Toast.makeText(getApplicationContext(), "Yes"+ testCont.result, Toast.LENGTH_LONG).show();

                Intent intent =new Intent(TestBrainSecond.this,TestBrainThree.class);
                startActivity(intent);
            }
        });
        bad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"No",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(TestBrainSecond.this,TestBrainThree.class);
                startActivity(intent);

            }
        });
        bad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"No",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(TestBrainSecond.this,TestBrainThree.class);
                startActivity(intent);

            }
        });
        bad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"No",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(TestBrainSecond.this,TestBrainThree.class);
                startActivity(intent);

            }
        });

    }


}