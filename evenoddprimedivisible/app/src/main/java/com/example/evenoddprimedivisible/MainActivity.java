package com.example.evenoddprimedivisible;


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

        EditText editNumber = findViewById(R.id.editNumber);
        Button buttonCheck = findViewById(R.id.buttonCheck);
        TextView textResult = findViewById(R.id.textResult);

        buttonCheck.setOnClickListener(v -> {
            int number = parseInt(editNumber);

            // Check Even or Odd
            String evenOdd = (number % 2 == 0) ? "Even" : "Odd";

            // Check Prime Number
            String prime = isPrime(number) ? "Prime" : "Not Prime";

            // Check Divisibility by 7
            String divisibleBy7 = (number % 7 == 0) ? "Divisible by 7" : "Not Divisible by 7";

            // Display result
            String result = "Number: " + number +
                    "\n" + evenOdd +
                    "\n" + prime +
                    "\n" + divisibleBy7;

            textResult.setText(result);
        });
    }

    private int parseInt(EditText editText) {
        try {
            return Integer.parseInt(editText.getText().toString());
        } catch (NumberFormatException e) {
            return 0; // Default to 0 if input is invalid
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
