package com.bawei.hujintao.base;

import android.icu.util.IslamicCalendar;

import com.bawei.hujintao.contract.IShopContract;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 下午 6:29
 */
public abstract class BasePresenter <V> {
    protected V view;
    public void attach(V view){
        this.view=view;
    }
    public void detach(){
        view=null;
    }

    public BasePresenter() {
        initModel();
    }
    protected abstract void initModel();
}
