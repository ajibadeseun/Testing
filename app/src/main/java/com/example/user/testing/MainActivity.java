package com.example.user.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = (ProgressBar) findViewById(R.id.bar);
        TextView txt = (TextView) findViewById(R.id.btn);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar.setProgress(40);
            }
        });


    }
}
