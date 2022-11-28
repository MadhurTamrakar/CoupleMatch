package com.example.couplematch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LocationActivity extends AppCompatActivity{

    TextView city, Btn_back;
    AppCompatButton Continue_btn;
    EditText location_ET;
    Button Enable_current_location;
    FusedLocationProviderClient fusedLocationProviderClient;
    String Religion, MaritalStatus, Diet, Height, Education, Professional, Dosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_location);

        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");
        Height = getIntent ().getStringExtra ("Height");
        Education = getIntent ().getStringExtra ("Education");
        Professional = getIntent ().getStringExtra ("Professional");

        Btn_back = findViewById (R.id.Btn_back);
        city = findViewById (R.id.city);
        Continue_btn = findViewById (R.id.Continue_btn);
        location_ET = findViewById (R.id.location_ET);
        Enable_current_location = findViewById (R.id.Enable_current_location);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (LocationActivity.this, ProfessionalActivity.class);
                startActivity (i);
            }
        });

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient (LocationActivity.this);

        Places.initialize (getApplicationContext (), "AIzaSyBOE7zZM3jMmK4vkj1PM1N3u_AP1zVcqD4");

        location_ET.setFocusable (false);
        location_ET.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                List<Place.Field> fieldList = Arrays.asList (Place.Field.ADDRESS);
                Intent intent = new Autocomplete.IntentBuilder (AutocompleteActivityMode.OVERLAY, fieldList)
                    .build (LocationActivity.this);
                startActivityForResult (intent, 200);
            }
        });

        Enable_current_location.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (ActivityCompat.checkSelfPermission (LocationActivity.this,
                    Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                    getCurrentLocation ();
                } else {
                    ActivityCompat.requestPermissions (LocationActivity.this
                        , new String[]{Manifest.permission.ACCESS_FINE_LOCATION
                            , Manifest.permission.ACCESS_COARSE_LOCATION}
                        , 44);
                }
            }
        });

        Continue_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (LocationActivity.this, AboutActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", Diet);
                i.putExtra ("Height", Height);
                i.putExtra ("Education", Education);
                i.putExtra ("Professional", Professional);
                i.putExtra ("Location", location_ET.getText ().toString ());
                i.putExtra ("City", city.getText ().toString ());
                startActivity (i);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult (requestCode, permissions, grantResults);
        if (requestCode == 200 && grantResults.length > 0 && (grantResults[0] + grantResults[1]
            == PackageManager.PERMISSION_GRANTED)) {

            getCurrentLocation ();
        } else {
//            Toast.makeText (getApplicationContext (), "Permission Denied", Toast.LENGTH_SHORT).show ();
        }
    }

    @SuppressLint("MissingPermission")
    private void getCurrentLocation() {
        LocationManager locationManager = (LocationManager) getSystemService (Context.LOCATION_SERVICE);

        if (locationManager.isProviderEnabled (LocationManager.GPS_PROVIDER)
            || locationManager.isProviderEnabled (LocationManager.NETWORK_PROVIDER)) {

            fusedLocationProviderClient.getLastLocation ().addOnCompleteListener (new OnCompleteListener<Location> () {
                @Override
                public void onComplete(@NonNull Task<Location> task) {

                    Location location = task.getResult ();

                    if (location != null) {
                        try {
                            Geocoder geocoder = new Geocoder (LocationActivity.this,
                                Locale.getDefault ());
                            List<Address> addresses = geocoder.getFromLocation (location.getLatitude (),
                                location.getLongitude (), 1);

                            location_ET.setText ((addresses.get (0).getAddressLine (0)));
                            city.setText (addresses.get (0).getLocality ());

                        } catch (IOException e) {
                            e.printStackTrace ();
                        }

                    } else {
                        LocationRequest locationRequest = new LocationRequest ()
                            .setPriority (LocationRequest.PRIORITY_HIGH_ACCURACY)
                            .setInterval (10000)
                            .setFastestInterval (10000)
                            .setNumUpdates (1);

                        LocationCallback locationCallback = new LocationCallback () {

                            public void onLocationResult(@NonNull LocationResult locationResult, @Nullable Intent data) {

                                Place place = Autocomplete.getPlaceFromIntent (data);
                                Location location1 = locationResult.getLastLocation ();
                                location_ET.setText (place.getAddress ());
                            }
                        };
                        fusedLocationProviderClient.requestLocationUpdates (locationRequest,
                            locationCallback, Looper.myLooper ());

                    }
                }
            });
        } else {
            startActivity (new Intent (Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                .setFlags (Intent.FLAG_ACTIVITY_NEW_TASK));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult (requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == RESULT_OK) {
            Place place = Autocomplete.getPlaceFromIntent (data);
            location_ET.setText (place.getAddress ());
        } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
            Status status = Autocomplete.getStatusFromIntent (data);
            Toast.makeText (getApplicationContext (), status.getStatusMessage (), Toast.LENGTH_SHORT).show ();
        }
    }
}
