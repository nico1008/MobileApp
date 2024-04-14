package com.example.mobileapp.GuessGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.R;

public class GuessTheAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_animal);

        Button buttonGuess = findViewById(R.id.buttonGuess);
        EditText textGuess = findViewById(R.id.editTextGuess);
        buttonGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textGuess.getText().toString().toLowerCase().equals("racoon"))
                    startActivity(new Intent(GuessTheAnimal.this, GuessSuccess.class));
                else
                    startActivity(new Intent(GuessTheAnimal.this, GuessError.class));
            }
        });
    }
}