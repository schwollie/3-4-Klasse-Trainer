package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.example.lars.mathetrainer.deutschuebung.Wortarten;

/**
 * Created by Lars on 30.07.2016.
 */
public class UebungDeutsch extends MainActivity implements View.OnClickListener{
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uebungdeutsch);

        ImageButton btn = (ImageButton)findViewById(R.id.homebutton3);
        btn.setOnClickListener(this);

        ImageButton btn2 = (ImageButton)findViewById(R.id.de1);
        btn2.setOnClickListener(this);

        sharedPreferences = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        int difficulty = sharedPreferences.getInt(getString(R.string.preference_difficulty), Difficulty.EASY);
    }

    public void showMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void showfirstuebung() {
        Intent intent = new Intent(this, Wortarten.class);
        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.homebutton3) {
            Animation a = AnimationUtils.loadAnimation(this,R.anim.turn_out);
            ImageButton btn = (ImageButton) findViewById(R.id.homebutton3);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showMainActivity();
                }
            });
            btn.startAnimation(a);


        } else if(view.getId()==R.id.de1) {
            Animation a = AnimationUtils.loadAnimation(this,R.anim.turn_out);
            ImageButton btn = (ImageButton) findViewById(R.id.de1);
            a.setAnimationListener(new SimpleAnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    showfirstuebung();
                }
            });
            btn.startAnimation(a);

        }

    }
}
