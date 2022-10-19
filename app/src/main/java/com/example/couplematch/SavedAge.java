package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SavedAge extends AppCompatActivity {

    AppCompatButton btn_21_25, btn_26_30, btn_31_35, btn_36_40, any;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_age);

        any = findViewById (R.id.any);
        btn_21_25 = findViewById (R.id.btn_21_25);
        btn_26_30 = findViewById (R.id.btn_26_30);
        btn_31_35 = findViewById (R.id.btn_31_35);
        btn_36_40 = findViewById (R.id.btn_36_40);

        btn_21_25.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedAge.this, SavedReligion.class);
                i.putExtra ("Age","21-25");
                startActivity (i);
                finish ();
            }
        });

        btn_26_30.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedAge.this, SavedReligion.class);
                i.putExtra ("Age","26-30");
                startActivity (i);
            }
        });

        btn_31_35.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedAge.this, SavedReligion.class);
                i.putExtra ("Age","31-35");
                startActivity (i);
            }
        });

        btn_36_40.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedAge.this, SavedReligion.class);
                i.putExtra ("Age","36-40");
                startActivity (i);
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedAge.this, SavedReligion.class);
                i.putExtra ("Age","any");
                startActivity (i);
            }
        });

    }
}
