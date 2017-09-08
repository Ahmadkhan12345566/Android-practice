package hk.ust.cse.comp107x.greetfriend;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
public class MainActivity extends ListActivity{
    //Button greetButton;
    public String[] names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       names =getResources().getStringArray(R.array.friends);
        setListAdapter( (ListAdapter ) new ArrayAdapter<String>(this,R.layout.friend_item,names));


        // setContentView(R.layout.activity_main);

        // get a reference to the greetButton on the UI
        //greetButton = (Button) findViewById(R.id.greetButton);
        // Set the onClickListener for the greetButton to be this class.
        // This requires that the class implement the View.OnClickListener callback
        // the onClick() method
        //greetButton.setOnClickListener(this);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent in=new Intent(this,ShowMessage.class);
        in.putExtra("message","GoodDay" +names[(int) id] + "!");
        startActivity(in);
    }
/*
    @Override
    public void onClick(View v) {

        // get a reference to the TextView on the UI
     //   TextView textMessage = (TextView) findViewById(R.id.textMessage);

        //get a reference to the EditText so that we can read in the value typed
        // by the user
        EditText editFriendName = (EditText) findViewById(R.id.editFriendName);

        // get the name of the friend typed in by the user in the EditText field
        String friendName = editFriendName.getText().toString();

        switch (v.getId()) {

            case R.id.greetButton:

                // set the string being displayed by the TextView to the greeting
                // message for the friend
//          //      textMessage.setText(getString(R.string.greetstring) + friendName + "!");
                Intent in=new Intent(this,ShowMessage.class);
                in.putExtra("message","GoodDay" + friendName + "!");
                startActivity(in);
                break;


            default:

                break;
        }
    }
    */
}
