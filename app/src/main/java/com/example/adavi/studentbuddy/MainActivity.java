package com.example.adavi.studentbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDB = new DatabaseHelper(this);
    }


    public void subject(View view) {
        Intent intent = new Intent(this, DisplaySubjectsActivity.class);
        startActivity(intent);
    }


    public void marks(View view) {



    }

    public void events(View view) {


    }

    public void timetable(View view) {

    }



}
