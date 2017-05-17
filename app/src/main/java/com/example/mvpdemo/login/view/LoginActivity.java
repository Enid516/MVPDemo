package com.example.mvpdemo.login.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mvpdemo.R;
import com.example.mvpdemo.login.presenter.LoginPresenterImpl;

/**
 * Created by Enid on 2017/5/9.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {

    private EditText etLoginPassword;
    private EditText etLoginName;
    private LoginPresenterImpl loginPresenter;
    private ProgressBar progressBar;
    private Button btnLogin;
    private Button btnClear;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //init view
        etLoginName = (EditText) findViewById(R.id.login_name);
        etLoginPassword = (EditText) findViewById(R.id.login_password);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnClear = (Button) findViewById(R.id.btn_clear);

        //set click listener
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        //init
        loginPresenter = new LoginPresenterImpl(this);
        loginPresenter.setProgressBarVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login) {
            btnLogin.setEnabled(false);
            btnClear.setEnabled(false);
            loginPresenter.setProgressBarVisibility(View.VISIBLE);
            loginPresenter.doLogin(etLoginName.getText().toString(), etLoginPassword.getText().toString());
        } else if (v.getId() == R.id.btn_clear) {
            loginPresenter.clear();
        }
    }

    @Override
    public void onClearText() {
        etLoginName.setText("");
        etLoginPassword.setText("");
    }

    @Override
    public void onLoginResult(Boolean result, int code) {
        btnLogin.setEnabled(true);
        btnClear.setEnabled(true);
        loginPresenter.setProgressBarVisibility(View.INVISIBLE);
        if (result) {
            Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {
        progressBar.setVisibility(visibility);
    }
}
