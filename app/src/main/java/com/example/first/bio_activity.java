package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bio_activity extends AppCompatActivity {
private ImageView mydisplay;
private TextView myname;
private TextView myinfo;
private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_activity);

        mydisplay = (ImageView) findViewById(R.id.resultimageviewID);
        myname= (TextView) findViewById (R.id.nameID);
        myinfo= (TextView) findViewById (R.id.infoID);
        extras= getIntent().getExtras();



        if (extras != null) {
            String name = extras.getString("name");


            String info = extras.getString("info");

            setUp(name, info);
        }

    }

  public void setUp(String name, String info) {
        if(name.equals("Ayush"))
        {
            mydisplay.setImageDrawable(getResources().getDrawable(R.drawable.pp));
        myname. setText(name);
         myinfo.setText(info);}
        else if (name.equals("Sarthak"))
        {
            mydisplay.setImageDrawable(getResources().getDrawable(R.drawable.pp1));
            myname.setText(name);
            myinfo.setText(info);
        }

    }

}