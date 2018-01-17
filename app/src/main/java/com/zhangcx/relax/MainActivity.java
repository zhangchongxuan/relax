package com.zhangcx.relax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {
    private static final boolean IS_DEBUG = BuildConfig.IS_DEBUG;
    private static final String SERVER_URL0 = BuildConfig.SERVER_URL0;
    private static final String SERVER_URL1 = BuildConfig.SERVER_URL1;
    private static final String which = BuildConfig.which;

    private TextView tv_url;
    private TextView tv_isDebug;
    private TextView tv_isFree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tv_url=(TextView)   findViewById(R.id.tv_url);
        tv_isDebug=(TextView)  findViewById(R.id.tv_isDebug);
        tv_isFree=(TextView)  findViewById(R.id.tv_isFree);

        tv_url.setText(SERVER_URL0+SERVER_URL1);

        tv_isDebug.setText(""+IS_DEBUG);


        tv_isFree.setText(which);


        Logger.e("tkl");

    }
}
