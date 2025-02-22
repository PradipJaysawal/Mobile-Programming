package com.example.a3nolsumargestsmallestaverage;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNumber1 = findViewById(R.id.editNumber1);
        EditText editNumber2 = findViewById(R.id.editNumber2);
        EditText editNumber3 = findViewById(R.id.editNumber3);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textResult = findViewById(R.id.textResult);

        buttonCalculate.setOnClickListener(v -> {
            double num1 = parseDouble(editNumber1);
            double num2 = parseDouble(editNumber2);
            double num3 = parseDouble(editNumber3);

            double sum = num1 + num2 + num3;
            double largest = Math.max(num1, Math.max(num2, num3));
            double smallest = Math.min(num1, Math.min(num2, num3));
            double average = sum / 3;

            String result = "Sum: " + sum +
                    "\nLargest: " + largest +
                    "\nSmallest: " + smallest +
                    "\nAverage: " + average;

            textResult.setText(result);
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
