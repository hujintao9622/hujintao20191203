package com.bawei.hujintao.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bawei.hujintao.R;

/**
 * 功能:  Activity基类
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:02
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int layoutId();
}
