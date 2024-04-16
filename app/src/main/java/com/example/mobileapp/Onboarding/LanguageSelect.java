package com.example.mobileapp.Onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.Login.Login;
import com.example.mobileapp.R;

public class LanguageSelect extends AppCompatActivity implements View.OnClickListener {

    private Button russianButton, englishButton, chineseButton, belarusButton, kazakhButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);

        russianButton = findViewById(R.id.russian_button);
        englishButton = findViewById(R.id.english_button);
        chineseButton = findViewById(R.id.chinese_button);
        belarusButton = findViewById(R.id.belarus_button);
        kazakhButton = findViewById(R.id.kazakh_button);

        russianButton.setOnClickListener(this);
        englishButton.setOnClickListener(this);
        chineseButton.setOnClickListener(this);
        belarusButton.setOnClickListener(this);
        kazakhButton.setOnClickListener(this);

        findViewById(R.id.choose_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageSelect.this, Login.class));
            }
        });
    }

    @Override
    public void onClick(View v) {
        clearOrangeColor();
        v.setSelected(true);
    }

    private void clearOrangeColor() {
        russianButton.setSelected(false);
        englishButton.setSelected(false);
        chineseButton.setSelected(false);
        belarusButton.setSelected(false);
        kazakhButton.setSelected(false);
    }
}
