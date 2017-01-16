package com.example.kaoshi.fragment;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.example.kaoshi.base.BaseFragment;


public class LocalAudioFragment extends BaseFragment {

    @Override
    public View initView() {
        TextView view = new TextView(mContext);

        view.setTextSize(25);


        view.setTextColor(Color.RED);
        view.setText("本地yinyue ");
        return view;
    }
}
