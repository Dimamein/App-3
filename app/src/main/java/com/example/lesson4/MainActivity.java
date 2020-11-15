package com.example.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Convert;
        final EditText Number;
        final Double currentNumber;
        Convert = findViewById(R.id.ConvertButton);
        Number = findViewById(R.id.editTextNumber);

        Convert.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final Double currentNumber;
                        currentNumber = Double.parseDouble(Number.getText().toString()) / 3.79;
                        Toast.makeText(getApplicationContext(), "$" + String.format( "%.2f", currentNumber), Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}