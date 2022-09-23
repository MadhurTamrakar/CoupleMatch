package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.couplematch.R;

public class DeleteMyAccountActivity extends AppCompatActivity {

    TextView Btn_back;
    Dialog logoutPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_delete_my_account);

        Btn_back = findViewById (R.id.Btn_back);
        logoutPopup = new Dialog (this);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (DeleteMyAccountActivity.this, MenuActivity.class));
            }
        });
    }
    public void deletePopUp(View v){
        AppCompatButton btn_yes,Cancel_btn;
        logoutPopup.setContentView (R.layout.logout_popup);
        Cancel_btn = (AppCompatButton) logoutPopup.findViewById (R.id.Cancel_btn);
        btn_yes = (AppCompatButton) logoutPopup.findViewById (R.id.btn_yes);

        btn_yes.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                logoutPopup.dismiss ();
                startActivity (new Intent (DeleteMyAccountActivity.this, HomeActivity.class));
            }
        });
        Cancel_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                logoutPopup.dismiss ();
                startActivity (new Intent (DeleteMyAccountActivity.this, MenuActivity.class));
            }
        });
        logoutPopup.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        logoutPopup.show ();
    }
}
