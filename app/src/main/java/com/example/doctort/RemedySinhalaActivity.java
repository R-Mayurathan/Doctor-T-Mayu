package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.doctort.R;

public class RemedySinhalaActivity extends AppCompatActivity {


    private ImageButton play, pause, stop;
    private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedy_sinhala);
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
            player = MediaPlayer.create(RemedySinhalaActivity.this, R.raw.remedy_sinhala);
        }
        player.start();
        Toast.makeText(this,"ආරම්භ කළා", Toast.LENGTH_SHORT).show();
    }


    private void setPause() {
        if(player != null){
            player.pause();
            Toast.makeText(this,"විරාම කළා", Toast.LENGTH_SHORT).show();
        }

    }

    private void setStop() {
        if(player != null) {
            player.stop();
            Toast.makeText(this, "නැවැත්තුවා", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(RemedySinhalaActivity.this, R.raw.remedy_sinhala);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        setStop();
    }
}