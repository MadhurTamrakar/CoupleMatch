package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.adapter.Adapter;
import com.example.couplematch.adapter.SearchAdapter;
import com.example.couplematch.model.Data2;
import com.example.couplematch.response.SavedPreference;
import com.example.couplematch.response.UniqueUserData;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.example.couplematch.sharedPreference.SharedPreference;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchResultActivity extends AppCompatActivity {

    TextView Btn_back, age, religion, dosh, marital_status, Diet, height, education, profession, income, drink, smoke, physical_status;
    EditText ed_id;
    AppCompatButton search_btn, searchById_btn;
    SharedPreference sharedPreference;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_search_result);

        sharedPreference = new SharedPreference (this);
        sharedPrefManager = new SharedPrefManager (this);

        Btn_back = findViewById (R.id.Btn_back);
        age = findViewById (R.id.age);
        religion = findViewById (R.id.religion);
        dosh = findViewById (R.id.dosh);
        marital_status = findViewById (R.id.marital_status);
        Diet = findViewById (R.id.Diet);
        height = findViewById (R.id.height);
        education = findViewById (R.id.education);
        profession = findViewById (R.id.profession);
        income = findViewById (R.id.income);
        drink = findViewById (R.id.drink);
        smoke = findViewById (R.id.smoke);
        searchById_btn = findViewById (R.id.searchById_btn);
        physical_status = findViewById (R.id.physical_status);
        ed_id = findViewById (R.id.ed_id);
        search_btn = findViewById (R.id.search_btn);

        age.setText (sharedPreference.getAge ());
        religion.setText (sharedPreference.getReligion ());
        dosh.setText (sharedPreference.getDosh ());
        marital_status.setText (sharedPreference.getMaritalStatus ());
        Diet.setText (sharedPreference.getDiet ());
        height.setText (sharedPreference.getHeight ());
        education.setText (sharedPreference.getEducation ());
        profession.setText (sharedPreference.getProfession ());
        income.setText (sharedPreference.getIncome ());
        drink.setText (sharedPreference.getDrink ());
        smoke.setText (sharedPreference.getSmoke ());
        physical_status.setText (sharedPreference.getPhysicalStatus ());

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SearchResultActivity.this, MenuActivity.class));
            }
        });

        searchById_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String user_code = ed_id.getText ().toString ();
                if(user_code.isEmpty ()){
                    ed_id.setError ("Enter User ID");
                }else{
                    GetUser (user_code);
                }
            }
        });

        search_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                startActivity (new Intent (SearchResultActivity.this, SearchedProfile.class));
                finish ();
//                String gender = sharedPrefManager.getUserGender ();
//                String Age = age.getText ().toString ();
//                String Religion = religion.getText ().toString ();
//                String Dosh = dosh.getText ().toString ();
//                String Marital_status = marital_status.getText ().toString ();
//                String diet = Diet.getText ().toString ();
//                String Height = height.getText ().toString ();
//                String Education = education.getText ().toString ();
//                String Profession = profession.getText ().toString ();
//                String Income = income.getText ().toString ();
//                String Drink = drink.getText ().toString ();
//                String Smoke = smoke.getText ().toString ();
//                String Physical_status = physical_status.getText ().toString ();

//                    PartnerPreference(gender, Age, Religion, Dosh, Marital_status, diet, Height, Education, Profession, Drink, Smoke, Physical_status);


            }
        });
    }

    private void GetUser(String user_code) {
        Call<UniqueUserData> call = ApiService.getService ().GetUniqueUserData (user_code);
        call.enqueue (new Callback<UniqueUserData> () {
            @Override
            public void onResponse(Call<UniqueUserData> call, Response<UniqueUserData> response) {
                if (response.isSuccessful ()) {
                    if (response.body ().getData () != null) {
                        Intent i = new Intent (SearchResultActivity.this, UniqueProfileID.class);
                        i.putExtra ("Image", response.body ().getData ().getProfile1 ());
                        i.putExtra ("Name", response.body ().getData ().getName ());
                        i.putExtra ("UserCode", response.body ().getData ().getUserCode ());
                        i.putExtra ("Religion", response.body ().getData ().getReligion ());
                        i.putExtra ("Marital_Status", response.body ().getData ().getMaritalStatus ());
                        i.putExtra ("Height", response.body ().getData ().getHeight ());
                        i.putExtra ("Diet", response.body ().getData ().getDiet ());
                        i.putExtra ("Education", response.body ().getData ().getEducation ());
                        i.putExtra ("Profession", response.body ().getData ().getProfession ());
                        i.putExtra ("About_Me", response.body ().getData ().getAboutMe ());
                        i.putExtra ("Partner_Preference", response.body ().getData ().getPartnerPreference ());
                        i.putExtra ("Age", response.body ().getData ().getAge ());
                        i.putExtra ("City", response.body ().getData ().getCity ());
                        startActivity (i);
                        finish ();
                    } else {
                        Toast.makeText (SearchResultActivity.this, "No Data Found", Toast.LENGTH_SHORT).show ();
                    }
                }
            }
            @Override
            public void onFailure(Call<UniqueUserData> call, Throwable t) {

            }
        });
    }

//    private void PartnerPreference(String gender, String age, String religion, String dosh, String marital_status, String diet, String height, String education, String profession, String drink, String smoke, String physical_status) {
//        final ProgressDialog progressDialog = new ProgressDialog (SearchResultActivity.this);
//        progressDialog.setMessage ("Loading....");
//        progressDialog.show ();
//        UserService apiService = ApiService.getService ();
//        Call<SavedPreference> Call = apiService.search_partner_preference (gender, age, religion, dosh, marital_status, diet, height, education, profession, drink, smoke, physical_status);
//        Call.enqueue (new Callback<SavedPreference> () {
//            @Override
//            public void onResponse(retrofit2.Call<SavedPreference> call, Response<SavedPreference> response) {
//                if (response.isSuccessful ()){
//                    if(response.body ().getData2 () != null){
//                        Intent i = new Intent (SearchResultActivity.this, SearchedProfile.class);
//                        i.putExtra ("Image", response.body ().getData2 ().get (0).getProfile1 ());
//                        i.putExtra ("Name", response.body ().getData2 ().get (0).getName ());
//                        i.putExtra ("UserCode", response.body ().getData2 ().get (0).getUserCode ());
//                        i.putExtra ("Religion", response.body ().getData2 ().get (0).getReligion ());
//                        i.putExtra ("Marital_Status", response.body ().getData2 ().get (0).getMaritalStatus ());
//                        i.putExtra ("Height", response.body ().getData2 ().get (0).getHeight ());
//                        i.putExtra ("Diet", response.body ().getData2 ().get (0).getDiet ());
//                        i.putExtra ("Education", response.body ().getData2 ().get (0).getEducation ());
//                        i.putExtra ("Profession", response.body ().getData2 ().get (0).getProfession ());
//                        i.putExtra ("About_Me", response.body ().getData2 ().get (0).getAboutMe ());
//                        i.putExtra ("Partner_Preference", response.body ().getData2 ().get (0).getPartnerPreference ());
//                        i.putExtra ("Age", response.body ().getData2 ().get (0).getAge ());
//                        i.putExtra ("City", response.body ().getData2 ().get (0).getCity ());
//                    }else{
//                        Toast.makeText (SearchResultActivity.this, "Failed To Load Data", Toast.LENGTH_SHORT).show ();
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(retrofit2.Call<SavedPreference> call, Throwable t) {
//
//            }
//        });
//    }
}
