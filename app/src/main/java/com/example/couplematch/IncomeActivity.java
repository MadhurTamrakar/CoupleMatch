package com.example.couplematch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.couplematch.sharedPreference.SharedPrefManager;

public class IncomeActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    AppCompatButton btn_INR1_INR3, btn_INR3_INR5, btn_INR5_INR7, btn_INR7_INR10, btn_INR10_INR12, btn_INR12_INR15, btn_INR15_INR17, btn_INR17_INR20, btn_INR20_INR23;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_income);

        sharedPrefManager = new SharedPrefManager (this);
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
                startActivity (new Intent (IncomeActivity.this, EditProfileActivity.class));
            }
        });

        btn_INR1_INR3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "1 lakh to 3 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR3_INR5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "3 lakh to 5 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR5_INR7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "5 lakh to 7 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR7_INR10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "7 lakh to 10 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR10_INR12.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "10 lakh to 12 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR12_INR15.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "12 lakh to 15 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR15_INR17.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "15 lakh to 17 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR17_INR20.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "17 lakh to 120 lakh");
                startActivity (i);
                finish ();
            }
        });
        btn_INR20_INR23.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (IncomeActivity.this, DrinkActivity.class);
                i.putExtra ("Income", "20 lakh to 123 lakh");
                startActivity (i);
                finish ();
            }
        });

    }
}
