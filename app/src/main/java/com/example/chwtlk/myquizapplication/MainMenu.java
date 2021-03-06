package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.Intent.ACTION_VIEW;

public class MainMenu extends AppCompatActivity {
    Button buttonPlayGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Log.d("lifecycle", getResources().getString(R.string.on_create));
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
                //startActivity(new Intent(getApplicationContext(), Quiz1.class));
                Intent intent=new Intent(MainMenu.this,Quiz1.class);
                intent.putExtra("name", "My Explicit Intent Innformation");
                startActivity(intent);

                // ** Implicit Intent
                //Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://www.google.com"));
                // startActivity(intent);
            }
        });

    }
}
