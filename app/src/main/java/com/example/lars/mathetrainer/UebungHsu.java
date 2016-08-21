package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Lars on 30.07.2016.
 */
public class UebungHsu extends MainActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uebunghsu);
        ImageButton btn = (ImageButton) findViewById(R.id.homebutton2);
        btn.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        int difficulty = sharedPreferences.getInt(getString(R.string.preference_difficulty), Difficulty.EASY);
    }

    public void showMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.homebutton2) {
            Animation a = AnimationUtils.loadAnimation(this,R.anim.turn_out);
            ImageButton btn = (ImageButton) findViewById(R.id.homebutton2);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showMainActivity();
                }
            });
            btn.startAnimation(a);


        }

    }
}
