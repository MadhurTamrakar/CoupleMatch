package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SavedMaritalStatus extends AppCompatActivity {

    AppCompatButton any, btn_unmarried, btn_divorced, btn_DIVORCED, btn_WIDOWED, btn_WIDOWED_WITH_CHILDREN, btn_SEPARATED, btn_ANNULLED, btn_MARRIED, btn_AWAITING;
    TextView Btn_back;
    String Age, Religion, Dosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_saved_marital_status);

        Age = getIntent ().getStringExtra ("Age");
        Religion = getIntent ().getStringExtra ("Religion");
        Dosh = getIntent ().getStringExtra ("Dosh");

        any = findViewById (R.id.any);
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
                startActivity (new Intent (SavedMaritalStatus.this, SavedPreferenceActivity.class));
            }
        });

        any.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                any.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_unmarried.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_divorced.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_DIVORCED.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_WIDOWED.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_WIDOWED_WITH_CHILDREN.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_ANNULLED.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_SEPARATED.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_MARRIED.setBackgroundResource (R.drawable.edit_profile_btn);
                btn_AWAITING.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "any");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_unmarried.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_unmarried.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Unmarried");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_divorced.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_divorced.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Divorced");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_DIVORCED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_DIVORCED.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Divorced With Children");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_WIDOWED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_WIDOWED.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Widow");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_WIDOWED_WITH_CHILDREN.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_WIDOWED_WITH_CHILDREN.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Widow With Children");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_ANNULLED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_ANNULLED.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Annulled");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_SEPARATED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_SEPARATED.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Separated");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_MARRIED.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_MARRIED.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Married");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

        btn_AWAITING.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                btn_AWAITING.setBackgroundResource (R.drawable.edit_profile_btn);
                new Handler ().postDelayed (new Runnable () {
                    public void run() {
                        Intent i = new Intent (SavedMaritalStatus.this, SavedDiet.class);
                        i.putExtra ("MaritalStatus", "Awaiting");
                        i.putExtra ("Dosh", Dosh);
                        i.putExtra ("Religion", Religion);
                        i.putExtra ("Age", Age);
                        startActivity (i);
                    }
                },  800);
            }
        });

    }
}
