package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeEnglishActivity extends AppCompatActivity {

    private ImageButton btnSymptom, btnRemedy, btnPredict, btnHelp;
    private boolean play = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_english);


        btnSymptom = (ImageButton) findViewById(R.id.btnSymptomTamil);
        btnSymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymptom();
            }
        });

        btnRemedy = findViewById(R.id.btnRemedyTamil);
        btnRemedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRemedy ();
            }
        });

        btnPredict = findViewById(R.id.btnPredictTamil);
        btnPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPredict ();
            }
        });

        btnHelp = findViewById(R.id.btnHelpSinhala);
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp ();
            }
        });
    }

    public void openHelp() {
        Intent help_intent = new Intent(HomeEnglishActivity.this, CallerEnglishActivity.class);
        Toast.makeText(this,"Call and get help", Toast.LENGTH_SHORT).show();
        startActivity(help_intent);
    }

    public void openSymptom (){
        Intent symtom_intent = new Intent(HomeEnglishActivity.this, SymptomEnglishActivity.class);
        Toast.makeText(this,"Symptoms", Toast.LENGTH_SHORT).show();
        startActivity(symtom_intent);
    }

    public void openRemedy (){
        Intent remedy_intent = new Intent(HomeEnglishActivity.this, RemedyEnglishActivity.class);
        Toast.makeText(this,"Remedies - Click to Listen", Toast.LENGTH_SHORT).show();
        startActivity(remedy_intent);
    }

    public void openPredict (){
        Intent predict_intent = new Intent(HomeEnglishActivity.this, PredictEnglishActivity.class);
        Toast.makeText(this,"Select the image using select or camera button", Toast.LENGTH_LONG).show();
        startActivity(predict_intent);
    }
}