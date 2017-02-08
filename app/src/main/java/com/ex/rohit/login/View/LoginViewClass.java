package com.ex.rohit.login.View;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.ex.rohit.login.R;


public class LoginViewClass extends AppCompatActivity implements LoginViewInterface {

    EditText mobileNo,password;
    Button confirmButton;
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        confirmButton= (Button)findViewById(R.id.sendOtpButton);
        mobileNo=(EditText)findViewById(R.id.MobileNo);
        password=(EditText)findViewById(R.id.Password);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);

    }

    @Override
    public void showLoader() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoader() {
        progressBar.setVisibility(View.INVISIBLE);
    }
}
