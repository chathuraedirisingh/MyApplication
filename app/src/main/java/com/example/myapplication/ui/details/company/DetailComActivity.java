package com.example.myapplication.ui.details.company;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.util.BaseActivity;

public class DetailComActivity extends BaseActivity {

    private static final String DETAIL_COM_FRAG = "DETAIL_COM_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_com);

        FragmentManager manager = getSupportFragmentManager();
        DetailComFragment fragment = (DetailComFragment) manager.findFragmentByTag(DETAIL_COM_FRAG);

        if(fragment==null){
            fragment = DetailComFragment.newInstance();
        }
        addFragmentToActivity(manager,fragment, R.id.root_com_detail,DETAIL_COM_FRAG);
    }
}
