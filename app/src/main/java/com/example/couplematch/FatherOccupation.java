package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FatherOccupation extends AppCompatActivity {

    AppCompatButton btn_None, btn_Government, btn_Private, btn_Public, btn_Retired, btn_Business;
    String Income, Drink, Smoke, Physical_status;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_father_occupation);

        Income = getIntent ().getStringExtra ("Income");
        Drink = getIntent ().getStringExtra ("Drink");
        Smoke = getIntent ().getStringExtra ("Smoke");
        Physical_status = getIntent ().getStringExtra ("PhysicalStatus");

        Btn_back = findViewById (R.id.Btn_back);
        btn_None = findViewById (R.id.btn_None);
        btn_Government = findViewById (R.id.btn_Government);
        btn_Private = findViewById (R.id.btn_Private);
        btn_Public = findViewById (R.id.btn_Public);
        btn_Retired = findViewById (R.id.btn_Retired);
        btn_Business = findViewById (R.id.btn_Business);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (FatherOccupation.this, PhysicalStatusActivity.class));
            }
        });

        btn_None.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FatherOccupation.this, MotherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", "Nome");
                startActivity (i);
                finish ();
            }
        });

        btn_Government.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FatherOccupation.this, MotherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", "Government Job");
                startActivity (i);
                finish ();
            }
        });

        btn_Private.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FatherOccupation.this, MotherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", "Private Job");
                startActivity (i);
                finish ();
            }
        });

        btn_Public.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FatherOccupation.this, MotherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", "Public Sector Job");
                startActivity (i);
                finish ();
            }
        });

        btn_Retired.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FatherOccupation.this, MotherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", "Retired");
                startActivity (i);
                finish ();
            }
        });

        btn_Business.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FatherOccupation.this, MotherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", "Business");
                startActivity (i);
                finish ();
            }
        });

    }
}
