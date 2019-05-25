package com.example.mike.med2.fragments_of_descriptions;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mike.med2.R;
import com.example.mike.med2.test_activity.TestCont;

public class Brain_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info_brain, null);

        Button button = (Button) v.findViewById(R.id.toest);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TestCont.class);
                startActivity(intent);

            }
        });

        return v;
    }



}

