package com.example.mike.med2.fragments_of_system;

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

public class EndocrynFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.endocryn_fragment,null);
        Button gipofiz=(Button) view.findViewById(R.id.gipofiz);
        Button epifiz =(Button) view.findViewById(R.id.epifiz);
        Button timus=(Button) view.findViewById(R.id.timus);
        Button schitovyd=(Button) view.findViewById(R.id.schitovydka);
        Button nadpoch = (Button) view.findViewById(R.id.nadpochech);
        Button yaichki = (Button) view.findViewById(R.id.yaichkiandyaichniki);

        gipofiz.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Гипофиз",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        epifiz.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Эпифиз",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        timus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Тимус",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        schitovyd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Щитовидная железа",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        nadpoch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Надпочечники",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        yaichki.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Яички и яичники",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        return view;
    }
}
