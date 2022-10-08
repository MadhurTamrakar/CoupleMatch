package com.example.couplematch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class HomeActivity extends AppCompatActivity {

    private static final int RC_SIGN_IN = 0;
    private CallbackManager callbackManager;
    GoogleSignInClient mGoogleSignInClient;
    Dialog myDialog;
    CheckBox checkBox;
    AppCompatButton btn_continue_with_login;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10;

    @Deprecated
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home);

        btn_continue_with_login = findViewById (R.id.btn_continue_with_login);

        btn_continue_with_login.setEnabled (false);

        checkBox = findViewById (R.id.checkBox);
        checkBox.setOnCheckedChangeListener (new CompoundButton.OnCheckedChangeListener () {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean checked) {
                btn_continue_with_login.setEnabled (checked);
            }
        });

        image1 = (ImageView) findViewById (R.id.imageView);
        Animation anim = new MyAnimation (image1, 50);
        anim.setDuration (70000);
        image1.startAnimation (anim);

        image2 = (ImageView) findViewById (R.id.imageView2);
        Animation anim2 = new MyAnimation2 (image2, 60);
        anim2.setDuration (70000);
        image2.startAnimation (anim2);

        image3 = (ImageView) findViewById (R.id.imageView3);
        Animation anim3 = new MyAnimation (image3, 40);
        anim3.setDuration (70000);
        image3.startAnimation (anim3);

        image4 = (ImageView) findViewById (R.id.imageView4);
        Animation anim4 = new MyAnimation2 (image4, 50);
        anim4.setDuration (70000);
        image4.startAnimation (anim4);

        image5 = (ImageView) findViewById (R.id.imageView5);
        Animation anim5 = new MyAnimation (image5, 40);
        anim5.setDuration (70000);
        image5.startAnimation (anim5);

        image6 = (ImageView) findViewById (R.id.imageView6);
        Animation anim6 = new MyAnimation2 (image6, 40);
        anim6.setDuration (70000);
        image6.startAnimation (anim6);

        image7 = (ImageView) findViewById (R.id.imageView7);
        Animation anim7 = new MyAnimation (image7, 60);
        anim7.setDuration (70000);
        image7.startAnimation (anim7);

        image8 = (ImageView) findViewById (R.id.imageView8);
        Animation anim8 = new MyAnimation2 (image8, 50);
        anim8.setDuration (70000);
        image8.startAnimation (anim8);

        image9 = (ImageView) findViewById (R.id.imageView9);
        Animation anim9 = new MyAnimation (image9, 40);
        anim9.setDuration (70000);
        image9.startAnimation (anim9);

        image10 = (ImageView) findViewById (R.id.imageView10);
        Animation anim10 = new MyAnimation2 (image10, 50);
        anim10.setDuration (70000);
        image10.startAnimation (anim10);

        myDialog = new Dialog (this);

    }


    public void ShowPopUp(View v) {

        TextView textClose;
        AppCompatButton btn_google, btn_facebook;
        myDialog.setContentView (R.layout.social_login_popup);
        textClose = myDialog.findViewById (R.id.textClose);
        btn_google = myDialog.findViewById (R.id.btn_google);
        btn_facebook = myDialog.findViewById (R.id.btn_facebook);

        //........ google sign in ...........//
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder (GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail ()
            .build ();
        mGoogleSignInClient = GoogleSignIn.getClient (this, gso);

        btn_google.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                switch (view.getId ()) {
                    case R.id.btn_google:
                        signIn ();
                        break;
                }
            }
        });

        //........ facebook sign in ...........//
        callbackManager = CallbackManager.Factory.create ();

        LoginManager.getInstance ().registerCallback (callbackManager,
            new FacebookCallback<LoginResult> () {
                @Override
                public void onSuccess(LoginResult loginResult) {
                    startActivity (new Intent (HomeActivity.this, SignupActivity.class));
                    finish ();
                }

                @Override
                public void onCancel() {
                }

                @Override
                public void onError(FacebookException exception) {
                }
            });

        btn_facebook.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                LoginManager.getInstance ().logInWithReadPermissions (HomeActivity.this, Arrays.asList ("public_profile"));
            }
        });

        //........ popup closed ...........//
        textClose.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                myDialog.dismiss ();
            }
        });

        myDialog.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        myDialog.show ();
    }

    //.............. google sign in.................//
    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent ();
        startActivityForResult (signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult (requestCode, resultCode, data);
        super.onActivityResult (requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent (data);
            handleSignInResult (task);
        }
    }

    //.............. google sign in.................//
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult (ApiException.class);

            startActivity (new Intent (HomeActivity.this, SignupActivity.class));
            finish ();
        } catch (ApiException e) {
            Log.w ("Error", "signInResult:failed code=" + e.getStatusCode ());
        }
    }
    @Override
    protected void onStart() {
        super.onStart ();

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if(account != null){
            Intent i = new Intent (HomeActivity.this, MainActivity.class);
            startActivity (i);
        }
    }
}
