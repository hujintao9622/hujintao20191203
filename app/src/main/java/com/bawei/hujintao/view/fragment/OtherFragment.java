package com.bawei.hujintao.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.base.BaseFragment;
import com.bawei.hujintao.util.NetUtil;

/**
 * 功能:  其他页面
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 9:12
 */
public class OtherFragment extends BaseFragment {

    private TextView name,cont;
    private LinearLayout ll;

    @Override
    protected void initView(View view) {
        //找控件
        name = view.findViewById(R.id.ot_name);
        cont = view.findViewById(R.id.ot_cont);
        ll = view.findViewById(R.id.ll);

    }

    @Override
    protected int layoutId() {
        return R.layout.other;
    }

    @Override
    protected void initData() {
        //接收值
        String key = getArguments().getString("key");
        name.setText(key);
        //判断网络
        if (NetUtil.getInstance().hsaNet(getContext())){
            cont.setVisibility(View.VISIBLE);
            ll.setVisibility(View.GONE);
        }else {
            cont.setVisibility(View.GONE);
            ll.setVisibility(View.VISIBLE);
        }
    }

    public static OtherFragment getInstance(String value) {
        OtherFragment other = new OtherFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key",value);
        other.setArguments(bundle);
        return other;
    }
}
