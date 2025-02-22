package com.example.simpleinterest;

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

        EditText editPrincipal = findViewById(R.id.editPrincipal);
        EditText editRate = findViewById(R.id.editRate);
        EditText editTime = findViewById(R.id.editTime);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textResult = findViewById(R.id.textResult);

        buttonCalculate.setOnClickListener(v -> {
            double principal = parseDouble(editPrincipal);
            double rate = parseDouble(editRate);
            double time = parseDouble(editTime);

            double simpleInterest = (principal * rate * time) / 100;
            textResult.setText("Simple Interest: " + simpleInterest);
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
