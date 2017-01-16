package com.example.kaoshi.fragment;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.example.kaoshi.base.BaseFragment;

/**
 * Created by 麻少亭 on 2017/1/16.
 */

public class LocalVideoFragment extends BaseFragment {
    @Override
    public View initView() {
        TextView view = new TextView(mContext);
        view.setTextSize(25);
        view.setTextColor(Color.RED);
        view.setText("本地视频");
        return view;
    }
}
