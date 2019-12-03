package com.bawei.hujintao.presenter;

import com.bawei.hujintao.contract.IShopContract;
import com.bawei.hujintao.model.ShopModel;
import com.bawei.hujintao.model.bean.Mall;

/**
 * 功能:  P层
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:59
 */
public class ShopPresenter {
    public void getShopData(final IShopContract.IViewCallBack iViewCallBack){
        ShopModel shopModel = new ShopModel();
        shopModel.getShopData(new IShopContract.IModelCallBack() {
            @Override
            public void onSuccess(Mall mall) {
                iViewCallBack.onSuccess(mall);
            }

            @Override
            public void onFailure(Throwable e) {
                iViewCallBack.onFailure(e);
            }
        });
    }
}
