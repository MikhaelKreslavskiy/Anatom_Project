package com.example.mike.med2.fragments_of_system;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mike.med2.Test;
import com.example.mike.med2.info_about_organs.InfoBreathSystemActivity;
import com.example.mike.med2.R;

public class BreathSystemFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


         View view = inflater.inflate(R.layout.breath_system_fragment,null);
        Button gortan=(Button) view.findViewById(R.id.but_gortan);
        Button traheya=(Button) view.findViewById(R.id.but_traheya);
        Button nose=(Button) view.findViewById(R.id.nose);
        Button glotka=(Button) view.findViewById(R.id.glotka);
        Button lungs = (Button) view.findViewById(R.id.lungs);
        lungs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),InfoBreathSystemActivity.class);
                startActivity(intent);

            }
        });
        lungs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Легкие и бронхи",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        gortan.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Гортань",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        glotka.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Глотка",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        nose.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Нос",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        traheya.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Трахея",Toast.LENGTH_LONG).show();

                return false;
            }
        });
        return view;
        }


}
