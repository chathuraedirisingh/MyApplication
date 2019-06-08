package com.example.myapplication.viewmodel.company;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.data.db.entity.Company;
import com.example.myapplication.data.db.repository.Repository;

public class ListCompanyViewModel extends ViewModel {

    private Repository repository;

    public ListCompanyViewModel(Repository repository) {
        this.repository = repository;
    }

    public LiveData<Company> getCompanyItemById(String itemId){
        return repository.getCompany(itemId);
    }

}