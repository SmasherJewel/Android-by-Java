package com.example.chp_1practice_set;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button button;
     EditText number1,number2;
     TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Q-->1
//       Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();

//        Q-->2
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                int add =  Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
                result.setText("Addtion: "+ add);
            }
        });
    }
}