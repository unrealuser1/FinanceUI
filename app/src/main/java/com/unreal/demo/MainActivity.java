package com.unreal.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    Animation scaleUp, scaleDown;
    CardView addCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        addCard = findViewById(R.id.add_card);
        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        addCard.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()== MotionEvent.ACTION_DOWN){
                    addCard.startAnimation(scaleDown);
                }else if(motionEvent.getAction()== MotionEvent.ACTION_UP){
                    addCard.startAnimation(scaleUp);
            }
                return true;
            }
        });
    }










}