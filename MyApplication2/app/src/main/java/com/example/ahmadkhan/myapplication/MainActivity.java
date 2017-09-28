package com.example.ahmadkhan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void sendData(View view){
        EditText editFriendName = (EditText) findViewById(R.id.editText);
        Intent in=new Intent(this,Showconf.class);
        String Name = editFriendName.getText().toString();
        in.putExtra(EXTRA_MESSAGE,Name);
        startActivity(in);
    }
}
