package com.example.myapplication.data.db.entity;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CompanyDao {

    @Query("SELECT * FROM company")
    LiveData<List<Company>> getListCompanyData();

    @Query("SELECT * FROM company WHERE comId =:comId")
    LiveData<Company> getCompanyById(String comId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertCompany(Company company);

    @Delete
    void deleteCompany(Company company);

}
