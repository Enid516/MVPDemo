package com.example.mvpdemo.presenter.login;

import com.example.mvpdemo.mvp.p.BasePresenter;
import com.example.mvpdemo.utils.log.MLog;
import com.example.mvpdemo.view.login.LoginContract;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public class LoginP extends BasePresenter<LoginContract.View> implements LoginContract.Presenter{

    public LoginP(LoginContract.View iLoginView) {
        super(iLoginView);
    }

    @Override
    public void login() {
        getView().showFullLoading();
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getView().hideFullLoading();
            }
        },2000);
        String userName = getView().getUserName();
        String password = getView().getPassword();
        MLog.i("username:"+userName+",password:"+password);
    }
}
