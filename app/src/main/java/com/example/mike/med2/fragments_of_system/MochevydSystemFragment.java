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

public class MochevydSystemFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.urinary_fragment,null);
        Button mochpusyr=(Button) view.findViewById(R.id.mochpusyr);
        Button pochki=(Button) view.findViewById(R.id.pochki);
        Button uretra=(Button) view.findViewById(R.id.uretra);
        Button mochetoch=(Button) view.findViewById(R.id.mochetochnik);
        mochpusyr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Мочевой пузырь",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        pochki.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Почки",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        uretra.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Уретра",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        mochetoch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Мочеточник",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        return view;

    }
}
