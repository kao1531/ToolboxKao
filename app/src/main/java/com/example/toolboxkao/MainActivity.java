package com.example.toolboxkao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox happy, sad, angry, relaxed, stressed;
    RadioButton red, orange, yellow, green, blue, purple;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnCheckbox();
        addListenerOnRadioButton();
        addListenerOnSwitch();
    }

    public void sendInfo (View v)
    {
        // getting a reference to my edit text fields
        EditText myName = (EditText) findViewById(R.id.editText);
        EditText myAge = (EditText) findViewById(R.id.editText2);
        Spinner year = (Spinner) findViewById(R.id.year);
        Switch s = (Switch) findViewById(R.id.switch1);
        boolean switchState = s.isChecked();

        if (myName.length() == 0 || myAge.length() == 0 || switchState == false)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please fill in all fields and agree to terms of service";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

       /**
        if (switchState == false)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please agree to the terms of service";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        **/
        else
        {
            // extracting the text from those edit text fields
            String myNameStr = myName.getText().toString();
            String myAgeStr = myAge.getText().toString();
            String yearStr = year.getSelectedItem().toString();
            // Creating the intent object so I can send data
            Intent intent = new Intent(this, Fortune.class);

            // putting data from edit text fields into intent to send to other activity
            // MY_NAME and MY_AGE are constants in the InfoActivity class
            intent.putExtra(Fortune.FIRST_NAME, myNameStr);
            intent.putExtra(Fortune.LAST_NAME, myAgeStr);
            intent.putExtra(Fortune.YEAR, yearStr);

            // loads the next activity
            startActivity(intent);
        }
    }

    /**
     *  https://www.mkyong.com/android/android-imageview-example/
     */
    public void addListenerOnCheckbox()
    {
        image = (ImageView) findViewById(R.id.imageView);

        happy = (CheckBox) findViewById(R.id.checkBox);
        sad = (CheckBox) findViewById(R.id.checkBox1);
        angry = (CheckBox) findViewById(R.id.checkBox2);
        relaxed = (CheckBox) findViewById(R.id.checkBox3);
        stressed = (CheckBox) findViewById(R.id.checkBox4);

        happy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                image.setImageResource(R.mipmap.happy);
            }
        });
        sad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                image.setImageResource(R.mipmap.sad);
            }
        });
        angry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                image.setImageResource(R.mipmap.mad);
            }
        });
        relaxed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                image.setImageResource(R.mipmap.relaxed);
            }
        });
        stressed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                image.setImageResource(R.mipmap.stressed);
            }
        });
    }

    public void addListenerOnRadioButton()
    {
        red = (RadioButton) findViewById(R.id.radioButton);
        orange = (RadioButton) findViewById(R.id.radioButton2);
        yellow = (RadioButton) findViewById(R.id.radioButton3);
        green = (RadioButton) findViewById(R.id.radioButton4);
        blue = (RadioButton) findViewById(R.id.radioButton5);
        purple = (RadioButton) findViewById(R.id.radioButton6);

        red.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                ConstraintLayout layout = findViewById(R.id.constraint);
                layout.setBackgroundColor(Color.parseColor("#ff4040"));
            }
        });

        orange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                ConstraintLayout layout = findViewById(R.id.constraint);
                layout.setBackgroundColor(Color.parseColor("#FFB900"));
            }
        });

        yellow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                ConstraintLayout layout = findViewById(R.id.constraint);
                layout.setBackgroundColor(Color.YELLOW);
            }
        });

        green.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                ConstraintLayout layout = findViewById(R.id.constraint);
                layout.setBackgroundColor(Color.GREEN);
            }
        });

        blue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                ConstraintLayout layout = findViewById(R.id.constraint);
                layout.setBackgroundColor(Color.CYAN);
            }
        });

        purple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                ConstraintLayout layout = findViewById(R.id.constraint);
                layout.setBackgroundColor(Color.parseColor("#C984E7"));
            }
        });
    }

    public void addListenerOnSwitch ()
    {

    }
}
