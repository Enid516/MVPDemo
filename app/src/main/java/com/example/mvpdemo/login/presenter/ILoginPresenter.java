package com.example.mvpdemo.login.presenter;

/**
 * Created by Enid on 2017/5/9.
 * 业务逻辑接口
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name,String password);
    void setProgressBarVisibility(int visibility);
}
