package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 6/27/2017.
 */

public class listAdapter extends ArrayAdapter<listItem>{


    int listColor;
    public listAdapter(Activity context, ArrayList<listItem> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        //i.e, we create a new view using inflator
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        listItem word = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView numberField = (TextView) listItemView.findViewById(R.id.numField);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        numberField.setText(word.getNumText());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView placeName= (TextView) listItemView.findViewById(R.id.placeName);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        placeName.setText(word.getPlaceName());

        return listItemView;
    }
}
