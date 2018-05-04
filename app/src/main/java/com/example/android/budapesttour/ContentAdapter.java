package com.example.android.budapesttour;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dzsub on 2018.05.03..
 */

public class ContentAdapter extends ArrayAdapter<Content> {

    private int mContainerColorResourceId;

    public ContentAdapter (Activity context, ArrayList<Content> contents, int containerColorResourceId){
        super(context, 0, contents);
        mContainerColorResourceId = containerColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        final Content currentContent = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentContent.getmName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);

        if (currentContent.hasAddress()) {
            addressTextView.setText(currentContent.getmAddress());
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture);

        if (currentContent.hasPicture()){
            pictureImageView.setImageResource(currentContent.getmPicture());
            pictureImageView.setVisibility(View.VISIBLE);
        } else {
            pictureImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mContainerColorResourceId);
        if ((position % 2) == 1) {
            textContainer.setBackgroundColor(color);
        } else {
            textContainer.setBackgroundColor(Color.WHITE);
        }

        return listItemView;
    }
}
