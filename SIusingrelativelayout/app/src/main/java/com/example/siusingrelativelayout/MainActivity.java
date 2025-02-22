package com.example.siusingrelativelayout;

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

        // Getting references to UI elements
        EditText editPrincipal = findViewById(R.id.editPrincipal);
        EditText editRate = findViewById(R.id.editRate);
        EditText editTime = findViewById(R.id.editTime);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textResult = findViewById(R.id.textResult);

        // Calculate Simple Interest on button click
        buttonCalculate.setOnClickListener(v -> {
            double principal = parseDouble(editPrincipal);
            double rate = parseDouble(editRate);
            double time = parseDouble(editTime);

            // Formula: SI = (P * R * T) / 100
            double simpleInterest = (principal * rate * time) / 100;

            textResult.setText("Simple Interest: " + simpleInterest);
        });
    }

    // Function to safely parse double values
    private double parseDouble(EditText editText) {
        try {
            return Double.parseDouble(editText.getText().toString());
        } catch (NumberFormatException e) {
            return 0.0; // Return 0 if input is invalid
        }
    }
}
