package com.example.xmlcode_areaofcircle;


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

        EditText editRadius = findViewById(R.id.editRadius);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textResult = findViewById(R.id.textResult);

        buttonCalculate.setOnClickListener(v -> {
            double radius = parseDouble(editRadius);
            double area = Math.PI * radius * radius;
            textResult.setText("Area of Circle: " + area);
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
