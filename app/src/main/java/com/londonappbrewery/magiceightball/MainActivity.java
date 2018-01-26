package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button = findViewById(R.id.ask_button);
        final ImageView ball = findViewById(R.id.magic_8_ball_image);

        final int[] answers = {R.drawable.ball1,
                               R.drawable.ball2,
                               R.drawable.ball3,
                               R.drawable.ball4,
                               R.drawable.ball5};

        ask_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // choose a random answer
                Random random = new Random();
                int choice = random.nextInt(5);
                ball.setImageResource(answers[choice]);
            }
        });
    }
}
