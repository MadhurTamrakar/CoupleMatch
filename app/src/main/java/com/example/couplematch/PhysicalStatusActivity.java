package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PhysicalStatusActivity extends AppCompatActivity {

    AppCompatButton btn_Physically, btn_Mentally, btn_Disabled, btn_fit, btn_Healthy;
    String Income, Drink, Smoke;
    TextView Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_physical_status);

        Income = getIntent ().getStringExtra ("Income");
        Drink = getIntent ().getStringExtra ("Drink");
        Smoke = getIntent ().getStringExtra ("Smoke");

        Btn_back = findViewById (R.id.Btn_back);
        btn_Physically = findViewById (R.id.btn_Physically);
        btn_Mentally = findViewById (R.id.btn_Mentally);
        btn_Disabled = findViewById (R.id.btn_Disabled);
        btn_fit = findViewById (R.id.btn_fit);
        btn_Healthy = findViewById (R.id.btn_Healthy);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (PhysicalStatusActivity.this, SmokeActivity.class));
            }
        });

        btn_Physically.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (PhysicalStatusActivity.this, FatherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus","Physically Challenged");
                startActivity (i);
                finish ();
            }
        });
        btn_Mentally.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (PhysicalStatusActivity.this, FatherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus","Mentally Challenged");
                startActivity (i);
                finish ();
            }
        });
        btn_Disabled.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (PhysicalStatusActivity.this, FatherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus","Disable");
                startActivity (i);
                finish ();
            }
        });
        btn_fit.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (PhysicalStatusActivity.this, FatherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus","Physically Fit");
                startActivity (i);
                finish ();
            }
        });
        btn_Healthy.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (PhysicalStatusActivity.this, FatherOccupation.class);
                i.putExtra ("Income", Income);
                i.putExtra ("Drink", Drink);
                i.putExtra ("Smoke",Smoke);
                i.putExtra ("PhysicalStatus","Healthy");
                startActivity (i);
                finish ();
            }
        });
    }
}
