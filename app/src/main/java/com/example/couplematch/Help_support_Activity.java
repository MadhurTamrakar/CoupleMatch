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

public class Help_support_Activity extends AppCompatActivity {

    TextView Btn_back;
    Dialog message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_help_support);

        Btn_back = findViewById (R.id.Btn_back);
        message = new Dialog (this);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (Help_support_Activity.this, MenuActivity.class));
            }
        });
    }

    public void messagePopUp(View v) {
        TextView textClose;
        message.setContentView (R.layout.message_sent_popup);
        textClose = (TextView) message.findViewById (R.id.textClose);

        textClose.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                message.dismiss ();
                startActivity (new Intent (Help_support_Activity.this, MenuActivity.class));
            }
        });
        message.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        message.show ();
    }
}
