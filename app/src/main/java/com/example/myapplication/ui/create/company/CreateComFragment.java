package com.example.myapplication.ui.create.company;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateComFragment extends Fragment {


    public CreateComFragment() {
        // Required empty public constructor
    }

    public static CreateComFragment newInstance() {
        return new CreateComFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_com, container, false);
    }

}
