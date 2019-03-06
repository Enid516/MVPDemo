package com.example.mvpdemo.view.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.mvpdemo.R;
import com.example.mvpdemo.mvp.v.BasePActivity;
import com.example.mvpdemo.presenter.login.LoginP;

/**
 * Created by Enid on 2017/5/9.
 */

public class LoginActivity extends BasePActivity<LoginP> implements View.OnClickListener,LoginContract.View {

    private EditText etLoginPassword;
    private EditText etLoginName;

    private Button btnLogin;
    private Button btnClear;

    @Override
    public LoginP onBindPresenter() {
        return new LoginP(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //init view
        etLoginName = (EditText) findViewById(R.id.login_name);
        etLoginPassword = (EditText) findViewById(R.id.login_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnClear = (Button) findViewById(R.id.btn_clear);

        //set click listener
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login) {
            getPresenter().login();
        } else if (v.getId() == R.id.btn_clear) {
            etLoginName.setText("");
            etLoginPassword.setText("");
        }
    }

    @Override
    public String getUserName() {
        return etLoginName.getText().toString();
    }

    @Override
    public String getPassword() {
        return etLoginPassword.getText().toString();
    }
}
