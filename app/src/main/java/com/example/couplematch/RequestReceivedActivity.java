package com.example.couplematch;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.CancelRequest;
import com.example.couplematch.response.ConfirmRequest;
import com.example.couplematch.response.RequestReceived;
import com.example.couplematch.response.ViewProfile;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.mikhaellopez.circularimageview.CircularImageView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestReceivedActivity extends AppCompatActivity {

    AppCompatButton accept_btn, cancel_btn, view_profile_btn;
    String Name, Image, Request_id, User_id;
    CircularImageView circularImageView;
    TextView tv_name;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_request_received);

        sharedPrefManager = new SharedPrefManager (this);

        Name =  getIntent ().getStringExtra ("Name");
        Image = getIntent ().getStringExtra ("Image");

        tv_name = findViewById (R.id.tv_name);
        circularImageView = findViewById ( R.id.circularImageView);
        cancel_btn = findViewById (R.id.cancel_btn);
        accept_btn = findViewById (R.id.accept_btn);
        view_profile_btn = findViewById (R.id.view_profile_btn);

        accept_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent (RequestReceivedActivity.this, MatchActivity.class);
//                Toast.makeText (RequestReceivedActivity.this, "Request Accepted", Toast.LENGTH_SHORT).show ();
//                startActivity (i);
                User_id = sharedPrefManager.getId ();
                Request_id = getIntent ().getStringExtra ("Request_id");
                AcceptRequest(User_id, Request_id);

            }
        });
        cancel_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent (RequestReceivedActivity.this, MenuActivity.class);
//                Toast.makeText (RequestReceivedActivity.this, "Request Cancel", Toast.LENGTH_LONG).show ();
//                startActivity (i);
                User_id = sharedPrefManager.getId ();
                Request_id = getIntent ().getStringExtra ("Request_id");
                Cancel_Request(User_id, Request_id);
            }
        });
        view_profile_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Request_id = getIntent ().getStringExtra ("Request_id");
                viewprofile(Request_id);
            }
        });

        tv_name.setText (Name);

        Glide.with (getApplicationContext ())
            .load (Image)
            .placeholder (R.drawable.avatar)
            .into (circularImageView);
    }

    private void viewprofile(String Request_id) {
        final ProgressDialog progressDialog = new ProgressDialog (RequestReceivedActivity.this);
        progressDialog.setMessage ("Please Wait....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<ViewProfile> call = apiService.requested_profile (Request_id);
        call.enqueue (new Callback<ViewProfile> () {
            @Override
            public void onResponse(Call<ViewProfile> call, Response<ViewProfile> response) {
                if (response.isSuccessful ()){
                    progressDialog.dismiss ();
                    Intent i = new Intent (RequestReceivedActivity.this, Person_View.class);
                    i.putExtra ("Name", response.body ().getData ().get (0).getName ());
                    i.putExtra ("Age", response.body ().getData ().get (0).getAge ());
                    i.putExtra ("City", response.body ().getData ().get (0).getCity ());
                    i.putExtra ("Image", response.body ().getData ().get (0).getProfile1 ());
                    i.putExtra ("UserCode", response.body ().getData ().get (0).getUserCode ());
                    i.putExtra ("Mobile", response.body ().getData ().get (0).getMobile ());
                    i.putExtra ("Dob", response.body ().getData ().get (0).getDob ());
                    i.putExtra ("Email", response.body ().getData ().get (0).getEmail ());
                    i.putExtra ("Religion", response.body ().getData ().get (0).getReligion ());
                    i.putExtra ("Dosh", response.body ().getData ().get (0).getDosh ());
                    i.putExtra ("MaritalStatus", response.body ().getData ().get (0).getMaritalStatus ());
                    i.putExtra ("Height", response.body ().getData ().get (0).getHeight ());
                    i.putExtra ("Diet", response.body ().getData ().get (0).getDiet ());
                    i.putExtra ("Education", response.body ().getData ().get (0).getEducation ());
                    i.putExtra ("Profession", response.body ().getData ().get (0).getProfession ());
                    i.putExtra ("Income", response.body ().getData ().get (0).getIncome ());
                    i.putExtra ("Smoke", response.body ().getData ().get (0).getSmoke ());
                    i.putExtra ("Drink", response.body ().getData ().get (0).getDrink ());
                    i.putExtra ("Physical Status", response.body ().getData ().get (0).getPhysicalStatus ());

                    startActivity (i);

                }else{
                    Toast.makeText (RequestReceivedActivity.this, "Error In Loading Profile", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<ViewProfile> call, Throwable t) {

            }
        });
    }

    private void Cancel_Request(String User_id, String Request_id) {
        UserService apiService = ApiService.getService ();
        Call<CancelRequest> call = apiService.cancel_request (User_id, Request_id);
        call.enqueue (new Callback<CancelRequest> () {
            @Override
            public void onResponse(Call<CancelRequest> call, Response<CancelRequest> response) {
                if (response.isSuccessful ()){
                    Toast.makeText (RequestReceivedActivity.this, "Request Rejected", Toast.LENGTH_SHORT).show ();
                    cancel_btn.setTextColor (Color.WHITE);
                    cancel_btn.setBackgroundColor (Color.RED);
                    startActivity (new Intent (RequestReceivedActivity.this, ProfileViewedActivity.class));
                    finish ();
                }
            }

            @Override
            public void onFailure(Call<CancelRequest> call, Throwable t) {

            }
        });
    }

    private void AcceptRequest(String User_id, String Request_id) {
        UserService apiService = ApiService.getService ();
        Call<ConfirmRequest> call = apiService.confirm_request (User_id, Request_id);
        call.enqueue (new Callback<ConfirmRequest> () {
            @Override
            public void onResponse(Call<ConfirmRequest> call, Response<ConfirmRequest> response) {
                if (response.isSuccessful ()){
                    Toast.makeText (RequestReceivedActivity.this, "Request Accepted", Toast.LENGTH_SHORT).show ();
                    accept_btn.setText("Done");
                    accept_btn.setTextColor (Color.WHITE);

                    Intent i = new Intent (RequestReceivedActivity.this, MatchActivity.class);
                    i.putExtra ("Image", Image);
                    startActivity (i);
                    finish ();
//                    startActivity (new Intent (RequestReceivedActivity.this, MatchActivity.class));
//                    finish ();
                }
            }

            @Override
            public void onFailure(Call<ConfirmRequest> call, Throwable t) {

            }
        });
    }
}
