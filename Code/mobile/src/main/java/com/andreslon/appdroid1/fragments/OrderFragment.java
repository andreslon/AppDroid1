package com.andreslon.appdroid1.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andreslon.appdroid1.R;



public class OrderFragment extends Fragment {

    //Contructor
    public OrderFragment() {
    }


    //Initializate
    public static OrderFragment newInstance() {
        OrderFragment fragment = new OrderFragment();

        return fragment;
    }


    //Create View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_order, container, false);



        return view;
    }

}