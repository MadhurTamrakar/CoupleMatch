package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView Btn_back, delete_account_btn,btn_edit_profile, btn_logout;
    LinearLayout btn_home, btn_search, btn_saved, btn_online, btn_shortlist_me, btn_shortlist_by_me, btn_profile_viewed, btn_profile_viewer, btn_request_send, btn_request_received, btn_request_accept_by_user, btn_request_accept_by_me, btn_request_cancel_by_user, btn_request_cancel_by_me ;
    LinearLayout btn_share_app, btn_contact_us, btn_Help_support;
    Dialog AboutPopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menu);

        Btn_back = findViewById (R.id.Btn_back);
        btn_home = findViewById (R.id.btn_home);
        btn_search = findViewById (R.id.btn_search);
        btn_saved = findViewById (R.id.btn_saved);
        btn_online = findViewById (R.id.btn_online);
        btn_shortlist_me = findViewById (R.id.btn_shortlist_me);
        btn_shortlist_by_me = findViewById (R.id.btn_shortlist_by_me);
        btn_profile_viewed = findViewById (R.id.btn_profile_viewed);
        btn_profile_viewer = findViewById (R.id.btn_profile_viewer);
        btn_request_send = findViewById (R.id.btn_request_send);
        btn_request_received = findViewById (R.id.btn_request_received);
        btn_request_accept_by_user = findViewById (R.id.btn_request_accept_by_user);
        btn_request_accept_by_me = findViewById (R.id.btn_request_accept_by_me);
        btn_request_cancel_by_user = findViewById (R.id.btn_request_cancel_by_user);
        btn_request_cancel_by_me = findViewById (R.id.btn_request_cancel_by_me);
        btn_share_app = findViewById (R.id.btn_share_app);
        btn_contact_us = findViewById (R.id.btn_contact_us);
        btn_Help_support = findViewById (R.id.btn_Help_support);
        delete_account_btn = findViewById (R.id.delete_account_btn);
        btn_edit_profile = findViewById (R.id.btn_edit_profile);
        btn_logout = findViewById (R.id.btn_logout);

        AboutPopUp = new Dialog (this);


        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, MainActivity.class));
            }
        });
        btn_home.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, MainActivity.class));
            }
        });
        btn_search.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, SearchResultActivity.class));
            }
        });
        btn_saved.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, SavedPreferenceActivity.class));
            }
        });
        btn_online.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_shortlist_me.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_shortlist_by_me.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_profile_viewed.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_profile_viewer.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_request_send.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_request_received.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_request_accept_by_user.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_request_accept_by_me.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_request_cancel_by_user.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_request_cancel_by_me.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ProfileViewedActivity.class));
            }
        });
        btn_share_app.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ShareOurAppActivity.class));
            }
        });
        btn_contact_us.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, ContactUsActivity.class));
            }
        });
        delete_account_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, DeleteMyAccountActivity.class));
            }
        });
        btn_edit_profile.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, EditProfileActivity.class));
            }
        });
        btn_Help_support.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, Help_support_Activity.class));
            }
        });
        btn_logout.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuActivity.this, HomeActivity.class));
            }
        });
    }

    public void aboutPopUp(View v){
        AppCompatButton btn_ok;
        AboutPopUp.setContentView (R.layout.about_us_pop_up);
        btn_ok = (AppCompatButton) AboutPopUp.findViewById (R.id.btn_ok);

        btn_ok.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                AboutPopUp.dismiss ();
                startActivity (new Intent (MenuActivity.this, MenuActivity.class));
            }
        });
        AboutPopUp.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        AboutPopUp.show ();
    }
}