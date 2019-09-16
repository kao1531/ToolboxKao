package com.example.toolboxkao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.widget.TextView;

public class Fortune extends AppCompatActivity {

    public static final String LAST_NAME = "last";
    public static final String FIRST_NAME = "first";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        Intent intent = getIntent();
        String lastName = intent.getStringExtra(LAST_NAME);
        String firstName = intent.getStringExtra(FIRST_NAME);

        String strToDisplay = firstName + " " + lastName + "'s Fortune Is..." ;
        String fortuneStr = "Your Identity will be Stolen in the Near Future.";
        TextView str = (TextView) findViewById(R.id.info);
        TextView fortune = (TextView) findViewById(R.id.fortune);
        str.setText(strToDisplay);
        fortune.setText(fortuneStr);
    }
}
