package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoshActivity extends AppCompatActivity {

    AppCompatButton btn_Manglik,btn_Non_Manglik,btn_ANSHIK_MANGLIK,btn_doNotKnow,doNotBelieve;
    TextView Btn_back;
    String Religion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_dosh);

        Religion = getIntent ().getStringExtra ("Religion");

        btn_Manglik = findViewById (R.id.btn_Manglik);
        btn_Non_Manglik = findViewById (R.id.btn_Non_Manglik);
        btn_ANSHIK_MANGLIK = findViewById (R.id.btn_ANSHIK_MANGLIK);
        btn_doNotKnow = findViewById (R.id.btn_doNotKnow);
        doNotBelieve = findViewById (R.id.doNotBelieve);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (DoshActivity.this, ReligionActivity.class));
            }
        });

        btn_Manglik.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DoshActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", "Manglik");
                startActivity (i);
//                startActivity (new Intent (DoshActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_Non_Manglik.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DoshActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", "Non Manglik");
                startActivity (i);
//                startActivity (new Intent (DoshActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_ANSHIK_MANGLIK.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DoshActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", "Anshik Manglik");
                startActivity (i);
//                startActivity (new Intent (DoshActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_doNotKnow.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DoshActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", "Don,t know");
                startActivity (i);
//                startActivity (new Intent (DoshActivity.this, MaritalStatusActivity.class));
            }
        });
        doNotBelieve.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DoshActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", "Do Not Believe");
                startActivity (i);
//                startActivity (new Intent (DoshActivity.this, MaritalStatusActivity.class));
            }
        });
    }
}
