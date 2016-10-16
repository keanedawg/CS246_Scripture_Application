package com.example.scripture_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText BookText;
    private EditText ChapterText;
    private EditText VerseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BookText = (EditText) findViewById(R.id.myBook);
        ChapterText = (EditText) findViewById(R.id.myChapter);
        VerseText = (EditText) findViewById(R.id.myVerse);
        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

    }


    private void sendData() {
        Intent intent = new Intent(this, SecondActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("Book", BookText.getText().toString());
        bundle.putString("Chapter", ChapterText.getText().toString());
        bundle.putString("Verse", VerseText.getText().toString());

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
