package com.example.myapplication.viewmodel.employee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.data.db.entity.Employee;
import com.example.myapplication.data.db.repository.Repository;

public class ListEmployeeViewModel extends ViewModel {

    private Repository repository;

    public ListEmployeeViewModel(Repository repository) {
        this.repository = repository;
    }

    public LiveData<Employee> getListItemById(String itemId){
        return repository.getEmployee(itemId);
    }

}