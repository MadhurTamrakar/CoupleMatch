package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.adapter.Adapter;
import com.example.couplematch.model.Result3;
import com.example.couplematch.response.GetUserData;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    TextView Btn_menu, Btn_notification, tv_total_profile;
    Adapter adapter;
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        sharedPrefManager = new SharedPrefManager (this);

        Btn_notification = findViewById (R.id.Btn_notification);
        Btn_menu = findViewById (R.id.Btn_menu);
        tv_total_profile = findViewById (R.id.tv_total_profile);

        Btn_notification.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, NotificationActivity.class);
                startActivity (i);
            }
        });

        Btn_menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, MenuActivity.class);
                startActivity (i);

            }
        });

        String user_Id = sharedPrefManager.getId ();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", user_Id );
        GetUser (user_Id);

    }

    private void GetUser(String user_Id) {
        final ProgressDialog progressDialog = new ProgressDialog (MainActivity.this);
        progressDialog.setMessage ("Loading....");
        progressDialog.show ();
        Call<GetUserData> GetUser = ApiService.getService ().GetUser (user_Id);
        GetUser.enqueue (new Callback<GetUserData> () {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<GetUserData> call, Response<GetUserData> response) {
                if (response.isSuccessful ()) {
                    if(response.body ().getResult3 () != null) {
                        progressDialog.dismiss ();
                        tv_total_profile.setText (String.valueOf(response.body ().getTotal ()));
                        recyclerView = findViewById (R.id.recyclerView);
                        LayoutManager = new GridLayoutManager (getApplicationContext (), 2);
                        recyclerView.setLayoutManager (LayoutManager);
                        adapter = new Adapter (getApplicationContext (), response.body ().getResult3 ());
                        recyclerView.setAdapter (adapter);
                        recyclerView.setHasFixedSize (true);
                        adapter.getItemCount ();
                        adapter.notifyDataSetChanged ();
                    }else{
                        Toast.makeText (MainActivity.this, "Failed To Load Data", Toast.LENGTH_SHORT).show ();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetUserData> call, Throwable t) {
                Log.d("", "Error Loaded");
            }
        });
    }

    @Override
    public void onBackPressed() {

        if (pressedTime + 2000 > System.currentTimeMillis()) {
            finish();
            super.onBackPressed();
            finishAffinity();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }


}
