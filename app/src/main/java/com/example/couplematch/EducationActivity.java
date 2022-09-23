package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EducationActivity extends AppCompatActivity {

    AppCompatButton btn_No_education,btn_Secondary,btn_Senior_Secondary,btn_Graduation,btn_Post_Graduation,btn_Bed,btn_Mphil,btn_Phd,btn_MBBS,btn_other;
    TextView Btn_back;
    String Religion, MaritalStatus, Diet, Height, Dosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_education);

        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");

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
                startActivity (new Intent (EducationActivity.this, HeightActivity.class));
            }
        });

        btn_No_education.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","No Education");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Secondary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","Secondary");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Senior_Secondary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","Senior Secondary");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Graduation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","Graduation");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Post_Graduation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","Post Graduation");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Bed.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","B.Ed");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Mphil.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","M.phil");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_Phd.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","Phd");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_MBBS.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","MBBS");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });
        btn_other.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (EducationActivity.this, ProfessionalActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education","Other");
                startActivity (i);
//                startActivity (new Intent (EducationActivity.this, ProfessionalActivity.class));
            }
        });

    }
}
