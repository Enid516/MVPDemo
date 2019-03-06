package com.example.mvpdemo.mvp.v;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mvpdemo.commom.FullLoadingHelper;
import com.example.mvpdemo.mvp.ILoadingView;
import com.example.mvpdemo.view.ExtendsActivity;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public class LoadingViewActivity extends ExtendsActivity implements ILoadingView {

    private FullLoadingHelper mLoadingHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLoadingHelper = FullLoadingHelper.init(this);
    }

    @Override
    public void showFullLoading() {
        mLoadingHelper.showFullLoading();
    }

    @Override
    public void hideFullLoading() {
        mLoadingHelper.hideFullLoading();
    }

    @Override
    public void showFailedLayout() {
    }

    @Override
    public void hideFailedLayout() {

    }

    @Override
    public void showNoneLayout() {
        mLoadingHelper.showNoneLayout();
    }

    @Override
    public void hideNoneLayout() {
        mLoadingHelper.hideNoneLayout();
    }

    @Override
    public <T extends Activity> T getActivity() {
        return (T)this;
    }
}
