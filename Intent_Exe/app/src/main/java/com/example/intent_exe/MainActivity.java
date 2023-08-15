package com.example.intent_exe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userId,password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userId = findViewById(R.id.userId);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

        public void onClick(View view) {
                String id = userId.getText().toString();
                String pass = password.getText().toString();
                if (id.equals("Smasher") && pass.equals("Password")) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                } else if (id.equals("") || pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter userId and Password both", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid userId and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}