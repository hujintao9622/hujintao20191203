package com.bawei.hujintao.model;

import com.bawei.hujintao.contract.IShopContract;
import com.bawei.hujintao.model.bean.Mall;
import com.bawei.hujintao.util.NetUtil;
import com.google.gson.Gson;

/**
 * 功能:  M层
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:53
 */
public class ShopModel {
    String st="http://blog.zhaoliang5156.cn/api/mall/mall.json";
    //请求数据
    public void getShopData(final IShopContract.IModelCallBack iModelCallBack){
        NetUtil.getInstance().getJson(st, new NetUtil.MyCallBack() {
            @Override
            public void onGetJson(String json) {
                //解析
                Mall mall = new Gson().fromJson(json, Mall.class);
                iModelCallBack.onSuccess(mall);
            }

            @Override
            public void onFailure(Throwable e) {
                iModelCallBack.onFailure(e);
            }
        });
    }
}
