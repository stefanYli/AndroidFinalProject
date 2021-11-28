package com.roilin.trials.finalproject.content;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Datasources {

    private List<Card> cardItems;
    private static final String LOG_SOURCE = "Datasources";

    public Datasources() {
        /* empty */
    }

    public void initData() {
        cardItems = new ArrayList<>();

        cardItems.add(new Card("Nature", "url"));
        cardItems.add(new Card("Sea", "url"));
        cardItems.add(new Card("Building", "url"));
        cardItems.add(new Card("Foggy", "url"));
        cardItems.add(new Card("item1", "url"));
        cardItems.add(new Card("item2", "url"));
        cardItems.add(new Card("item3", "url"));
        cardItems.add(new Card("item4", "url"));
        cardItems.add(new Card("Nature", "url"));
        cardItems.add(new Card("Sea", "url"));
        cardItems.add(new Card("Building", "url"));
        cardItems.add(new Card("Foggy", "url"));
        cardItems.add(new Card("item1", "url"));
        cardItems.add(new Card("item2", "url"));
        cardItems.add(new Card("item3", "url"));
        cardItems.add(new Card("item4", "url"));
        Log.i(LOG_SOURCE,"Card items are added");
    }

    public List<Card> getCardItems() {
        return cardItems;
    }

}
