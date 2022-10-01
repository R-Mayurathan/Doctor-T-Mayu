package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.doctort.R;

public class RemedyEnglishActivity extends AppCompatActivity {

    private ImageButton play, pause, stop;
    private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedy_english);
        play = (ImageButton) findViewById(R.id.btnplay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPlay();
            }
        });
        pause = (ImageButton) findViewById(R.id.btnpause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPause();
            }
        });
        stop = (ImageButton) findViewById(R.id.btnstop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setStop();
            }
        });
    }
    private void setPlay() {
        if(player == null){
            player = MediaPlayer.create(RemedyEnglishActivity.this, R.raw.remedy_english);

        }
        Toast.makeText(this,"Playing", Toast.LENGTH_SHORT).show();
        player.start();
    }


    private void setPause() {
        if(player != null){
            player.pause();
            Toast.makeText(this,"Paused", Toast.LENGTH_SHORT).show();
        }

    }

    private void setStop() {
        player.stop();
        Toast.makeText(this,"Stopped", Toast.LENGTH_SHORT).show();
        player = MediaPlayer.create(RemedyEnglishActivity.this, R.raw.remedy_english);
    }

    @Override
    protected void onStop() {
        super.onStop();
        setStop();
    }
}