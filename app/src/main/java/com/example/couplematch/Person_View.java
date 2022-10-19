package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Person_View extends AppCompatActivity {

    TextView text_name,text_age,text_location,userCode,UserName,Dob,Mobile,Email,Religion,Dosh,MaritalStatus
        ,Height,Diet,Education,Profession,City,Income,Smoke,Drink,PhysicalStatus,Btn_back;
    ImageView profileImage;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_person_view);

        Btn_back = findViewById (R.id.Btn_back);
        profileImage = findViewById (R.id.profileImage);
        text_name = findViewById (R.id.text_name);
        text_age = findViewById (R.id.text_age);
        text_location = findViewById (R.id.text_location);
        userCode = findViewById (R.id.userCode);
        UserName = findViewById (R.id.UserName);
        Dob = findViewById (R.id.Dob);
        Mobile = findViewById (R.id.Mobile);
        Email = findViewById (R.id.Email);
        Religion = findViewById (R.id.religion);
        Dosh = findViewById (R.id.dosh);
        MaritalStatus = findViewById (R.id.maritalStatus);
        Height = findViewById (R.id.Height);
        Diet = findViewById (R.id.Diet);
        Education = findViewById (R.id.education);
        Profession = findViewById (R.id.profession);
        City = findViewById (R.id.city);
        Income = findViewById (R.id.income);
        Smoke = findViewById (R.id.Smoke);
        Drink = findViewById (R.id.drink);
        PhysicalStatus = findViewById (R.id.PhysicalStatus);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (Person_View.this, RequestReceivedActivity.class));
            }
        });

        String name = getIntent ().getStringExtra ("Name");
        String age = getIntent ().getStringExtra ("Age");
        String city = getIntent ().getStringExtra ("City");
        String image = getIntent ().getStringExtra ("Image");
        String usercode = getIntent ().getStringExtra ("UserCode");
        String religion = getIntent ().getStringExtra ("Religion");
        String dosh = getIntent ().getStringExtra ("Dosh");
        String marital_status = getIntent ().getStringExtra ("MaritalStatus");
        String height = getIntent ().getStringExtra ("Height");
        String diet = getIntent ().getStringExtra ("Diet");
        String education = getIntent ().getStringExtra ("Education");
        String profession = getIntent ().getStringExtra ("Profession");
        String income = getIntent ().getStringExtra ("Income");
        String smoke = getIntent ().getStringExtra ("Smoke");
        String drink = getIntent ().getStringExtra ("Drink");
        String physical_status = getIntent ().getStringExtra ("Physical Status");
        String mobile = getIntent ().getStringExtra ("Mobile");
        String dob = getIntent ().getStringExtra ("Dob");
        String email = getIntent ().getStringExtra ("Email");

        text_name.setText (name);
        text_age.setText (age);
        text_location.setText (city);
        userCode.setText (usercode);
        UserName.setText (name);
        Dob.setText (dob);
        Mobile.setText (mobile);
        Email.setText (email);
        Religion.setText (religion);
        Dosh.setText (dosh);
        MaritalStatus.setText (marital_status);
        Height.setText (height);
        Diet.setText (diet);
        City.setText (city);
        Education.setText (education);
        Profession.setText (profession);
        Income.setText (income);
        Smoke.setText (smoke);
        Drink.setText (drink);
        PhysicalStatus.setText (physical_status);

        Glide.with (getApplicationContext ())
            .load (image)
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (profileImage);

        if (dosh == null){
            Dosh.setText ("Not Mentioned");
            Dosh.setTextColor (Color.BLACK);
        }else{
            Dosh.setText (dosh);
        }

        if (email == null){
            Email.setText ("Not Provided");
            Email.setTextColor (Color.BLACK);
        }else{
            Email.setText (email);
        }

        if (income == null){
            Income.setText ("Not Provided");
            Income.setTextColor (Color.BLACK);
        }else{
            Income.setText (income);
        }

        if (smoke == null){
            Smoke.setText ("Not Mentioned");
            Smoke.setTextColor (Color.BLACK);
        }else{
            Smoke.setText (smoke);
        }

        if (drink == null){
            Drink.setText ("Not Mentioned");
            Drink.setTextColor (Color.BLACK);
        }else{
            Drink.setText (drink);
        }

        if (physical_status == null){
            PhysicalStatus.setText ("Not Mentioned");
            PhysicalStatus.setTextColor (Color.BLACK);
        }else{
            PhysicalStatus.setText (physical_status);
        }
    }
}
