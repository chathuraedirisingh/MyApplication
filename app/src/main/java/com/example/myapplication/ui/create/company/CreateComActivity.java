package com.example.myapplication.ui.create.company;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.util.BaseActivity;

public class CreateComActivity extends BaseActivity {

    private static final String CREATE_COM_FRAG = "CREATE_COM_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



//        setContentView(R.layout.activity_create_com);

        FragmentManager manager = getSupportFragmentManager();
        CreateComFragment fragment = (CreateComFragment) manager.findFragmentByTag(CREATE_COM_FRAG);

        if(fragment==null){
            fragment = CreateComFragment.newInstance();
        }
        addFragmentToActivity(manager,fragment, R.id.root_com_create,CREATE_COM_FRAG);

    }
}
