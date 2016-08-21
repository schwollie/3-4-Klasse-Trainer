package com.example.lars.mathetrainer;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/**
 * Created by Lars on 31.07.2016.
 */
public abstract class SimpleAnimationListener implements Animation.AnimationListener {
    @Override
    public void onAnimationEnd(Animation animation) {}

    @Override
    public void onAnimationRepeat(Animation animation) {}

    @Override
    public void onAnimationStart(Animation animation) {}
}
