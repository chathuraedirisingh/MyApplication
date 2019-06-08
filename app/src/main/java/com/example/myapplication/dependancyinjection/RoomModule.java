package com.example.myapplication.dependancyinjection;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;

import com.example.myapplication.data.db.AppDB;
import com.example.myapplication.data.db.entity.CompanyDao;
import com.example.myapplication.data.db.entity.EmployeeDao;
import com.example.myapplication.data.db.repository.Repository;
import com.example.myapplication.viewmodel.CustomViewModelFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    private final AppDB database;

    public RoomModule(Application application) {
        this.database = Room.databaseBuilder(
                application,
                AppDB.class,
                "myApp.db"
        ).build();
    }

    @Provides
    @Singleton
    Repository provideRepository(EmployeeDao employeeDao, CompanyDao companyDao){
        return new Repository(employeeDao, companyDao);
    }


    @Provides
    @Singleton
    EmployeeDao provideEmployeeDao(AppDB database){
        return database.employeeDao();
    }

    @Provides
    @Singleton
    CompanyDao provideCompanyDao(AppDB database){
        return database.companyDao();
    }

    @Provides
    @Singleton
    AppDB provideDtabase(Application application){
        return database;
    }

    @Provides
    @Singleton
    ViewModelProvider.Factory provideViewModelFactory(Repository repository){
        return new CustomViewModelFactory(repository);
    }
}