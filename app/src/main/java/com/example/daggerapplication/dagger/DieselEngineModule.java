package com.example.daggerapplication.dagger;


import com.example.daggerapplication.models.DieselEngine;
import com.example.daggerapplication.models.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    public abstract Engine providesDieselEngine(DieselEngine engine);
}
