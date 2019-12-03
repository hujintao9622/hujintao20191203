package com.bawei.hujintao.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.model.bean.Mall;
import com.bawei.hujintao.util.NetUtil;

import java.util.List;

/**
 * 功能:  适配器
 * 作者:  胡锦涛
 * 时间:  2019/12/3 0003 上午 10:01
 */
public class MyAdapter extends BaseAdapter {
    private List<Mall.ShopGridDataBean> list;

    public MyAdapter(List<Mall.ShopGridDataBean> shopGridData) {

        list = shopGridData;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //声明优化类
        ViewHolder holder=null;
        if (convertView==null){
            //创建优化类
            holder=new ViewHolder();
            //加载布局
            convertView=View.inflate(parent.getContext(), R.layout.item,null);
            //初始化控件
            holder.img=convertView.findViewById(R.id.it_img);
            holder.title=convertView.findViewById(R.id.it_title);
            holder.price=convertView.findViewById(R.id.it_price);
            //标记
            convertView.setTag(holder);
        }else {
            //复用布局
            holder= (ViewHolder) convertView.getTag();
        }
        //获取数据
        Mall.ShopGridDataBean shopGridDataBean = list.get(position);
        //绑定数据
        holder.title.setText(shopGridDataBean.getTitle());
        holder.price.setText(shopGridDataBean.getPrice());
        NetUtil.getInstance().getBitmap(shopGridDataBean.getImageurl(),holder.img);
        return convertView;
    }
    class ViewHolder{
        ImageView img;
        TextView title;
        TextView price;
    }
}
