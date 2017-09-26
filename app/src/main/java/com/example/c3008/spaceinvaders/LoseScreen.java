package com.example.c3008.spaceinvaders;

/**
 * Created by c3008 on 7/28/2017.
 */


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;

public class LoseScreen extends Activity {

    Button button;
    Context context;

    private Canvas canvas;
    private Paint paint;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int score = getIntent().getIntExtra("score" , 0);

        setContentView(R.layout.activity_space_invaders2);
        TextView textView = (TextView) findViewById(R.id.textView7);
        textView.setText("Score: " + score);


    }
    public void tryAgain(View view){
        Intent intent = new Intent( this, SpaceInvadersActivity.class);
        startActivity(intent);
    }



}