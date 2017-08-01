package com.example.c3008.spaceinvaders;

/**
 * Created by c3008 on 7/28/2017.
 */


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Canvas;
import android.graphics.Paint;

public class LoseScreen extends Activity {

    Button button;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_invaders2);
    }
    public void sendMessage(View view){
        Intent intent = new Intent( this, SpaceInvadersView.class);
        startActivity(intent);
    }

}