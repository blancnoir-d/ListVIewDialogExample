package com.project.saeha.listviewdialogexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DialogListVIewAdapter extends BaseAdapter{
    Context mContext;
    String[] mMenuList;
    LayoutInflater mInflater;


    public DialogListVIewAdapter(Context context, String[] menuList){
        this.mContext = context;
        this.mMenuList = menuList;

    }

    @Override
    public int getCount() {
        return mMenuList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = mInflater.inflate(R.layout.item_main_dialog_list, viewGroup,false);
        TextView tvMenuName = (TextView)view.findViewById(R.id.tv_menu_name);
        tvMenuName.setText(mMenuList[i]);
        return view;
    }
}
