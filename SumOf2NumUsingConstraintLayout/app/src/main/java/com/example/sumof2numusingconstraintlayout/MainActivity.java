package com.example.sumof2numusingconstraintlayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button button;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by ID
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        resultTextView = findViewById(R.id.resultTextView);

        // Add click listener to button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Parse input into numbers
                    double num1 = Double.parseDouble(editText1.getText().toString());
                    double num2 = Double.parseDouble(editText2.getText().toString());

                    // Add numbers
                    double sum = num1 + num2;

                    // Display result
                    resultTextView.setText("The sum is: " + sum);
                } catch (NumberFormatException e) {
                    resultTextView.setText("Invalid input");
                }
            }
        });
    }
}
