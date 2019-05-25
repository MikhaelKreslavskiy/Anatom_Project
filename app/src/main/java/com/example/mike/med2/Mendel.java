package com.example.mike.med2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Mendel extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mendel_layout);
      final  EditText firstgen=(EditText) findViewById(R.id.firstgen);
     final   EditText firstpriznak=(EditText) findViewById(R.id.firstpriznak);
      final  EditText secondgen=(EditText) findViewById(R.id.secondgen);
      final  EditText secondpriznak=(EditText) findViewById(R.id.secondpriznak);
      final  EditText man=(EditText) findViewById(R.id.mangamets);
      final  EditText girl=(EditText) findViewById(R.id.girlgamets);
        Button solvbut=(Button) findViewById(R.id.solvebut);
     final   TextView genotype=(TextView) findViewById(R.id.genotype);
       final TextView fenotype=(TextView) findViewById(R.id.fenotype);
        solvbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String firstgenstr = firstgen.getText().toString();
                String firstpriznakstr = firstpriznak.getText().toString();
                String secondgenstr = secondgen.getText().toString();
                String secondpriznakstr = secondpriznak.getText().toString();
                String men = man.getText().toString();
                String girlstr = girl.getText().toString();
                if(Character.isLowerCase(firstgenstr.charAt(0)))
                {
                    Toast.makeText(getApplicationContext(),"Доминантный ген обозначается заглавной буквой",Toast.LENGTH_LONG).show();
                    return;
                }
                if(firstgenstr.length()>1)
                {
                    Toast.makeText(getApplicationContext(),"Запишите только один ген",Toast.LENGTH_LONG).show();
                    return;
                }
                if(Character.isUpperCase(secondgenstr.charAt(0)))
                {
                    Toast.makeText(getApplicationContext(),"Рецессивный ген обозначается прописной буквой",Toast.LENGTH_LONG).show();
                    return;
                }
                if(secondgenstr.length()>1)
                {
                    Toast.makeText(getApplicationContext(),"Запишите только один ген",Toast.LENGTH_LONG).show();
                    return;
                }
                if((men.length()>2)||(girlstr.length()>2))
                {
                    Toast.makeText(getApplicationContext(),"Гены родителей обозначаются двумя буквами",Toast.LENGTH_LONG).show();
                    return;
                }
                if ((Character.isUpperCase(men.charAt(0)) && (Character.isUpperCase(men.charAt(1)))) || (Character.isUpperCase(girlstr.charAt(0)) && (Character.isUpperCase(girlstr.charAt(1))))) {
                    genotype.setText("По генотипу " + men.charAt(0) + girlstr.charAt(0) + "  " + men.charAt(0) + girlstr.charAt(1) + "  " + men.charAt(1) + girlstr.charAt(0) + "   " + men.charAt(1) + girlstr.charAt(1));
                    fenotype.setText("По фенотипу-100% -" + firstpriznakstr);
                }
                if ((men.charAt(0)==girlstr.charAt(0))&&(men.charAt(1)==girlstr.charAt(1))&&(Character.isUpperCase(men.charAt(0)))) {
                    genotype.setText("По генотипу " + men.charAt(0) + girlstr.charAt(0) + "  " + men.charAt(0) + girlstr.charAt(1) + "  " + men.charAt(1) + girlstr.charAt(0) + "   " + men.charAt(1) + girlstr.charAt(1));
                    fenotype.setText("По фенотипу: 75%- " + firstpriznakstr + "; 25% - " + secondpriznakstr);
                }
                if ((men.charAt(0)==girlstr.charAt(0))&&(men.charAt(1)==girlstr.charAt(1))&&(Character.isLowerCase(men.charAt(0)))) {
                    genotype.setText("По генотипу " + men.charAt(0) + girlstr.charAt(0) + "  " + men.charAt(0) + girlstr.charAt(1) + "  " + men.charAt(1) + girlstr.charAt(0) + "   " + men.charAt(1) + girlstr.charAt(1));
                    fenotype.setText("По фенотипу-100% -" + secondpriznakstr);
                }
                if ((men.charAt(0)==men.charAt(1)&&Character.isLowerCase(men.charAt(0)))&&girlstr.charAt(0)!=girlstr.charAt(1)) {
                    genotype.setText("По генотипу " + men.charAt(0) + girlstr.charAt(0) + "  " + men.charAt(0) + girlstr.charAt(1) + "  " + men.charAt(1) + girlstr.charAt(0) + "   " + men.charAt(1) + girlstr.charAt(1));
                    fenotype.setText("По фенотипу-50% -" + firstpriznakstr+" ; 50%-"+secondpriznakstr);
                }

                if ((girlstr.charAt(0)==girlstr.charAt(1)&&Character.isLowerCase(girlstr.charAt(0)))&&men.charAt(0)!=men.charAt(1)) {
                    genotype.setText("По генотипу " + men.charAt(0) + girlstr.charAt(0) + "  " + men.charAt(0) + girlstr.charAt(1) + "  " + men.charAt(1) + girlstr.charAt(0) + "   " + men.charAt(1) + girlstr.charAt(1));
                    fenotype.setText("По фенотипу-50% -" + firstpriznakstr+" ; 50%-"+secondpriznakstr);
                }
            }
        });








    }
}
