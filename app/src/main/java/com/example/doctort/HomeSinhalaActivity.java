package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeSinhalaActivity extends AppCompatActivity {

    private ImageButton btnSymptomSihala, btnRemedySinhala, btnPredictSinhala, btnHelpSinhala;
    private boolean play = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sinhala);

        btnSymptomSihala = (ImageButton) findViewById(R.id.btnSymptomTamil);
        btnSymptomSihala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openSymptomSinhala();}
        });

        btnRemedySinhala = findViewById(R.id.btnRemedyTamil);
        btnRemedySinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRemedySinhala ();
            }
        });

        btnPredictSinhala = findViewById(R.id.btnPredictTamil);
        btnPredictSinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPredictSinhala ();
            }
        });

        btnHelpSinhala = findViewById(R.id.btnHelpSinhala);
        btnHelpSinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp ();
            }
        });
    }

    public void openHelp() {
        Intent help_intent = new Intent(HomeSinhalaActivity.this, CallerSinhalaActivity.class);
        Toast.makeText(this,"ඇමතුමක් ලබා දී උදව් ලබා ගන්න", Toast.LENGTH_SHORT).show();
        startActivity(help_intent);
    }

    public void openSymptomSinhala (){
        Intent symtom_intent = new Intent(HomeSinhalaActivity.this, SymptomSinhalaActivity.class);
        startActivity(symtom_intent);
    }

    public void openRemedySinhala (){
        Intent remedy_intent = new Intent(HomeSinhalaActivity.this, RemedySinhalaActivity.class);
        startActivity(remedy_intent);
    }

    private void openPredictSinhala (){
        Intent predict_intent_tamil = new Intent(HomeSinhalaActivity.this, PredictSinhalaActivity.class);
        Toast.makeText(this,"තෝරන්න හෝ කැමරා බොත්තම භාවිතයෙන් රූපය තෝරන්න", Toast.LENGTH_LONG).show();
        startActivity(predict_intent_tamil);
    }
}