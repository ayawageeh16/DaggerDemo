package com.example.daggerapplication.models;

import android.util.Log;

import com.example.daggerapplication.models.Car;

import javax.inject.Inject;

public class Remote {

    private static final  String TAG ="Remote";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG,"Remote Connected");
    }
}
