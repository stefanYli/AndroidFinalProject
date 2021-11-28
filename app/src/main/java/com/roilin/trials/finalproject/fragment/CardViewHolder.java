package com.roilin.trials.finalproject.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.roilin.trials.finalproject.R;

/****************************************************************
 *  View Holder
 ****************************************************************/
public class CardViewHolder extends RecyclerView.ViewHolder
{

    /*****************************
     * the items from the Card
     *****************************/
    private final TextView cardText;
    private final ImageView cardImage;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        cardText = itemView.findViewById(R.id.cardText);
        cardImage = itemView.findViewById(R.id.cardImage);
    }

    public TextView getCardText() { return cardText; }

    public ImageView getCardImage() { return cardImage; }
}
