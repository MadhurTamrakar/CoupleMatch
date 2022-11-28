package com.example.couplematch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
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
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.mikhaellopez.circularimageview.CircularImageView;

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
    private CircularImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10;
    LinearLayout terms_conditions;

    @Deprecated
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home);

        btn_continue_with_login = findViewById (R.id.btn_continue_with_login);
        terms_conditions = findViewById (R.id.terms_conditions);
        checkBox = findViewById (R.id.checkBox);


        if (ActivityCompat.checkSelfPermission (HomeActivity.this,
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

        } else {
            ActivityCompat.requestPermissions (HomeActivity.this
                , new String[]{Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.ACCESS_COARSE_LOCATION}
                , 44);

        }


        image1 = findViewById (R.id.imageView);
        Animation anim = new MyAnimation (image1, 50);
        anim.setDuration (80000);
        anim.setRepeatCount (Animation.INFINITE);
        anim.setRepeatMode (ObjectAnimator.RESTART);
        anim.setInterpolator (new AccelerateInterpolator ());
        anim.setFillAfter (true);
        image1.startAnimation (anim);

        image2 = findViewById (R.id.imageView2);
        Animation anim2 = new MyAnimation2 (image2, 60);
        anim2.setDuration (80000);
        anim2.setRepeatCount (Animation.INFINITE);
        anim2.setRepeatMode (ObjectAnimator.RESTART);
        anim2.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image2.startAnimation (anim2);

        image3 = findViewById (R.id.imageView3);
        Animation anim3 = new MyAnimation (image3, 40);
        anim3.setDuration (80000);
        anim3.setRepeatCount (Animation.INFINITE);
        anim3.setRepeatMode (ObjectAnimator.RESTART);
        anim3.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image3.startAnimation (anim3);

        image4 = findViewById (R.id.imageView4);
        Animation anim4 = new MyAnimation2 (image4, 30);
        anim4.setDuration (80000);
        anim4.setRepeatCount (Animation.INFINITE);
        anim4.setRepeatMode (ObjectAnimator.RESTART);
        anim4.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image4.startAnimation (anim4);

        image5 = findViewById (R.id.imageView5);
        Animation anim5 = new MyAnimation (image5, 40);
        anim5.setDuration (80000);
        anim5.setRepeatCount (Animation.INFINITE);
        anim5.setRepeatMode (ObjectAnimator.RESTART);
        anim5.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image5.startAnimation (anim5);

        image6 = findViewById (R.id.imageView6);
        Animation anim6 = new MyAnimation2 (image6, 40);
        anim6.setDuration (80000);
        anim6.setRepeatCount (Animation.INFINITE);
        anim6.setRepeatMode (ObjectAnimator.RESTART);
        anim6.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image6.startAnimation (anim6);

        image7 = findViewById (R.id.imageView7);
        Animation anim7 = new MyAnimation (image7, 60);
        anim7.setDuration (80000);
        anim7.setRepeatCount (Animation.INFINITE);
        anim7.setRepeatMode (ObjectAnimator.RESTART);
        anim7.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image7.startAnimation (anim7);

        image8 = findViewById (R.id.imageView8);
        Animation anim8 = new MyAnimation2 (image8, 50);
        anim8.setDuration (80000);
        anim8.setRepeatCount (Animation.INFINITE);
        anim8.setRepeatMode (ObjectAnimator.RESTART);
        anim8.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image8.startAnimation (anim8);

        image9 = findViewById (R.id.imageView9);
        Animation anim9 = new MyAnimation (image9, 40);
        anim9.setDuration (80000);
        anim9.setRepeatCount (Animation.INFINITE);
        anim9.setRepeatMode (ObjectAnimator.RESTART);
        anim9.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image9.startAnimation (anim9);

        image10 = findViewById (R.id.imageView10);
        Animation anim10 = new MyAnimation2 (image10, 50);
        anim10.setDuration (80000);
        anim10.setRepeatCount (Animation.INFINITE);
        anim10.setRepeatMode (ObjectAnimator.RESTART);
        anim10.setInterpolator (new AccelerateInterpolator ());
        anim2.setFillAfter (true);
        image10.startAnimation (anim10);

        myDialog = new Dialog (this);

        checkBox.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (ContextCompat.checkSelfPermission (HomeActivity.this,
                    Manifest.permission.READ_CONTACTS)
                    != PackageManager.PERMISSION_GRANTED) {

                    // Permission is not granted
                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale (HomeActivity.this,
                        Manifest.permission.ACCESS_FINE_LOCATION)) {
                        btn_continue_with_login.setEnabled (false);
                        Toast.makeText (HomeActivity.this, "Enable Location Permission to Proceed", Toast.LENGTH_SHORT).show ();
                    } else {
                        ActivityCompat.requestPermissions (HomeActivity.this,
                            new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 44);
                    }
                } else {
                    checkBox.setEnabled (true);
                    // Permission has already been granted
                }
            }
        });

        btn_continue_with_login.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked ()) {
                    SocialPopUp (v);
                } else {
                    Toast.makeText (HomeActivity.this, "Please Agree Terms & Conditions", Toast.LENGTH_SHORT).show ();
                }
            }
        });

    }

    public void SocialPopUp(View v) {

//        TextView textClose;
        AppCompatButton btn_google, btn_facebook;
        myDialog.setContentView (R.layout.social_login_popup);
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
//            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent (data);

            try{
                task.getResult (ApiException.class);
                handleSignInResult();
            } catch (ApiException e) {
                Toast.makeText (this, "Something went wrong", Toast.LENGTH_SHORT).show ();
            }
//            if (result != null && result.isSuccess ()) {
//                GoogleSignInAccount account = result.getSignInAccount ();
////                setAppPreferenceData (account.getId (), account.getEmail (), String.valueOf (account.getPhotoUrl ()), account.getDisplayName ());
//                startActivity (new Intent (this, MainActivity.class));
//                finish ();
//            } else{
//                handleSignInResult();
//            }
        }
    }

    //.............. google sign in.................//
    private void handleSignInResult() {
        finish ();
        startActivity (new Intent (HomeActivity.this, SignupActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart ();

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount (this);
        if (account != null) {
            Intent i = new Intent (HomeActivity.this, MainActivity.class);
            startActivity (i);
        }
    }
}
