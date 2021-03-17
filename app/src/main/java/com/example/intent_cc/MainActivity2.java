package com.example.intent_cc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView getText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getText = findViewById(R.id.setText);

        Intent intent = getIntent();
        String texts = intent.getStringExtra("texts");
        getText.setText(texts);
    }
}