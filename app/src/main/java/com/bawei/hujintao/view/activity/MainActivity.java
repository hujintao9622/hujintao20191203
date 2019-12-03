package com.bawei.hujintao.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bawei.hujintao.R;
import com.bawei.hujintao.base.BaseActivity;
import com.bawei.hujintao.view.fragment.OtherFragment;
import com.bawei.hujintao.view.fragment.ShopingCartFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RadioGroup rg;
    private ViewPager vp;
List<Fragment> fragmentList=new ArrayList<>();
    @Override
    protected void initData() {
        //设置数据
        OtherFragment shou = OtherFragment.getInstance("首页");
        OtherFragment fen = OtherFragment.getInstance("分类");
        OtherFragment fa = OtherFragment.getInstance("发现");
        ShopingCartFragment shop = new ShopingCartFragment();
        OtherFragment my = OtherFragment.getInstance("我的");
        fragmentList.add(shou);
        fragmentList.add(fen);
        fragmentList.add(fa);
        fragmentList.add(shop);
        fragmentList.add(my);
        //设置适配器
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }
        });
    }

    @Override
    protected void initView() {
        //找控件
        rg = findViewById(R.id.rg);
        vp = findViewById(R.id.vp);
        //关联ViewPager和RadioGroup
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.shou:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.fen:
                        vp.setCurrentItem(1);
                        break;
                    case R.id.fa:
                        vp.setCurrentItem(2);
                        break;
                    case R.id.gou:
                        vp.setCurrentItem(3);
                        break;
                    case R.id.my:
                        vp.setCurrentItem(4);
                        break;

                }
            }
        });
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                rg.check(rg.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
    //跳转到首页
    public void jump(){
        vp.setCurrentItem(0);
    }
}
