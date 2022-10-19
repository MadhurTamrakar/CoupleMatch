package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MotherOccupation extends AppCompatActivity {

    AppCompatButton btn_None, btn_Government, btn_Private, btn_HouseWife, btn_Retired, btn_Business;
    String Income, Drink, Smoke, Physical_status, Father_Occupation;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_mother_occupation);

        Income = getIntent ().getStringExtra ("Income");
        Drink = getIntent ().getStringExtra ("Drink");
        Smoke = getIntent ().getStringExtra ("Smoke");
        Physical_status = getIntent ().getStringExtra ("PhysicalStatus");
        Father_Occupation = getIntent ().getStringExtra ("Father_Occupation");

        Btn_back = findViewById (R.id.Btn_back);
        btn_None = findViewById (R.id.btn_None);
        btn_Government = findViewById (R.id.btn_Government);
        btn_Private = findViewById (R.id.btn_Private);
        btn_HouseWife = findViewById (R.id.btn_HouseWife);
        btn_Retired = findViewById (R.id.btn_Retired);
        btn_Business = findViewById (R.id.btn_Business);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (MotherOccupation.this, FatherOccupation.class));
            }
        });

        btn_None.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MotherOccupation.this, EditProfileActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", Father_Occupation);
                i.putExtra ("Mother_Occupation", "Nome");
                startActivity (i);
                finish ();
            }
        });

        btn_Government.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MotherOccupation.this, EditProfileActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", Father_Occupation);
                i.putExtra ("Mother_Occupation", "Government Job");
                startActivity (i);
                finish ();
            }
        });

        btn_Private.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MotherOccupation.this, EditProfileActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", Father_Occupation);
                i.putExtra ("Mother_Occupation", "Private Job");
                startActivity (i);
                finish ();
            }
        });

        btn_HouseWife.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MotherOccupation.this, EditProfileActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", Father_Occupation);
                i.putExtra ("Mother_Occupation", "House Wife");
                startActivity (i);
                finish ();
            }
        });

        btn_Retired.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MotherOccupation.this, EditProfileActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", Father_Occupation);
                i.putExtra ("Mother_Occupation", "Retired");
                startActivity (i);
                finish ();
            }
        });

        btn_Business.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MotherOccupation.this, EditProfileActivity.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus", Physical_status);
                i.putExtra ("Father_Occupation", Father_Occupation);
                i.putExtra ("Mother_Occupation", "Business");
                startActivity (i);finish ();
            }
        });
    }
}
