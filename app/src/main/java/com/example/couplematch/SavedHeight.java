package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedHeight extends AppCompatActivity {

    AppCompatButton any, btn_height4_1,  btn_height4_2, btn_height4_3,btn_height4_4,btn_height4_5,btn_height4_6,btn_height4_7,btn_height4_8,btn_height4_9,btn_height4_10,btn_height4_11,
        btn_height5,btn_height5_1,btn_height5_2,btn_height5_3,btn_height5_4,btn_height5_5,btn_height5_6,btn_height5_7,btn_height5_8,btn_height5_9,btn_height5_10,btn_height5_11,
        btn_height6,btn_height6_1,btn_height6_2,btn_height6_3,btn_height6_4,btn_height6_5,btn_height6_6,btn_height6_7,btn_height6_8,btn_height6_9,btn_height6_10,btn_height6_11,
        btn_height7;
    TextView Btn_back;
    String Age, Religion, Dosh, MaritalStatus, Diet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_height);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");
        MaritalStatus = getIntent ().getStringExtra ("MaritalStatus");
        Diet = getIntent ().getStringExtra ("Diet");

        any = findViewById (R.id.any);
        btn_height4_1 = findViewById (R.id.btn_height4_1); btn_height4_2 = findViewById (R.id.btn_height4_2);
        btn_height4_3 = findViewById (R.id.btn_height4_3); btn_height4_4 = findViewById (R.id.btn_height4_4);
        btn_height4_5 = findViewById (R.id.btn_height4_5); btn_height4_6 = findViewById (R.id.btn_height4_6);
        btn_height4_7 = findViewById (R.id.btn_height4_7); btn_height4_8 = findViewById (R.id.btn_height4_8);
        btn_height4_9 = findViewById (R.id.btn_height4_9); btn_height4_10 = findViewById (R.id.btn_height4_10);
        btn_height4_11 = findViewById (R.id.btn_height4_11); btn_height5 = findViewById (R.id.btn_height5);
        btn_height5_1 = findViewById (R.id.btn_height5_1); btn_height5_2 = findViewById (R.id.btn_height5_2);
        btn_height5_3 = findViewById (R.id.btn_height5_3); btn_height5_4 = findViewById (R.id.btn_height5_4);
        btn_height5_5 = findViewById (R.id.btn_height5_5); btn_height5_6 = findViewById (R.id.btn_height5_6);
        btn_height5_7 = findViewById (R.id.btn_height5_7); btn_height5_8 = findViewById (R.id.btn_height5_8);
        btn_height5_9 = findViewById (R.id.btn_height5_9); btn_height5_10 = findViewById (R.id.btn_height5_10);
        btn_height5_11 = findViewById (R.id.btn_height5_11); btn_height6 = findViewById (R.id.btn_height6);
        btn_height6_1 = findViewById (R.id.btn_height6_1); btn_height6_2 = findViewById (R.id.btn_height6_2);
        btn_height6_3 = findViewById (R.id.btn_height6_3); btn_height6_4 = findViewById (R.id.btn_height6_4);
        btn_height6_5 = findViewById (R.id.btn_height6_5); btn_height6_6 = findViewById (R.id.btn_height6_6);
        btn_height6_7 = findViewById (R.id.btn_height6_7); btn_height6_8 = findViewById (R.id.btn_height6_8);
        btn_height6_9 = findViewById (R.id.btn_height6_9); btn_height6_10 = findViewById (R.id.btn_height6_10);
        btn_height6_11 = findViewById (R.id.btn_height6_11); btn_height7 = findViewById (R.id.btn_height7);

        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedHeight.this, SavedPreferenceActivity.class));
            }
        });
        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                any.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height4_1.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height4_2.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height4_3.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height4_4.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height4_5.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height4_6.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height4_7.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height4_8.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height4_9.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height4_10.setBackgroundResource (R.drawable.edit_profile_btn); btn_height4_11.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height5.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height5_1.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height5_2.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height5_3.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height5_4.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height5_5.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height5_6.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height5_7.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height5_8.setBackgroundResource (R.drawable.edit_profile_btn);  btn_height5_9.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height5_10.setBackgroundResource (R.drawable.edit_profile_btn); btn_height5_11.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height6.setBackgroundResource (R.drawable.edit_profile_btn); btn_height6_1.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height6_2.setBackgroundResource (R.drawable.edit_profile_btn); btn_height6_3.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height6_4.setBackgroundResource (R.drawable.edit_profile_btn); btn_height6_5.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height6_6.setBackgroundResource (R.drawable.edit_profile_btn); btn_height6_7.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height6_8.setBackgroundResource (R.drawable.edit_profile_btn); btn_height6_9.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height6_10.setBackgroundResource (R.drawable.edit_profile_btn); btn_height6_11.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_height7.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Height", "any");
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_1.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.1");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_2.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.2");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_3.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.3");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_4.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.4");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_5.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.5");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);

//                startActivity (new Intent (SavedHeight.this, SavedEducation.class));
            }
        });
        btn_height4_6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_6.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.6");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_7.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.7");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_8.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.8");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_9.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.9");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_10.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.10");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height4_11.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height4_11.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "4.11");
                        i.putExtra ("Age", Age);
                        startActivity (i);;
                    }
                },  800);
            }
        });
        btn_height5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_1.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.1");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_2.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.2");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_3.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.3");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_4.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.4");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_5.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.5");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_6.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.6");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_7.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.7");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_8.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.8");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_9.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.9");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_10.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.10");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height5_11.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height5_11.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "5.11");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });btn_height6_1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_1.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.1");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_2.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.2");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_3.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.3");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_4.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.4");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_5.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.5");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_6.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.6");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_7.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.7");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_8.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.8");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_height6_9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_9.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.9");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });btn_height6_10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_10.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.10");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });btn_height6_11.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height6_11.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "6.11");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });btn_height7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_height7.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedHeight.this, SavedEducation.class);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("MaritalStatus", MaritalStatus);
                        i.putExtra ("Diet", Diet);
                        i.putExtra ("Height", "7");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
    }
}
