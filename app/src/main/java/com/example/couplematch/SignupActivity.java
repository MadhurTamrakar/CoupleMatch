package com.example.couplematch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.response.SignUpResponse;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.hbb20.CountryCodePicker;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupActivity extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;
    Button btn_register;
    TextView Btn_back, tv_age;
    EditText editText, ed_number;
    RadioGroup radioGroup;
    RadioButton radioButton;
    private DatePickerDialog datePickerDialog;
    private Button dateButton;
    CountryCodePicker ccp;

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
        tv_age = findViewById (R.id.tv_age);
        ed_number = findViewById (R.id.ed_number);
        ccp = findViewById (R.id.ccp);

//        btn_register.setEnabled (false);

        if (ActivityCompat.checkSelfPermission (SignupActivity.this,
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
//            btn_register.setEnabled (true);
        } else {
            ActivityCompat.requestPermissions (SignupActivity.this
                , new String[]{Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.ACCESS_COARSE_LOCATION}
                , 44);
        }

        radioGroup = (RadioGroup) findViewById (R.id.radio);

        Btn_back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (SignupActivity.this, HomeActivity.class));
            }
        });

        btn_register.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View view) {
                Pattern ptrn = Pattern.compile("(\\w+)\\s+(\\w+)");
                Matcher matcher = ptrn.matcher("FirstName  LastName");

                String name = editText.getText ().toString ();
                String mobile = ed_number.getText ().toString ().trim ();
                String dob = dateButton.getText ().toString ().trim ();
                String age = tv_age.getText ().toString ().trim ();
                String countryCode = ccp.getSelectedCountryCode ();

                final String gender;

                sharedPrefManager.setName (name);
                sharedPrefManager.setUserMobile (mobile);
                sharedPrefManager.setUserDob (dob);
                sharedPrefManager.setUserAge (age);
                sharedPrefManager.setCountryCode (countryCode);

                int selectedId = radioGroup.getCheckedRadioButtonId ();
                radioButton = (RadioButton) findViewById (selectedId);
                gender = radioButton.getText ().toString ();

                sharedPrefManager.setUserGender (gender);

                if (name.isEmpty ()) {
                    editText.setError ("Please Enter Your Name");
                }
                else if (mobile.length () < 10) {
                    ed_number.setError ("Please Enter Correct Mobile Number");
                } else {
                    registerUser (name, mobile, gender, dob, age);
                }
            }
        });
    }

    public void registerUser(String name, String mobile, String gender, String dob, String age) {
        UserService apiService = ApiService.getService ();
        Call<SignUpResponse> Call = apiService.registerUser (name, mobile, gender, dob, age);
        Call.enqueue (new Callback<SignUpResponse> () {
            @Override
            public void onResponse(Call<SignUpResponse> responseCall, Response<SignUpResponse> response) {
                if (response.isSuccessful ()) {
                    sharedPrefManager.setId (response.body ().getResult ().getId ());
                    startActivity (new Intent (SignupActivity.this, ReligionActivity.class));
                    finish ();

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

    @SuppressLint("SetTextI18n")
    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Calendar c = Calendar.getInstance();
                c.set(Calendar.YEAR, year);
                c.set(Calendar.MONTH, month);
                c.set(Calendar.DAY_OF_MONTH, day);
//                String date = makeDateString (day, month, year);
                dateButton.setText (day + "/" + (month+1) + "/" + year);
                tv_age.setText(Integer.toString(calculateAge(c.getTimeInMillis())));
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

    private int calculateAge(long timeInMillis) {
        Calendar dob = Calendar.getInstance();
        dob.setTimeInMillis(timeInMillis);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if(today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)){
            age--;
        }
        return age;
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

