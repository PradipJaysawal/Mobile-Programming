package com.example.onetoanotheractivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewData = findViewById(R.id.textViewData);

        // Receive data from Intent
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", -1); // -1 is default if not found
        String name = intent.getStringExtra("name");
        String address = intent.getStringExtra("address");

        // Display data
        String result = "ID: " + id + "\nName: " + name + "\nAddress: " + address;
        textViewData.setText(result);
    }
}
