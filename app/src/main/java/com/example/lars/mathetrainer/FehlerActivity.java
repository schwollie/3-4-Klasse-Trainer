package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Lars on 30.07.2016.
 */
public class FehlerActivity extends MainActivity implements View.OnClickListener{

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fehler);

        Intent intent = new Intent(this, MainContent.class);

        int richtig = getIntent().getIntExtra("richtig", 0);
        int falsch = getIntent().getIntExtra("falsch", 0);
        int wiederholung = getIntent().getIntExtra("wiederholung",0);
        int Aufgaben = getIntent().getIntExtra("Aufgaben",0);
        int fach = getIntent().getIntExtra("fach",0);



        double aufgaben = richtig + falsch;
        double verhältnisgut = richtig/aufgaben;
        double verhältnisschlecht = falsch/aufgaben;





        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);

        TextView richtig1 = (TextView)findViewById(R.id.richtigen);
        TextView falsch1 = (TextView)findViewById(R.id.fehler);
        TextView ergebnis = (TextView)findViewById(R.id.Resultat);

        richtig1.setText("00000"+richtig);
        falsch1.setText("00000"+falsch);


        sharedPreferences = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();



        if(fach==1) {
            intent.putExtra("richtig", richtig);
            intent.putExtra("falsch", falsch);
            intent.putExtra("Aufgaben",Aufgaben);
            intent.putExtra("fach", fach);
        } else if(fach==2) {
            intent.putExtra("richtig", richtig);
            intent.putExtra("falsch", falsch);
            intent.putExtra("Aufgaben",Aufgaben);
            intent.putExtra("fach", fach);

        } else if(fach==3) {
            intent.putExtra("richtig", richtig);
            intent.putExtra("falsch", falsch);
            intent.putExtra("Aufgaben",Aufgaben);
            intent.putExtra("fach", fach);
        }


























        if (richtig == 0&&falsch == 0||wiederholung>3) {
            ergebnis.setText("Du hast dir keine Mühe gegeben!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);

        }  else if(richtig == 0&&falsch>0) {
            ergebnis.setText("Du musst sehr stark an dir Arbeiten!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        } else if(falsch == 0&&verhältnisgut==1) {
            ergebnis.setText("Wow hast du echt gut gemacht!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        } else if(verhältnisgut>0.7) {
            ergebnis.setText("Gut gemacht!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

        } else if(verhältnisgut>0.5||falsch==richtig) {
            ergebnis.setText("Du hast es OK gemacht!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        } else if(verhältnisgut>0.3) {
            ergebnis.setText("Naja!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        } else if(verhältnisgut>0.1) {
            ergebnis.setText("Du musst an dir Arbeiten!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        } else if(verhältnisschlecht>0.7) {
            ergebnis.setText("Du musst an dir Arbeiten!!");
            ergebnis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);

        }








    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
