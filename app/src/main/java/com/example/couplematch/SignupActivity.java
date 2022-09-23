package com.example.couplematch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.SignUpResponse;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.facebook.login.Login;
import com.google.android.material.shadow.ShadowRenderer;

import java.util.Calendar;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    Button btn_register, male_tv, female_tv;
    TextView Btn_back;
    EditText editText, ed_number;
    private DatePickerDialog datePickerDialog;
    private Button dateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_signup);

        sharedPrefManager = new SharedPrefManager (this);
        initDatePicker ();
        dateButton = findViewById (R.id.datePickerButton);
        dateButton.setText (getTodayDate ());
        btn_register = findViewById (R.id.btn_register);
        Btn_back = findViewById (R.id.Btn_back);
        editText = findViewById (R.id.editText);
        ed_number = findViewById (R.id.ed_number);
        male_tv = findViewById (R.id.male_tv);
        female_tv = findViewById (R.id.female_tv);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SignupActivity.this, HomeActivity.class));
            }
        });

        btn_register.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View view) {

                String name = editText.getText ().toString ().trim ();
                String mobile = ed_number.getText ().toString ().trim ();
                String dob = dateButton.getText ().toString ().trim ();

                final String gender;
                gender = male_tv.getText ().toString ().trim (); female_tv.getText ().toString ().trim ();

                if (name.equals ("") || name.contains (" ")) {
                    editText.setError ("Enter Your Full Name");
                }
                if (mobile.length () < 10) {
                    ed_number.setError ("Enter Correct Phone Number");
                } else {
                    startActivity (new Intent (SignupActivity.this, ReligionActivity.class));
                }
                registerUser (name, mobile, gender, dob);
            }
        });
    }

    public void registerUser(String name, String mobile, String gender, String dob) {
        UserService apiService = ApiService.getService ();
        Call<SignUpResponse> Call = apiService.registerUser (name, mobile, gender, dob );
        Call.enqueue (new Callback<SignUpResponse> () {
            @Override
            public void onResponse(Call<SignUpResponse> responseCall, Response<SignUpResponse> response) {
                if (response.isSuccessful ()) {
                    sharedPrefManager.setId (response.body ().getResult ().getId ());
//                    String message = "Register Successfully";
//                    Toast.makeText (SignupActivity.this, message, Toast.LENGTH_SHORT).show ();
//                    startActivity (new Intent (SignupActivity.this, ReligionActivity.class));
//                    finish ();
                } else {
                    String message = "Get Yourself Register";
                    Toast.makeText (SignupActivity.this, message, Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onFailure(Call<SignUpResponse> call, Throwable t) {
                String message = "Register failed";
                Toast.makeText (SignupActivity.this, message, Toast.LENGTH_LONG).show ();

            }
        });
    }

    private String getTodayDate() {
        Calendar cal = Calendar.getInstance ();
        int year = cal.get (Calendar.YEAR);
        int month = cal.get (Calendar.MONTH);
        month = month + 1;
        int day = cal.get (Calendar.DAY_OF_MONTH);
        return makeDateString (day, month, year);
    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = makeDateString (day, month, year);
                dateButton.setText (date);
            }
        };

        Calendar cal = Calendar.getInstance ();
        int year = cal.get (Calendar.YEAR);
        int month = cal.get (Calendar.MONTH);
        int day = cal.get (Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog (this, style, dateSetListener, year, month, day);
        datePickerDialog.getDatePicker ().setMaxDate (System.currentTimeMillis ());

    }

    private String makeDateString(int day, int month, int year) {
        return getMonthFormat (month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month) {
        if (month == 1)
            return "JAN";
        if (month == 2)
            return "FEB";
        if (month == 3)
            return "MAR";
        if (month == 4)
            return "APR";
        if (month == 5)
            return "MAY";
        if (month == 6)
            return "JUN";
        if (month == 7)
            return "JUL";
        if (month == 8)
            return "AUG";
        if (month == 9)
            return "SEP";
        if (month == 10)
            return "OCT";
        if (month == 11)
            return "NOV";
        if (month == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }

    public void openDatePicker(View view) {
        datePickerDialog.show ();
    }
}

