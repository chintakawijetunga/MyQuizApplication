package com.example.chwtlk.myquizapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    static final int REQUEST_VIDEO_CAPTURE = 1;
    Button btnPlay;
    Button btnPause;
    Button btnStop;
    VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setButtonActions();
        dispatchTakeVideoIntent();
    }

    private void dispatchTakeVideoIntent() {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
            Uri videoUri = intent.getData();
            mVideoView =(VideoView)findViewById(R.id.mVideoView);
            mVideoView.setVideoURI(videoUri);
        }
    }

    protected void setButtonActions(){
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPause = (Button)findViewById(R.id.btnPause);
        btnStop = (Button)findViewById(R.id.btnStop);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVideoView.start();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVideoView.pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVideoView.stopPlayback();
            }
        });

    }
}
