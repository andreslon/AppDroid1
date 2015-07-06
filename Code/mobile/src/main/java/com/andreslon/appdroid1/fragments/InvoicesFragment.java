package com.andreslon.appdroid1.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andreslon.appdroid1.R;


public class InvoicesFragment extends Fragment {

    //Contructor
    public InvoicesFragment() {
    }


    //Initializate
    public static InvoicesFragment newInstance() {
        InvoicesFragment fragment = new InvoicesFragment();

        return fragment;
    }


    //Create View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_invoices, container, false);



        return view;
    }

}