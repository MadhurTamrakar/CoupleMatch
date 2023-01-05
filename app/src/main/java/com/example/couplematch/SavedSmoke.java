package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedSmoke extends AppCompatActivity {

    AppCompatButton any, btn_Occasionally, btn_Regular, btn_zero_Tolerance, btn_Definitely, btn_Never ;
    TextView Btn_back;
    String Age, Religion, Dosh, MaritalStatus, Diet, Height, Education, Profession, Income, Drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_smoke);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");
        Education = getIntent ().getStringExtra ("Education");
        Profession = getIntent ().getStringExtra ("Profession");
        Income = getIntent ().getStringExtra ("Income");
        Drink = getIntent ().getStringExtra ("Drink");

        any = findViewById (R.id.any);
        Btn_back = findViewById (R.id.Btn_back);
        btn_Occasionally = findViewById (R.id.btn_Occasionally);
        btn_Regular = findViewById (R.id.btn_Regular);
        btn_zero_Tolerance = findViewById (R.id.btn_zero_Tolerance);
        btn_Definitely = findViewById (R.id.btn_Definitely);
        btn_Never = findViewById (R.id.btn_Never);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedSmoke.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                any.setBackgroundResource (R.drawable.edit_profile_btn); btn_Occasionally.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Regular.setBackgroundResource (R.drawable.edit_profile_btn); btn_zero_Tolerance.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Definitely.setBackgroundResource (R.drawable.edit_profile_btn); btn_Never.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedSmoke.this, SavedPhysicalStatus.class);
                        i.putExtra ("Smoke","any");
                        i.putExtra ("Drink", Drink);
                        i.putExtra ("Income", Income);
                        i.putExtra ("Profession", Profession);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                }, 800);
            }
        });

        btn_Occasionally.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Occasionally.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedSmoke.this, SavedPhysicalStatus.class);
                        i.putExtra ("Smoke","Occasionally");
                        i.putExtra ("Drink", Drink);
                        i.putExtra ("Income", Income);
                        i.putExtra ("Profession", Profession);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                }, 800);
            }
        });
        btn_Regular.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Regular.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedSmoke.this, SavedPhysicalStatus.class);
                        i.putExtra ("Smoke","Regular");
                        i.putExtra ("Drink", Drink);
                        i.putExtra ("Income", Income);
                        i.putExtra ("Profession", Profession);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                }, 800);
            }
        });
        btn_zero_Tolerance.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_zero_Tolerance.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedSmoke.this, SavedPhysicalStatus.class);
                        i.putExtra ("Smoke","Zero Tolerance");
                        i.putExtra ("Drink", Drink);
                        i.putExtra ("Income", Income);
                        i.putExtra ("Profession", Profession);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                }, 800);
            }
        });
        btn_Definitely.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Definitely.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedSmoke.this, SavedPhysicalStatus.class);
                        i.putExtra ("Smoke","Definitely");
                        i.putExtra ("Drink", Drink);
                        i.putExtra ("Income", Income);
                        i.putExtra ("Profession", Profession);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                }, 800);
            }
        });
        btn_Never.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Never.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedSmoke.this, SavedPhysicalStatus.class);
                        i.putExtra ("Smoke","Never");
                        i.putExtra ("Drink", Drink);
                        i.putExtra ("Income", Income);
                        i.putExtra ("Profession", Profession);
                        i.putExtra ("Education", Education);
                        i.putExtra ("Height", Height);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                }, 800);
            }
        });
    }
}
