package com.example.onetoanotheractivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent and add data
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("id", 1);
                intent.putExtra("name", "Pradip");
                intent.putExtra("address", "chitwan");
                startActivity(intent); // Start SecondActivity
            }
        });
    }
}
