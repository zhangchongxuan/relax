package com.zhangcx.relax.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        return views;
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

        final TextView viewById = views.findViewById(R.id.num);

        viewById.setText("你好啊小家伙!!");
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
}
