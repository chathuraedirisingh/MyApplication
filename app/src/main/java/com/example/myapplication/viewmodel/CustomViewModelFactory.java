package com.example.myapplication.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.data.db.repository.Repository;
import com.example.myapplication.viewmodel.company.ListCompanyCollectionViewModel;
import com.example.myapplication.viewmodel.company.ListCompanyViewModel;
import com.example.myapplication.viewmodel.company.NewCompanyViewModel;
import com.example.myapplication.viewmodel.employee.ListEmployeeCollectionViewModel;
import com.example.myapplication.viewmodel.employee.ListEmployeeViewModel;
import com.example.myapplication.viewmodel.employee.NewEmployeeViewModel;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CustomViewModelFactory implements ViewModelProvider.Factory {
    private final Repository repository;

    @Inject
    public CustomViewModelFactory(Repository repository) {
        this.repository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ListEmployeeCollectionViewModel.class))
            return (T) new ListEmployeeCollectionViewModel(repository);

        else if (modelClass.isAssignableFrom(ListEmployeeViewModel.class))
            return (T) new ListEmployeeViewModel(repository);

        else if (modelClass.isAssignableFrom(NewEmployeeViewModel.class))
            return (T) new NewEmployeeViewModel(repository);

        if (modelClass.isAssignableFrom(ListCompanyCollectionViewModel.class))
            return (T) new ListCompanyCollectionViewModel(repository);

        else if (modelClass.isAssignableFrom(ListCompanyViewModel.class))
            return (T) new ListCompanyViewModel(repository);

        else if (modelClass.isAssignableFrom(NewCompanyViewModel.class))
            return (T) new NewCompanyViewModel(repository);

        else {
            throw new IllegalArgumentException("ViewModel Not Found");
        }
    }
}