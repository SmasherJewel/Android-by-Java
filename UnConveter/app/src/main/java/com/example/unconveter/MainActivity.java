package com.example.unconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView blank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        blank = findViewById(R.id.blank);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();

                String val = editText.getText().toString();
                int kg = Integer.parseInt(val);
                double pound = (2.205 * kg);
                blank.setText(String.format("The corresponding value in pound is:%.2f ",pound));
            }  });
    }
}