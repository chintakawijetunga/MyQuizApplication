package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button buttonPlayGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        buttonClick();
    }

    private void buttonClick() {
        buttonPlayGame = (Button) findViewById(R.id.btnPlayGame);

        buttonPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Quiz5.class));
            }
        });

    }
}
