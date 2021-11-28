package com.roilin.trials.finalproject.fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.roilin.trials.finalproject.R;
import com.roilin.trials.finalproject.content.Card;

import java.util.List;

/****************************************************************
 *  THE ADAPTER
 ****************************************************************/

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<Card> cardList;
    private static final String LOG_SOURCE = "CardAdapter";
    public CardAdapter(List<Card> _cardList) {
        this.cardList = _cardList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Card currentCard = cardList.get(position);
        holder.getCardText().setText(currentCard.getCardText());
        //holder.getCardImage().setImageResource(currentCard.getImageUrl());
        /************************************
         * Add onClick for each item
         ************************************/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add a variable to send to the activity
                // then we will change our intent
                Log.i(LOG_SOURCE,"A card was clicked");
            }
        });
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}