package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.couplematch.fragments.AcceptedByMeFragment;
import com.example.couplematch.fragments.AcceptedByUserFragment;
import com.example.couplematch.fragments.CancelByMeFragment;
import com.example.couplematch.fragments.CancelByUserFragment;
import com.example.couplematch.fragments.OnlineUserFragment;
import com.example.couplematch.fragments.ProfileViewedByMe;
import com.example.couplematch.fragments.ProfileViewer;
import com.example.couplematch.fragments.RequestByMe;
import com.example.couplematch.fragments.RequestSendMeFragment;
import com.example.couplematch.fragments.SortListed_by_me;
import com.example.couplematch.fragments.SortListed_me;
import com.example.couplematch.response.RequestReceived;
import com.example.couplematch.sharedPreference.SharedPrefManager;

public class ProfileViewedActivity extends AppCompatActivity {

    TextView Btn_back, textData;
    AppCompatButton onlineUser, sort_listed, sort_listed_by_me, profile_viewer, profile_viewed, request_send, request_received, request_accept_by_user, request_accept_by_me, request_cancel_user, request_cancel_me;
    ConstraintLayout constraint_layout;
    ImageView mail_box;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile_viewed);

        sharedPrefManager = new SharedPrefManager (this);

        textData = findViewById (R.id.textData);
        mail_box = findViewById (R.id.mail_box);
        constraint_layout = findViewById (R.id.constraint_layout);
        Btn_back = findViewById (R.id.Btn_back);
//        onlineUser = findViewById (R.id.onlineUser);
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
        sort_listed.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                SortListed_me sortListed_me = new SortListed_me ();
                loadFragments (sortListed_me);
                sort_listed.setTextColor (Color.parseColor("#2196F3"));

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);

            }
        });
        sort_listed_by_me.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                SortListed_by_me sortListed_by_me = new SortListed_by_me ();
                loadFragments (sortListed_by_me);
                sort_listed_by_me.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        profile_viewer.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                ProfileViewer profileViewer = new ProfileViewer ();
                loadFragments (profileViewer);
                profile_viewer.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        profile_viewed.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                ProfileViewedByMe profileViewedByMe = new ProfileViewedByMe ();
                loadFragments (profileViewedByMe);
                profile_viewed.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        request_send.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                RequestSendMeFragment requestSendMeFragment = new RequestSendMeFragment ();
                loadFragments (requestSendMeFragment);
                request_send.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        request_received.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                RequestByMe requestByMe = new RequestByMe ();
                loadFragments (requestByMe);
                request_received.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        request_accept_by_user.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                AcceptedByUserFragment acceptedByUserFragment = new AcceptedByUserFragment ();
                loadFragments (acceptedByUserFragment);
                request_accept_by_user.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        request_accept_by_me.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                AcceptedByMeFragment acceptedByMeFragment = new AcceptedByMeFragment ();
                loadFragments (acceptedByMeFragment);
                request_accept_by_me.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        request_cancel_user.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                CancelByUserFragment cancelByUserFragment = new CancelByUserFragment ();
                loadFragments (cancelByUserFragment);
                request_cancel_user.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_me.setTextColor (Color.BLACK);
            }
        });
        request_cancel_me.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                CancelByMeFragment cancelByMeFragment= new CancelByMeFragment ();
                loadFragments (cancelByMeFragment);
                request_cancel_me.setTextColor (Color.parseColor("#2196F3"));

                sort_listed.setTextColor (Color.BLACK);

                sort_listed_by_me.setTextColor (Color.BLACK);

                profile_viewer.setTextColor (Color.BLACK);

                profile_viewed.setTextColor (Color.BLACK);

                request_send.setTextColor (Color.BLACK);

                request_received.setTextColor (Color.BLACK);

                request_accept_by_user.setTextColor (Color.BLACK);

                request_accept_by_me.setTextColor (Color.BLACK);

                request_cancel_user.setTextColor (Color.BLACK);
            }
        });

    }

    public void loadFragments(Fragment fragment){
        String user_id = sharedPrefManager.getId ();
        FragmentManager fragmentManager = getSupportFragmentManager ();
        FragmentTransaction transaction = fragmentManager.beginTransaction ();
        Bundle bundle = new Bundle();
        bundle.putString("ID", user_id );
        fragment.setArguments(bundle);
        transaction.replace (R.id.constraint_layout, fragment);
        mail_box.setVisibility (View.GONE);
        textData.setVisibility (View.GONE);
        transaction.commit ();
    }
}
