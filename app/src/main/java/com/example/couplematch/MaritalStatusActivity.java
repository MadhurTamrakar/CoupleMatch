package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MaritalStatusActivity extends AppCompatActivity {

    AppCompatButton btn_unmarried, btn_divorced, btn_DIVORCED, btn_WIDOWED, btn_WIDOWED_WITH_CHILDREN, btn_SEPARATED, btn_ANNULLED, btn_MARRIED, btn_AWAITING;
    TextView Btn_back;
    String Religion, Dosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_marital_status);

        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");

        btn_unmarried = findViewById (R.id.btn_unmarried);
        btn_divorced = findViewById (R.id.btn_divorced);
        btn_DIVORCED = findViewById (R.id.btn_DIVORCED);
        btn_WIDOWED = findViewById (R.id.btn_WIDOWED);
        btn_WIDOWED_WITH_CHILDREN = findViewById (R.id.btn_WIDOWED_WITH_CHILDREN);
        btn_ANNULLED = findViewById (R.id.btn_ANNULLED);
        btn_SEPARATED = findViewById (R.id.btn_SEPARATED);
        btn_MARRIED = findViewById (R.id.btn_MARRIED);
        btn_AWAITING = findViewById (R.id.btn_AWAITING);
        Btn_back = findViewById (R.id.Btn_back);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (MaritalStatusActivity.this, ReligionActivity.class));
            }
        });

        btn_unmarried.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Unmarried");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_divorced.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Divorced");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_DIVORCED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Divorced With Children");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_WIDOWED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Widow");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_WIDOWED_WITH_CHILDREN.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Widow With Children");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_ANNULLED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Annulled");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_SEPARATED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Separated");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_MARRIED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Married");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

        btn_AWAITING.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MaritalStatusActivity.this, DietActivity.class);
                i.putExtra ("Religion", Religion);
                i.putExtra ("Dosh", Dosh);
                i.putExtra ("MaritalStatus", "Awaiting");
                startActivity (i);
//                startActivity (new Intent (MaritalStatusActivity.this, DietActivity.class));
            }
        });

    }
}
