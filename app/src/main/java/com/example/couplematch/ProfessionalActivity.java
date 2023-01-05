package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class ProfessionalActivity extends AppCompatActivity {

    AppCompatButton btn_Business, btn_Government, btn_Private, btn_Public, btn_IAS, btn_Advocate,
        btn_Doctor, btn_Engineer, btn_Not_working, btn_Other;
    TextView Btn_back;
    String Religion, MaritalStatus, Diet, Height, Education, Dosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_professional);

        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");
        Education = getIntent ().getStringExtra ("Education");

        Btn_back = findViewById (R.id.Btn_back);
        btn_Business = findViewById (R.id.btn_Business);
        btn_Government = findViewById (R.id.btn_Government);
        btn_Private = findViewById (R.id.btn_Private);
        btn_Public = findViewById (R.id.btn_Public);
        btn_IAS = findViewById (R.id.btn_IAS);
        btn_Advocate = findViewById (R.id.btn_Advocate);
        btn_Doctor = findViewById (R.id.btn_Doctor);
        btn_Engineer = findViewById (R.id.btn_Engineer);
        btn_Not_working = findViewById (R.id.btn_Not_working);
        btn_Other = findViewById (R.id.btn_Other);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ProfessionalActivity.this, EducationActivity.class));
            }
        });
        btn_Business.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Business.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Business");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Government.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Government.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Government Job");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Private.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Private.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Private Job");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Public.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Public.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Public Sector job");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_IAS.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_IAS.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "IAS");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Advocate.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Advocate.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Advocate");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Doctor.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Doctor.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Doctor");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Engineer.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Engineer.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Software Engineer");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Not_working.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Not_working.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Non Working");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Other.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Other.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (ProfessionalActivity.this, LocationActivity.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Professional", "Other");
                        startActivity (i);
                    }
                },  800);
            }
        });
    }
}
