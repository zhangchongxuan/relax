package com.zhangcx.relax;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;


import com.zhangcx.mylibrary.utils.PermissionUtil;
import com.zhangcx.relax.base.BaseActivity;
import com.zhangcx.relax.entity.Tab;
import com.zhangcx.relax.fragment.FourFragment;
import com.zhangcx.relax.fragment.OneFragment;
import com.zhangcx.relax.fragment.ThreeFragment;
import com.zhangcx.relax.fragment.TwoFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    private FragmentTabHost mTabHost;

    private ArrayList<Tab> mTabs = new ArrayList<>();
    private LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initTabs();

//        PermissionUtil.requestPerssions(this,)
    }

    private void initViews() {

        mTabHost =  findViewById(android.R.id.tabhost);

        mTabHost.setup(this, getSupportFragmentManager(), R.id.realcontent);

        mInflater = LayoutInflater.from(this);


    }

    private void initListener() {

    }


    private void initData() {

    }

    private void initTabs() {
        Tab tabOne = new Tab(R.mipmap.ic_launcher, R.string.OneFragment, OneFragment.class);
        Tab tabTwo = new Tab(R.mipmap.ic_launcher, R.string.TwoFragment, TwoFragment.class);
        Tab tabThree = new Tab(R.mipmap.ic_launcher, R.string.ThreeFragment, ThreeFragment.class);
        Tab tabFour = new Tab(R.mipmap.ic_launcher, R.string.FourFragment, FourFragment.class);
        mTabs.add(tabOne);
        mTabs.add(tabTwo);
        mTabs.add(tabThree);
        mTabs.add(tabFour);

        for (Tab tab : mTabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(String.valueOf(tab.getText()));
            tabSpec.setIndicator(buildView(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(), null);
        }
        //通过这行代码可以去除掉底部菜单5个图表之间的分割线
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
    }

    //设置Indicator中的View
    private View buildView(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView Tab_img = (ImageView) view.findViewById(R.id.tab_img);
        TextView Tab_txt = (TextView) view.findViewById(R.id.tab_txt);

        Tab_img.setBackgroundResource(tab.getImage());
        Tab_txt.setText(tab.getText());
        return view;
    }

    @Override
    public String getToolbarTitle() {
        return "你好啊 !!!!!";
    }

    @Override
    public void getToolbarBack() {
        finish();

    }

    @Override
    public boolean isHideToolBar() {
        return false;
    }

    @Override
    public int setToolBarBG() {
        return getResources().getColor(R.color.colorAccent);
    }
}

