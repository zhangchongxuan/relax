package com.zhangcx.relax.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.zhangcx.relax.BR;

/**
 * Created by zhangchongxuan on 18/1/22.
 */

public class UserEntity extends BaseObservable {

    String userName;
    String age;
    String address;

    public UserEntity() {
    }

    public UserEntity(String userName, String age, String address) {
        this.userName = userName;
        this.age = age;
        this.address = address;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);

    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);

    }
}
