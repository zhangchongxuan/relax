package com.zhangcx.relax;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zhangcx.relax.databinding.ActivityMainBinding;
import com.zhangcx.relax.entity.UserEntity;

public class MainActivity extends AppCompatActivity {
    private static final boolean IS_DEBUG = BuildConfig.IS_DEBUG;
    private static final String SERVER_URL0 = BuildConfig.SERVER_URL0;
    private static final String SERVER_URL1 = BuildConfig.SERVER_URL1;
    private static final String which = BuildConfig.which;

    private ActivityMainBinding mainBinding;


    UserEntity mEntity = new UserEntity("zhangcx", "18", "北京市昌平区生命科学园");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainBinding.setUser(mEntity);

    }

}
