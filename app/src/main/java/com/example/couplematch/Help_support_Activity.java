package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.HelpSupport;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.mikhaellopez.circularimageview.CircularImageView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Help_support_Activity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    TextView Btn_back;
    Dialog message;
    EditText ed_mail, ed_message;
    AppCompatButton btn_submit;
    CircularImageView imageView, imageView4, imageView3, imageView2, imageView5, imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_help_support);

        sharedPrefManager = new SharedPrefManager (this);
        Btn_back = findViewById (R.id.Btn_back);
        ed_mail = findViewById (R.id.ed_mail);
        ed_message = findViewById (R.id.ed_message);
        btn_submit = findViewById (R.id.btn_submit);

        imageView = findViewById (R.id.imageView);
        Animation anim = new MyAnimation (imageView, 50);
        anim.setDuration (100000);
        imageView.startAnimation (anim);

        imageView2 = findViewById (R.id.imageView2);
        Animation anim2 = new MyAnimation2 (imageView2, 60);
        anim2.setDuration (100000);
        imageView2.startAnimation (anim2);

        imageView3 = findViewById (R.id.imageView3);
        Animation anim3 = new MyAnimation (imageView3, 40);
        anim3.setDuration (100000);
        imageView3.startAnimation (anim3);

        imageView4 = findViewById (R.id.imageView4);
        Animation anim4 = new MyAnimation2 (imageView4, 30);
        anim4.setDuration (100000);
        imageView4.startAnimation (anim4);

        imageView5 = findViewById (R.id.imageView7);
        Animation anim5 = new MyAnimation (imageView5, 40);
        anim5.setDuration (100000);
        imageView5.startAnimation (anim5);

        imageView6 = findViewById (R.id.imageView6);
        Animation anim6 = new MyAnimation2 (imageView6, 40);
        anim6.setDuration (100000);
        imageView6.startAnimation (anim6);

        message = new Dialog (this);

        ed_mail.setText (sharedPrefManager.getUserEmail ());

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (Help_support_Activity.this, MenuActivity.class));
            }
        });

        btn_submit.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String email = ed_mail.getText ().toString ();
                String Message = ed_message.getText ().toString ();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                if(email.matches(emailPattern) && email.length() > 0){
                    if (Message.isEmpty ()) {
                        Toast.makeText (Help_support_Activity.this, "Please Enter The Message in Required Field", Toast.LENGTH_SHORT).show ();
                    }else {
                        messagePopUp (v);
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void messagePopUp(View v) {
//        TextView textClose;
        message.setContentView (R.layout.message_sent_popup);
//        textClose = (TextView) message.findViewById (R.id.textClose);
        String user_id = sharedPrefManager.getId ();
        String email = ed_mail.getText ().toString ();
        String Message = ed_message.getText ().toString ();

        Help_Support (user_id, email, Message);

        message.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        message.show ();

//        textClose.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick(View view) {
//                message.dismiss ();
//                ed_message.setText ("");
//            }
//        });
    }

    private void Help_Support(String user_id, String email, String message) {
        UserService apiService = ApiService.getService ();
        Call<HelpSupport> call = apiService.Help_And_Support (user_id, email, message);
        call.enqueue (new Callback<HelpSupport> () {
            @Override
            public void onResponse(Call<HelpSupport> call, Response<HelpSupport> response) {
                if (response.isSuccessful ()) {
                    ed_message.setText (sharedPrefManager.getUserEmail ());
                } else {
                    Toast.makeText (Help_support_Activity.this, "Request Failed", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<HelpSupport> call, Throwable t) {

            }
        });
    }
}
