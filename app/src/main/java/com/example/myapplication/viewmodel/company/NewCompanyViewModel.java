package com.example.myapplication.viewmodel.company;

import android.annotation.SuppressLint;
import androidx.lifecycle.ViewModel;
import android.os.AsyncTask;

import com.example.myapplication.data.db.entity.Company;
import com.example.myapplication.data.db.repository.Repository;

public class NewCompanyViewModel extends ViewModel {

    private Repository repository;

    public NewCompanyViewModel(Repository repository) {
        this.repository = repository;
    }

    /**
     * Attach our LiveData to the Database
     */
    public void addNewCompanyToDatabase(Company company){
        new AddItemTask().execute(company);
    }

    @SuppressLint("StaticFieldLeak")
    private class AddItemTask extends AsyncTask<Company, Void, Void> {

        @Override
        protected Void doInBackground(Company... item) {
            repository.insertCompany(item[0]);
            return null;
        }
    }
}