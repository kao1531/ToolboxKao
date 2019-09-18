package com.example.toolboxkao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.widget.TextView;

public class Fortune extends AppCompatActivity {

    public static final String LAST_NAME = "last";
    public static final String FIRST_NAME = "first";
    public static final String YEAR = "year";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        Intent intent = getIntent();
        String lastName = intent.getStringExtra(LAST_NAME);
        String firstName = intent.getStringExtra(FIRST_NAME);
        String year = intent.getStringExtra(YEAR);
        int yearNum = Integer.parseInt(year);
        int age = 2020 - yearNum;

        String strToDisplay = firstName + " " + lastName + "'s Fortune Is..." ;
        String fortuneStr = "You will turn " + age + " years old next year.";
        TextView str = (TextView) findViewById(R.id.info);
        TextView fortune = (TextView) findViewById(R.id.fortune);
        str.setText(strToDisplay);
        fortune.setText(fortuneStr);
    }
}
