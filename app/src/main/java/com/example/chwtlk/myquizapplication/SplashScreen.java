package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread splash_Screen = new Thread(){

            public void run(){

                try{

                    sleep(1000);

                }catch(Exception e){

                    e.printStackTrace();

                }finally{
                    startActivity(new Intent(getApplicationContext(),LoginMenu.class));

                    finish();
                }
            }
        };

        splash_Screen.start();
    }
}
