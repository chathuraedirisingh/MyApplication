package com.example.myapplication.viewmodel.company;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import android.os.AsyncTask;

import com.example.myapplication.data.db.entity.Company;
import com.example.myapplication.data.db.repository.Repository;

import java.util.List;

public class ListCompanyCollectionViewModel extends ViewModel {

    private Repository repository;

    public ListCompanyCollectionViewModel(Repository repository) {
        this.repository = repository;
    }

    public LiveData<List<Company>> getCompanies() {
        return repository.getCompanies();
    }

    public void deleteCompanyItem(Company company) {
        DeleteItemTask deleteItemTask = new DeleteItemTask();
        deleteItemTask.execute(company);
    }

    @SuppressLint("StaticFieldLeak")
    private class DeleteItemTask extends AsyncTask<Company, Void, Void> {

        @Override
        protected Void doInBackground(Company... item) {
            repository.deleteCompany(item[0]);
            return null;
        }
    }

}
