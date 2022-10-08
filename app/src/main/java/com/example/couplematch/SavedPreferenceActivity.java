package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SavedPreferenceActivity extends AppCompatActivity {

    TextView Btn_back, add_physical, add_smoke, add_drink, add_city, add_income, add_profession, add_education, add_height, add_diet, add_Marital, add_dosh, add_religion, add_age ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_preference);

        Btn_back=findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SavedPreferenceActivity.this, MenuActivity.class));
            }
        });
    }
}
