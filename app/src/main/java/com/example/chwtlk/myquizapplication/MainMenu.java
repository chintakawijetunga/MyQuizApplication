package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button buttonPlayGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Log.d("lifecycle", String.valueOf(R.string.on_create));
        buttonClick();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onStop invoked");
    }

    private void buttonClick() {
        buttonPlayGame = (Button) findViewById(R.id.btnPlayGame);

        buttonPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Quiz1.class));
            }
        });

    }
}
