package com.pinger.gankit.ui.view.gank;

/*
 *  @项目名：  GankIT 
 *  @包名：    com.pinger.gankit.ui.view.gank
 *  @文件名:   GankTuiJianView
 *  @创建者:   Pinger
 *  @创建时间:  2016/11/11 14:43
 *  @描述：    TODO
 */

import android.content.Context;
import android.util.AttributeSet;

import com.pinger.gankit.model.bean.GankBean;
import com.pinger.gankit.ui.adapter.GankAdapter;

import java.util.List;

public class GankTuiJianView extends GankBaseView {

    public GankTuiJianView(Context context) {
        this(context, null);
    }

    public GankTuiJianView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initData(GankAdapter adapter, List<GankBean> gankBeanList) {
        adapter.setNewData(gankBeanList);
    }

    @Override
    protected void initMoreData(GankAdapter adapter, List<GankBean> gankBeanMoreList) {
        adapter.addData(gankBeanMoreList);
    }
}