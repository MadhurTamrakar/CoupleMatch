package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SmokeActivity extends AppCompatActivity {

    AppCompatButton btn_Occasionally, btn_Regular, btn_zero_Tolerance, btn_Definitely, btn_Never ;
    String Income, Drink;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_smoke);

        Income = getIntent ().getStringExtra ("Income");
        Drink = getIntent ().getStringExtra ("Drink");

        Btn_back = findViewById (R.id.Btn_back);
        btn_Occasionally = findViewById (R.id.btn_Occasionally);
        btn_Regular = findViewById (R.id.btn_Regular);
        btn_zero_Tolerance = findViewById (R.id.btn_zero_Tolerance);
        btn_Definitely = findViewById (R.id.btn_Definitely);
        btn_Never = findViewById (R.id.btn_Never);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SmokeActivity.this, DrinkActivity.class));
            }
        });

        btn_Occasionally.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SmokeActivity.this, PhysicalStatusActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke","Occasionally");
                startActivity (i);
                finish ();
            }
        });
        btn_Regular.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SmokeActivity.this, PhysicalStatusActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke","Regular");
                startActivity (i);
                finish ();
            }
        });
        btn_zero_Tolerance.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SmokeActivity.this, PhysicalStatusActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke","Zero Tolerance");
                startActivity (i);
                finish ();
            }
        });
        btn_Definitely.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SmokeActivity.this, PhysicalStatusActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke","Definitely");
                startActivity (i);
                finish ();
            }
        });
        btn_Never.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SmokeActivity.this, PhysicalStatusActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke","Never");
                startActivity (i);
                finish ();
            }
        });
    }
}
