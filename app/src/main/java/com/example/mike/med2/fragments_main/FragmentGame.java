package com.example.mike.med2.fragments_main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mike.med2.Mendel;
import com.example.mike.med2.R;
import com.example.mike.med2.test_activity.TestCont;

public class FragmentGame extends Fragment {
    private static boolean alreadybuy=false;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.game_fragment,null);
        final TextView count=(TextView)view.findViewById(R.id.moneytext);
        final TestCont testCont=new TestCont();
        testCont.money+=testCont.result;
        count.setText("У вас денег:  "+ testCont.money);
        Button button=(Button)view.findViewById(R.id.buy);
        Button perehod=(Button) view.findViewById(R.id.perehod);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(testCont.money<4)
                {
                    Toast.makeText(getContext(),"Не хватает монет",Toast.LENGTH_LONG).show();
                    return;
                }
                if(alreadybuy==true)
                {
                    Toast.makeText(getContext(),"Эта функция уже куплена",Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
                    alreadybuy=true;
                    testCont.money=testCont.money-4;
                    count.setText("У вас денег: "+testCont.money);

                }
            }
        });

            perehod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (alreadybuy == true) {
                        Toast.makeText(getContext(), "Переход", Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getActivity(),Mendel.class);
                        startActivity(intent);
                    }
                }
            });

       return view;
    }
}
