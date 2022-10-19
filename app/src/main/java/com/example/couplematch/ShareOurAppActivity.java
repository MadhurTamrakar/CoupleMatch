package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.io.File;

public class ShareOurAppActivity extends AppCompatActivity {

    TextView Btn_back;
    AppCompatButton Share_btn;
    private CircularImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_share_our_app);

        Btn_back = findViewById (R.id.Btn_back);
        Share_btn = findViewById (R.id.Share_btn);

        image1 = findViewById (R.id.imageView);
        Animation anim = new MyAnimation (image1, 50);
        anim.setDuration (70000);
        image1.startAnimation (anim);

        image2 = findViewById (R.id.imageView2);
        Animation anim2 = new MyAnimation2 (image2, 60);
        anim2.setDuration (70000);
        image2.startAnimation (anim2);

        image3 = findViewById (R.id.imageView3);
        Animation anim3 = new MyAnimation (image3, 40);
        anim3.setDuration (70000);
        image3.startAnimation (anim3);

        image4 = findViewById (R.id.imageView4);
        Animation anim4 = new MyAnimation2 (image4, 50);
        anim4.setDuration (70000);
        image4.startAnimation (anim4);

        image5 = findViewById (R.id.imageView5);
        Animation anim5 = new MyAnimation (image5, 40);
        anim5.setDuration (70000);
        image5.startAnimation (anim5);

        image6 = findViewById (R.id.imageView6);
        Animation anim6 = new MyAnimation2 (image6, 40);
        anim6.setDuration (70000);
        image6.startAnimation (anim6);

        image7 = findViewById (R.id.imageView7);
        Animation anim7 = new MyAnimation (image7, 60);
        anim7.setDuration (70000);
        image7.startAnimation (anim7);

        image8 = findViewById (R.id.imageView8);
        Animation anim8 = new MyAnimation2 (image8, 50);
        anim8.setDuration (70000);
        image8.startAnimation (anim8);

        image9 = findViewById (R.id.imageView9);
        Animation anim9 = new MyAnimation (image9, 40);
        anim9.setDuration (70000);
        image9.startAnimation (anim9);

        image10 = findViewById (R.id.imageView10);
        Animation anim10 = new MyAnimation2 (image10, 50);
        anim10.setDuration (70000);
        image10.startAnimation (anim10);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity ( new Intent (ShareOurAppActivity.this, MenuActivity.class));
            }
        });

        Share_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                shareIt();
            }
        });
    }

    private void shareIt() {
        ApplicationInfo app = getApplicationContext().getApplicationInfo();
        String filePath = app.sourceDir;

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File (filePath)));
        sharingIntent.setType("text/plain");
        String shareBody = "Download CoupleMatch World's only Matrimonial where no charges";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
