package com.example.myapplication.dependancyinjection;

import android.app.Application;

import com.example.myapplication.MyApplication;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final MyApplication application;
    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    MyApplication provideRoomDemoApplication(){
        return application;
    }

    @Provides
    Application provideApplication(){
        return application;
    }
}
