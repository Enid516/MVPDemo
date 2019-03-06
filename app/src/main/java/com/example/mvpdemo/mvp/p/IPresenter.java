package com.example.mvpdemo.mvp.p;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public interface IPresenter {
    /**
     * 判断presenter 和 view 是否建立关联，防止内存泄漏
     * @return
     */
    boolean isViewAttach();

    /**
     * 断开presenter 和 view 之间的关联
     */
    void detachView();
}
