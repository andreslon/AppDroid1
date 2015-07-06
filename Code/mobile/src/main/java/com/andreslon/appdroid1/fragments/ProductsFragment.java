package com.andreslon.appdroid1.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andreslon.appdroid1.R;



public class ProductsFragment extends Fragment {

    //Contructor
    public ProductsFragment() {
    }


    //Initializate
    public static ProductsFragment newInstance() {
        ProductsFragment fragment = new ProductsFragment();

        return fragment;
    }


    //Create View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_products, container, false);



        return view;
    }

}