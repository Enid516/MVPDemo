package com.example.mvpdemo.mvp;

/**
 * @author enid
 * @date 2019/3/6
 * @description 加载控制
 */
public interface ILoading {
    /**
     * 显示整个页面加载
     */
    void showFullLoading();

    /**
     * 隐藏整个页面加载
     */
    void hideFullLoading();

    /**
     * 显示加载失败
     */
    void showFailedLayout();

    /**
     * 隐藏失败View
     */
    void hideFailedLayout();

    /**
     * 显示数据为空
     */
    void showNoneLayout();

    /**
     * 隐藏空View
     */
    void hideNoneLayout();
}
