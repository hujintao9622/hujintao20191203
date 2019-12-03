package com.bawei.hujintao.contract;

import com.bawei.hujintao.model.bean.Mall;

/**
 * 功能:  契约
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:54
 */
public interface IShopContract {
    //M到P
    interface IModelCallBack{
        void onSuccess(Mall mall);
        void onFailure(Throwable e);
    }
    //P到V
    interface IViewCallBack{
        void onSuccess(Mall mall);
        void onFailure(Throwable e);
    }
}
