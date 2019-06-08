package com.example.myapplication.ui.details.employee;

import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.util.BaseActivity;

public class DetailEmpActivity extends BaseActivity {

    private static final String DETAIL_EMP_FRAG = "DETAIL_EMP_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_emp);

        FragmentManager manager = getSupportFragmentManager();
        DetailEmpFragment fragment = (DetailEmpFragment) manager.findFragmentByTag(DETAIL_EMP_FRAG);

        if(fragment==null){
            fragment = DetailEmpFragment.newInstance();
        }
        addFragmentToActivity(manager,fragment,R.id.root_emp_details,DETAIL_EMP_FRAG);
    }
}
