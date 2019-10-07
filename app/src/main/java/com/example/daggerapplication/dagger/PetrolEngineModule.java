package com.example.daggerapplication.dagger;

import com.example.daggerapplication.models.Engine;
import com.example.daggerapplication.models.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine providesPetrolEngine(PetrolEngine petrolEngine);

}
