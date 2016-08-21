package com.example.lars.mathetrainer;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Lars on 30.07.2016.
 */
public class SettingsActivity extends MainActivity implements View.OnClickListener {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        Button btn1 = (Button) findViewById(R.id.radioButton);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.radioButton2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.radioButton3);
        btn3.setOnClickListener(this);

        txt1 = (TextView) findViewById(R.id.difficulty);

        sharedPreferences = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        update();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.radioButton) {
            editor.putInt(getString(R.string.preference_difficulty), Difficulty.EASY);
            editor.commit();
            update();
        } else if (view.getId() == R.id.radioButton2) {
            editor.putInt(getString(R.string.preference_difficulty), Difficulty.MEDIUM);
            editor.commit();
            update();
        } else if (view.getId() == R.id.radioButton3) {
            editor.putInt(getString(R.string.preference_difficulty), Difficulty.HARD);
            editor.commit();
            update();
        }
    }

    private void update() {
        int difficulty = sharedPreferences.getInt(getString(R.string.preference_difficulty), Difficulty.EASY);
        switch (difficulty) {
            case Difficulty.EASY:
                txt1.setText("Leicht");
                txt1.setBackgroundColor(Color.GREEN);
                break;
            case Difficulty.MEDIUM:
                txt1.setText("Mittel");
                txt1.setBackgroundColor(Color.YELLOW);
                break;
            case Difficulty.HARD:
                txt1.setText("Schwer");
                txt1.setBackgroundColor(Color.RED);
                break;
        }
    }
}
