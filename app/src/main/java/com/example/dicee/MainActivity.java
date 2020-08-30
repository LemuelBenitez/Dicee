package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    Random ran = new Random();
    Button roll;
    String TAG = "Dicee";
    final int[] img = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = (Button)findViewById(R.id.button);
        image1 = (ImageView)findViewById(R.id.leftDice);
        image2 = (ImageView)findViewById(R.id.rightDice);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Ze button has been pressed");

                int number = ran.nextInt(6);
                image1.setImageResource(img[number]);
                int number2 = ran.nextInt(6);
                image2.setImageResource(img[number2]);
            }
        });
    }

}