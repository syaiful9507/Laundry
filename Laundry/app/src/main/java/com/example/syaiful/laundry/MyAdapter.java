package com.example.syaiful.laundry;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by AKNS08 on 4/15/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<MyObject> list;

	//menambahkan konstruktor yang mengambil sebagai masukan daftar
    public MyAdapter(List<MyObject> list) {
        this.list = list;
    }



    ////Fungsi ini menciptakan viewHolder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_cards,viewGroup,false);
        return new MyViewHolder(view);
    }

    //di sinilah kita akan memenuhi sel kita dengan teks / gambar dari masing-masing myObjects
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyObject myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
