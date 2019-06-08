package com.example.myapplication.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myapplication.data.db.entity.Company;
import com.example.myapplication.data.db.entity.CompanyDao;
import com.example.myapplication.data.db.entity.Employee;
import com.example.myapplication.data.db.entity.EmployeeDao;

@Database(entities = {Employee.class, Company.class}, version = 1)
public abstract class AppDB extends RoomDatabase {

    public abstract EmployeeDao employeeDao();

    public abstract CompanyDao companyDao();

}
