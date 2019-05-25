package com.example.mike.med2.test_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mike.med2.ClickTest;
import com.example.mike.med2.R;
import com.example.mike.med2.fragments_of_descriptions.Brain_fragment;

public class TestBrainFirst extends Fragment implements ClickTest {
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.test_brain_first, null);

final TestCont r=new TestCont();
        final TextView question = (TextView) v.findViewById(R.id.question);

        question.setText("Какой гормон можно получить с помощью обнимашек?");
        switch (r.randomer()) {
            case 0:
                right = (RadioButton) v.findViewById(R.id.var1);
                bad1 = (RadioButton) v.findViewById(R.id.var2);
                bad2 = (RadioButton) v.findViewById(R.id.var3);
                bad3 = (RadioButton) v.findViewById(R.id.var4);

                right.setText("Окситоцин");
                bad1.setText("Адреналин");
                bad2.setText("Вазопрессин");
                bad3.setText("амелин");
                break;


            case 1:

                right = (RadioButton) v.findViewById(R.id.var2);
                bad1 = (RadioButton) v.findViewById(R.id.var1);
                bad2 = (RadioButton) v.findViewById(R.id.var4);
                bad3 = (RadioButton) v.findViewById(R.id.var3);

                right.setText("Окситоцин");
                bad1.setText("Адреналин");
                bad2.setText("Вазопрессин");
                bad3.setText("амелин");
                break;
            case 2:

                right = (RadioButton) v.findViewById(R.id.var3);
                bad1 = (RadioButton) v.findViewById(R.id.var1);
                bad2 = (RadioButton) v.findViewById(R.id.var2);
                bad3 = (RadioButton) v.findViewById(R.id.var4);

                right.setText("Окситоцин");
                bad1.setText("Адреналин");
                bad2.setText("Вазопрессин");
                bad3.setText("амелин");
                break;
            case 3:
                right = (RadioButton) v.findViewById(R.id.var4);
                bad1 = (RadioButton) v.findViewById(R.id.var1);
                bad2 = (RadioButton) v.findViewById(R.id.var3);
                bad3 = (RadioButton) v.findViewById(R.id.var4);

                right.setText("Окситоцин");
                bad1.setText("Адреналин");
                bad2.setText("Вазопрессин");
                bad3.setText("амелин");
                break;
        }

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v) {
                Toast.makeText(getContext(), "Yes", Toast.LENGTH_LONG).show();
                r.result++;
                Intent intent =new Intent(getActivity(),TestBrainSecond.class);
                startActivity(intent);
            }
        });
        bad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"No",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(getActivity(),TestBrainSecond.class);
                startActivity(intent);

            }
        });
        bad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"No",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(getActivity(),TestBrainSecond.class);
                startActivity(intent);

            }
        });
        bad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"No",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(getActivity(),TestBrainSecond.class);
                startActivity(intent);

            }
        });


return v;

    }



    @Override
    public void onClick(View view) {
        if(view.getId()==right.getId())
        {
            Toast.makeText(getContext(),"Yes",Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(getContext(),"No",Toast.LENGTH_LONG).show();
        }


    }


}
