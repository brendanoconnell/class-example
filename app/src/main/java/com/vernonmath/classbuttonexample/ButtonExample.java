package com.vernonmath.classbuttonexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ButtonExample extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.vernonmath.ButtonExample.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_example);
    }

    public void sendMessage(View view) {
        // Build an intent to open a new activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        //Find the textbox by is
        EditText editText = (EditText) findViewById(R.id.edit_message);

        // Store the value of the textbox in a local variable
        String message = editText.getText().toString();

        // Add the information to the "intent" to be passed to the next activitiy
        intent.putExtra(EXTRA_MESSAGE, message);

        // Once the information has been saved, start the activity within the intent
        startActivity(intent);
    }


}
