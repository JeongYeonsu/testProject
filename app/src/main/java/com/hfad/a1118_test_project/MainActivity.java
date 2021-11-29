package com.hfad.a1118_test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "TEST123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener mL = new MyListener();
        Button b1 = (Button) findViewById(R.id.button1);
        if (b1 != null) {
            b1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "무명클래스 event 처리",
                            Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            Log.d(TAG, "b1 is null");
        }

    }

    class MyListener implements View.OnClickListener {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "event 처리", Toast.LENGTH_SHORT).show();
        }
    }
}