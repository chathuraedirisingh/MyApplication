package com.example.myapplication.ui.list.employee;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.util.BaseActivity;
import com.google.android.material.navigation.NavigationView;

public class ListEmpActivity extends BaseActivity {

    private static final String LIST_EMP_FRAG = "LIST_EMP_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_emp);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame);

        getLayoutInflater().inflate(R.layout.activity_list_emp, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().getItem(0).setChecked(true);

        FragmentManager manager = getSupportFragmentManager();
        ListEmpFragment fragment = (ListEmpFragment) manager.findFragmentByTag(LIST_EMP_FRAG);

        if(fragment==null){
            fragment = ListEmpFragment.newInstance();
        }
        addFragmentToActivity(manager,fragment,R.id.root_emp_list,LIST_EMP_FRAG);
    }
}
