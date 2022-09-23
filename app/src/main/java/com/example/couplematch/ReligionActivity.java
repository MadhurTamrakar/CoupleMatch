package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReligionActivity extends AppCompatActivity {

    AppCompatButton btn_hindu, btn_muslim, btn_sikh, btn_christian, btn_buddhist, btn_jewish, btn_parsi, btn_atheist, btn_non_religious, btn_other;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_religion);

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
                startActivity (new Intent (ReligionActivity.this, SignupActivity.class));
            }
        });

        btn_hindu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, DoshActivity.class);
                i.putExtra ("Religion","Hindu");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, DoshActivity.class));
            }
        });
        btn_muslim.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Muslim");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_sikh.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Sikh");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_christian.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Christian");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_buddhist.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Buddhist");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_jewish.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Jewish");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_parsi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Parsi");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_atheist.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Atheist");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_non_religious.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Non Religious");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });
        btn_other.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ReligionActivity.this, MaritalStatusActivity.class);
                i.putExtra ("Religion","Other");
                startActivity (i);
//                startActivity (new Intent (ReligionActivity.this, MaritalStatusActivity.class));
            }
        });

    }
}
