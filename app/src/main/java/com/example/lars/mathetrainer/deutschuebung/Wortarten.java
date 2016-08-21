package com.example.lars.mathetrainer.deutschuebung;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lars.mathetrainer.AufgabenInfo;
import com.example.lars.mathetrainer.Difficulty;
import com.example.lars.mathetrainer.FehlerActivity;
import com.example.lars.mathetrainer.MainActivity;
import com.example.lars.mathetrainer.R;

import java.util.Random;

/**
 * Created by Lars on 01.08.2016.
 */
public class Wortarten extends MainActivity implements View.OnClickListener {

    private AufgabenInfo aufgabenInfo;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wortarten);

        Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(this);

        aufgabenInfo = new AufgabenInfo(this);



        SharedPreferences sharedPreferences = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        int difficulty = sharedPreferences.getInt(getString(R.string.preference_difficulty), Difficulty.EASY);
        schwer = difficulty;




        begin();
    }

    int richtig;
    int falsch;
    int Wiederholung;
    int wiederholung2 = 0;




    String erste = "Hi";
    String zweite = "Hi";
    String dritte = "Hi";
    String vierte = "Hi";
    String fünfte = "Hi";

    String wortart1 = "HI";
    String wortart2 = "HI";
    String wortart3 = "HI";
    String wortart4 = "HI";
    String wortart5 = "HI";

    int aufgabe = 0;
    int whichprofe = 1;
    int schwer;




    public void wortart() {
        Random rnd = new Random();

        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);

        int wortart = rnd.nextInt(5);

        if(wortart==0) {
            aufgabe++;
            if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
                begin();
            }
            Nomen();
        } else if(wortart==1) {
            aufgabe++;
            if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
                begin();
            }
            Adjectiv();
        } else if(wortart==2) {
            aufgabe++;
            if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
                begin();
            }
            Verb();
        } else if(wortart==3) {
            aufgabe++;
            if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
                begin();
            }
            Artikel();

        } else if(wortart==4) {
            aufgabe++;
            if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
                begin();
            }
            Pronomen();

        }







    }



    public void Nomen() {
        Random rnd = new Random();
        int random1 = rnd.nextInt(10);
        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);

        if(aufgabe==1) {
            wortart1 = "Nomen";
        } else if(aufgabe==2) {
            wortart2 = "Nomen";
        } else if(aufgabe==3) {
            wortart3 = "Nomen";
        } else if(aufgabe==4) {
            wortart4 = "Nomen";
        } else if(aufgabe==5);
            wortart5 = "Nomen";

        if (random1 == 0) {
            if (aufgabe == 1) {
                wort1.setText("Banane");
                erste = "Banane";
            } else if (aufgabe == 2) {
                wort2.setText("Banane");
                zweite = "Banane";
            } else if (aufgabe == 3) {
                wort3.setText("Banane");
                dritte = "Banane";
            } else if (aufgabe == 4) {
                wort4.setText("Banane");
                vierte = "Banane";
            } else if (aufgabe == 5) {
                wort5.setText("Banane");
                fünfte = "Banane";
            }

        } else if (random1 == 1) {

            if (aufgabe == 1) {
                wort1.setText("Auto");
                erste = "Auto";
            } else if (aufgabe == 2) {
                wort2.setText("Auto");
                zweite = "Auto";
            } else if (aufgabe == 3) {
                wort3.setText("Auto");
                dritte = "Auto";
            } else if (aufgabe == 4) {
                wort4.setText("Auto");
                vierte = "Auto";
            } else if (aufgabe == 5) {
                wort5.setText("Auto");
                fünfte = "Auto";
            }


        } else if (random1 == 2) {
            if (aufgabe == 1) {
                wort1.setText("Globus");
                erste = "Globus";
            } else if (aufgabe == 2) {
                wort2.setText("Globus");
                zweite = "Globus";
            } else if (aufgabe == 3) {
                wort3.setText("Globus");
                dritte = "Globus";
            } else if (aufgabe == 4) {
                wort4.setText("Globus");
                vierte = "Globus";
            } else if (aufgabe == 5) {
                wort5.setText("Globus");
                fünfte = "Globus";
            }


        } else if (random1 == 3) {

            if (aufgabe == 1) {
                wort1.setText("Koch");
                erste = "Koch";
            } else if (aufgabe == 2) {
                wort2.setText("Koch");
                zweite = "Koch";
            } else if (aufgabe == 3) {
                wort3.setText("Koch");
                dritte = "Koch";
            } else if (aufgabe == 4) {
                wort4.setText("Koch");
                vierte = "Koch";
            } else if (aufgabe == 5) {
                wort5.setText("Koch");
                fünfte = "Koch";

            }


        } else if(random1== 4) {

            if (aufgabe == 1) {
                wort1.setText("Zauberer");
                erste = "Zauberer";
            } else if (aufgabe == 2) {
                wort2.setText("Zauberer");
                zweite = "Zauberer";
            } else if (aufgabe == 3) {
                wort3.setText("Zauberer");
                dritte = "Zauberer";
            } else if (aufgabe == 4) {
                wort4.setText("Zauberer");
                vierte = "Zauberer";
            } else if (aufgabe == 5) {
                wort5.setText("Zauberer");
                fünfte = "Zauberer";

            }

        } else if(random1==5) {
            if (aufgabe == 1) {
                wort1.setText("Körper");
                erste = "Körper";
            } else if (aufgabe == 2) {
                wort2.setText("Körper");
                zweite = "Körper";
            } else if (aufgabe == 3) {
                wort3.setText("Körper");
                dritte = "Körper";
            } else if (aufgabe == 4) {
                wort4.setText("Körper");
                vierte = "Körper";
            } else if (aufgabe == 5) {
                wort5.setText("Körper");
                fünfte = "Körper";

            }


        } else if(random1==6) {
            if (aufgabe == 1) {
                wort1.setText("Himmel");
                erste = "Himmel";
            } else if (aufgabe == 2) {
                wort2.setText("Himmel");
                zweite = "Himmel";
            } else if (aufgabe == 3) {
                wort3.setText("Himmel");
                dritte = "Himmel";
            } else if (aufgabe == 4) {
                wort4.setText("Himmel");
                vierte = "Himmel";
            } else if (aufgabe == 5) {
                wort5.setText("Himmel");
                fünfte = "Himmel";

            }


        } else if(random1==7) {
            if (aufgabe == 1) {
                wort1.setText("Bett");
                erste = "Bett";
            } else if (aufgabe == 2) {
                wort2.setText("Bett");
                zweite = "Bett";
            } else if (aufgabe == 3) {
                wort3.setText("Bett");
                dritte = "Bett";
            } else if (aufgabe == 4) {
                wort4.setText("Bett");
                vierte = "Bett";
            } else if (aufgabe == 5) {
                wort5.setText("Bett");
                fünfte = "Bett";

            }

        } else if(random1==8) {
            if (aufgabe == 1) {
                wort1.setText("Kind");
                erste = "Kind";
            } else if (aufgabe == 2) {
                wort2.setText("Kind");
                zweite = "Kind";
            } else if (aufgabe == 3) {
                wort3.setText("Kind");
                dritte = "Kind";
            } else if (aufgabe == 4) {
                wort4.setText("Kind");
                vierte = "Kind";
            } else if (aufgabe == 5) {
                wort5.setText("Kind");
                fünfte = "Kind";

            }


        } else if(random1==9){
            if (aufgabe == 1) {
                wort1.setText("Abend");
                erste = "Abend";
            } else if (aufgabe == 2) {
                wort2.setText("Abend");
                zweite = "Abend";
            } else if (aufgabe == 3) {
                wort3.setText("Abend");
                dritte = "Abend";
            } else if (aufgabe == 4) {
                wort4.setText("Abend");
                vierte = "Abend";
            } else if (aufgabe == 5) {
                wort5.setText("Abend");
                fünfte = "Abend";

            }
        }
        if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
            begin();
        }

    }

    public void Verb() {
        Random rnd = new Random();
        int random1 = rnd.nextInt(10);
        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);

        if(aufgabe==1) {
            wortart1 = "Verb";
        } else if(aufgabe==2) {
            wortart2 = "Verb";
        } else if(aufgabe==3) {
            wortart3 = "Verb";
        } else if(aufgabe==4) {
            wortart4 = "Verb";
        } else if(aufgabe==5);
        wortart5 = "Verb";

        if (random1 == 0) {
            if (aufgabe == 1) {
                wort1.setText("essen");
                erste = "essen";
            } else if (aufgabe == 2) {
                wort2.setText("essen");
                zweite = "essen";
            } else if (aufgabe == 3) {
                wort3.setText("essen");
                dritte = "essen";
            } else if (aufgabe == 4) {
                wort4.setText("essen");
                vierte = "essen";
            } else if (aufgabe == 5) {
                wort5.setText("essen");
                fünfte = "essen";
            }

        } else if (random1 == 1) {

            if (aufgabe == 1) {
                wort1.setText("hüpfen");
                erste = "hüpfen";
            } else if (aufgabe == 2) {
                wort2.setText("hüpfen");
                zweite = "hüpfen";
            } else if (aufgabe == 3) {
                wort3.setText("hüpfen");
                dritte = "hüpfen";
            } else if (aufgabe == 4) {
                wort4.setText("hüpfen");
                vierte = "hüpfen";
            } else if (aufgabe == 5) {
                wort5.setText("hüpfen");
                fünfte = "hüpfen";
            }


        } else if (random1 == 2) {
            if (aufgabe == 1) {
                wort1.setText("üben");
                erste = "üben";
            } else if (aufgabe == 2) {
                wort2.setText("üben");
                zweite = "üben";
            } else if (aufgabe == 3) {
                wort3.setText("üben");
                dritte = "üben";
            } else if (aufgabe == 4) {
                wort4.setText("üben");
                vierte = "üben";
            } else if (aufgabe == 5) {
                wort5.setText("üben");
                fünfte = "üben";
            }


        } else if (random1 == 3) {

            if (aufgabe == 1) {
                wort1.setText("heben");
                erste = "heben";
            } else if (aufgabe == 2) {
                wort2.setText("heben");
                zweite = "heben";
            } else if (aufgabe == 3) {
                wort3.setText("heben");
                dritte = "heben";
            } else if (aufgabe == 4) {
                wort4.setText("heben");
                vierte = "heben";
            } else if (aufgabe == 5) {
                wort5.setText("heben");
                fünfte = "heben";

            }


        } else if(random1== 4) {

            if (aufgabe == 1) {
                wort1.setText("gewinnen");
                erste = "gewinnen";
            } else if (aufgabe == 2) {
                wort2.setText("gewinnen");
                zweite = "gewinnen";
            } else if (aufgabe == 3) {
                wort3.setText("gewinnen");
                dritte = "gewinnen";
            } else if (aufgabe == 4) {
                wort4.setText("gewinnen");
                vierte = "gewinnen";
            } else if (aufgabe == 5) {
                wort5.setText("gewinnen");
                fünfte = "gewinnen";

            }

        } else if(random1==5) {
            if (aufgabe == 1) {
                wort1.setText("verstehen");
                erste = "verstehen";
            } else if (aufgabe == 2) {
                wort2.setText("verstehen");
                zweite = "verstehen";
            } else if (aufgabe == 3) {
                wort3.setText("verstehen");
                dritte = "verstehen";
            } else if (aufgabe == 4) {
                wort4.setText("verstehen");
                vierte = "verstehen";
            } else if (aufgabe == 5) {
                wort5.setText("verstehen");
                fünfte = "verstehen";

            }


        } else if(random1==6) {
            if (aufgabe == 1) {
                wort1.setText("beobachten");
                erste = "beobachten";
            } else if (aufgabe == 2) {
                wort2.setText("beobachten");
                zweite = "beobachten";
            } else if (aufgabe == 3) {
                wort3.setText("beobachten");
                dritte = "beobachten";
            } else if (aufgabe == 4) {
                wort4.setText("beobachten");
                vierte = "beobachten";
            } else if (aufgabe == 5) {
                wort5.setText("beobachten");
                fünfte = "beobachten";

            }


        } else if(random1==7) {
            if (aufgabe == 1) {
                wort1.setText("liegen");
                erste = "liegen";
            } else if (aufgabe == 2) {
                wort2.setText("liegen");
                zweite = "liegen";
            } else if (aufgabe == 3) {
                wort3.setText("liegen");
                dritte = "liegen";
            } else if (aufgabe == 4) {
                wort4.setText("liegen");
                vierte = "liegen";
            } else if (aufgabe == 5) {
                wort5.setText("liegen");
                fünfte = "liegen";

            }

        } else if(random1==8) {
            if (aufgabe == 1) {
                wort1.setText("überleben");
                erste = "überleben";
            } else if (aufgabe == 2) {
                wort2.setText("überleben");
                zweite = "überleben";
            } else if (aufgabe == 3) {
                wort3.setText("überleben");
                dritte = "überleben";
            } else if (aufgabe == 4) {
                wort4.setText("überleben");
                vierte = "überleben";
            } else if (aufgabe == 5) {
                wort5.setText("überleben");
                fünfte = "überleben";

            }


        } else if(random1==9){
            if (aufgabe == 1) {
                wort1.setText("holen");
                erste = "holen";
            } else if (aufgabe == 2) {
                wort2.setText("holen");
                zweite = "holen";
            } else if (aufgabe == 3) {
                wort3.setText("holen");
                dritte = "holen";
            } else if (aufgabe == 4) {
                wort4.setText("holen");
                vierte = "holen";
            } else if (aufgabe == 5) {
                wort5.setText("holen");
                fünfte = "holen";

            }
        }
        if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
            begin();
        }

    }

    public void Adjectiv() {
        Random rnd = new Random();
        int random1 = rnd.nextInt(10);
        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);

        if(aufgabe==1) {
            wortart1 = "Adjektiv";
        } else if(aufgabe==2) {
            wortart2 = "Adjektiv";
        } else if(aufgabe==3) {
            wortart3 = "Adjektiv";
        } else if(aufgabe==4) {
            wortart4 = "Adjektiv";
        } else if(aufgabe==5);
        wortart5 = "Adjektiv";

        if (random1 == 0) {
            if (aufgabe == 1) {
                wort1.setText("groß");
                erste = "groß";
            } else if (aufgabe == 2) {
                wort2.setText("groß");
                zweite = "groß";
            } else if (aufgabe == 3) {
                wort3.setText("groß");
                dritte = "groß";
            } else if (aufgabe == 4) {
                wort4.setText("groß");
                vierte = "groß";
            } else if (aufgabe == 5) {
                wort5.setText("groß");
                fünfte = "groß";
            }

        } else if (random1 == 1) {

            if (aufgabe == 1) {
                wort1.setText("gut");
                erste = "gut";
            } else if (aufgabe == 2) {
                wort2.setText("gut");
                zweite = "gut";
            } else if (aufgabe == 3) {
                wort3.setText("gut");
                dritte = "gut";
            } else if (aufgabe == 4) {
                wort4.setText("gut");
                vierte = "gut";
            } else if (aufgabe == 5) {
                wort5.setText("gut");
                fünfte = "gut";
            }


        } else if (random1 == 2) {
            if (aufgabe == 1) {
                wort1.setText("roh");
                erste = "roh";
            } else if (aufgabe == 2) {
                wort2.setText("roh");
                zweite = "roh";
            } else if (aufgabe == 3) {
                wort3.setText("roh");
                dritte = "roh";
            } else if (aufgabe == 4) {
                wort4.setText("roh");
                vierte = "roh";
            } else if (aufgabe == 5) {
                wort5.setText("roh");
                fünfte = "roh";
            }


        } else if (random1 == 3) {

            if (aufgabe == 1) {
                wort1.setText("stark");
                erste = "stark";
            } else if (aufgabe == 2) {
                wort2.setText("stark");
                zweite = "stark";
            } else if (aufgabe == 3) {
                wort3.setText("stark");
                dritte = "stark";
            } else if (aufgabe == 4) {
                wort4.setText("stark");
                vierte = "stark";
            } else if (aufgabe == 5) {
                wort5.setText("stark");
                fünfte = "stark";

            }


        } else if(random1== 4) {

            if (aufgabe == 1) {
                wort1.setText("traurig");
                erste = "traurig";
            } else if (aufgabe == 2) {
                wort2.setText("traurig");
                zweite = "traurig";
            } else if (aufgabe == 3) {
                wort3.setText("traurig");
                dritte = "traurig";
            } else if (aufgabe == 4) {
                wort4.setText("traurig");
                vierte = "traurig";
            } else if (aufgabe == 5) {
                wort5.setText("traurig");
                fünfte = "traurig";

            }

        } else if(random1==5) {
            if (aufgabe == 1) {
                wort1.setText("verbrannt");
                erste = "verbrannt";
            } else if (aufgabe == 2) {
                wort2.setText("verbrannt");
                zweite = "verbrannt";
            } else if (aufgabe == 3) {
                wort3.setText("verbrannt");
                dritte = "verbrannt";
            } else if (aufgabe == 4) {
                wort4.setText("verbrannt");
                vierte = "verbrannt";
            } else if (aufgabe == 5) {
                wort5.setText("verbrannt");
                fünfte = "verbrannt";

            }


        } else if(random1==6) {
            if (aufgabe == 1) {
                wort1.setText("glücklich");
                erste = "glücklich";
            } else if (aufgabe == 2) {
                wort2.setText("glücklich");
                zweite = "glücklich";
            } else if (aufgabe == 3) {
                wort3.setText("glücklich");
                dritte = "glücklich";
            } else if (aufgabe == 4) {
                wort4.setText("glücklich");
                vierte = "glücklich";
            } else if (aufgabe == 5) {
                wort5.setText("glücklich");
                fünfte = "glücklich";

            }


        } else if(random1==7) {
            if (aufgabe == 1) {
                wort1.setText("ruhig");
                erste = "ruhig";
            } else if (aufgabe == 2) {
                wort2.setText("ruhig");
                zweite = "ruhig";
            } else if (aufgabe == 3) {
                wort3.setText("ruhig");
                dritte = "ruhig";
            } else if (aufgabe == 4) {
                wort4.setText("ruhig");
                vierte = "ruhig";
            } else if (aufgabe == 5) {
                wort5.setText("ruhig");
                fünfte = "ruhig";

            }

        } else if(random1==8) {
            if (aufgabe == 1) {
                wort1.setText("lebendig");
                erste = "lebendig";
            } else if (aufgabe == 2) {
                wort2.setText("lebendig");
                zweite = "lebendig";
            } else if (aufgabe == 3) {
                wort3.setText("lebendig");
                dritte = "lebendig";
            } else if (aufgabe == 4) {
                wort4.setText("lebendig");
                vierte = "lebendig";
            } else if (aufgabe == 5) {
                wort5.setText("lebendig");
                fünfte = "lebendig";

            }


        } else if(random1==9){
            if (aufgabe == 1) {
                wort1.setText("eifrig");
                erste = "eifrig";
            } else if (aufgabe == 2) {
                wort2.setText("eifrig");
                zweite = "eifrig";
            } else if (aufgabe == 3) {
                wort3.setText("eifrig");
                dritte = "eifrig";
            } else if (aufgabe == 4) {
                wort4.setText("eifrig");
                vierte = "eifrig";
            } else if (aufgabe == 5) {
                wort5.setText("eifrig");
                fünfte = "eifrig";

            }
        }
        if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
            begin();
        }

    }


    public void Artikel() {
        Random rnd = new Random();
        int random1 = rnd.nextInt(6);
        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);

        if(aufgabe==1) {
            wortart1 = "Artikel";
        } else if(aufgabe==2) {
            wortart2 = "Artikel";
        } else if(aufgabe==3) {
            wortart3 = "Artikel";
        } else if(aufgabe==4) {
            wortart4 = "Artikel";
        } else if(aufgabe==5);
        wortart5 = "Artikel";

        if (random1 == 0) {
            if (aufgabe == 1) {
                wort1.setText("der");
                erste = "der";
            } else if (aufgabe == 2) {
                wort2.setText("der");
                zweite = "der";
            } else if (aufgabe == 3) {
                wort3.setText("der");
                dritte = "der";
            } else if (aufgabe == 4) {
                wort4.setText("der");
                vierte = "der";
            } else if (aufgabe == 5) {
                wort5.setText("der");
                fünfte = "der";
            }

        } else if (random1 == 1) {

            if (aufgabe == 1) {
                wort1.setText("die");
                erste = "die";
            } else if (aufgabe == 2) {
                wort2.setText("die");
                zweite = "die";
            } else if (aufgabe == 3) {
                wort3.setText("die");
                dritte = "die";
            } else if (aufgabe == 4) {
                wort4.setText("die");
                vierte = "die";
            } else if (aufgabe == 5) {
                wort5.setText("die");
                fünfte = "die";
            }


        } else if (random1 == 2) {
            if (aufgabe == 1) {
                wort1.setText("das");
                erste = "das";
            } else if (aufgabe == 2) {
                wort2.setText("das");
                zweite = "das";
            } else if (aufgabe == 3) {
                wort3.setText("das");
                dritte = "das";
            } else if (aufgabe == 4) {
                wort4.setText("das");
                vierte = "das";
            } else if (aufgabe == 5) {
                wort5.setText("das");
                fünfte = "das";
            }


        } else if (random1 == 3) {

            if (aufgabe == 1) {
                wort1.setText("einer");
                erste = "einer";
            } else if (aufgabe == 2) {
                wort2.setText("einer");
                zweite = "einer";
            } else if (aufgabe == 3) {
                wort3.setText("einer");
                dritte = "einer";
            } else if (aufgabe == 4) {
                wort4.setText("einer");
                vierte = "einer";
            } else if (aufgabe == 5) {
                wort5.setText("einer");
                fünfte = "einer";

            }


        } else if(random1== 4) {

            if (aufgabe == 1) {
                wort1.setText("eine");
                erste = "eine";
            } else if (aufgabe == 2) {
                wort2.setText("eine");
                zweite = "eine";
            } else if (aufgabe == 3) {
                wort3.setText("eine");
                dritte = "eine";
            } else if (aufgabe == 4) {
                wort4.setText("eine");
                vierte = "eine";
            } else if (aufgabe == 5) {
                wort5.setText("eine");
                fünfte = "eine";

            }

        } else if(random1==5) {
            if (aufgabe == 1) {
                wort1.setText("einen");
                erste = "einen";
            } else if (aufgabe == 2) {
                wort2.setText("einen");
                zweite = "einen";
            } else if (aufgabe == 3) {
                wort3.setText("einen");
                dritte = "einen";
            } else if (aufgabe == 4) {
                wort4.setText("einen");
                vierte = "einen";
            } else if (aufgabe == 5) {
                wort5.setText("einen");
                fünfte = "einen";

            }


        }
        if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
            begin();
        }

    }

    public void Pronomen() {
        Random rnd = new Random();
        int random1 = rnd.nextInt(10);
        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);

        if(aufgabe==1) {
            wortart1 = "Pronomen";
        } else if(aufgabe==2) {
            wortart2 = "Pronomen";
        } else if(aufgabe==3) {
            wortart3 = "Pronomen";
        } else if(aufgabe==4) {
            wortart4 = "Pronomen";
        } else if(aufgabe==5);
        wortart5 = "Pronomen";

        if (random1 == 0) {
            if (aufgabe == 1) {
                wort1.setText("ich");
                erste = "ich";
            } else if (aufgabe == 2) {
                wort2.setText("ich");
                zweite = "ich";
            } else if (aufgabe == 3) {
                wort3.setText("ich");
                dritte = "ich";
            } else if (aufgabe == 4) {
                wort4.setText("ich");
                vierte = "ich";
            } else if (aufgabe == 5) {
                wort5.setText("ich");
                fünfte = "ich";
            }

        } else if (random1 == 1) {

            if (aufgabe == 1) {
                wort1.setText("du");
                erste = "du";
            } else if (aufgabe == 2) {
                wort2.setText("du");
                zweite = "du";
            } else if (aufgabe == 3) {
                wort3.setText("du");
                dritte = "du";
            } else if (aufgabe == 4) {
                wort4.setText("du");
                vierte = "du";
            } else if (aufgabe == 5) {
                wort5.setText("du");
                fünfte = "du";
            }


        } else if (random1 == 2) {
            if (aufgabe == 1) {
                wort1.setText("er");
                erste = "er";
            } else if (aufgabe == 2) {
                wort2.setText("er");
                zweite = "er";
            } else if (aufgabe == 3) {
                wort3.setText("er");
                dritte = "er";
            } else if (aufgabe == 4) {
                wort4.setText("er");
                vierte = "er";
            } else if (aufgabe == 5) {
                wort5.setText("er");
                fünfte = "er";
            }


        } else if (random1 == 3) {

            if (aufgabe == 1) {
                wort1.setText("sie");
                erste = "sie";
            } else if (aufgabe == 2) {
                wort2.setText("sie");
                zweite = "sie";
            } else if (aufgabe == 3) {
                wort3.setText("sie");
                dritte = "sie";
            } else if (aufgabe == 4) {
                wort4.setText("sie");
                vierte = "sie";
            } else if (aufgabe == 5) {
                wort5.setText("sie");
                fünfte = "sie";

            }


        } else if(random1== 4) {

            if (aufgabe == 1) {
                wort1.setText("es");
                erste = "es";
            } else if (aufgabe == 2) {
                wort2.setText("es");
                zweite = "es";
            } else if (aufgabe == 3) {
                wort3.setText("es");
                dritte = "es";
            } else if (aufgabe == 4) {
                wort4.setText("es");
                vierte = "es";
            } else if (aufgabe == 5) {
                wort5.setText("es");
                fünfte = "es";

            }

        } else if(random1==5) {
            if (aufgabe == 1) {
                wort1.setText("ihr");
                erste = "ihr";
            } else if (aufgabe == 2) {
                wort2.setText("ihr");
                zweite = "ihr";
            } else if (aufgabe == 3) {
                wort3.setText("ihr");
                dritte = "ihr";
            } else if (aufgabe == 4) {
                wort4.setText("ihr");
                vierte = "ihr";
            } else if (aufgabe == 5) {
                wort5.setText("ihr");
                fünfte = "ihr";

            }


        } else if(random1==6) {
            if (aufgabe == 1) {
                wort1.setText("euer");
                erste = "euer";
            } else if (aufgabe == 2) {
                wort2.setText("euer");
                zweite = "euer";
            } else if (aufgabe == 3) {
                wort3.setText("euer");
                dritte = "euer";
            } else if (aufgabe == 4) {
                wort4.setText("euer");
                vierte = "euer";
            } else if (aufgabe == 5) {
                wort5.setText("euer");
                fünfte = "euer";

            }


        } else if(random1==7) {
            if (aufgabe == 1) {
                wort1.setText("mein");
                erste = "mein";
            } else if (aufgabe == 2) {
                wort2.setText("mein");
                zweite = "mein";
            } else if (aufgabe == 3) {
                wort3.setText("mein");
                dritte = "mein";
            } else if (aufgabe == 4) {
                wort4.setText("mein");
                vierte = "mein";
            } else if (aufgabe == 5) {
                wort5.setText("mein");
                fünfte = "mein";

            }

        } else if(random1==8) {
            if (aufgabe == 1) {
                wort1.setText("unser");
                erste = "unser";
            } else if (aufgabe == 2) {
                wort2.setText("unser");
                zweite = "unser";
            } else if (aufgabe == 3) {
                wort3.setText("unser");
                dritte = "unser";
            } else if (aufgabe == 4) {
                wort4.setText("unser");
                vierte = "unser";
            } else if (aufgabe == 5) {
                wort5.setText("unser");
                fünfte = "unser";

            }


        } else if(random1==9){
            if (aufgabe == 1) {
                wort1.setText("sich");
                erste = "sich";
            } else if (aufgabe == 2) {
                wort2.setText("sich");
                zweite = "sich";
            } else if (aufgabe == 3) {
                wort3.setText("sich");
                dritte = "sich";
            } else if (aufgabe == 4) {
                wort4.setText("sich");
                vierte = "sich";
            } else if (aufgabe == 5) {
                wort5.setText("sich");
                fünfte = "sich";

            }
        }

        if (wort1.equals(wort2) || wort1.equals(wort3) || wort1.equals(wort4) || wort1.equals(wort5) || wort2.equals(wort3) || wort2.equals(wort4) || wort2.equals(wort5) || wort3.equals(wort4) || wort3.equals(wort5) || wort4.equals(wort5)) {
            begin();
        }

    }



    public void begin() {
        TextView wort1 = (TextView)findViewById(R.id.textView45);
        TextView wort2 = (TextView)findViewById(R.id.textView46);
        TextView wort3 = (TextView)findViewById(R.id.textView47);
        TextView wort4 = (TextView)findViewById(R.id.textView48);
        TextView wort5 = (TextView)findViewById(R.id.textView49);
        wortart();
        wortart();
        wortart();
        wortart();
        wortart();



    }




    public void proveNomen() {

        EditText edit1 =  (EditText) findViewById(R.id.editText2);
        String wort1 = edit1.getText().toString();

        EditText edit2 =  (EditText) findViewById(R.id.editText3);
        String wort2 = edit2.getText().toString();

        EditText edit3 =  (EditText) findViewById(R.id.editText4);
        String wort3 = edit3.getText().toString();

        EditText edit4 =  (EditText) findViewById(R.id.editText5);
        String wort4 = edit4.getText().toString();

        EditText edit5 =  (EditText) findViewById(R.id.editText6);
        String wort5 = edit5.getText().toString();
        if(schwer==1) {
            if (whichprofe == 1) {
                if (wort1.equals("Nomen") || wort1.equals("nomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Nomen") || wort2.equals("nomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Nomen") || wort3.equals("nomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Nomen") || wort4.equals("nomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Nomen") || wort5.equals("nomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        } else {
            if (whichprofe == 1) {
                if (wort1.equals("Nomen") || wort1.equals("nomen")||wort1.equals("Namenwort")||wort1.equals("namenwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Nomen") || wort2.equals("nomen")||wort2.equals("Namenwort")||wort2.equals("namenwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Nomen") || wort3.equals("nomen")||wort3.equals("Namenwort")||wort4.equals("namenwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Nomen") || wort4.equals("nomen")||wort4.equals("Namenwort")||wort4.equals("namenwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Nomen") || wort5.equals("nomen")||wort5.equals("Namenwort")||wort5.equals("namenwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        }

    }

    public void proveAdjektiv() {

        EditText edit1 =  (EditText) findViewById(R.id.editText2);
        String wort1 = edit1.getText().toString();

        EditText edit2 =  (EditText) findViewById(R.id.editText3);
        String wort2 = edit2.getText().toString();

        EditText edit3 =  (EditText) findViewById(R.id.editText4);
        String wort3 = edit3.getText().toString();

        EditText edit4 =  (EditText) findViewById(R.id.editText5);
        String wort4 = edit4.getText().toString();

        EditText edit5 =  (EditText) findViewById(R.id.editText6);
        String wort5 = edit5.getText().toString();
        if(schwer==1) {
            if (whichprofe == 1) {
                if (wort1.equals("Adjektiv") || wort1.equals("adjektiv")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Adjektiv") || wort2.equals("adjektiv")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Adjektiv") || wort3.equals("adjektiv")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Adjektiv") || wort4.equals("adjektiv")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Adjektiv") || wort5.equals("adjektiv")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        } else {
            if (whichprofe == 1) {
                if (wort1.equals("Adjektiv") || wort1.equals("adjektiv")||wort1.equals("Wiewort")||wort1.equals("wiewort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Adjektiv") || wort2.equals("adjektiv")||wort2.equals("Wiewort")||wort2.equals("wiewort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Adjektiv") || wort3.equals("adjektiv")||wort3.equals("Wiewort")||wort4.equals("wiewort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Adjektiv") || wort4.equals("adjektiv")||wort4.equals("Wiewort")||wort4.equals("wiewort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Adjektiv") || wort5.equals("adjektiv")||wort5.equals("Wiewort")||wort5.equals("wiewort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        }

    }

    public void proveVerb() {

        EditText edit1 =  (EditText) findViewById(R.id.editText2);
        String wort1 = edit1.getText().toString();

        EditText edit2 =  (EditText) findViewById(R.id.editText3);
        String wort2 = edit2.getText().toString();

        EditText edit3 =  (EditText) findViewById(R.id.editText4);
        String wort3 = edit3.getText().toString();

        EditText edit4 =  (EditText) findViewById(R.id.editText5);
        String wort4 = edit4.getText().toString();

        EditText edit5 =  (EditText) findViewById(R.id.editText6);
        String wort5 = edit5.getText().toString();
        if(schwer==1) {
            if (whichprofe == 1) {
                if (wort1.equals("Verb") || wort1.equals("verb")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Verb") || wort2.equals("verb")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Verb") || wort3.equals("verb")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Verb") || wort4.equals("verb")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Verb") || wort5.equals("verb")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        } else {
            if (whichprofe == 1) {
                if (wort1.equals("Verb") || wort1.equals("verb")||wort1.equals("Tunwort")||wort1.equals("tunwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Verb") || wort2.equals("verb")||wort2.equals("Tunwort")||wort2.equals("tunwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Verb") || wort3.equals("verb")||wort3.equals("Tunwort")||wort4.equals("tunwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Verb") || wort4.equals("verb")||wort4.equals("Tunwort")||wort4.equals("tunwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Verb") || wort5.equals("verb")||wort5.equals("Tunwort")||wort5.equals("tunwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        }

    }

    public void provePronomen() {

        EditText edit1 =  (EditText) findViewById(R.id.editText2);
        String wort1 = edit1.getText().toString();

        EditText edit2 =  (EditText) findViewById(R.id.editText3);
        String wort2 = edit2.getText().toString();

        EditText edit3 =  (EditText) findViewById(R.id.editText4);
        String wort3 = edit3.getText().toString();

        EditText edit4 =  (EditText) findViewById(R.id.editText5);
        String wort4 = edit4.getText().toString();

        EditText edit5 =  (EditText) findViewById(R.id.editText6);
        String wort5 = edit5.getText().toString();
        if(schwer==1) {
            if (whichprofe == 1) {
                if (wort1.equals("Pronomen") || wort1.equals("pronomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Pronomen") || wort2.equals("pronomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Pronomen") || wort3.equals("pronomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Pronomen") || wort4.equals("pronomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Pronomen") || wort5.equals("pronomen")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        } else {
            if (whichprofe == 1) {
                if (wort1.equals("Pronomen") || wort1.equals("pronomen")||wort1.equals("Fürwort")||wort1.equals("fürwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Pronomen") || wort2.equals("pronomen")||wort2.equals("Fürwort")||wort2.equals("fürwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Pronomen") || wort3.equals("pronomen")||wort3.equals("Fürwort")||wort4.equals("fürwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Pronomen") || wort4.equals("pronomen")||wort4.equals("Fürwort")||wort4.equals("fürwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Pronomen") || wort5.equals("pronomen")||wort5.equals("Fürwort")||wort5.equals("fürwort")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        }

    }

    public void proveArtikel() {
        EditText edit1 =  (EditText) findViewById(R.id.editText2);
        String wort1 = edit1.getText().toString();

        EditText edit2 =  (EditText) findViewById(R.id.editText3);
        String wort2 = edit2.getText().toString();

        EditText edit3 =  (EditText) findViewById(R.id.editText4);
        String wort3 = edit3.getText().toString();

        EditText edit4 =  (EditText) findViewById(R.id.editText5);
        String wort4 = edit4.getText().toString();

        EditText edit5 =  (EditText) findViewById(R.id.editText6);
        String wort5 = edit5.getText().toString();










        if(schwer==1) {
            if (whichprofe == 1) {
                if (wort1.equals("Artikel") || wort1.equals("artikel")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Artikel") || wort2.equals("artikel")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Artikel") || wort3.equals("artikel")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Artikel") || wort4.equals("artikel")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Artikel") || wort5.equals("artikel")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        } else {
            if (whichprofe == 1) {
                if (wort1.equals("Artikel") || wort1.equals("artikel")||wort1.equals("begleiter")||wort1.equals("Begleiter")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 2) {
                if (wort2.equals("Artikel") || wort2.equals("artikel")||wort2.equals("begleiter")||wort2.equals("Begleiter")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 3) {
                if (wort3.equals("Artikel") || wort3.equals("artikel")||wort3.equals("begleiter")||wort4.equals("Begleiter")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 4) {
                if (wort4.equals("Artikel") || wort4.equals("artikel")||wort4.equals("begleiter")||wort4.equals("Begleiter")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            } else if (whichprofe == 5) {
                if (wort5.equals("Artikel") || wort5.equals("artikel")||wort5.equals("begleiter")||wort5.equals("Begleiter")) {
                    richtig++;
                    whichprofe++;
                } else {
                    falsch++;
                    whichprofe++;
                }

            }
        }

    }

    public void provenothing() {
        EditText edit1 =  (EditText) findViewById(R.id.editText2);
        String wort1 = edit1.getText().toString();

        EditText edit2 =  (EditText) findViewById(R.id.editText3);
        String wort2 = edit2.getText().toString();

        EditText edit3 =  (EditText) findViewById(R.id.editText4);
        String wort3 = edit3.getText().toString();

        EditText edit4 =  (EditText) findViewById(R.id.editText5);
        String wort4 = edit4.getText().toString();

        EditText edit5 =  (EditText) findViewById(R.id.editText6);
        String wort5 = edit5.getText().toString();

        if(wort1.length()<4||wort1.length()>8) {
            Wiederholung++;
            falsch--;

        } if(wort2.length()<4||wort1.length()>8) {
            Wiederholung++;
            falsch--;

        } if(wort3.length()<4||wort1.length()>8) {
            Wiederholung++;
            falsch--;

        } if(wort4.length()<4||wort1.length()>8) {
            Wiederholung++;
            falsch--;

        } if(wort5.length()<4||wort1.length()>8) {
            Wiederholung++;
            falsch--;

        }


    }



    @Override
    public void onBackPressed() {
    }

    @Override
    public void onClick(View view) {

        if(Wiederholung>0&&wiederholung2<3) {
            Toast.makeText(getApplicationContext(), "Überlege nochmal!!", Toast.LENGTH_SHORT).show();
            wiederholung2++;
            falsch = 0;
        } else if(Wiederholung<2||wiederholung2>2) {
            if (view.getId() == R.id.button2) {
                if (wortart1.equals("Nomen")) {
                    proveNomen();
                } else if (wortart1.equals("Adjektiv")) {
                    proveAdjektiv();
                } else if (wortart1.equals("Verb")) {
                    proveVerb();
                } else if (wortart1.equals("Pronomen")) {
                    provePronomen();
                } else if (wortart1.equals("Artikel")) {
                    proveArtikel();

                }

                if (wortart2.equals("Nomen")) {
                    proveNomen();
                } else if (wortart2.equals("Adjektiv")) {
                    proveAdjektiv();
                } else if (wortart2.equals("Verb")) {
                    proveVerb();
                } else if (wortart2.equals("Pronomen")) {
                    provePronomen();
                } else if (wortart2.equals("Artikel")) {
                    proveArtikel();

                }

                if (wortart3.equals("Nomen")) {
                    proveNomen();
                } else if (wortart3.equals("Adjektiv")) {
                    proveAdjektiv();
                } else if (wortart3.equals("Verb")) {
                    proveVerb();
                } else if (wortart3.equals("Pronomen")) {
                    provePronomen();
                } else if (wortart3.equals("Artikel")) {
                    proveArtikel();

                }

                if (wortart4.equals("Nomen")) {
                    proveNomen();
                } else if (wortart4.equals("Adjektiv")) {
                    proveAdjektiv();
                } else if (wortart4.equals("Verb")) {
                    proveVerb();
                } else if (wortart4.equals("Pronomen")) {
                    provePronomen();
                } else if (wortart4.equals("Artikel")) {
                    proveArtikel();

                }

                if (wortart5.equals("Nomen")) {
                    proveNomen();
                } else if (wortart5.equals("Adjektiv")) {
                    proveAdjektiv();
                } else if (wortart5.equals("Verb")) {
                    proveVerb();
                } else if (wortart5.equals("Pronomen")) {
                    provePronomen();
                } else if (wortart5.equals("Artikel")) {
                    proveArtikel();

                }
                aufgabenInfo.richtigeAntwortenDE += richtig;
                provenothing();
                aufgabenInfo.falscheAntwortenDE += falsch;
                aufgabenInfo.save();

                Intent intent = new Intent(this, FehlerActivity.class);
                intent.putExtra("richtig", richtig);
                intent.putExtra("falsch", falsch);
                intent.putExtra("wiederholung", Wiederholung);
                intent.putExtra("fach", 2);
                intent.putExtra("Aufgaben", aufgabe);
                startActivity(intent);


            }
        }



    }



}
