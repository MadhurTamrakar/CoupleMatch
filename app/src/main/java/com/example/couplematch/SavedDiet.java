package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedDiet extends AppCompatActivity {

    TextView Btn_back;
    AppCompatButton any, btn_veg, btn_Non_VEG, btn_OCCASIONALLY, btn_EGGITARIAN, Btn_NEVER;
    String Age, Religion, Dosh, MaritalStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_diet);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");

        any = findViewById (R.id.any);
        btn_veg = findViewById (R.id.btn_veg);
        btn_Non_VEG = findViewById (R.id.btn_Non_VEG);
        btn_OCCASIONALLY = findViewById (R.id.btn_OCCASIONALLY);
        btn_EGGITARIAN = findViewById (R.id.btn_EGGITARIAN);
        Btn_NEVER = findViewById (R.id.Btn_NEVER);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedDiet.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                any.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_veg.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_Non_VEG.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_OCCASIONALLY.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_EGGITARIAN.setBackgroundResource (R.drawable.edit_profile_btn);
                Btn_NEVER.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDiet.this, SavedHeight.class);
                        i.putExtra ("Diet", "any");
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedDiet.this, SavedHeight.class));
            }
        });

        btn_veg.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_veg.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDiet.this, SavedHeight.class);
                        i.putExtra ("Diet", "Veg");
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedDiet.this, SavedHeight.class));
            }
        });

        btn_Non_VEG.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_Non_VEG.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDiet.this, SavedHeight.class);
                        i.putExtra ("Diet", "Non Veg");
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedDiet.this, SavedHeight.class));
            }
        });

        btn_OCCASIONALLY.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_OCCASIONALLY.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDiet.this, SavedHeight.class);
                        i.putExtra ("Diet", "Occasionally Non Veg");
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedDiet.this, SavedHeight.class));
            }
        });

        btn_EGGITARIAN.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_EGGITARIAN.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDiet.this, SavedHeight.class);
                        i.putExtra ("Diet", "Eggitarian");
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedDiet.this, SavedHeight.class));
            }
        });

        Btn_NEVER.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Btn_NEVER.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedDiet.this, SavedHeight.class);
                        i.putExtra ("Diet", "Never use Onion");
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedDiet.this, SavedHeight.class));
            }
        });
    }
}
