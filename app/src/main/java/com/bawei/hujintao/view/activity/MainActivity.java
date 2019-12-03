package com.bawei.hujintao.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bawei.hujintao.R;
import com.bawei.hujintao.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private RadioGroup rg;
    private ViewPager vp;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        //找控件
        rg = findViewById(R.id.rg);
        vp = findViewById(R.id.vp);
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
}
