package com.udacity.shahd.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shahd on 4/14/17.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOCATION_SEPARATOR = " of ";

    public NewsAdapter(@NonNull Context context, @NonNull List<News> newses) {
        super(context, 0, newses);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final News currentNews = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.web_title);
        TextView trailTextTextView = (TextView) listItemView.findViewById(R.id.trail_text);
        TextView sectionNameTextView = (TextView) listItemView.findViewById(R.id.section_name);
        TextView webPublicationDateTextView = (TextView) listItemView.findViewById(R.id.publication_date);


        titleTextView.setText(currentNews.getWebTitle());
        trailTextTextView.setText(currentNews.getTrailText());
        sectionNameTextView.setText(currentNews.getSectionName());
        webPublicationDateTextView.setText(currentNews.getWebPublicationDate()
        );


        return listItemView;
    }



}
