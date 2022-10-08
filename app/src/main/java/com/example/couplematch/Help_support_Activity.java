package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.HelpSupport;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Help_support_Activity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    TextView Btn_back;
    Dialog message;
    EditText ed_mail, ed_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_help_support);

        sharedPrefManager = new SharedPrefManager (this);
        Btn_back = findViewById (R.id.Btn_back);
        ed_mail = findViewById (R.id.ed_mail);
        ed_message = findViewById (R.id.ed_message);
        message = new Dialog (this);

        ed_mail.setText (sharedPrefManager.getUserEmail ());

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
        String user_id = sharedPrefManager.getId ();
        String email = ed_mail.getText ().toString ();
        String Message = ed_message.getText ().toString ();

        Help_Support (user_id, email, Message);

        message.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        message.show ();

        textClose.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                message.dismiss ();
            }
        });
    }

    private void Help_Support(String user_id, String email, String message) {
        UserService apiService = ApiService.getService ();
        Call<HelpSupport> call = apiService.Help_And_Support (user_id, email, message);
        call.enqueue (new Callback<HelpSupport> () {
            @Override
            public void onResponse(Call<HelpSupport> call, Response<HelpSupport> response) {
                if(response.isSuccessful ()){
                    ed_message.setText (sharedPrefManager.getUserEmail ());
                } else{
                    Toast.makeText (Help_support_Activity.this, "Request Failed", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<HelpSupport> call, Throwable t) {

            }
        });
    }
}
