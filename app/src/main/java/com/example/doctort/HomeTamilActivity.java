package com.example.doctort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeTamilActivity extends AppCompatActivity {

    private ImageButton btnSymptom, btnRemedy, btnPredictTamil, btnHelpTamil;
    private boolean play = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_tamil);

        btnSymptom = (ImageButton) findViewById(R.id.btnSymptomTamil);
        btnSymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openSymptom();}
        });

        btnRemedy = findViewById(R.id.btnRemedyTamil);
        btnRemedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRemedy ();
            }
        });

        btnPredictTamil = findViewById(R.id.btnPredictTamil);
        btnPredictTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPredictTamil ();
            }
        });

        btnHelpTamil = findViewById(R.id.btnHelpTamil);
        btnHelpTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp ();
            }
        });
    }

    public void openHelp() {
        Intent help_intent = new Intent(HomeTamilActivity.this, CallerTamilActivity.class);
        Toast.makeText(this,"அழைப்பு செய்து உதவி பெறவும்", Toast.LENGTH_SHORT).show();
        startActivity(help_intent);
    }

    public void openSymptom (){
        Intent symtom_intent = new Intent(HomeTamilActivity.this, SymptomsTamilActivity.class);
        startActivity(symtom_intent);
    }

    public void openRemedy (){
        Intent remedy_intent = new Intent(HomeTamilActivity.this, RemedyTamilActivity.class);
        startActivity(remedy_intent);
    }

    private void openPredictTamil (){
        Intent predict_intent_tamil = new Intent(HomeTamilActivity.this, PredictTamilActivity.class);
        Toast.makeText(this,"தேர்தல் அல்லது புகைப்பட பொத்தானை அழுத்தி படத்தை உள்ளிடவும் ", Toast.LENGTH_LONG).show();
        startActivity(predict_intent_tamil);
    }
}