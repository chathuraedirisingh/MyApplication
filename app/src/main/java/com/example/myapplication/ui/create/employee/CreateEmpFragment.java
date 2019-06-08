package com.example.myapplication.ui.create.employee;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreateEmpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateEmpFragment extends Fragment {


    public CreateEmpFragment() {
        // Required empty public constructor
    }


    public static CreateEmpFragment newInstance() {
        return new CreateEmpFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_emp, container, false);
    }

}
