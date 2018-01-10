package com.zhangcx.relax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {
    private static final boolean IS_DEBUG = BuildConfig.IS_DEBUG;
    private static final String SERVER_URL0 = BuildConfig.SERVER_URL0;
    private static final String SERVER_URL1 = BuildConfig.SERVER_URL1;
    private TextView tv_url;
    private TextView tv_isDebug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tv_url=(TextView)   findViewById(R.id.tv_url);
        tv_isDebug=(TextView)  findViewById(R.id.tv_isDebug);

        tv_url.setText(SERVER_URL0+SERVER_URL1);

        tv_isDebug.setText(""+IS_DEBUG);


        Logger.e("tkl");

    }
}
