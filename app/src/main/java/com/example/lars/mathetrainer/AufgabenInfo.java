package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.lars.mathetrainer.R;

/**
 * Created by Lars on 30.07.2016.
 */
public class AufgabenInfo {

    private final SharedPreferences sharedPreferences;

    public int richtigeAntwortenMathe = 1;
    public int falscheAntwortenMathe = 1;
    public int whichfach = 1;
    public int richtigeAntwortenDE = 1;
    public int falscheAntwortenDE = 1;
    public int richtigeAntwortenhsu = 1;
    public int falscheAntwortenhsu = 1;
    public int dufalsch = 0;
    public int durichtig = 0;
    public float maAufgaben;
    public int maAufgaben2;
    public int deAufgaben = 0;
    public int hsuAufgaben = 0;

    public AufgabenInfo(Context context) {
        sharedPreferences = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        richtigeAntwortenMathe = sharedPreferences.getInt("richtigeAntwortenMathe", 1);
        falscheAntwortenMathe = sharedPreferences.getInt("falscheAntwortenMathe", 1);
        richtigeAntwortenDE = sharedPreferences.getInt("richtigeAntwortenDE", 1);
        falscheAntwortenDE = sharedPreferences.getInt("falscheAntwortenDE", 1);
        if(richtigeAntwortenMathe>1) {
            richtigeAntwortenMathe = richtigeAntwortenMathe-1;
        } else if(falscheAntwortenMathe>1) {
            falscheAntwortenMathe = falscheAntwortenMathe-1;
        } else if(richtigeAntwortenDE>1) {
            richtigeAntwortenDE = richtigeAntwortenDE-1;
        } else if(falscheAntwortenDE>1) {
            falscheAntwortenDE = falscheAntwortenDE-1;
        }
        // TODO: Werte auslesen

        int zahl = 0;



        if(richtigeAntwortenMathe==1) {
            zahl++;

        } else if(richtigeAntwortenDE==1) {
            zahl++;

        } else if(richtigeAntwortenhsu==1) {
            zahl++;
        }

        if(zahl==3) {
            whichfach = 1;
        } else if(zahl==2) {
            if(richtigeAntwortenMathe>1) {
                whichfach = 1;
            } else if(richtigeAntwortenhsu>1) {
                whichfach= 3;
            } else if(richtigeAntwortenDE>1) {
                whichfach=2;
            }
        } else if(zahl==1) {
            if (richtigeAntwortenMathe > 1) {
                whichfach = 1;
            } else if (richtigeAntwortenhsu > 1) {
                whichfach = 3;
            } else if (richtigeAntwortenDE > 1) {
                whichfach = 2;
            }
        }else if(zahl==0) {
            if (richtigeAntwortenMathe > 1) {
                whichfach = 1;
            } else if (richtigeAntwortenhsu > 1) {
                whichfach = 3;
            } else if (richtigeAntwortenDE > 1) {
                whichfach = 2;
            }
        }




        if(richtigeAntwortenMathe-falscheAntwortenMathe>richtigeAntwortenDE-falscheAntwortenDE&&richtigeAntwortenMathe-falscheAntwortenMathe>richtigeAntwortenhsu-falscheAntwortenhsu) {
            whichfach=1;
        } else if(richtigeAntwortenDE-falscheAntwortenDE>richtigeAntwortenMathe-falscheAntwortenMathe&&richtigeAntwortenDE-falscheAntwortenDE>richtigeAntwortenhsu-falscheAntwortenhsu) {
            whichfach=2;
        } else if(richtigeAntwortenhsu-falscheAntwortenhsu>richtigeAntwortenMathe-falscheAntwortenMathe&&richtigeAntwortenhsu-falscheAntwortenhsu>richtigeAntwortenDE-falscheAntwortenDE) {
            whichfach=3;
        }



            maAufgaben2 = richtigeAntwortenMathe+falscheAntwortenMathe;
        maAufgaben = richtigeAntwortenMathe/maAufgaben2;

        deAufgaben = richtigeAntwortenDE+falscheAntwortenDE;

    }


    public void save() {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Werte speichern
        editor.putInt("richtigeAntwortenMathe", richtigeAntwortenMathe);
        editor.putInt("falscheAntwortenMathe", falscheAntwortenMathe);
        editor.putFloat("maAufgaben", (float) maAufgaben);

        editor.putInt("richtigeAntwortenDE", richtigeAntwortenDE);
        editor.putInt("falscheAntwortenDE", falscheAntwortenDE);
        editor.putFloat("deAufgaben", deAufgaben);

        editor.putInt("whichfach",whichfach);




        editor.commit();
    }
}
