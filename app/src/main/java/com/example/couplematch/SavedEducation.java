package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
                any.setBackgroundResource (R.drawable.edit_profile_btn); btn_No_education.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Secondary.setBackgroundResource (R.drawable.edit_profile_btn); btn_Senior_Secondary.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Graduation.setBackgroundResource (R.drawable.edit_profile_btn); btn_Post_Graduation.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Bed.setBackgroundResource (R.drawable.edit_profile_btn); btn_Mphil.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Phd.setBackgroundResource (R.drawable.edit_profile_btn); btn_MBBS.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_other.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Education","any");
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_No_education.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_No_education.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education","No Education");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Secondary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Secondary.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Education","Secondary");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Senior_Secondary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Senior_Secondary.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","Senior Secondary");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Graduation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Graduation.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","Graduation");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Post_Graduation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Post_Graduation.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","Post Graduation");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Bed.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Bed.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","B.Ed");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Mphil.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Mphil.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","M.phil");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Phd.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Phd.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","Phd");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_MBBS.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_MBBS.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","MBBS");
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_other.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_other.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedEducation.this, SavedProfession.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Age", Age);
                        i.putExtra ("Education","Other");
                        startActivity (i);
                    }
                },  800);
            }
        });

    }
}
