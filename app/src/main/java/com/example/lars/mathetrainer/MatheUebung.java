package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.example.lars.mathetrainer.matheu.Uebung1;
import com.example.lars.mathetrainer.matheu.Uebung2;
import com.example.lars.mathetrainer.matheu.Uebung3;
import com.example.lars.mathetrainer.matheu.Uebung4;

/**
 * Created by Lars on 29.07.2016.
 */
public class MatheUebung extends MainActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uebungmathe);

        ImageButton btn = (ImageButton) findViewById(R.id.homebutton1);
        btn.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        int difficulty = sharedPreferences.getInt(getString(R.string.preference_difficulty), Difficulty.EASY);

        ImageButton im = (ImageButton) findViewById(R.id.ma1);
        im.setOnClickListener(this);

        ImageButton im2 = (ImageButton) findViewById(R.id.ma2);
        im2.setOnClickListener(this);

        ImageButton im3 = (ImageButton) findViewById(R.id.ma3);
        im3.setOnClickListener(this);

        ImageButton im4 = (ImageButton )findViewById(R.id.ma4);
        im4.setOnClickListener(this);
    }


    public void showMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void showFirstUebung() {
        Intent intent = new Intent(this, Uebung1.class);
        startActivity(intent);
    }

    public void showsecondUebung() {
        Intent intent = new Intent(this, Uebung2.class);
        startActivity(intent);
    }

    public void showthirdUebung() {
        Intent intent = new Intent(this, Uebung3.class);
        startActivity(intent);

    }
    public void showfourthUebung() {
        Intent intent = new Intent(this, Uebung4.class);
        startActivity(intent);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.homebutton1) {
            Animation a = AnimationUtils.loadAnimation(this, R.anim.turn_out);
            ImageButton btn = (ImageButton) findViewById(R.id.homebutton1);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showMainActivity();
                }
            });
            btn.startAnimation(a);


        } else if (view.getId() == R.id.ma1) {
            Animation a = AnimationUtils.loadAnimation(this, R.anim.turn_out);
            ImageButton btn2 = (ImageButton) findViewById(R.id.ma1);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showFirstUebung();

                }
            });
            btn2.startAnimation(a);
        } else if (view.getId() == R.id.ma2) {
            Animation a = AnimationUtils.loadAnimation(this, R.anim.turn_out);
            ImageButton btn2 = (ImageButton) findViewById(R.id.ma2);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showsecondUebung();

                }
            });
            btn2.startAnimation(a);
        } else if (view.getId() == R.id.ma3) {
            Animation a = AnimationUtils.loadAnimation(this, R.anim.turn_out);
            ImageButton btn3 = (ImageButton) findViewById(R.id.ma3);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showthirdUebung();

                }
            });
            btn3.startAnimation(a);


        } else if (view.getId()==R.id.ma4) {
            Animation a = AnimationUtils.loadAnimation(this, R.anim.turn_out);
            ImageButton btn4 = (ImageButton) findViewById(R.id.ma4);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showfourthUebung();

                }
            });
            btn4.startAnimation(a);

        }

    }

}
