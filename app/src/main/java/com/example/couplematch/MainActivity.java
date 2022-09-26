package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.couplematch.adapter.Adapter;
import com.example.couplematch.model.UserData;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    List<UserData> userDataList;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    TextView Btn_menu;

//    int []arr = {R.drawable.download,R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,
//        R.drawable.download5,R.drawable.download6,R.drawable.download7,R.drawable.download8,R.drawable.download9,R.drawable.download10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        sharedPrefManager = new SharedPrefManager (this);
        Btn_menu = findViewById (R.id.Btn_menu);
        Btn_menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MainActivity.this,MenuActivity.class));
            }
        });

        userDataList = new ArrayList<> ();
        recyclerView = findViewById (R.id.recyclerView);
        String user_Id = sharedPrefManager.getId ();
        GetUser(user_Id);

//        recyclerView.setHasFixedSize (true);
//        adapter = new Adapter (arr);
//        recyclerView.setAdapter (adapter);

    }

    private void GetUser(String user_Id) {
        Call<List<UserData>> user = ApiService.getService ().GetUser (user_Id);
        user.enqueue (new Callback<List<UserData>> () {
            @Override
            public void onResponse(Call<List<UserData>> call, Response<List<UserData>> response) {
                List<UserData> userDataList = response.body ();

                for(UserData userData : userDataList) {
                    userDataList.add (userData);
                }
//                String position = null;
                setAdapter(userDataList);
            }

            @Override
            public void onFailure(Call<List<UserData>> call, Throwable t) {

            }
        });
    }

    private void setAdapter(List<UserData> userDataList) {
        LayoutManager = new GridLayoutManager (this,2);
        recyclerView.setLayoutManager (LayoutManager);
        Adapter adapter = new Adapter (this,userDataList);
        recyclerView.setAdapter (adapter);
    }
}
