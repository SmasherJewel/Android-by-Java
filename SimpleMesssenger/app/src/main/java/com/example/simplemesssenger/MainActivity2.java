package com.example.simplemesssenger;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView recivedText;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recivedText = findViewById(R.id.recivedText);
        Intent intent = getIntent();
        String newMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        recivedText.setText("Receiving message: " + newMessage);
    }
}