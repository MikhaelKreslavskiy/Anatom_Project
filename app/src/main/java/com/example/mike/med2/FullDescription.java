package com.example.mike.med2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FullDescription extends AppCompatActivity {
    public String name;
    public String auth;
    public String annotation;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_description_layout);
        name=getIntent().getExtras().getString("name");
        auth=getIntent().getExtras().getString("auth");
        annotation=getIntent().getExtras().getString("annotation");
        final TextView nametext=(TextView)findViewById(R.id.name_desc);
        final TextView authtext=(TextView)findViewById(R.id.author_desc);
        final TextView anntext=(TextView)findViewById(R.id.annotation_desc);
       nametext.setText(name);
       authtext.setText(auth);
        anntext.setText(annotation);


    }
}
