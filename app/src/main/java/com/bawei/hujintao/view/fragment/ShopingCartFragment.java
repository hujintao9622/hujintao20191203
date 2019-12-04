package com.bawei.hujintao.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.base.BaseFragment;
import com.bawei.hujintao.contract.IShopContract;
import com.bawei.hujintao.model.bean.Mall;
import com.bawei.hujintao.presenter.ShopPresenter;
import com.bawei.hujintao.view.activity.MainActivity;
import com.bawei.hujintao.view.adapter.MyAdapter;

import java.util.List;

/**
 * 功能:  购物车页面
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:12
 */
public class ShopingCartFragment extends BaseFragment<ShopPresenter> implements IShopContract.IView{


    private GridView gv;
    private Button shop;

    @Override
    protected ShopPresenter providePresenter() {
        return new ShopPresenter();
    }

    @Override
    protected void initView(View view) {
        //找控件
        gv = view.findViewById(R.id.gv);
        shop = view.findViewById(R.id.shop);
        //点击购物事件
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.jump();
            }
        });
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_shoping_cart;
    }

    @Override
    protected void initData() {
        prsenter.getShopData();
    }


    @Override
    public void onSuccess(Mall mall) {
        List<Mall.ShopGridDataBean> shopGridData = mall.getShopGridData();
        gv.setAdapter(new MyAdapter(shopGridData));
    }

    @Override
    public void onFailure(Throwable e) {
        Log.i("xx",e.toString());
    }
}
