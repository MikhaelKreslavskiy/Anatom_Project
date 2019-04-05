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

import com.example.mike.med2.Test;
import com.example.mike.med2.info_about_organs.InfoBreathSystemActivity;
import com.example.mike.med2.R;

public class BreathSystemFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


            View v = inflater.inflate(R.layout.breath_system_fragment, null);

            Button button = (Button) v.findViewById(R.id.lungs);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                  Intent intent=new Intent(getActivity(),InfoBreathSystemActivity.class);
                  startActivity(intent);

                }
            });
            button.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                   Toast.makeText(getContext(),"Lungs",Toast.LENGTH_LONG).show();

                    return false;
                }
            });

            return v;
        }


}
