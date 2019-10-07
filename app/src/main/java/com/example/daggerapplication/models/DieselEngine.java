package com.example.daggerapplication.models;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d("Diesel", "diesel started");
    }
}
