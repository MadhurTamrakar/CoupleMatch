package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;

public class MatchActivity extends AppCompatActivity {

    AppCompatButton view_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_match);

        view_contact = findViewById (R.id.view_contact);

    }
}
