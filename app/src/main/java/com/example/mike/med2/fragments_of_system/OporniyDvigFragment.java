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

public class OporniyDvigFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     View v=inflater.inflate(R.layout.oporno_dvig_fragment,null);
        Button cherep=(Button)v.findViewById(R.id.cherep);
        cherep.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(),"Череп",Toast.LENGTH_LONG).show();
                return false;
            }
        });
     return v;
    }
}
