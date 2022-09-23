package com.example.couplematch;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.UpdateProfileResponse;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AboutActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    TextView Btn_back;
    AppCompatButton Continue_btn;
    EditText editText_partner, editText_about;
    String Religion, Dosh, MaritalStatus, Diet, Height, Education, Professional, Location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_about);
        sharedPrefManager = new SharedPrefManager (this);


        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");
        Education = getIntent ().getStringExtra ("Education");
        Professional = getIntent ().getStringExtra ("Professional");
        Location = getIntent ().getStringExtra ("Location");

        Btn_back = findViewById (R.id.Btn_back);
        Continue_btn = findViewById (R.id.Continue_btn);
        editText_partner = findViewById (R.id.editText_partner);
        editText_about = findViewById (R.id.editText_about);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (AboutActivity.this, LocationActivity.class));
            }
        });
        Continue_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String user_id = sharedPrefManager.getId ();
                String religion = Religion;
                String dosh = Dosh;
                String maritalstatus = MaritalStatus;
                String diet = Diet;
                String height = Height;
                String education = Education;
                String profession = Professional;
                String location = Location;
                String about_me = editText_about.getText ().toString ().trim ();
                String partner_preference = editText_partner.getText ().toString ().trim ();

                profileUpdate (user_id, religion, dosh, maritalstatus, diet, height, education, profession, location, about_me, partner_preference);
            }
        });
    }

    private void profileUpdate(String user_id, String religion, String dosh, String maritalstatus, String diet, String height, String education, String profession, String location, String about_me, String partner_preference) {
        UserService apiService = ApiService.getService ();
        Call<UpdateProfileResponse> Call = apiService.UpdateProfile (user_id, religion, dosh, maritalstatus, diet, height, education, profession, location, about_me, partner_preference);
        Call.enqueue (new Callback<UpdateProfileResponse> () {
            @Override
            public void onResponse(Call<UpdateProfileResponse> responseCall, Response<UpdateProfileResponse> response) {
                if (response.isSuccessful ()) {
//                    sharedPrefManager.setId (user_id);
                    startActivity (new Intent (AboutActivity.this, Add_Photo_Activity.class));
                    finish ();
                } else {}

            }
            @Override
            public void onFailure(Call<UpdateProfileResponse> call, Throwable t) {
            }
        });
    }
}
