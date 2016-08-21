package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Lars on 31.07.2016.
 */
public class MainContent extends LinearLayout {

    public String fach;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public MainContent(Context context) {
        this(context, null);
    }

    public MainContent(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    protected void init() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.content_main, this, true);

        AufgabenInfo aufgabeninfo = new AufgabenInfo(this.getContext());




        TextView mafehler = (TextView) findViewById(R.id.textView5);
        TextView maRichtig = (TextView) findViewById(R.id.textView19);

        TextView maaufgabe = (TextView) findViewById(R.id.stmara);
        TextView defehler = (TextView) findViewById(R.id.textView25);
        TextView derichtig = (TextView) findViewById(R.id.textView26);
        TextView deaufgabe = (TextView) findViewById(R.id.textView28);
        TextView hsufehler = (TextView) findViewById(R.id.textView30);
        TextView hsurichtig = (TextView) findViewById(R.id.textView33);
        TextView hsuaufgabe = (TextView) findViewById(R.id.textView35);
        TextView dufehler = (TextView) findViewById(R.id.textView37);
        TextView duRichtig = (TextView) findViewById(R.id.textView39);
        TextView bestfach = (TextView) findViewById(R.id.bestfach);

        int whichfach = (aufgabeninfo.whichfach);

        if(whichfach==0) {
            fach = "Du hast noch nicht geuebt";
        } else if(whichfach==1) {
            fach = "Mathe";
        } else if(whichfach==2) {
            fach = "Deutsch";
        } else if(whichfach==3) {
            fach = "HSU";
        }

        maRichtig.setText(String.format("%04d", aufgabeninfo.richtigeAntwortenMathe));
        mafehler.setText(String.format("%04d", aufgabeninfo.falscheAntwortenMathe));
        maaufgabe.setText(String.format("%f", aufgabeninfo.maAufgaben));

        derichtig.setText(String.format("%04d", aufgabeninfo.richtigeAntwortenDE));
        defehler.setText(String.format("%04d", aufgabeninfo.falscheAntwortenDE));
        deaufgabe.setText(String.format("%04d", aufgabeninfo.deAufgaben));

        bestfach.setText(fach);












    }
}


