package com.alonso.appexamen;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    protected TextView mSignUpTextView;
    protected Button mloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        TextView titulo = (TextView) findViewById(R.id.title);



        Typeface myFont = Typeface.createFromAsset(getAssets(), "Nettizen_TRIAL.ttf");
        titulo.setTypeface(myFont);


        mloginButton = (Button)findViewById(R.id.loginButton);
        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }


    public void mostrarVentana(View view){
        Intent i=new Intent(this, SignUpActivity.class);
        startActivity(i);
    }
}
