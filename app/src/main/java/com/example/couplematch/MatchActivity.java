package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

public class MatchActivity extends AppCompatActivity {

    AppCompatButton view_contact;
    CircularImageView img_partner, img_your;
    String Name, Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_match);

        Name =  getIntent ().getStringExtra ("Name");
        Image = getIntent ().getStringExtra ("Image");

//        view_contact = findViewById (R.id.view_contact);
        img_your =findViewById (R.id.img_your);
        img_partner = findViewById (R.id.img_partner);

        Glide.with (getApplicationContext ())
            .load (Image)
            .placeholder (R.drawable.avatar)
            .into (img_partner);

    }
}
