package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.UpdateProfileResponse;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditProfileActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    TextView Btn_back, Refresh, tvname, tvemail, tvmobile, tvdob, tvgender, tvage, tvreligion, tvdosh, tvmarital_status, tvdiet, tvheight, tveducation, tvprofession, tvincome, tvlocation, tvdrink, tvsmoke, tvphysical_status, tvfather_occupation, tvmother_occupation;;
    Dialog Saved;
    EditText tved_about, tved_preference;
    String Name, Mobile, Email, Gender, Age, Dob, Religion, Dosh, MaritalStatus, Diet, Height, Education, Professional, Location, About_me, Partner_Preference, Income, Drink, Smoke, PhysicalStatus, Father_Occupation, Mother_Occupation;
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;
    AppCompatButton save_btn;

    //    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_edit_profile);

        sharedPrefManager = new SharedPrefManager (this);

        String user_id = sharedPrefManager.getId ();
        Name = sharedPrefManager.getName ();
        Mobile = sharedPrefManager.getUserMobile ();
        Gender = sharedPrefManager.getUserGender ();
        Dob = sharedPrefManager.getUserDob ();
        Age = sharedPrefManager.getUserAge ();
        Religion = sharedPrefManager.getUserReligion ();
        Dosh = sharedPrefManager.getUserDosh ();
        MaritalStatus =sharedPrefManager.getUserMaritalStatus ();
        Diet = sharedPrefManager.getUserDiet ();
        Height = sharedPrefManager.getUserHeight ();
        Education = sharedPrefManager.getUserEducation ();
        Professional = sharedPrefManager.getUserProfession ();
        Location = sharedPrefManager.getUserLocation ();
        About_me = sharedPrefManager.getUserAboutMe ();
        Partner_Preference = sharedPrefManager.getUserPartnerPreference ();
        Email = sharedPrefManager.getUserEmail ();

        Income = getIntent ().getStringExtra ("Income");
        Drink = getIntent ().getStringExtra ("Drink");
        Smoke = getIntent ().getStringExtra ("Smoke");
        PhysicalStatus = getIntent ().getStringExtra ("PhysicalStatus");
        Father_Occupation = getIntent ().getStringExtra ("Father_Occupation");
        Mother_Occupation = getIntent ().getStringExtra ("Mother_Occupation");

        Refresh = findViewById (R.id.Refresh);
        Btn_back = findViewById (R.id.Btn_back);
        save_btn = findViewById (R.id.save_btn);
        tvname = findViewById (R.id.name);
        tvemail = findViewById (R.id.email);
        tvmobile = findViewById (R.id.mobile);
        tvdob = findViewById (R.id.dob);
        tvgender = findViewById (R.id.gender);
        tvage = findViewById (R.id.age);
        tvreligion = findViewById (R.id.religion);
        tvdosh = findViewById (R.id.dosh);
        tvmarital_status = findViewById (R.id.marital_status);
        tvdiet = findViewById (R.id.diet);
        tvheight = findViewById (R.id.height);
        tveducation = findViewById (R.id.education);
        tvprofession = findViewById (R.id.profession);
        tvincome = findViewById (R.id.income);
        tvlocation = findViewById (R.id.location);
        tvdrink = findViewById (R.id.drink);
        tvsmoke = findViewById (R.id.smoke);
        tvphysical_status = findViewById (R.id.physical_status);
        tvfather_occupation = findViewById (R.id.father_occupation);
        tvmother_occupation = findViewById (R.id.mother_occupation);
        tved_about = findViewById (R.id.ed_about);
        tved_preference = findViewById (R.id.ed_preference);

        imageView1 = findViewById (R.id.imageView1);
        imageView2 = findViewById (R.id.imageView2);
        imageView3 = findViewById (R.id.imageView3);
        imageView4 = findViewById (R.id.imageView4);
        imageView5 = findViewById (R.id.imageView5);
        imageView6 = findViewById (R.id.imageView6);

        Saved = new Dialog (this);

        Refresh.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                EditProfile(user_id);
            }
        });

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, MenuActivity.class));
            }
        });
        tvincome.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, IncomeActivity.class));
                finish ();
            }
        });
        tvdrink.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, IncomeActivity.class));
                finish ();
            }
        });
        tvsmoke.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, IncomeActivity.class));
                finish ();
            }
        });
        tvphysical_status.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, IncomeActivity.class));
                finish ();
            }
        });
        tvfather_occupation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, IncomeActivity.class));
                finish ();
            }
        });
        tvmother_occupation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, IncomeActivity.class));
                finish ();
            }
        });

        tvname.setText (Name);
        tvgender.setText (Gender);
        tvdob.setText (Dob);
        tvage.setText (Age);
        tvmobile.setText (Mobile);
        tvreligion.setText (Religion);
        tvdosh.setText (Dosh);
        tvmarital_status.setText (MaritalStatus);
        tvheight.setText (Height);
        tveducation.setText (Education);
        tvdiet.setText (Diet);
        tvprofession.setText (Professional);
        tvlocation.setText (Location);
        tved_about.setText (About_me);
        tved_preference.setText (Partner_Preference);
        tvincome.setText (Income);
        tvdrink.setText (Drink);
        tvsmoke.setText (Smoke);
        tvphysical_status.setText (PhysicalStatus);
        tvfather_occupation.setText (Father_Occupation);
        tvmother_occupation.setText (Mother_Occupation);
        tvemail.setText (Email);
    }

    private void EditProfile(String user_id) {
        final ProgressDialog progressDialog = new ProgressDialog (EditProfileActivity.this);
        progressDialog.setMessage ("Refreshing....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<UpdateProfileResponse> Call = apiService.EditProfile (user_id);
        Call.enqueue (new Callback<UpdateProfileResponse> () {
            @Override
            public void onResponse(retrofit2.Call<UpdateProfileResponse> call, Response<UpdateProfileResponse> response) {
                if (response.isSuccessful ()) {
                    progressDialog.dismiss ();
                    assert response.body () != null;

                    Glide.with (getApplicationContext ())
                        .load (response.body ().getResult2 ().getProfile1 ())
                        .placeholder (R.drawable.avatar)
                        .centerCrop ()
                        .into (imageView1);
                    Glide.with (getApplicationContext ())
                        .load (response.body ().getResult2 ().getProfile2 ())
                        .placeholder (R.drawable.avatar)
                        .centerCrop ()
                        .into (imageView2);
                    Glide.with (getApplicationContext ())
                        .load (response.body ().getResult2 ().getProfile3 ())
                        .placeholder (R.drawable.avatar)
                        .centerCrop ()
                        .into (imageView3);
                    Glide.with (getApplicationContext ())
                        .load (response.body ().getResult2 ().getProfile4 ())
                        .placeholder (R.drawable.avatar)
                        .centerCrop ()
                        .into (imageView4);
                    Glide.with (getApplicationContext ())
                        .load (response.body ().getResult2 ().getProfile5 ())
                        .placeholder (R.drawable.avatar)
                        .centerCrop ()
                        .into (imageView5);
                    Glide.with (getApplicationContext ())
                        .load (response.body ().getResult2 ().getProfile6 ())
                        .placeholder (R.drawable.avatar)
                        .centerCrop ()
                        .into (imageView6);

                    tved_about.setText (response.body ().getResult2 ().getAboutMe ());
                    tved_preference.setText (response.body ().getResult2 ().getPartnerPreference ());
                    tvincome.setText (response.body ().getResult2 ().getIncome ());
                    tvdrink.setText (response.body ().getResult2 ().getDrink ());
                    tvsmoke.setText (response.body ().getResult2 ().getSmoke ());
                    tvphysical_status.setText (response.body ().getResult2 ().getPhysicalStatus ());
                    tvfather_occupation.setText (response.body ().getResult2 ().getFatherOccupation ());
                    tvmother_occupation.setText (response.body ().getResult2 ().getMotherOccupation ());
                }else {
                    Toast.makeText (EditProfileActivity.this, "Refresh Failed", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<UpdateProfileResponse> call, Throwable t) {
                Toast.makeText (EditProfileActivity.this, "Refresh Failed", Toast.LENGTH_SHORT).show ();
            }
        });
    }

    public void savedPopUp(View v) {
        TextView textClose;
        Saved.setContentView (R.layout.saved_pop_up);
        textClose = (TextView) Saved.findViewById (R.id.textClose);
        String user_id = sharedPrefManager.getId ();

        Name  =  tvname.getText ().toString (); Dosh = tvdosh.getText ().toString (); Location = tvlocation.getText ().toString ();
        Mobile = tvmobile.getText ().toString (); MaritalStatus = tvmarital_status.getText ().toString (); Drink = tvdrink.getText ().toString ();
        Email = tvemail.getText ().toString (); Diet = tvdiet.getText ().toString (); Smoke = tvsmoke.getText ().toString ();
        Gender = tvgender.getText ().toString (); Height = tvheight.getText ().toString (); PhysicalStatus = tvphysical_status.getText ().toString ();
        Age = tvage.getText ().toString (); Education = tveducation.getText ().toString (); About_me = tved_about.getText ().toString ();
        Dob = tvdob.getText ().toString (); Professional = tvprofession.getText ().toString (); Partner_Preference = tved_preference.getText ().toString ();
        Religion = tvreligion.getText ().toString (); Income = tvincome.getText ().toString (); Father_Occupation = tvfather_occupation.getText ().toString ();
        Mother_Occupation = tvmother_occupation.getText ().toString ();

        UpdateProfile(user_id, Name, Mobile, Email, Gender, Age, Dob, Religion, Dosh, MaritalStatus, Diet, Height, Education, Professional, Income, Location, Drink, Smoke, PhysicalStatus, About_me, Partner_Preference, Father_Occupation, Mother_Occupation);

        textClose.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Saved.dismiss ();
//                startActivity (new Intent (EditProfileActivity.this, MenuActivity.class));
            }
        });
        Saved.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        Saved.show ();
    }

    private void UpdateProfile(String user_id, String name, String mobile, String email, String gender, String age, String dob, String religion, String dosh, String maritalStatus, String diet, String height, String education, String professional, String income, String location, String drink, String smoke, String physicalStatus, String about_me, String partner_preference, String father_occupation, String mother_occupation) {
        UserService apiService = ApiService.getService ();
        Call<UpdateProfileResponse> Call = apiService.UpdateProfileAgain (user_id, name, mobile, gender, dob, religion, dosh, maritalStatus, diet, height, education, professional, location, about_me, partner_preference, income, drink, smoke, father_occupation, mother_occupation, email, age, physicalStatus);
        Call.enqueue (new Callback<UpdateProfileResponse> () {
            @Override
            public void onResponse(Call<UpdateProfileResponse> call, Response<UpdateProfileResponse> response) {

            }

            @Override
            public void onFailure(Call<UpdateProfileResponse> call, Throwable t) {
                Toast.makeText (EditProfileActivity.this, "Updating Profile Failed", Toast.LENGTH_SHORT).show ();
            }
        });
    }

}
