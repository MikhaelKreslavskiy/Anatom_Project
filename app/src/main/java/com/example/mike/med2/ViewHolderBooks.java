package com.example.mike.med2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderBooks extends RecyclerView.ViewHolder {
    TextView auth;
   TextView name;
   TextView annot;
    public ViewHolderBooks(@NonNull View itemView) {
        super(itemView);
        auth=itemView.findViewById(R.id.authp);
        name=itemView.findViewById(R.id.name);
        annot=itemView.findViewById(R.id.annotat);
    }
    public interface OnUserClickListener {
        void onUserClick(View view);
    }
}
