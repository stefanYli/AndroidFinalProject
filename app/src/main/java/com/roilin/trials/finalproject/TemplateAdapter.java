package com.roilin.trials.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TemplateAdapter extends RecyclerView.Adapter<templateViewHolder>
{

    private ArrayList<Template> itemList;


    public TemplateAdapter(ArrayList<Template> _itemList)
    {
        this.itemList = _itemList;
    }


    @NonNull
    @Override
    public templateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_template,parent,false);
        return new templateViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull templateViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return 0;
    }
}
