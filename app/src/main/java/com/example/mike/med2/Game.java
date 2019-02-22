package com.example.mike.med2;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game extends Activity {
    private Button button4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        button4 = (Button) findViewById(R.id.button4);
        AsyncTask<Void, Void, Void> asyncTask = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    Thread.sleep(4000);
                    button4.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        asyncTask.execute();

}



    }



