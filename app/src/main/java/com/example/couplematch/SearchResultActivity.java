package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchResultActivity extends AppCompatActivity {

    TextView Btn_back;
//    AppCompatButton search_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_search_result);

        Btn_back = findViewById (R.id.Btn_back);
//        search_btn = findViewById (R.id.search_btn);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (SearchResultActivity.this, MenuActivity.class));
            }
        });
//        search_btn.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                startActivity (new Intent (SearchResultActivity.this, HomeActivity.class));
//            }
//        });

    }
}
