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

public class EditProfileActivity extends AppCompatActivity {

    TextView Btn_back;
    Dialog Saved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_edit_profile);

        Btn_back = findViewById (R.id.Btn_back);
        Saved = new Dialog (this);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (EditProfileActivity.this, MenuActivity.class));
            }
        });
    }
    public void savedPopUp(View v){
        TextView textClose;
        Saved.setContentView (R.layout.saved_pop_up);
        textClose = (TextView) Saved.findViewById (R.id.textClose);

        textClose.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Saved.dismiss ();
                startActivity (new Intent (EditProfileActivity.this, MenuActivity.class));
            }
        });
        Saved.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        Saved.show ();
    }
}
