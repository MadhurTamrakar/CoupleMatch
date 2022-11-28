package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.bumptech.glide.Glide;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.Block;
import com.example.couplematch.response.PhotoResponse;
import com.example.couplematch.response.RequestSend;
import com.example.couplematch.response.SortList;
import com.example.couplematch.response.profileViewed;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {

    ImageView profileImage;
    TextView btn_MorePhotos,text_name, userCode, text_age, Btn_menu, UserName, text_location, religion_text, marital_status_text, Height_text, Diet_text, Education_text, profession_text, drink_text, live_in_text, smoke_text, income_text, about_text, about_partner_text, Btn_notification;
    String Id, Name, UserCode, Age, Religion, Marital_Status, Height, Diet, Education, Profession, About_Me, Partner_Preference, City , image2, image3, image4, image5, image6;
    AppCompatButton connect_btn, block_btn, skip_btn, shortlist_btn;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile);

        sharedPrefManager = new SharedPrefManager (this);

        Id = getIntent ().getStringExtra ("Id");
        Name = getIntent ().getStringExtra ("Name");
        image2= getIntent ().getStringExtra ("Image2");
        image3= getIntent ().getStringExtra ("Image3");
        image4= getIntent ().getStringExtra ("Image4");
        image5= getIntent ().getStringExtra ("Image5");
        image6= getIntent ().getStringExtra ("Image6");
        UserCode = getIntent ().getStringExtra ("UserCode");
        Religion = getIntent ().getStringExtra ("Religion");
        Marital_Status = getIntent ().getStringExtra ("Marital_Status");
        Height = getIntent ().getStringExtra ("Height");
        Diet = getIntent ().getStringExtra ("Diet");
        Education = getIntent ().getStringExtra ("Education");
        Profession = getIntent ().getStringExtra ("Profession");
        About_Me = getIntent ().getStringExtra ("About_Me");
        Partner_Preference = getIntent ().getStringExtra ("Partner_Preference");
        City = getIntent ().getStringExtra ("City");
        Age = getIntent ().getStringExtra ("Age");

        Btn_menu = findViewById (R.id.Btn_menu);
        btn_MorePhotos = findViewById (R.id.btn_MorePhotos);
        text_location = findViewById (R.id.text_location);
        Btn_notification = findViewById (R.id.Btn_notification);
        profileImage = findViewById (R.id.profileImage);
        text_name = findViewById (R.id.text_name);
        text_age = findViewById (R.id.text_age);
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
        shortlist_btn = findViewById (R.id.shortlist_btn);


        String user_id = sharedPrefManager.getId ();
        String profile_id = Id;
        profileView (user_id, profile_id);


        Btn_notification.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ProfileActivity.this, NotificationActivity.class);
                startActivity (i);
            }
        });

        btn_MorePhotos.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ProfileActivity.this, MorePhotoActivity.class);
                i.putExtra ("Image2", image2);
                i.putExtra ("Image3", image3);
                i.putExtra ("Image4", image4);
                i.putExtra ("Image5", image5);
                i.putExtra ("Image6", image6);
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
//                Toast.makeText(getBaseContext(), "Profile Added To Shortlist" , Toast.LENGTH_SHORT ).show();
//                Intent intent = new Intent (ProfileActivity.this, MainActivity.class);
//                startActivity (intent);
//                finish ();
            }
        });

        skip_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ProfileActivity.this, MainActivity.class);
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
//                Intent intent = new Intent (ProfileActivity.this, MainActivity.class);
//                startActivity (intent);
//                finish ();
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
                Intent i = new Intent (ProfileActivity.this, MenuActivity.class);
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
        live_in_text.setText (City);
        text_location.setText (City);
        text_age.setText (Age);
    }

    private void profileView(String user_id, String profile_id) {
        UserService apiService = ApiService.getService ();
        Call<profileViewed> call = apiService.profile_view (user_id, profile_id);
        call.enqueue (new Callback<profileViewed> () {
            @Override
            public void onResponse(Call<profileViewed> call, Response<profileViewed> response) {
                if (response.isSuccessful ()) {

                }
            }

            @Override
            public void onFailure(Call<profileViewed> call, Throwable t) {

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
                    startActivity (new Intent (ProfileActivity.this, MainActivity.class));
                } else {
                    Toast.makeText (getBaseContext (), "Error", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<SortList> call, Throwable t) {

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
                    startActivity (new Intent (ProfileActivity.this, MainActivity.class));
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
}
