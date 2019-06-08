package com.example.myapplication.ui.create.employee;

import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.util.BaseActivity;

public class CreateEmpActivity extends BaseActivity {

    private static final String CREATE_EMP_FRAG = "CREATE_EMP_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_emp);

        FragmentManager manager = getSupportFragmentManager();
        CreateEmpFragment fragment = (CreateEmpFragment) manager.findFragmentByTag(CREATE_EMP_FRAG);

        if(fragment==null){
            fragment = CreateEmpFragment.newInstance();
        }
        addFragmentToActivity(manager,fragment, R.id.root_emp_create,CREATE_EMP_FRAG);
    }
}
