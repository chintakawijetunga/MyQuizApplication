package com.example.chwtlk.myquizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Quiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        String name = b.getString("name");
    }
}
