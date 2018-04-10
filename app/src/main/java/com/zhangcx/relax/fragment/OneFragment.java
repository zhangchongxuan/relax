package com.zhangcx.relax.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.orhanobut.logger.Logger;
import com.zhangcx.relax.R;
import com.zhangcx.relax.base.BaseFragement;

/**
 * Created by zhangchongxuan on 18/1/28.
 */

public class OneFragment extends BaseFragement {

    String TAG="OneFragment";
    private LayoutInflater inflater;
    private View views;
    private WebView webView;

    private String url="http://10.130.203.17/gtask/html/index/cleanSupervisorIndex.html?token=66f8a933bffa4d9398d0c340f151d762";
//    private String url="http://10.130.203.17/login/html/login/login.html";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "onCreate: " );
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        this.inflater=inflater;
        Log.e(TAG,"onCreateView");
          views = inflater.inflate(R.layout.fragment_one, container, false);


        initData();
        return views;
    }

    private void initData() {
        if(views!=null){
            webView=(WebView)   views.findViewById(R.id.web);

            if (webView != null) {
//            webView.getSettings().setBuiltInZoomControls(true);
//            webView.getSettings().setSupportZoom(true);
//            webView.getSettings().setUseWideViewPort(true);
//            webView.getSettings().setLoadWithOverviewMode(true);
                //禁止缩放
                webView.getSettings().setBuiltInZoomControls(false);
                webView.getSettings().setSupportZoom(false);
                webView.getSettings().setDisplayZoomControls(false);

                //webview在安卓5.0之前默认允许其加载混合网络协议内容
                // 在安卓5.0之后，默认不允许加载http与https混合内容，需要设置webview允许其加载混合网络协议内容
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
                }
                //允许JavaScript执行
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
                webView.getSettings().setDomStorageEnabled(true);
                webView.requestFocus(View.FOCUS_DOWN);
                webView.requestFocusFromTouch();
                webView.setWebViewClient(new MyWebClient());


                webView.loadUrl(url);

            }

        }
    }


    @Override
    public void onStart() {
        super.onStart();

        Log.e(TAG,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");

    }

    @Override
    public void onStop() {
        super.onStop();

        Logger.e(TAG,"onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG,"onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e(TAG,"onDestroy");

    }


    private class MyWebClient extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView view, final String url) {
            Log.e(TAG, "shouldOverrideUrlLoading1: " + url);
            view.loadUrl(url);
            return true;
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            final String url = request.getUrl().toString();

            Log.e(TAG, "shouldOverrideUrlLoading2: " + url);
            view.loadUrl(url);
            return true;
        }
    }
}
