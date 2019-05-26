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

public class CirculyatorSystemFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.circ_system_fragment,null);
        Button heart=(Button) view.findViewById(R.id.heart);
        Button veny=(Button) view.findViewById(R.id.vena);
        Button artery=(Button) view.findViewById(R.id.artery);
        Button kapillyary=(Button) view.findViewById(R.id.kappilyary);
        Button limfasystem = (Button) view.findViewById(R.id.limfa_system);


        heart.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Сердце",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        veny.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Вена",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        artery.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Артерия",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        limfasystem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Лимфатическая система",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        kapillyary.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Каппиляры",Toast.LENGTH_LONG).show();
                return false;
            }
        });
       return view;
    }
}
