package com.example.mvpdemo.mvp.p;

import com.example.mvpdemo.mvp.ILoading;
import com.example.mvpdemo.mvp.ILoadingView;
import com.example.mvpdemo.mvp.IView;

import java.lang.ref.WeakReference;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public class BasePresenter<V extends ILoadingView> implements IPresenter {
    /**
     * 采用弱引用方式防止内存泄漏
     */
    private WeakReference<V> mViewRef;

    private ILoading mLoading;

    public BasePresenter(V v) {
        attachView(v);
    }

    private void attachView(V v){
        mViewRef = new WeakReference<V>(v);
        mLoading = v;
    }

    public V getView(){
        return mViewRef.get();
    }

    @Override
    public boolean isViewAttach() {
        return mViewRef != null && mViewRef.get() != null;
    }

    @Override
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
