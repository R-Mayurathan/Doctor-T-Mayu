package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.doctort.R;

public class RemedyTamilActivity extends AppCompatActivity {

    private ImageButton play, pause, stop;
    private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedy_tamil);
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
            player = MediaPlayer.create(RemedyTamilActivity.this, R.raw.remedy_tamil);
        }
        player.start();
        Toast.makeText(this,"ஆரம்பமாகிவிட்டது", Toast.LENGTH_SHORT).show();
    }


    private void setPause() {
        if(player != null){
            player.pause();
            Toast.makeText(this,"இடைநிறுத்தப்பட்டது", Toast.LENGTH_SHORT).show();
        }

    }

    private void setStop() {
        player.stop();
        player = MediaPlayer.create(RemedyTamilActivity.this, R.raw.remedy_tamil);
        Toast.makeText(this,"நிறுத்தப்பட்டது", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setStop();
    }
}