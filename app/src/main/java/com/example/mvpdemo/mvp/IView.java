package com.example.mvpdemo.mvp;

import android.app.Activity;

/**
 * @author enid
 * @date 2019/3/6
 * @description 所有Activity和Fragment需要实现的接口
 */
public interface IView {
    /**
     * 获取Activity
     *
     * @param <T>
     * @return
     */
    <T extends Activity> T getActivity();
}
