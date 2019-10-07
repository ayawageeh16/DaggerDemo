package com.example.daggerapplication.dagger;

import com.example.daggerapplication.modules.Rims;
import com.example.daggerapplication.modules.Tires;
import com.example.daggerapplication.modules.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
      return new Rims();
    }

    // make it static if this method doesnot depend on class instance
    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
