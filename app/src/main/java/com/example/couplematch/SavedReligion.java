package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedReligion extends AppCompatActivity {

    AppCompatButton btn_hindu, btn_muslim, btn_sikh, btn_christian, btn_buddhist, btn_jewish, btn_parsi, btn_atheist, btn_non_religious, btn_other, any;
    TextView Btn_back;
    String Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_religion);

        Age = getIntent ().getStringExtra ("Age");
        any = findViewById (R.id.any);
        btn_hindu = findViewById (R.id.btn_hindu);
        btn_muslim = findViewById (R.id.btn_muslim);
        btn_sikh = findViewById (R.id.btn_sikh);
        btn_christian = findViewById (R.id.btn_christian);
        btn_buddhist = findViewById (R.id.btn_buddhist);
        btn_jewish = findViewById (R.id.btn_jewish);
        btn_parsi = findViewById (R.id.btn_parsi);
        btn_atheist = findViewById (R.id.btn_atheist);
        btn_non_religious = findViewById (R.id.btn_non_religious);
        btn_other = findViewById (R.id.btn_other);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SavedReligion.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                any.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_other.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_non_religious.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_atheist.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_parsi.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_jewish.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_buddhist.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_christian.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_hindu.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_muslim.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_sikh.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedDosh.class);
                        i.putExtra ("Religion","any");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                        finish ();
                    }
                },  800);
            }
        });

        btn_hindu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_hindu.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedDosh.class);
                        i.putExtra ("Religion","Hindu");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                        finish ();
                    }
                },  800);
            }
        });
        btn_muslim.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_muslim.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Muslim");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_sikh.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_sikh.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Sikh");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_christian.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_christian.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Christian");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_buddhist.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_buddhist.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Buddhist");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_jewish.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_jewish.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Jewish");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_parsi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_parsi.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Parsi");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_atheist.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_atheist.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Atheist");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_non_religious.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_non_religious.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Non Religious");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
        btn_other.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_other.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedReligion.this, SavedMaritalStatus.class);
                        i.putExtra ("Religion","Other");
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });
    }
}
