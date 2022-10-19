package com.example.couplematch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.SavedPreference;
import com.example.couplematch.response.UpdateProfileResponse;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.example.couplematch.sharedPreference.SharedPreference;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SavedPreferenceActivity extends AppCompatActivity {

    TextView Btn_back, add_physical, add_smoke, add_drink, add_income, add_profession, add_education, add_height, add_diet, add_Marital, add_dosh, add_religion, add_age;
    String Age, Religion, Dosh, MaritalStatus, Diet, Height, Education, Profession, Income, Drink, Smoke, Physical_status;
    SharedPreference sharedPreference;
    AppCompatButton btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_preference);

        sharedPreference = new SharedPreference (this);

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
        Physical_status = getIntent ().getStringExtra ("PhysicalStatus");

        btn_save = findViewById (R.id.btn_save);
        Btn_back = findViewById (R.id.Btn_back);
        add_physical = findViewById (R.id.add_physical);
        add_smoke = findViewById (R.id.add_smoke);
        add_drink = findViewById (R.id.add_drink);
        add_income = findViewById (R.id.add_income);
        add_profession = findViewById (R.id.add_profession);
        add_education = findViewById (R.id.add_education);
        add_height = findViewById (R.id.add_height);
        add_diet = findViewById (R.id.add_diet);
        add_Marital = findViewById (R.id.add_Marital);
        add_dosh = findViewById (R.id.add_dosh);
        add_religion = findViewById (R.id.add_religion);
        add_age = findViewById (R.id.add_age);

        btn_save.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, MenuActivity.class));
            }
        });

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, MenuActivity.class));
            }
        });
        add_age.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedAge.class));
            }
        });
        add_religion.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedReligion.class));
            }
        });
        add_dosh.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedDosh.class));
            }
        });
        add_Marital.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedMaritalStatus.class));
            }
        });
        add_diet.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedDiet.class));
            }
        });
        add_height.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedHeight.class));
            }
        });
        add_education.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedEducation.class));
            }
        });
        add_profession.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedProfession.class));
            }
        });
        add_income.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedIncome.class));
            }
        });
        add_drink.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedDrink.class));
            }
        });
        add_smoke.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedSmoke.class));
            }
        });
        add_physical.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, SavedPhysicalStatus.class));
            }
        });

        add_age.setText (Age);
        add_religion.setText (Religion);
        add_dosh.setText (Dosh);
        add_Marital.setText (MaritalStatus);
        add_diet.setText (Diet);
        add_height.setText (Height);
        add_education.setText (Education);
        add_profession.setText (Profession);
        add_income.setText (Income);
        add_drink.setText (Drink);
        add_smoke.setText (Smoke);
        add_physical.setText (Physical_status);

        sharedPreference.setAge (add_age.getText ().toString ());
        sharedPreference.setReligion (add_religion.getText ().toString ());
        sharedPreference.setDosh (add_dosh.getText ().toString ());
        sharedPreference.setMaritalStatus (add_Marital.getText ().toString ());
        sharedPreference.setDiet (add_diet.getText ().toString ());
        sharedPreference.setHeight (add_height.getText ().toString ());
        sharedPreference.setEducation (add_education.getText ().toString ());
        sharedPreference.setProfession (add_profession.getText ().toString ());
        sharedPreference.setIncome (add_income.getText ().toString ());
        sharedPreference.setDrink (add_drink.getText ().toString ());
        sharedPreference.setSmoke (add_smoke.getText ().toString ());
        sharedPreference.setPhysicalStatus (add_physical.getText ().toString ());

    }

}
