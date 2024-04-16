package com.example.mobileapp.GuessGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.MainActivity;
import com.example.mobileapp.R;

public class GuessError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_error);

        Button nextButton = findViewById(R.id.nextButton);
        Button tryAgainButton = findViewById(R.id.tryAgainButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuessError.this, MainActivity.class));
            }
        });

        tryAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuessError.this, GuessTheAnimal.class));
            }
        });
    }

    public void onBackButtonClicked(View view) {
        onBackPressed();
    }
}