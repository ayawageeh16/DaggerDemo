package com.example.daggerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerapplication.dagger.CarComponent;
import com.example.daggerapplication.dagger.DaggerCarComponent;
import com.example.daggerapplication.models.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dagger instantiation
        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}
