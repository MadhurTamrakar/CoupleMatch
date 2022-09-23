package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DietActivity extends AppCompatActivity {

    TextView Btn_back;
    AppCompatButton btn_veg, btn_Non_VEG, btn_OCCASIONALLY, btn_EGGITARIAN, Btn_NEVER;
    String Religion, MaritalStatus, Dosh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_diet);

        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");

        btn_veg = findViewById (R.id.btn_veg);
        btn_Non_VEG = findViewById (R.id.btn_Non_VEG);
        btn_OCCASIONALLY = findViewById (R.id.btn_OCCASIONALLY);
        btn_EGGITARIAN = findViewById (R.id.btn_EGGITARIAN);
        Btn_NEVER = findViewById (R.id.Btn_NEVER);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (DietActivity.this, MaritalStatusActivity.class));
            }
        });

        btn_veg.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DietActivity.this, HeightActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", "Veg");
                startActivity (i);
//                startActivity (new Intent (DietActivity.this, HeightActivity.class));
            }
        });

        btn_Non_VEG.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DietActivity.this, HeightActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", "Non Veg");
                startActivity (i);
//                startActivity (new Intent (DietActivity.this, HeightActivity.class));
            }
        });

        btn_OCCASIONALLY.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DietActivity.this, HeightActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", "Occasionally Non Veg");
                startActivity (i);
//                startActivity (new Intent (DietActivity.this, HeightActivity.class));
            }
        });

        btn_EGGITARIAN.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DietActivity.this, HeightActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", "Eggitarian");
                startActivity (i);
//                startActivity (new Intent (DietActivity.this, HeightActivity.class));
            }
        });

        Btn_NEVER.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (DietActivity.this, HeightActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", MaritalStatus);
                i.putExtra ("Diet", "Never use Onion");
                startActivity (i);
//                startActivity (new Intent (DietActivity.this, HeightActivity.class));
            }
        });
    }
}
