package com.andreslon.appdroid1.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andreslon.appdroid1.R;


/**
 * Fragment for the main content
 */
public class HomeFragment extends Fragment {

    //Contructor
    public HomeFragment() {
    }


    //Initializate
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();

        return fragment;
    }


    //Create View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_home, container, false);



        return view;
    }

}
