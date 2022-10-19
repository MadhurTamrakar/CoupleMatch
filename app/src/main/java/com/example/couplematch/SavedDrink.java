package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SavedDrink extends AppCompatActivity {

    AppCompatButton any, btn_Occasionally, btn_Regular, btn_zero_Tolerance, btn_Definitely, btn_Never ;
    TextView Btn_back;
    String Age, Religion, Dosh, MaritalStatus, Diet, Height, Education, Profession, Income;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_drink);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");
        Education = getIntent ().getStringExtra ("Education");
        Profession = getIntent ().getStringExtra ("Profession");
        Income = getIntent ().getStringExtra ("Income");

        any = findViewById (R.id.any);
        btn_Occasionally = findViewById (R.id.btn_Occasionally);
        btn_Regular = findViewById (R.id.btn_Regular);
        btn_zero_Tolerance = findViewById (R.id.btn_zero_Tolerance);
        btn_Definitely = findViewById (R.id.btn_Definitely);
        btn_Never = findViewById (R.id.btn_Never);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedDrink.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedDrink.this, SavedSmoke.class);
                i.putExtra ("Drink","any");
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
                finish ();
            }
        });

        btn_Occasionally.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedDrink.this, SavedSmoke.class);
                i.putExtra ("Drink","Occasionally");
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
                finish ();
            }
        });
        btn_Regular.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedDrink.this, SavedSmoke.class);
                i.putExtra ("Drink","Regular");
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
                finish ();
            }
        });
        btn_zero_Tolerance.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedDrink.this, SavedSmoke.class);
                i.putExtra ("Drink","Zero Tolerance");
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
        });
        btn_Definitely.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedDrink.this, SavedSmoke.class);
                i.putExtra ("Drink","Definitely");
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
        });
        btn_Never.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SavedDrink.this, SavedSmoke.class);
                i.putExtra ("Drink","Never");
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
        });
    }
}
