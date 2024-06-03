package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int counter = 0; // Объявление переменной counter, которая будет хранить значение счетчика
    private TextView counterTextView; // Объявление переменной для TextView, где будет отображаться значение счетчика
    private Button clickButton; // Объявление переменной для кнопки
    private Button resetButton; // Объявление переменной для кнопки сброса

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Устанавливаем макет для активности

        // Находим TextView и Button по их ID
        counterTextView = findViewById(R.id.counterTextView); // Находим TextView по его ID и присваиваем переменной counterTextView
        clickButton = findViewById(R.id.clickButton); // Находим Button по его ID и присваиваем переменной clickButton
        resetButton = findViewById(R.id.resetButton); // Находим Button сброса по его ID и присваиваем переменной resetButton

        // Устанавливаем слушатель кликов на кнопку
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При клике увеличиваем счетчик и обновляем текст в TextView
                counter++; // Увеличиваем значение счетчика на 1
                counterTextView.setText(String.valueOf(counter)); // Устанавливаем текст в TextView равным текущему значению счетчика, преобразованному в строку
            }
        });

        // Устанавливаем слушатель кликов на кнопку сброса
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При клике сбрасываем счетчик и обновляем текст в TextView
                counter = 0; // Сбрасываем значение счетчика
                counterTextView.setText(String.valueOf(counter)); // Устанавливаем текст в TextView равным текущему значению счетчика, преобразованному в строку
            }
        });
    }
}

