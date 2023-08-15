package com.example.simplemesssenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText messageBox;
    public static final String EXTRA_MESSAGE = "com.example.simplemesssenger.extra.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Toast.makeText(this, "sending message", Toast.LENGTH_SHORT).show();
        messageBox = findViewById(R.id.messageBox);
        String newMessage = messageBox.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_MESSAGE,newMessage);
        startActivity(intent);
    }
}