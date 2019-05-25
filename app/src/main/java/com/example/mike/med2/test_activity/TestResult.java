package com.example.mike.med2.test_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mike.med2.MainActivity;
import com.example.mike.med2.R;

public class TestResult extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_result);
        TestCont testCont =new TestCont();
        TextView result=(TextView)findViewById(R.id.result);
        TextView ans1=(TextView)findViewById(R.id.ans1);
        TextView ans2=(TextView)findViewById(R.id.ans2);
        TextView ans3=(TextView)findViewById(R.id.ans3);
        TextView ans4=(TextView)findViewById(R.id.ans4);
        TextView ans5=(TextView)findViewById(R.id.ans5);
        Button button=(Button)findViewById(R.id.back);
        result.setText("Ваш результат "+testCont.result+" из 5");
        ans1.setText("Вопрос 1: верный ответ-Окситоцин");
        ans2.setText("Вопрос 2: верный ответ-10");
        ans3.setText("Вопрос 3: верный ответ-Ливанов");
        ans4.setText("Вопрос 4: верный ответ-Легкое");
        ans5.setText("Вопрос 5: верный ответ-Углекислый газ");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TestResult.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
