package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RequestReceivedActivity extends AppCompatActivity {

    AppCompatButton accept_btn, cancel_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_request_received);

        cancel_btn = findViewById (R.id.cancel_btn);
        accept_btn = findViewById (R.id.accept_btn);

        accept_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (RequestReceivedActivity.this, MatchActivity.class);
                Toast.makeText (RequestReceivedActivity.this, "Request Accepted", Toast.LENGTH_SHORT).show ();
                startActivity (i);
            }
        });
        cancel_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (RequestReceivedActivity.this, MenuActivity.class);
                Toast.makeText (RequestReceivedActivity.this, "Request Cancel", Toast.LENGTH_LONG).show ();
                startActivity (i);
            }
        });
    }
}
