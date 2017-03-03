package com.example.migel.mrfoxmiguel;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {

    TextView welcome,cargando;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        welcome = (TextView)findViewById(R.id.welcome);
        cargando= (TextView)findViewById(R.id.cargando);
        imageView= (ImageView) findViewById(R.id.imageView);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "AmaticSC-Regular.ttf");
        welcome.setTypeface(font);
        cargando.setTypeface(font);

        final Animation ani = AnimationUtils.loadAnimation(getBaseContext(), R.anim.translate);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);


        cargando.startAnimation(ani);
        imageView.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.fox));
                    }
                }, 500);//Tiempo hasta que cambia el icono

                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        welcome.setVisibility(View.VISIBLE);
                    }
                }, 1000); //Tiempo Amarillo hasta Welcome

                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Intent i = new Intent(MySplash.this, MyLogin.class);
                        startActivity(i);
                        finish();
                    }
                }, 1500); //Tiempo Welcome hasta MyLogin


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
