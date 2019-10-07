package com.example.daggerapplication.dagger;

import com.example.daggerapplication.MainActivity;
import com.example.daggerapplication.models.Car;
import com.example.daggerapplication.dagger.WheelsModule;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();
    void inject(MainActivity mainActivity);

}
