package com.example.areaofcircle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextRadius;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextRadius = findViewById(R.id.editTextRadius);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        String radiusStr = editTextRadius.getText().toString();

        if (!radiusStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double area = Math.PI * radius * radius;
            textViewResult.setText("Area: " + area);
        } else {
            textViewResult.setText("Please enter a radius");
        }
    }
}
