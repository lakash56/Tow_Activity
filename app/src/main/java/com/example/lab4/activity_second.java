package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {
    TextView message;
    EditText mReply;
    Button bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        message = findViewById(R.id.getMessage);


        mReply = findViewById(R.id.editText_reply);
        bttn = findViewById(R.id.button_reply);

        final Intent intent = getIntent();
        String messages = intent.getStringExtra("message");
        message.setText(messages);


        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reply = mReply.getText().toString();
                Intent replyIntent = new Intent(activity_second.this, MainActivity.class);
                replyIntent.putExtra("reply", reply);
                startActivity(replyIntent);
            }
        });


    }
}