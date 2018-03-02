package com.alonso.appexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();



        TextView titulo = (TextView) findViewById(R.id.Title);

        Animation animaImagen = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation animaTitulo = AnimationUtils.loadAnimation(this, R.anim.leftin);


        titulo.startAnimation(animaTitulo);
        animaTitulo.setAnimationListener(this);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }


    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
