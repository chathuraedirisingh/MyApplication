package com.example.myapplication.ui.list.company;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.util.BaseActivity;
import com.google.android.material.navigation.NavigationView;

public class ListComActivity extends BaseActivity {

    private static final String LIST_COM_FRAG = "LIST_COM_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_com);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_list_com, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().getItem(1).setChecked(true);



        FragmentManager manager = getSupportFragmentManager();
        ListComFragment fragment = (ListComFragment) manager.findFragmentByTag(LIST_COM_FRAG);

        if(fragment==null){
            fragment = ListComFragment.newInstance();
        }
        addFragmentToActivity(manager,fragment, R.id.root_com_list,LIST_COM_FRAG);
    }
}
