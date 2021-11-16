package com.roilin.trials.finalproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class templateViewHolder extends RecyclerView.ViewHolder
{
    private final ImageView mTemplateImage;
    private final TextView mTemplateName;

    public templateViewHolder(@NonNull View itemView)
    {
        super(itemView);
        mTemplateImage = itemView.findViewById(R.id.templateImage);
        mTemplateName = itemView.findViewById(R.id.templateName);
    }

    public ImageView getTemplateImage(){return mTemplateImage;}
    public TextView mTemplateName(){return mTemplateName;}

}


