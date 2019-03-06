package com.example.mvpdemo.view.login;

import com.example.mvpdemo.mvp.ILoadingView;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public interface LoginContract {
    interface View extends ILoadingView {
        String getUserName();
        String getPassword();
    }

    interface Presenter{
        void login();
    }
}
