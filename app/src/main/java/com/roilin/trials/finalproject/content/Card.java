package com.roilin.trials.finalproject.content;

public class Card {

    private String cardText;
    private String imageUrl;

    public Card(String cardText, String imageUrl) {
        this.cardText = cardText;
        this.imageUrl = imageUrl;
    }
    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
