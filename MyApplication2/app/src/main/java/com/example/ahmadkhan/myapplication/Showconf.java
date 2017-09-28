package com.example.ahmadkhan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Showconf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showconf);
        Intent in =getIntent();
        String message=in.getStringExtra(EXTRA_MESSAGE);
        TextView textMessage=(TextView) findViewById(R.id.textView);
        textMessage.setText(message);
    }
}
