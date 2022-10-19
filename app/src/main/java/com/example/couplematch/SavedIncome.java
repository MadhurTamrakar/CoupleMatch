package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SavedIncome extends AppCompatActivity {

    AppCompatButton any, btn_INR1_INR3, btn_INR3_INR5, btn_INR5_INR7, btn_INR7_INR10, btn_INR10_INR12, btn_INR12_INR15, btn_INR15_INR17, btn_INR17_INR20, btn_INR20_INR23;
    TextView Btn_back;
    String Age, Religion, Dosh, MaritalStatus, Diet, Height, Education, Profession;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_income);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");
        Education = getIntent ().getStringExtra ("Education");
        Profession = getIntent ().getStringExtra ("Profession");

        any = findViewById (R.id.any);
        btn_INR1_INR3 = findViewById (R.id.btn_INR1_INR3);
        btn_INR3_INR5 = findViewById (R.id.btn_INR3_INR5);
        btn_INR5_INR7 = findViewById (R.id.btn_INR5_INR7);
        btn_INR7_INR10 = findViewById (R.id.btn_INR7_INR10);
        btn_INR10_INR12 = findViewById (R.id.btn_INR10_INR12);
        btn_INR12_INR15 = findViewById (R.id.btn_INR12_INR15);
        btn_INR15_INR17 = findViewById (R.id.btn_INR15_INR17);
        btn_INR17_INR20 = findViewById (R.id.btn_INR17_INR20);
        btn_INR20_INR23 = findViewById (R.id.btn_INR20_INR23);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedIncome.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "any");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });

        btn_INR1_INR3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "1 lakh to 3 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR3_INR5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "3 lakh to 5 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR5_INR7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "5 lakh to 7 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR7_INR10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "7 lakh to 10 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR10_INR12.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "10 lakh to 12 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR12_INR15.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "12 lakh to 15 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR15_INR17.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "15 lakh to 17 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR17_INR20.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "17 lakh to 120 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
        btn_INR20_INR23.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedIncome.this, SavedDrink.class);
                i.putExtra ("Income", "20 lakh to 123 lakh");
                i.putExtra ("Profession", Profession);
                i.putExtra ("Education", Education);
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
                finish ();
            }
        });
    }
}
