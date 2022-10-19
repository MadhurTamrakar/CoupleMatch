package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.adapter.Adapter;
import com.example.couplematch.adapter.RequestAdapter;
import com.example.couplematch.model.RequestData;
import com.example.couplematch.response.RequestReceived;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FriendRequestList extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    TextView Btn_menu, textData;
    SharedPrefManager sharedPrefManager;
    RequestAdapter adapter;
    List<RequestData> requestData;
    ImageView mail_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_friend_request_list);

        sharedPrefManager = new SharedPrefManager (this);

        Btn_menu = findViewById (R.id.Btn_menu);
        textData = findViewById (R.id.textData);
        mail_box = findViewById (R.id.mail_box);
        String ID = sharedPrefManager.getId ();
        RequestReceived (ID);

        Btn_menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (FriendRequestList.this, MenuActivity.class));
                finish ();
            }
        });
    }

    private void RequestReceived(String ID) {
        final ProgressDialog progressDialog = new ProgressDialog (FriendRequestList.this);
        progressDialog.setMessage ("Loading....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<RequestReceived> call = apiService.get_friend_requests (ID);
        call.enqueue (new Callback<RequestReceived> () {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<RequestReceived> call, Response<RequestReceived> response) {
                if (response.isSuccessful ()) {
                    if (response.body ().getRequestData () != null) {
                        progressDialog.dismiss ();
                        mail_box.setVisibility (View.GONE);
                        textData.setVisibility (View.GONE);
                        recyclerView = findViewById (R.id.recyclerView);
                        LayoutManager = new LinearLayoutManager (getApplicationContext ());
                        recyclerView.setLayoutManager (LayoutManager);
                        assert response.body () != null;
                        adapter = new RequestAdapter (getApplicationContext (), response.body ().getRequestData ());
                        recyclerView.setAdapter (adapter);
                        recyclerView.setHasFixedSize (true);
                        adapter.notifyDataSetChanged ();
                        adapter.getItemCount ();
                    }else {
                        progressDialog.dismiss ();
                        Toast.makeText (FriendRequestList.this, "No Request Found", Toast.LENGTH_SHORT).show ();
                    }
                }
            }

            @Override
            public void onFailure(Call<RequestReceived> call, Throwable t) {

            }
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
