package com.example.myapplication.dependancyinjection;

import android.app.Application;

import com.example.myapplication.ui.create.company.CreateComFragment;
import com.example.myapplication.ui.create.employee.CreateEmpFragment;
import com.example.myapplication.ui.details.company.DetailComFragment;
import com.example.myapplication.ui.details.employee.DetailEmpFragment;
import com.example.myapplication.ui.list.company.ListComFragment;
import com.example.myapplication.ui.list.employee.ListEmpFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, RoomModule.class})
public interface ApplicationComponent {

    void inject(ListEmpFragment listEmpFragment);
    void inject(CreateEmpFragment createEmpFragment);
    void inject(DetailEmpFragment detailEmpFragment);

    void inject(ListComFragment listComFragment);
    void inject(CreateComFragment createComFragment);
    void inject(DetailComFragment detailComFragment);

    Application application();

}