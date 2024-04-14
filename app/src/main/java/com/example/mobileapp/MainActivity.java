package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.GuessGame.GuessTheAnimal;
import com.example.mobileapp.PracticeGame.WordPractice;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guessTheAnimal = findViewById(R.id.buttonGuessTheAnimal);
        guessTheAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GuessTheAnimal.class));
            }
        });

        Button wordPractice = findViewById(R.id.buttonWordPractice);
        wordPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WordPractice.class));
            }
        });
    }
}