package com.example.mike.med2.fragments_main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mike.med2.BodyStructure;
import com.example.mike.med2.fragments_main.FragmentSystemClick;
import com.example.mike.med2.R;
import com.example.mike.med2.info_about_organs.InfoBreathSystemActivity;

public class FragmentSystem extends Fragment implements FragmentSystemClick {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_system,null);

        return  view;
    }

    @Override
    public void OnClick(View view) {
        Intent intent = new Intent(getActivity(), BodyStructure.class);

        switch (view.getId()) {

            case R.id.nerv_system:
                intent.putExtra("choice", 1);
                break;
            case R.id.endocryn_system:
                intent.putExtra("choice", 2);
                break;
            case R.id.oporno_dvig_apparat:
                intent.putExtra("choice", 3);
                break;
            case R.id.pishevat_system:
                intent.putExtra("choice", 4);
                break;
            case R.id.mochevyd_system:
                intent.putExtra("choice", 5);
                break;
            case R.id.sensor_system:
                intent.putExtra("choice", 6);
                break;
            case R.id.breath_system:
                intent.putExtra("choice", 7);
                break;
            case R.id.cyrculyatornaya_system:
                intent.putExtra("choice", 8);
                break;
            case R.id.pokrovnaya_system:
                intent.putExtra("choice", 9);
                break;
        }

        startActivity(intent);
    }













    @Override
    public void BlueClick(View v) {
        Toast.makeText(getContext(),"Системы воспроизводства(Эндодермальные)",Toast.LENGTH_LONG).show();
    }

    @Override
    public void RedClick(View view) {
        Toast.makeText(getContext(),"Системы поддержки(мезодермальные) ",Toast.LENGTH_LONG).show();
    }



    @Override
    public void GreenClick(View view) {
        Toast.makeText(getContext()," Системы восприятия(эктодермальные) ",Toast.LENGTH_LONG).show();


    }

    @Override
    public void YellowClick(View view) {
        Toast.makeText(getContext(),"Эндокринная система ",Toast.LENGTH_LONG).show();
    }
}
