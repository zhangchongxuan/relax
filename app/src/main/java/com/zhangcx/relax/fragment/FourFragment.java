package com.zhangcx.relax.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.logger.Logger;
import com.zhangcx.relax.R;
import com.zhangcx.relax.base.BaseFragement;

/**
 * Created by zhangchongxuan on 18/1/28.
 */

public class FourFragment extends BaseFragement {
    String TAG="FourFragment";



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "onCreate: " );
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        Log.e(TAG,"onCreateView");

        return inflater.inflate(R.layout.fragment_four,container,false);
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

        Log.e(TAG,"onStop");

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
