package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.couplematch.adapter.Adapter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    Adapter adapter;
    TextView Btn_menu;

    int []arr = {R.drawable.download,R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,
        R.drawable.download5,R.drawable.download6,R.drawable.download7,R.drawable.download8,R.drawable.download9,R.drawable.download10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Btn_menu = findViewById (R.id.Btn_menu);

        recyclerView = findViewById (R.id.recyclerView);
        LayoutManager = new GridLayoutManager (this,2);
        recyclerView.setLayoutManager (LayoutManager);
        adapter = new Adapter (arr);

        recyclerView.setAdapter (adapter);
        recyclerView.setHasFixedSize (true);

        Btn_menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MainActivity.this,MenuActivity.class));
            }
        });
    }
}
