package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class ContactUsActivity extends AppCompatActivity {

    TextView Btn_back;
    ImageView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_contact_us);

        Btn_back = findViewById (R.id.Btn_back);
        map = findViewById (R.id.map);


        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ContactUsActivity.this, MenuActivity.class));
            }
        });

        map.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });
    }

    private void openMap() {
        String uri = String.format(Locale.ENGLISH, "geo:0,0?q=Committee Chowk, Shahbad, Haryana", 30.170406, 76.867722);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage ("com.google.android.apps.maps");
        startActivity(intent);
    }
}
