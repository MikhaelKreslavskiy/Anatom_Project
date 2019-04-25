package com.example.mike.med2.fragments_of_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mike.med2.R;
import com.example.mike.med2.info_about_organs.InfoBreathSystemActivity;

public class PischevaritSystemFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.pishevarit_fragment,null);
        Button pechen=(Button) view.findViewById(R.id.pechenButton);
        Button gelch=(Button) view.findViewById(R.id.but_gelch);
        Button pogelud=(Button) view.findViewById(R.id.but_podgelud);
        Button kish=(Button) view.findViewById(R.id.but_kishtract);
        Button slun = (Button) view.findViewById(R.id.but_slun);
        pechen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),InfoBreathSystemActivity.class);
                startActivity(intent);

            }
        });
        pechen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Печень",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        slun.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Слюнные железы",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        pogelud.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Поджелудочная железа",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        gelch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Желчный пузырь",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        kish.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Желудочно-кишечный тракт",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        return view;
    }


}

