package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.adapter.AcceptedMeAdapter;
import com.example.couplematch.adapter.Adapter;
import com.example.couplematch.adapter.SearchAdapter;
import com.example.couplematch.model.Data2;
import com.example.couplematch.model.RequestAcceptedByMe;
import com.example.couplematch.response.SavedPreference;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.example.couplematch.sharedPreference.SharedPreference;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchedProfile extends AppCompatActivity {

    SharedPreference sharedPreference;
    SharedPrefManager sharedPrefManager;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    SearchAdapter adapter;
    ImageView mail_box;
    TextView Btn_back, textData;
    String gender, Religion, Dosh, Marital_Status, Height, Diet, Education, Profession, income, drink, smoke, physical_status, Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_searched_profile);

        sharedPreference = new SharedPreference (this);
        sharedPrefManager = new SharedPrefManager (this);

        textData = findViewById (R.id.textData);
        mail_box = findViewById (R.id.mail_box);
        Btn_back = findViewById (R.id.Btn_back);

        Age = sharedPreference.getAge ();
        gender = sharedPrefManager.getUserGender ();
        Religion = sharedPreference.getReligion ();
        Dosh = sharedPreference.getDosh ();
        Marital_Status = sharedPreference.getMaritalStatus ();
        Height = sharedPreference.getHeight ();
        Diet = sharedPreference.getDiet ();
        Education = sharedPreference.getEducation ();
        Profession = sharedPreference.getProfession ();
        income = sharedPreference.getIncome ();
        drink = sharedPreference.getDrink ();
        smoke = sharedPreference.getSmoke ();
        physical_status = sharedPreference.getPhysicalStatus ();

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SearchedProfile.this, SearchResultActivity.class));
                finish ();
            }
        });

        PartnerPreference(gender, Age, Religion, Dosh, Marital_Status, Diet, Height, Education, Profession, drink, smoke, physical_status);
    }

    private void PartnerPreference(String gender, String age, String religion, String dosh, String marital_status, String diet, String height, String education, String profession, String drink, String smoke, String physical_status) {
        final ProgressDialog progressDialog = new ProgressDialog (SearchedProfile.this);
        progressDialog.setMessage ("Loading....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<SavedPreference> Call = apiService.search_partner_preference (gender, age, religion, dosh, marital_status, diet, height, education, profession, drink, smoke, physical_status);
        Call.enqueue (new Callback<SavedPreference> () {
            @SuppressLint({"SetTextI18n", "NotifyDataSetChanged"})
            @Override
            public void onResponse(retrofit2.Call<SavedPreference> call, Response<SavedPreference> response) {
                if (response.isSuccessful ()){
                    if(response.body ().getData2 () != null){
                        progressDialog.dismiss ();
                        mail_box.setVisibility (View.GONE);
                        textData.setVisibility (View.GONE);
                        recyclerView = findViewById (R.id.recyclerView);
                        LayoutManager = new GridLayoutManager (getApplicationContext (), 2);
                        recyclerView.setLayoutManager (LayoutManager);
                        adapter = new SearchAdapter (getApplicationContext (), response.body ().getData2 ());
                        recyclerView.setAdapter (adapter);
                        recyclerView.setHasFixedSize (true);
                        adapter.getItemCount ();
                        adapter.notifyDataSetChanged ();
                    }else{
                        progressDialog.dismiss ();
                        textData.setText ("No Profile Found");
                    }
                }
            }

            @Override
            public void onFailure(retrofit2.Call<SavedPreference> call, Throwable t) {

            }
        });
    }
}
