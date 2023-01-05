package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedPhysicalStatus extends AppCompatActivity {

    AppCompatButton any, btn_Physically, btn_Mentally, btn_Disabled, btn_fit, btn_Healthy;
    TextView Btn_back;
    String Age, Religion, Dosh, MaritalStatus, Diet, Height, Education, Profession, Income, Drink, Smoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_physical_status);

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
        Smoke = getIntent ().getStringExtra ("Smoke");

        any = findViewById (R.id.any);
        Btn_back = findViewById (R.id.Btn_back);
        btn_Physically = findViewById (R.id.btn_Physically);
        btn_Mentally = findViewById (R.id.btn_Mentally);
        btn_Disabled = findViewById (R.id.btn_Disabled);
        btn_fit = findViewById (R.id.btn_fit);
        btn_Healthy = findViewById (R.id.btn_Healthy);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class));
            }
        });
        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                any.setBackgroundResource (R.drawable.edit_profile_btn); btn_Physically.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Mentally.setBackgroundResource (R.drawable.edit_profile_btn); btn_Disabled.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_fit.setBackgroundResource (R.drawable.edit_profile_btn); btn_Healthy.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class);
                        i.putExtra ("PhysicalStatus", "any");
                        i.putExtra ("Smoke", Smoke);
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

        btn_Physically.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Physically.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class);
                        i.putExtra ("PhysicalStatus", "Physically Challenged");
                        i.putExtra ("Smoke", Smoke);
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
        btn_Mentally.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Mentally.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class);
                        i.putExtra ("PhysicalStatus", "Mentally Challenged");
                        i.putExtra ("Smoke", Smoke);
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
        btn_Disabled.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Disabled.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class);
                        i.putExtra ("PhysicalStatus", "Disable");
                        i.putExtra ("Smoke", Smoke);
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
        btn_fit.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_fit.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class);
                        i.putExtra ("PhysicalStatus", "Physically Fit");
                        i.putExtra ("Smoke", Smoke);
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
        btn_Healthy.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_Healthy.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedPhysicalStatus.this, SavedPreferenceActivity.class);
                        i.putExtra ("PhysicalStatus", "Healthy");
                        i.putExtra ("Smoke", Smoke);
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
