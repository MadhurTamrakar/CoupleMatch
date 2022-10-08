package com.example.couplematch;

import android.app.ProgressDialog;
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
    String Religion, Dosh, MaritalStatus, Diet, Height, Education, Professional, Location, City;

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
        City = getIntent ().getStringExtra ("City");

        Btn_back = findViewById (R.id.Btn_back);
        Continue_btn = findViewById (R.id.Continue_btn);
        editText_partner = findViewById (R.id.editText_partner);
        editText_about = findViewById (R.id.editText_about);

//        userDosh = sharedPrefManager.setUserDosh (Dosh);

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
                String user_code = null;
                String religion = Religion;
                String dosh = Dosh;
                String maritalstatus = MaritalStatus;
                String diet = Diet;
                String height = Height;
                String education = Education;
                String profession = Professional;
                String location = Location;
                String city = City;
                String about_me = editText_about.getText ().toString ();
                String partner_preference = editText_partner.getText ().toString ();

                profileUpdate (user_id, user_code, religion, dosh, maritalstatus, diet, height, education, profession, location, city, about_me, partner_preference);
            }
        });
    }

    private void profileUpdate(String user_id, String user_code, String religion, String dosh, String maritalstatus, String diet, String height, String education, String profession, String location, String city, String about_me, String partner_preference) {
        final ProgressDialog progressDialog = new ProgressDialog (AboutActivity.this);
        progressDialog.setMessage ("Please Wait....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<UpdateProfileResponse> Call = apiService.UpdateProfile (user_id, user_code, religion, dosh, maritalstatus, diet, height, education, profession, location, city, about_me, partner_preference);
        Call.enqueue (new Callback<UpdateProfileResponse> () {
            @Override
            public void onResponse(Call<UpdateProfileResponse> responseCall, Response<UpdateProfileResponse> response) {

                if (response.isSuccessful ()) {
                    progressDialog.dismiss ();

                    if(response.body ().getResult2 ().getUserCode () != null) {
                        sharedPrefManager.setUserCode (response.body ().getResult2 ().getUserCode ());
                    } else {
                        sharedPrefManager.setUserCode ("null");
                    }

                    if(response.body ().getResult2 ().getReligion () != null) {
                        sharedPrefManager.setUserReligion (response.body ().getResult2 ().getReligion ());
                    } else {
                        sharedPrefManager.setUserReligion ("null");
                    }

                    if(response.body ().getResult2 ().getDosh () != null) {
                        sharedPrefManager.setUserDosh (response.body ().getResult2 ().getDosh ());
                    } else {
                        sharedPrefManager.setUserDosh ("null");
                    }

                    if(response.body ().getResult2 ().getMaritalStatus () != null) {
                        sharedPrefManager.setUserMaritalStatus (response.body ().getResult2 ().getMaritalStatus ());
                    } else {
                        sharedPrefManager.setUserMaritalStatus ("null");
                    }

                    if(response.body ().getResult2 ().getDiet () != null) {
                        sharedPrefManager.setUserDiet (response.body ().getResult2 ().getDiet ());
                    } else {
                        sharedPrefManager.setUserDiet ("null");
                    }

                    if(response.body ().getResult2 ().getHeight () != null) {
                        sharedPrefManager.setUserHeight (response.body ().getResult2 ().getHeight ());
                    } else {
                        sharedPrefManager.setUserHeight ("null");
                    }

                    if(response.body ().getResult2 ().getEducation () != null) {
                        sharedPrefManager.setUserEducation (response.body ().getResult2 ().getEducation ());
                    } else {
                        sharedPrefManager.setUserEducation ("null");
                    }

                    if(response.body ().getResult2 ().getProfession () != null) {
                        sharedPrefManager.setUserProfession (response.body ().getResult2 ().getProfession ());
                    } else {
                        sharedPrefManager.setUserProfession ("null");
                    }

                    if(response.body ().getResult2 ().getLocation () != null) {
                        sharedPrefManager.setUserLocation (response.body ().getResult2 ().getLocation ());
                    } else {
                        sharedPrefManager.setUserLocation ("null");
                    }

                    if(response.body ().getResult2 ().getAboutMe () != null) {
                        sharedPrefManager.setUserAboutMe (response.body ().getResult2 ().getAboutMe ());
                    } else {
                        sharedPrefManager.setUserAboutMe ("null");
                    }

                    if(response.body ().getResult2 ().getPartnerPreference () != null) {
                        sharedPrefManager.setUserPartnerPreference (response.body ().getResult2 ().getPartnerPreference ());
                    } else {
                        sharedPrefManager.setUserPartnerPreference ("null");
                    }

                    sharedPrefManager.setUserCity (response.body ().getResult2 ().getCity ());

                    Intent i = new Intent (AboutActivity.this, Add_Photo_Activity.class);
                    startActivity (i);


                } else {
                }

            }

            @Override
            public void onFailure(Call<UpdateProfileResponse> call, Throwable t) {
            }
        });
    }
}
