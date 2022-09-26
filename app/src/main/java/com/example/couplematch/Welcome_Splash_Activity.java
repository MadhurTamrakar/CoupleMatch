package com.example.couplematch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.couplematch.sharedPreference.SharedPrefManager;

public class Welcome_Splash_Activity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    TextView tv_name, tv_id;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_welcome_splash);

        sharedPrefManager = new SharedPrefManager (this);
        tv_name = findViewById (R.id.tv_name);
        tv_id =  findViewById (R.id.tv_id);

        String Name =sharedPrefManager.getString ();
        String id = sharedPrefManager.getUserCode ();
        tv_name.setText ("Welcome " +Name);
        tv_id.setText ("Your CoupleMatch ID is " + id);

        new Handler ().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Welcome_Splash_Activity.this, MainActivity.class);
                Welcome_Splash_Activity.this.startActivity(mainIntent);
                Welcome_Splash_Activity.this.finish();
            }
        }, 3000);

    }
}
