package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.Block;
import com.example.couplematch.response.RequestSend;
import com.example.couplematch.response.SortList;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UniqueProfileID extends AppCompatActivity {

    ImageView profileImage;
    TextView text_name, userCode, Btn_menu, UserName, text_age, text_location, religion_text, marital_status_text, Height_text, Diet_text, Education_text, profession_text, drink_text, live_in_text, smoke_text, income_text, about_text, about_partner_text, Btn_notification;
    String Id, Name, UserCode, Religion, Marital_Status, Height, Diet, Education, Profession, About_Me, Partner_Preference, City, Age;
    AppCompatButton connect_btn, block_btn, skip_btn, shortlist_btn;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_unique_profile_id);

        sharedPrefManager = new SharedPrefManager (this);

        Name = getIntent ().getStringExtra ("Name");
        UserCode = getIntent ().getStringExtra ("UserCode");
        Religion = getIntent ().getStringExtra ("Religion");
        Marital_Status = getIntent ().getStringExtra ("Marital_Status");
        Height = getIntent ().getStringExtra ("Height");
        Diet = getIntent ().getStringExtra ("Diet");
        Education = getIntent ().getStringExtra ("Education");
        Profession = getIntent ().getStringExtra ("Profession");
        About_Me = getIntent ().getStringExtra ("About_Me");
        Partner_Preference = getIntent ().getStringExtra ("Partner_Preference");
        City =  getIntent ().getStringExtra ("City");
        Age = getIntent ().getStringExtra ("Age");

        Btn_menu = findViewById (R.id.Btn_menu);
        text_location = findViewById (R.id.text_location);
        text_age = findViewById (R.id.text_age);
        Btn_notification = findViewById (R.id.Btn_notification);
        profileImage = findViewById (R.id.profileImage);
        text_name = findViewById (R.id.text_name);
        UserName = findViewById (R.id.UserName);
        userCode = findViewById (R.id.userCode);
        religion_text = findViewById (R.id.religion_text);
        marital_status_text = findViewById (R.id.marital_status_text);
        Height_text = findViewById (R.id.Height_text);
        Diet_text = findViewById (R.id.Diet_text);
        Education_text = findViewById (R.id.Education_text);
        profession_text = findViewById (R.id.profession_text);
        drink_text = findViewById (R.id.drink_text);
        live_in_text = findViewById (R.id.live_in_text);
        smoke_text = findViewById (R.id.smoke_text);
        income_text = findViewById (R.id.income_text);
        about_text = findViewById (R.id.about_text);
        about_partner_text = findViewById (R.id.about_partner_text);
        connect_btn = findViewById (R.id.connect_btn);
        block_btn = findViewById (R.id.block_btn);
        skip_btn = findViewById (R.id.skip_btn);
        shortlist_btn =  findViewById (R.id.shortlist_btn);

        Btn_notification.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (UniqueProfileID.this, NotificationActivity.class);
                startActivity (i);
            }
        });

        shortlist_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String user_id = sharedPrefManager.getId ();
                String sort_id = Id;
                SortList (user_id, sort_id);
                shortlist_btn.setText ("Shortlisted");
            }
        });

        skip_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (UniqueProfileID.this, MainActivity.class);
                startActivity (intent);
                finish ();
            }
        });

        block_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String user_id = sharedPrefManager.getId ();
                String block_id = Id;
                Block (user_id, block_id);
                block_btn.setText ("Blocked");
            }
        });

        connect_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String user_id = sharedPrefManager.getId ();
                String request_id = Id;
                Request_Send (user_id, request_id);
                connect_btn.setText ("Cancel Request");
            }
        });

        Btn_menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (UniqueProfileID.this, MenuActivity.class);
                startActivity (i);
                finish ();
            }
        });

        Glide.with (getApplicationContext ())
            .load (getIntent ().getStringExtra ("Image"))
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (profileImage);

        userCode.setText (UserCode);
        UserName.setText (Name);
        text_name.setText (Name);
        religion_text.setText (Religion);
        marital_status_text.setText (Marital_Status);
        Height_text.setText (Height);
        Diet_text.setText (Diet);
        Education_text.setText (Education);
        profession_text.setText (Profession);
        about_text.setText (About_Me);
        about_partner_text.setText (Partner_Preference);
        text_age.setText (Age);
        text_location.setText (City);
    }

    private void Request_Send(String user_id, String request_id) {
        UserService apiService = ApiService.getService ();
        Call<RequestSend> call = apiService.send_friend_request (user_id, request_id);
        call.enqueue (new Callback<RequestSend> () {
            @Override
            public void onResponse(Call<RequestSend> call, Response<RequestSend> response) {
                if (response.isSuccessful ()) {
//                    Toast.makeText (getBaseContext (), "Request Send", Toast.LENGTH_SHORT).show ();
                } else {
                    Toast.makeText (getBaseContext (), "Error", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<RequestSend> call, Throwable t) {

            }
        });
    }

    private void Block(String user_id, String block_id) {
        UserService apiService = ApiService.getService ();
        Call<Block> call = apiService.block_user (user_id, block_id);
        call.enqueue (new Callback<Block> () {
            @Override
            public void onResponse(Call<Block> call, Response<Block> response) {
                if (response.isSuccessful ()) {
                    Toast.makeText (getBaseContext (), "You Blocked This Profile", Toast.LENGTH_SHORT).show ();
                    startActivity (new Intent (UniqueProfileID.this, MainActivity.class));
                } else {
                    Toast.makeText (getBaseContext (), "Error", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<Block> call, Throwable t) {
                Toast.makeText (getBaseContext (), "Error", Toast.LENGTH_SHORT).show ();
            }
        });
    }

    private void SortList(String user_id, String sort_id) {
        UserService apiService = ApiService.getService ();
        Call<SortList> call = apiService.sort_list (user_id, sort_id);
        call.enqueue (new Callback<SortList> () {
            @Override
            public void onResponse(Call<SortList> call, Response<SortList> response) {
                if (response.isSuccessful ()) {
                    Toast.makeText (getBaseContext (), response.body ().getMessage (), Toast.LENGTH_SHORT).show ();
                    startActivity (new Intent (UniqueProfileID.this, MainActivity.class));
                } else {
                    Toast.makeText (getBaseContext (), "Error", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<SortList> call, Throwable t) {

            }
        });
    }
}
