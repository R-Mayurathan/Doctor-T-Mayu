package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.doctort.R;


public class LanguageActivity extends AppCompatActivity {

    private Button btnTamil, btnEnglish, btnSinhala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        Toast.makeText(this,"Choose Language", Toast.LENGTH_LONG).show();

        btnEnglish = (Button) findViewById(R.id.btnEnglish);
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglishDashboard();
            }
        });

        btnTamil = (Button) findViewById(R.id.btnTamil);
        btnTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTamilDashboard();
            }
        });

        btnSinhala = (Button) findViewById(R.id.btnSinhala);
        btnSinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSinhalaDashboard();
            }
        });

    }

    public void openEnglishDashboard() {
        Intent english = new Intent(LanguageActivity.this, HomeEnglishActivity.class);
        startActivity(english);
        finish();
    }

    public void openTamilDashboard() {
        Intent tamil = new Intent(LanguageActivity.this, HomeTamilActivity.class);
        startActivity(tamil);
        finish();
    }

    public void openSinhalaDashboard() {
        Intent sinhala = new Intent(LanguageActivity.this, HomeSinhalaActivity.class);
        startActivity(sinhala);
        finish();
    }
}