package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MorePhotoActivity extends AppCompatActivity {

    ImageView iv6,iv5, iv4, iv3, iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_more_photo);

        iv2 = findViewById (R.id.iv2);
        iv3 = findViewById (R.id.iv3);
        iv4 = findViewById (R.id.iv4);
        iv5 = findViewById (R.id.iv5);
        iv6 = findViewById (R.id.iv6);

        Glide.with (getApplicationContext ())
            .load (getIntent ().getStringExtra ("Image2"))
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (iv2);

        Glide.with (getApplicationContext ())
            .load (getIntent ().getStringExtra ("Image3"))
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (iv3);

        Glide.with (getApplicationContext ())
            .load (getIntent ().getStringExtra ("Image4"))
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (iv4);

        Glide.with (getApplicationContext ())
            .load (getIntent ().getStringExtra ("Image5"))
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (iv5);

        Glide.with (getApplicationContext ())
            .load (getIntent ().getStringExtra ("Image6"))
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (iv6);

    }
}
