package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.response.UniqueUserData;
import com.example.couplematch.service.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchResultActivity extends AppCompatActivity {

    TextView Btn_back;
    EditText ed_id;
    AppCompatButton search_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_search_result);

        Btn_back = findViewById (R.id.Btn_back);
        ed_id = findViewById (R.id.ed_id);
        search_btn = findViewById (R.id.search_btn);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SearchResultActivity.this, MenuActivity.class));
            }
        });
        search_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String user_code = ed_id.getText ().toString ();
                GetUser (user_code);
            }
        });

    }

    private void GetUser(String user_code) {
        Call<UniqueUserData> call = ApiService.getService ().GetUniqueUserData (user_code);
        call.enqueue (new Callback<UniqueUserData> () {
            @Override
            public void onResponse(Call<UniqueUserData> call, Response<UniqueUserData> response) {
                if (response.isSuccessful ()){
                    Intent i = new Intent (SearchResultActivity.this, UniqueProfileID.class);
                    i.putExtra ("Image", response.body ().getData ().getProfile1 ());
                    i.putExtra ("Name", response.body ().getData ().getName ());
                    i.putExtra ("UserCode",  response.body ().getData ().getUserCode ());
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
                } else{
                    Toast.makeText (SearchResultActivity.this, "No Data Found", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<UniqueUserData> call, Throwable t) {

            }
        });
    }
}
