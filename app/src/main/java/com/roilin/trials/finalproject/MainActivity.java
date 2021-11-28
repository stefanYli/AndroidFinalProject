package com.roilin.trials.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.roilin.trials.finalproject.content.Datasources;
import com.roilin.trials.finalproject.fragment.BlankFragment;
import com.roilin.trials.finalproject.fragment.CardAdapter;
import com.roilin.trials.finalproject.fragment.RecyclerFragment;

public class MainActivity extends AppCompatActivity {

    /*********************************
     * Declare the fragments
     *********************************/
    private BlankFragment blankFragment;
    private RecyclerFragment myCardsFragment;
    private RecyclerView cardRecyclerView;
    private Datasources data = new Datasources();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        cardRecyclerView = this.findViewById(R.id.recyclerView);
        data.initData();
        cardRecyclerView.setAdapter(new CardAdapter(data.getCardItems()));
        cardRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }



}