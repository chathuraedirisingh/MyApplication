package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.dependancyinjection.ApplicationComponent;
import com.example.myapplication.dependancyinjection.ApplicationModule;
import com.example.myapplication.dependancyinjection.DaggerApplicationComponent;
import com.example.myapplication.dependancyinjection.RoomModule;

public class MyApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .roomModule(new RoomModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
