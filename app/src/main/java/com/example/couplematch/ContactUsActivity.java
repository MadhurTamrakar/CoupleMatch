package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;

public class ContactUsActivity extends AppCompatActivity {

    TextView Btn_back;
    ImageView map;
    ImageButton mail_box;
    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_contact_us);

        Btn_back = findViewById (R.id.Btn_back);
        map = findViewById (R.id.map);
        mail_box = findViewById (R.id.mail_box);


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

        mail_box.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                open();
            }
        });
    }

    private void open() {
        Intent sendIntent = new Intent (Intent.ACTION_SEND);
        sendIntent.setType ("text/path");
        sendIntent.putExtra (Intent.EXTRA_EMAIL, new String[]{"couplematch.in@gmail.com"});
        startActivity (sendIntent);
    }

    private void openMap() {
        String latitude = "30.170406";
        String longitude = "76.867722";
        String uri = "https://www.google.com.tw/maps/place/" + latitude + "," + longitude;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }
}
