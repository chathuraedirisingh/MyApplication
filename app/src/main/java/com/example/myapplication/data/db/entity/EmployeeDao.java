package com.example.myapplication.data.db.entity;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EmployeeDao {

    @Query("SELECT * FROM employee")
    LiveData<List<Employee>> getListEmployeeData();

    @Query("SELECT * FROM employee WHERE empId =:empId")
    LiveData<Employee> getEmployeeById(String empId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertEmployee(Employee employee);

    @Delete
    void deleteEmployee(Employee employee);

}
