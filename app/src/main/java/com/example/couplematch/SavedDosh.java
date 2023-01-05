package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedDosh extends AppCompatActivity {

    AppCompatButton btn_Manglik,btn_Non_Manglik,btn_ANSHIK_MANGLIK,btn_doNotKnow,doNotBelieve, any;
    TextView Btn_back;
    String Age, Religion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_dosh);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");

        any = findViewById (R.id.any);
        btn_Manglik = findViewById (R.id.btn_Manglik);
        btn_Non_Manglik = findViewById (R.id.btn_Non_Manglik);
        btn_ANSHIK_MANGLIK = findViewById (R.id.btn_ANSHIK_MANGLIK);
        btn_doNotKnow = findViewById (R.id.btn_doNotKnow);
        doNotBelieve = findViewById (R.id.doNotBelieve);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedDosh.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                any.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Manglik.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Non_Manglik.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_ANSHIK_MANGLIK.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_doNotKnow.setBackgroundResource (R.drawable.edit_profile_btn);
                doNotBelieve.setBackgroundResource (R.drawable.edit_profile_btn);

                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDosh.this, SavedMaritalStatus.class);
                        i.putExtra ("Dosh", "any");
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_Manglik.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_Manglik.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDosh.this, SavedMaritalStatus.class);
                        i.putExtra ("Dosh", "Manglik");
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_Non_Manglik.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_Non_Manglik.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDosh.this, SavedMaritalStatus.class);
                        i.putExtra ("Dosh", "Non Manglik");
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_ANSHIK_MANGLIK.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_ANSHIK_MANGLIK.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDosh.this, SavedMaritalStatus.class);
                        i.putExtra ("Dosh", "Anshik Manglik");
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_doNotKnow.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_doNotKnow.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDosh.this, SavedMaritalStatus.class);
                        i.putExtra ("Dosh", "Don,t know");
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        doNotBelieve.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                doNotBelieve.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDosh.this, SavedMaritalStatus.class);
                        i.putExtra ("Dosh", "Do Not Believe");
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
    }
}
