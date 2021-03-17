package com.example.lab4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST =1;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;
    EditText mMessageEditText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hooks
        mMessageEditText = findViewById(R.id.editText_main);
        btn = findViewById(R.id.button_main);

        mReplyTextView = findViewById(R.id.getReply);


        final Intent intent = getIntent();
        String reply = intent.getStringExtra("reply");
        mReplyTextView.setText(reply);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mMessageEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this,activity_second.class);
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });

    }



}