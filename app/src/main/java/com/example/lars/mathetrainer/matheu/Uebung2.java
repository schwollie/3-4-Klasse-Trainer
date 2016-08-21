package com.example.lars.mathetrainer.matheu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lars.mathetrainer.AufgabenInfo;
import com.example.lars.mathetrainer.Difficulty;
import com.example.lars.mathetrainer.FehlerActivity;
import com.example.lars.mathetrainer.MainActivity;
import com.example.lars.mathetrainer.R;

import java.util.Random;

/**
 * Created by Lars on 31.07.2016.
 */
public class Uebung2 extends MainActivity implements View.OnClickListener {


        Random rnd = new Random();
        private SharedPreferences.Editor editor;
        int richtig;
        int ergebnis;
        int Aufgaben = 6;
        int falsch;
        int schwer;
        private int countdown;
        private Handler handler = new Handler();
        private Runnable runnable = new Runnable() {
            @Override
            public void run() {
                countdown();
            }
        };
        private AufgabenInfo aufgabenInfo;
        int zahl1;
        int zahl2;
        int Wiederholung;


        private void begin() {
            TextView txt1 = (TextView)findViewById(R.id.textView9);
            TextView txt2 = (TextView)findViewById(R.id.textView11);
            TextView txt3 = (TextView)findViewById(R.id.textView10);
            TextView txt4 = (TextView)findViewById(R.id.textView8);
            txt3.setText("x");
            txt4.setText(""+Aufgaben);
            for(;Aufgaben>0;) {
                Random rnd = new Random();
                if(schwer==3) {
                    zahl2 = 1+ rnd.nextInt(9);
                    zahl1 = 1 +rnd.nextInt(9);
                    txt1.setText("" + zahl1);
                    txt2.setText("" + zahl2);
                    Aufgaben--;
                    txt4.setText(""+Aufgaben);
                    ergebnis = zahl1*zahl2;
                    break;
                }   else if(schwer==2){
                    zahl2 = 1+ rnd.nextInt(15);
                    zahl1 = 1+rnd.nextInt(15);
                    txt1.setText("" + zahl1);
                    txt2.setText("" + zahl2);
                    Aufgaben--;
                    txt4.setText(""+Aufgaben);
                    ergebnis = zahl1*zahl2;
                    break;

                } else {
                    zahl2 = 1+ rnd.nextInt(21);
                    zahl1 = 1+rnd.nextInt(21);
                    txt1.setText("" + zahl1);
                    txt2.setText("" + zahl2);
                    Aufgaben--;
                    txt4.setText(""+Aufgaben);
                    ergebnis = zahl1*zahl2;
                    break;

                }
            }
        }




        private TextView txt1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.mathe_ue1u2);

            aufgabenInfo = new AufgabenInfo(this);

            Button btn = (Button)findViewById(R.id.maprofe1);
            btn.setOnClickListener(this);

            txt1 = (TextView)findViewById(R.id.countdown);

            SharedPreferences sharedPreferences = getSharedPreferences(
                    getString(R.string.preference_file_key), Context.MODE_PRIVATE);
            editor = sharedPreferences.edit();

            int difficulty = sharedPreferences.getInt(getString(R.string.preference_difficulty), Difficulty.EASY);
            countdown = difficulty*20;
            if(difficulty==1) {
                countdown = difficulty*3*10;
            } else if(difficulty==2) {
                countdown = difficulty*2*10;
            }
            schwer = difficulty;
            handler.postDelayed(runnable,1000);
            begin();
        }

        private void countdown() {
            countdown--;

            txt1.setText(String.format("%05d", countdown));
            if(countdown<=0) {
                EditText edt = (EditText) findViewById(R.id.editText);
                edt.setText("");
                Intent intent = new Intent(this, FehlerActivity.class);
                intent.putExtra("richtig", richtig);
                intent.putExtra("falsch", falsch);
                intent.putExtra("wiederholung", Wiederholung);
                intent.putExtra("fach",1);
                intent.putExtra("Aufgaben",Aufgaben-1);
                handler.removeCallbacks(runnable);
                startActivity(intent);
            } else {
                handler.postDelayed(runnable,1000);
            }
        }


        @Override
        public void onClick(View view) {
            TextView txt3 = (TextView) findViewById(R.id.textView10);
            EditText edt = (EditText) findViewById(R.id.editText);
            TextView txt1 = (TextView) findViewById(R.id.textView14);
            TextView richtig2 = (TextView) findViewById(R.id.textView16);
            if (view.getId() == R.id.maprofe1) {

                if (edt.getText().toString().trim().length() == 0 && Wiederholung == 0) {
                    Toast.makeText(getApplicationContext(), "Bitte eine Zahl eingeben!!", Toast.LENGTH_SHORT).show();
                    for (; edt.getText().toString().trim().length() == 0; ) {
                        txt3.setText("*");
                        ergebnis = zahl1 * zahl2;
                        Wiederholung++;
                        break;


                    }
                    Aufgaben++;
                    Wiederholung++;


                } else if (edt.getText().toString().trim().length() == 0 && Wiederholung > 0) {
                    falsch++;
                    txt1.setText("" + falsch);
                    Wiederholung++;
                } else {
                    int prove = Integer.parseInt(edt.getText().toString());
                    edt.setText("");

                    if (prove == ergebnis) {
                        richtig++;
                        edt.setText("");
                        richtig2.setText("" + richtig);

                    } else {
                        edt.setText("");
                        falsch++;
                        txt1.setText("" + falsch);
                    }
                }

                if (Aufgaben < 2) {
                    aufgabenInfo.richtigeAntwortenMathe += richtig;
                    aufgabenInfo.falscheAntwortenMathe += falsch;
                    aufgabenInfo.save();
                    handler.removeCallbacks(runnable);

                    Intent intent = new Intent(this, FehlerActivity.class);
                    intent.putExtra("richtig", richtig);
                    intent.putExtra("falsch", falsch);
                    intent.putExtra("wiederholung", Wiederholung);
                    intent.putExtra("fach", 1);
                    intent.putExtra("Aufgaben", Aufgaben - 1);
                    startActivity(intent);
                } else {
                    begin();
                }
            }
        }

        @Override
        public void onBackPressed() {
        }


        @Override
        public void onPause() {
            super.onPause();
            handler.removeCallbacks(runnable);
        }

}
