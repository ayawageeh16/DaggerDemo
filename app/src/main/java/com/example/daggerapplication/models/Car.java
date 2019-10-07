package com.example.daggerapplication.models;

import android.util.Log;

import com.example.daggerapplication.modules.Wheels;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "car";
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "driving ...");
    }

    @Inject
    public void enableRemote(Remote remote){
           remote.setListener(this);
    }
}
