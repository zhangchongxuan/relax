package com.zhangcx.relax.base;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.zhangcx.relax.R;

/**
 * Created by zhangchongxuan on 18/1/28.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private TextView toolbar_title;
    private TextView toolbar_subtitle;
    private TextView toolbar_arrow;

    private boolean isHideToolBar = false;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        //透明状态栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mToolbar = findViewById(R.id.toolbar);
        toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_subtitle = findViewById(R.id.toolbar_subtitle);
        toolbar_arrow = findViewById(R.id.toolbar_arrow);

        if (mToolbar != null) {
            //将Toolbar显示到界面
            setSupportActionBar(mToolbar);
        }
        if (toolbar_title != null) {
            //getTitle()的值是activity的android:lable属性值
            toolbar_title.setText("abc");
            //设置默认的标题不显示
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        ToolBarSettings();

    }

    private void ToolBarSettings() {
        if (toolbar_arrow != null) {
            toolbar_arrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getToolbarBack();
                }
            });
        }

        if (toolbar_title != null) {
            toolbar_title.setText(getToolbarTitle());
        }

        if (mToolbar != null) {
            if (isHideToolBar()) {
                mToolbar.setVisibility(View.GONE);
            } else {
                mToolbar.setVisibility(View.VISIBLE);
            }
            mToolbar.setBackgroundColor(setToolBarBG());
        }
    }

    public abstract String getToolbarTitle();

    public abstract void getToolbarBack();

    public abstract boolean isHideToolBar();

    public abstract int setToolBarBG();

}
