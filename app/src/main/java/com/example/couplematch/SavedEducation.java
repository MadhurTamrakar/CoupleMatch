package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SavedEducation extends AppCompatActivity {

    AppCompatButton any, btn_No_education,btn_Secondary,btn_Senior_Secondary,btn_Graduation,btn_Post_Graduation,btn_Bed,btn_Mphil,btn_Phd,btn_MBBS,btn_other;
    TextView Btn_back;
    String Age, Religion, Dosh, MaritalStatus, Diet, Height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_education);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");

        any = findViewById (R.id.any);
        Btn_back = findViewById (R.id.Btn_back);
        btn_No_education = findViewById (R.id.btn_No_education);
        btn_Secondary = findViewById (R.id.btn_Secondary);
        btn_Senior_Secondary = findViewById (R.id.btn_Senior_Secondary);
        btn_Graduation = findViewById (R.id.btn_Graduation);
        btn_Post_Graduation = findViewById (R.id.btn_Post_Graduation);
        btn_Bed = findViewById (R.id.btn_Bed);
        btn_Mphil = findViewById (R.id.btn_Mphil);
        btn_Phd = findViewById (R.id.btn_Phd);
        btn_MBBS = findViewById (R.id.btn_MBBS);
        btn_other = findViewById (R.id.btn_other);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedEducation.this, SavedPreferenceActivity.class));
            }
        });
        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","any");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });

        btn_No_education.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","No Education");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Secondary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","Secondary");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Senior_Secondary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","Senior Secondary");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Graduation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","Graduation");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Post_Graduation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","Post Graduation");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Bed.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","B.Ed");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Mphil.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","M.phil");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_Phd.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","Phd");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_MBBS.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","MBBS");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
        btn_other.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                i.putExtra ("Education","Other");
                i.putExtra ("Height", Height);
                i.putExtra ("Diet", Diet);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Age", Age);
                startActivity (i);
//                startActivity (new Intent (SavedEducation.this, SavedProfession.class));
            }
        });
    }
}
