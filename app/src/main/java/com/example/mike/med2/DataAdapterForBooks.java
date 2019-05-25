package com.example.mike.med2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class DataAdapterForBooks extends RecyclerView.Adapter<ViewHolderBooks> {
    ArrayList<Description> descriptions;
    LayoutInflater inflater;
    Context context;

    String au;
    private Activity activity;
    private static final String TAG = "MyApp";
    private ViewHolderBooks.OnUserClickListener onUserClickListener;
    public DataAdapterForBooks(Context context,ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
        this.inflater=LayoutInflater.from(context);
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolderBooks onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view=inflater.inflate(R.layout.item_book,viewGroup,false);

       return new ViewHolderBooks(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolderBooks viewHolderBooks, int i) {
     String aut=descriptions.get(i).author;
au=aut;
        Log.i(TAG,aut);
        viewHolderBooks.auth.setText(aut);
        String name=descriptions.get(i).name;
        Log.i(TAG,name);
        String an=descriptions.get(i).annotation;
        viewHolderBooks.name.setText(name);
      viewHolderBooks.annot.setText(an);


    }

    @Override
    public int getItemCount() {
        return descriptions.size();
    }
}
