package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.couplematch.fragments.OnlineUserFragment;

public class ProfileViewedActivity extends AppCompatActivity {

    TextView Btn_back;
    AppCompatButton onlineUser, sort_listed, sort_listed_by_me, profile_viewer, profile_viewed, request_send, request_received, request_accept_by_user, request_accept_by_me, request_cancel_user, request_cancel_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile_viewed);

        Btn_back = findViewById (R.id.Btn_back);
        onlineUser = findViewById (R.id.onlineUser);
        sort_listed = findViewById (R.id.sort_listed);
        sort_listed_by_me = findViewById (R.id.sort_listed_by_me);
        profile_viewer = findViewById (R.id.profile_viewer);
        profile_viewed = findViewById (R.id.profile_viewed);
        request_send = findViewById (R.id.request_send);
        request_received = findViewById (R.id.request_received);
        request_accept_by_user = findViewById (R.id.request_accept_by_user);
        request_accept_by_me = findViewById (R.id.request_accept_by_me);
        request_cancel_user = findViewById (R.id.request_cancel_user);
        request_cancel_me = findViewById (R.id.request_cancel_me);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ProfileViewedActivity.this, MenuActivity.class));
            }
        });

        onlineUser.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
              getSupportFragmentManager ().beginTransaction ().replace (R.id.container, new OnlineUserFragment ()).commit ();
            }
        });

        request_received.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ProfileViewedActivity.this, RequestReceivedActivity.class));

            }
        });
    }
}
