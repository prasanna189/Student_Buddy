package com.example.adavi.studentbuddy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void subject(View view) {
        Intent intent = new Intent(this, DisplaySubjectsActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

//            finishAffinity();
//            System.exit(0);

            DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which) {
                        case DialogInterface.BUTTON_POSITIVE:
                            finishAffinity();
//                            System.exit(0);
                            break;

                        case DialogInterface.BUTTON_NEGATIVE:
                            //No button clicked
                            break;

//                        case DialogInterface.BUTTON_NEUTRAL:
//
//                            Toast.makeText(MainActivity.this, "CHOOSE", Toast.LENGTH_SHORT).show();
//
//                            break;


                    }
                }
            };

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Exit the app?").setPositiveButton("EXIT", dialogClickListener)
                    .setNegativeButton("CANCEL", dialogClickListener).show();

            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


    public void marks(View view) {

        Toast.makeText(MainActivity.this, "TO BE IMPLEMENTED :D", Toast.LENGTH_SHORT).show();

    }

    public void events(View view) {

        Toast.makeText(MainActivity.this, "TO BE IMPLEMENTED :D", Toast.LENGTH_SHORT).show();
    }

    public void timetable(View view) {
        Toast.makeText(MainActivity.this, "TO BE IMPLEMENTED :D", Toast.LENGTH_SHORT).show();
    }



}
