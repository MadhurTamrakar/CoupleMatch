package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedAge extends AppCompatActivity {

    AppCompatButton btn_21_25, btn_26_30, btn_31_35, btn_36_40, any;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_age);

        any = findViewById (R.id.any);
        btn_21_25 = findViewById (R.id.btn_21_25);
        btn_26_30 = findViewById (R.id.btn_26_30);
        btn_31_35 = findViewById (R.id.btn_31_35);
        btn_36_40 = findViewById (R.id.btn_36_40);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedAge.this, SavedPreferenceActivity.class));
            }
        });

        btn_21_25.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_21_25.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedAge.this, SavedReligion.class);
                        i.putExtra ("Age","21-25");
                        startActivity (i);
                        finish ();
                    }
                },  800);

            }
        });

        btn_26_30.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_26_30.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedAge.this, SavedReligion.class);
                        i.putExtra ("Age","26-30");
                        startActivity (i);
                    }
                },  800);

            }
        });

        btn_31_35.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_31_35.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedAge.this, SavedReligion.class);
                        i.putExtra ("Age","31-35");
                        startActivity (i);
                    }
                },  800);

            }
        });

        btn_36_40.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                btn_36_40.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedAge.this, SavedReligion.class);
                        i.putExtra ("Age","36-40");
                        startActivity (i);
                    }
                },  800);

            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                any.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_36_40.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_31_35.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_26_30.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_21_25.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedAge.this, SavedReligion.class);
                        i.putExtra ("Age","any");
                        startActivity (i);
                    }
                },  800);

            }
        });

    }
}
