package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
        Intent in =getIntent();
        String message=in.getStringExtra("message");
        TextView textMessage=(TextView) findViewById(R.id.textMessage);
        textMessage.setText(message);
    }
}
