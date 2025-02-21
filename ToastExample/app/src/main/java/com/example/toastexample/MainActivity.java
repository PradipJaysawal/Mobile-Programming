package com.example.toastexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.et1);
        t2=findViewById(R.id.et2);
        
    }
    public void sumgara(View v)
    {
        t1=findViewById(R.id.et1);
        t2=findViewById(R.id.et2);
        double a,b,c;
        a=Float.parseFloat(t1.getText().toString());
        b=Float.parseFloat(t2.getText().toString());
        c=a+b;
        String p = Double.toString(c);
        Toast.makeText(getApplicationContext(),"NASA Hacked"+c, Toast.LENGTH_LONG).show();
    }
}