package com.example.mike.med2.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mike.med2.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView message;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        message=itemView.findViewById(R.id.text_message);
    }
}
