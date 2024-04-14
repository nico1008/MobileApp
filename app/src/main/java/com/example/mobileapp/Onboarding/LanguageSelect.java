package com.example.mobileapp.Onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.Login.Login;
import com.example.mobileapp.R;

public class LanguageSelect extends AppCompatActivity {

    private void clearOrangeColor(Button button) {
        button.setSelected(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);

        Button russianButton = findViewById(R.id.russian_button);
        russianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                // Set the orange color to the pressed button
                russianButton.setSelected(true);
            }
        });

        Button englishButton = findViewById(R.id.english_button);
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                // Set the orange color to the pressed button
                englishButton.setSelected(true);
            }
        });

        Button chineseButton = findViewById(R.id.chinese_button);
        chineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                // Set the orange color to the pressed button
                chineseButton.setSelected(true);
            }
        });

        Button belarushButton = findViewById(R.id.belarus_button);
        belarushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                // Set the orange color to the pressed button
                belarushButton.setSelected(true);
            }
        });

        Button kazakhButton = findViewById(R.id.kazakh_button);
        kazakhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.english_button));

                // Set the orange color to the pressed button
                kazakhButton.setSelected(true);
            }
        });

        Button chooseButton = findViewById(R.id.choose_button);
        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageSelect.this, Login.class));
            }
        });
    }
}