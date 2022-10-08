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
import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {

    ImageView profileImage;
    TextView text_name, userCode, text_age, Btn_menu, UserName, text_location, religion_text, marital_status_text, Height_text, Diet_text, Education_text, profession_text, drink_text, live_in_text, smoke_text, income_text, about_text, about_partner_text, Btn_notification;
    String Name, UserCode, Age, Religion, Marital_Status, Height, Diet, Education, Profession, About_Me, Partner_Preference, City;
    AppCompatButton connect_btn, block_btn, skip_btn, shortlist_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile);

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
        City = getIntent ().getStringExtra ("City");
        Age = getIntent ().getStringExtra ("Age");

        Btn_menu = findViewById (R.id.Btn_menu);
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
        shortlist_btn =  findViewById (R.id.shortlist_btn);

        Btn_notification.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText (ProfileActivity.this, "No Notification", Toast.LENGTH_SHORT).show ();
            }
        });

        shortlist_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Profile Added To Shortlist" , Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent (ProfileActivity.this, MainActivity.class);
                startActivity (intent);
                finish ();
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
                Toast.makeText(getBaseContext(), "You Blocked This Profile" , Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent (ProfileActivity.this, MainActivity.class);
                startActivity (intent);
                finish ();
            }
        });

        connect_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Request Is Send" , Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent (ProfileActivity.this, MainActivity.class);
                startActivity (intent);
                finish ();
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
        about_partner_text.setText (Partner_Preference);
        text_location.setText (City);
        text_age.setText (Age);
    }
}
