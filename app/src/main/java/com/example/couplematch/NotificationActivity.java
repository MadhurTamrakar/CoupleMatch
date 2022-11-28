package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.adapter.AcceptedMeAdapter;
import com.example.couplematch.adapter.Adapter;
import com.example.couplematch.adapter.Notification_Adapter;
import com.example.couplematch.response.GetUserData;
import com.example.couplematch.response.NotificationData;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NotificationActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    Notification_Adapter adapter;
    TextView Btn_back, notification_text;
    ImageView notification_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_notification);

        Btn_back = findViewById (R.id.Btn_back);
        notification_text = findViewById (R.id.notification_text);
        notification_icon = findViewById (R.id.notification_icon);

        sharedPrefManager = new SharedPrefManager (this);
        String user_Id = sharedPrefManager.getId ();
        notification(user_Id);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (NotificationActivity.this, MainActivity.class);
                startActivity (i);
            }
        });
    }

    private void notification(String user_Id) {
        Call<NotificationData> Notification = ApiService.getService ().Notification (user_Id);
        Notification.enqueue (new Callback<NotificationData> () {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<NotificationData> call, Response<NotificationData> response) {
                if (response.isSuccessful ()) {
                    assert response.body () != null;
                    if(response.body ().getAllNotification () != null) {
                        notification_icon.setVisibility (View.GONE);
                        notification_text.setVisibility (View.GONE);
                        recyclerView = findViewById (R.id.recyclerView);
                        LayoutManager = new LinearLayoutManager (getApplicationContext ());
                        recyclerView.setLayoutManager (LayoutManager);
                        adapter = new Notification_Adapter (getApplicationContext (), response.body ().getAllNotification ());
                        recyclerView.setAdapter (adapter);
                        recyclerView.setHasFixedSize (true);
                        adapter.getItemCount ();
                        adapter.notifyDataSetChanged ();
                    }else{
                        Toast.makeText (NotificationActivity.this, "Failed To Load Data", Toast.LENGTH_SHORT).show ();
                    }
                }
            }

            @Override
            public void onFailure(Call<NotificationData> call, Throwable t) {
                Log.d("", "Error Loaded");
            }
        });
    }
}
