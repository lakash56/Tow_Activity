package com.example.intent_cc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.intent_cc.extra.MESSAGE";
    Button btn,butn,bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button_one);
        bttn = findViewById(R.id.button_two);
        butn = findViewById(R.id.button_three);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("texts",getString(R.string.text_one));
                startActivity(intent);
            }
        });
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("texts",getString(R.string.text_two));
                startActivity(intent);
            }
        });
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("texts",getString(R.string.text_three));
                startActivity(intent);
            }
        });

    }


}