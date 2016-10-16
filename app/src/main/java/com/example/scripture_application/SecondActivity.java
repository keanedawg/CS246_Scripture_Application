package com.example.scripture_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView textView = (TextView) findViewById(R.id.Text_view_result);
        Bundle bundle = getIntent().getExtras();

        String myString = new String();
        myString = "Your favorite scripture is: " + bundle.getString("Book") + " ";
        myString += bundle.getString("Chapter") + ":" + bundle.getString("Verse");

        textView.setText(myString);

    }
}
