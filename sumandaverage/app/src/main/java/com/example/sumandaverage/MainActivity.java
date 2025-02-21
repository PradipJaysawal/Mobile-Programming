package com.example.sumandaverage;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textSum = findViewById(R.id.textSum);
        TextView textAverage = findViewById(R.id.textAverage);

        buttonCalculate.setOnClickListener(v -> {
            double num1 = parseDouble(editText1);
            double num2 = parseDouble(editText2);
            double num3 = parseDouble(editText3);
            double num4 = parseDouble(editText4);
            double num5 = parseDouble(editText5);

            double sum = num1 + num2 + num3 + num4 + num5;
            double average = sum / 5;

            textSum.setText("Sum: " + sum);
            textAverage.setText("Average: " + average);
        });
    }

    private double parseDouble(EditText editText) {
        try {
            return Double.parseDouble(editText.getText().toString());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
