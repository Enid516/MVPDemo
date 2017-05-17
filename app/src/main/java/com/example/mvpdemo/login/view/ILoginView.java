package com.example.mvpdemo.login.view;

/**
 * Created by Enid on 2017/5/9.
 * 视图逻辑接口,，其实现类是当前Activity  Fragment
 */

public interface ILoginView {
    void onClearText();
    void onLoginResult(Boolean result,int code);
    void onSetProgressBarVisibility(int visibility);
}
