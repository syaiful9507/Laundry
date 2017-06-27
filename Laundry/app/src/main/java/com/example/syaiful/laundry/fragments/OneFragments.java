package com.example.syaiful.laundry.fragments;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.syaiful.laundry.MyAdapter;
import com.example.syaiful.laundry.MyObject;
import com.example.syaiful.laundry.R;

import java.util.ArrayList;
import java.util.List;

public class OneFragments extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;


    private List<MyObject> cities = new ArrayList<>();
    public OneFragments() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //recyclerView.setLayoutManager(new GridLayoutManager(getActivity().getApplication(), 2));
        //recyclerView = (RecyclerView)getView().findViewById(R.id.recyclerView);
        View view =inflater.inflate(R.layout.activity_one_fragments, container, false);
        ajouterVilles();
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(new MyAdapter(cities));


        return view;

    }
    private void ajouterVilles() {
        cities.add(new MyObject("Cuci Setrika",R.drawable.laundry));
        cities.add(new MyObject("Setrika",R.drawable.laundry));
        cities.add(new MyObject("Cuci basah",R.drawable.laundry));
        cities.add(new MyObject("Cuci kering",R.drawable.laundry));
        cities.add(new MyObject("etc",R.drawable.laundry));
        cities.add(new MyObject("",R.drawable.laundry));
    }
}
