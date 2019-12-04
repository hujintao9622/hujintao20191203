package com.bawei.hujintao.contract;

import com.bawei.hujintao.model.ShopModel;
import com.bawei.hujintao.model.bean.Mall;

/**
 * 功能:  契约
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:54
 */
public interface IShopContract {

    //P到V
    interface IView{
        void onSuccess(Mall mall);
        void onFailure(Throwable e);
    }
    interface IPresenter{
        void getShopData();
    }
    interface IModel{
        void getShopData(IShopContract.IModel.IModelCallBack iModelCallBack);
        //M到P
        interface IModelCallBack{
            void onSuccess(Mall mall);
            void onFailure(Throwable e);
        }
    }
}
