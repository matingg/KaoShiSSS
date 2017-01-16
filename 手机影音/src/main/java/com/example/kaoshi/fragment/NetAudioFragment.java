package com.example.kaoshi.fragment;

import android.view.View;

import com.example.kaoshi.R;
import com.example.kaoshi.base.BaseFragment;
import com.example.kaoshi.bean.NetAudioBean;

import java.util.List;

/**
 * Created by 麻少亭 on 2017/1/16.
 */

public class NetAudioFragment extends BaseFragment {

    private static final String TAG = NetAudioFragment.class.getSimpleName();
    private List<NetAudioBean.ListBean> datas;

//    @Bind(R.id.listview)
//    ListView listview;
//    @Bind(R.id.progressbar)
//    ProgressBar progressbar;
//    @Bind(R.id.tv_nomedia)
//    TextView tvNomedia;

    @Override
    public View initView() {

        View view = View.inflate(mContext, R.layout.fragment_net_audio, null);
//        ButterKnife.bind(this, view);
        return view;
    }
}
