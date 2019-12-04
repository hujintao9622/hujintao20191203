package com.bawei.hujintao.presenter;

import com.bawei.hujintao.base.BasePresenter;
import com.bawei.hujintao.contract.IShopContract;
import com.bawei.hujintao.model.ShopModel;
import com.bawei.hujintao.model.bean.Mall;

/**
 * 功能:  P层
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:59
 */
public class ShopPresenter extends BasePresenter<IShopContract.IView> implements IShopContract.IPresenter{

    private ShopModel shopModel;

    @Override
    protected void initModel() {
        shopModel = new ShopModel();
    }

    @Override
    public void getShopData() {

        shopModel.getShopData(new IShopContract.IModel.IModelCallBack() {
            @Override
            public void onSuccess(Mall mall) {
               view.onSuccess(mall);
            }

            @Override
            public void onFailure(Throwable e) {
                view.onFailure(e);
            }
        });
    }
}
