package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.cropToPadding;
import static android.R.attr.elegantTextHeight;
import static android.R.attr.name;
import static com.example.android.miwok.R.id.defaultTranslation;

/**
 * Created by kelvinson on 6/2/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //the corresponing color for the backgrond of the list item
    private int mColorResourceId;

    /**
     *
     * @param context the current context used to inflate the layout file
     * @param words a list of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context,0, words);
        mColorResourceId = colorResourceId;
    }

    /**
     *
     * @param position the position in the list of data that should be displayed in the
     *                 list view
     * @param convertView the recycled view to populate
     * @param parent the parent ViewGroup that is used for inflation
     * @return the view for the position in the adapterView
     */
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        //change the background color of the list item
        //get the words object located at this position in the list
        Word currentWord = getItem(position);

        //find the gridview in the list_item.xlml layout with the text defaultTranslation;
        TextView defalutView = (TextView) listItemView.findViewById(defaultTranslation);
        defalutView.setText(currentWord.getmDefaultTranslation());

        //find the textView in teh list_item.xml layout with the defaultTranslation
        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        miwokView.setText(currentWord.getmMiwokTranslation());

        /**find the textView in teh list_item.xml layout with the defaultTranslation
        Note: for phrases activity there is no image resource id in the corresponing word instance
         and for the list item view so one solution is to set the visibity of imageView of the  Word
         object with no mImageResourceID field to INVISABILITY(4)
         field
        */
//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageResourceId);
//        imageView.setImageResource(currentWord.getmResourceID());

        //Find the imageView in the list_item.xml layout with the ID imageResourceId
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageResourceId);
        if (currentWord.hasImage()) {
            // Set the ImageView to the image resource specified in the current word
            imageView.setImageResource(currentWord.getmResourceID());

            // Make sure the view is visible becuase views in the simulator is reused
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        //change the background color of the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
