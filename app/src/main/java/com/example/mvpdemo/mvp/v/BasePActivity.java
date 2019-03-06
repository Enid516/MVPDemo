package com.example.mvpdemo.mvp.v;

import com.example.mvpdemo.mvp.p.IPresenter;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public abstract class BasePActivity<P extends IPresenter> extends LoadingViewActivity {
    private P mPresenter;

    /**
     * 创建presenter
     *
     * @return
     */
    public abstract P onBindPresenter();

    /**
     * 获取presenter
     *
     * @return
     */
    public P getPresenter() {
        if (mPresenter == null) {
            mPresenter = onBindPresenter();
        }
        return mPresenter;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        /**
         * 在生命周期结束时，将 presenter 与 view 之间的联系断开，防止出现内存泄露
         */
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
