package com.example.mvpdemo.login.presenter;

import android.os.Handler;
import android.os.Looper;

import com.example.mvpdemo.login.model.IUser;
import com.example.mvpdemo.login.view.ILoginView;

/**
 * Created by Enid on 2017/5/9.
 * 业务逻辑的实现
 */

public class LoginPresenterImpl implements ILoginPresenter{
    ILoginView iLoginView;
    IUser user;
    Handler handler;

    public LoginPresenterImpl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        handler = new Handler(Looper.getMainLooper());
    }
    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String password) {
        boolean isLoginSuccess = true;
        isLoginSuccess = validateLogin(name,password);
        final boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result,0);
            }
        },3000);
    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        iLoginView.onSetProgressBarVisibility(visibility);
    }

    private boolean validateLogin(String name, String password) {
        if (name.equals("enid")&& password.equals("123456")) return true;
        else return false;
    }
}
