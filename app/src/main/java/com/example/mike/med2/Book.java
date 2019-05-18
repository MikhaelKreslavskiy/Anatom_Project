package com.example.mike.med2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Book extends AppCompatActivity {
   public String name;
   public String author;
   public String ann;
   private FragmentBooks fragmentBooks=new FragmentBooks();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.book);
        final Button button=(Button)findViewById(R.id.sendbook);
        final EditText nameedit=(EditText)findViewById(R.id.name_of_the_book);
        final EditText auth=(EditText)findViewById(R.id.author) ;
        final EditText annotation =(EditText)findViewById(R.id.annotation);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference().child("books");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=nameedit.getText().toString();
                author=auth.getText().toString();
                ann=annotation.getText().toString();
                if(name.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Вы не ввели название книги",Toast.LENGTH_LONG).show();
                    return;
                }
                else {
                    Description description = new Description(name, author, ann);
                    if(isOnline()==true) {
                        myRef.push().setValue(description);
                        nameedit.setText("");
                        annotation.setText("");
                        auth.setText("");
                        Toast.makeText(getApplicationContext(), "Ваша книга добавлена", Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Нет подключения к Интернету",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

}


