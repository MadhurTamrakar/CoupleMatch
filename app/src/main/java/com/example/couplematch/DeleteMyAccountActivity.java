package com.example.couplematch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.R;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.DeleteData;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeleteMyAccountActivity extends AppCompatActivity {

    TextView Btn_back;
    Dialog logoutPopup;
    SharedPrefManager sharedPrefManager;
    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_delete_my_account);

        sharedPrefManager = new SharedPrefManager (this);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder (GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail ()
            .build ();
        mGoogleSignInClient = GoogleSignIn.getClient (this, gso);

        Btn_back = findViewById (R.id.Btn_back);
        logoutPopup = new Dialog (this);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (DeleteMyAccountActivity.this, MenuActivity.class));
            }
        });
    }

    public void deletePopUp(View v) {
        AppCompatButton btn_yes, Cancel_btn;
        logoutPopup.setContentView (R.layout.logout_popup);
        Cancel_btn = (AppCompatButton) logoutPopup.findViewById (R.id.Cancel_btn);
        btn_yes = (AppCompatButton) logoutPopup.findViewById (R.id.btn_yes);
        String user_id = sharedPrefManager.getId ();

        btn_yes.setOnClickListener (new View.OnClickListener () {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                logoutPopup.dismiss ();
//               Intent i = new Intent (DeleteMyAccountActivity.this, HomeActivity.class);
//                    startActivity (i);
//                    finish ();
                switch (view.getId ()) {
                    case R.id.btn_yes:
                        DeleteUser (user_id);
                        signOut ();
                        break;
                }
            }
        });
        Cancel_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                logoutPopup.dismiss ();
            }
        });
        logoutPopup.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        logoutPopup.show ();
    }

    private void signOut() {
        mGoogleSignInClient.signOut ()
            .addOnCompleteListener (this, new OnCompleteListener<Void> () {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    Intent i = new Intent (DeleteMyAccountActivity.this, HomeActivity.class);
                    startActivity (i);
                    finish ();
                }
            });
    }

    private void DeleteUser(String user_id) {
        UserService apiService = ApiService.getService ();
        Call<DeleteData> call = apiService.DeleteAccount (user_id);
        call.enqueue (new Callback<DeleteData> () {
            @Override
            public void onResponse(Call<DeleteData> call, Response<DeleteData> response) {
                if (response.isSuccessful ()) {
                    Toast.makeText (DeleteMyAccountActivity.this, "Account Deleted Successfully", Toast.LENGTH_SHORT).show ();
                } else {
                    Toast.makeText (DeleteMyAccountActivity.this, "Unable to delete account try again later", Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<DeleteData> call, Throwable t) {

            }
        });
    }
}
