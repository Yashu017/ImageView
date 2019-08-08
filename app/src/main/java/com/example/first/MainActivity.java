package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView first;
    private ImageView second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (ImageView) findViewById(R.id.imageView);
        second = (ImageView) findViewById(R.id.imageView2);
        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case (R.id.imageView):
                Intent person1 =new Intent (MainActivity.this, bio_activity.class);
                person1.putExtra("Name","Ayush");
                person1.putExtra("info"," roll no 1" );
                startActivity(person1);
               // Toast.makeText(MainActivity.this, "1st person selected", Toast.LENGTH_LONG).show();
                break;

            case (R.id.imageView2):
               // Toast.makeText(MainActivity.this, "2nd person selected", Toast.LENGTH_LONG).show();
                Intent person2 =new Intent (MainActivity.this, bio_activity.class);
                person2.putExtra("Name","Sarthak");
                person2.putExtra("info"," roll no 2" );
                startActivity(person2);
                break;
        }
    }
}