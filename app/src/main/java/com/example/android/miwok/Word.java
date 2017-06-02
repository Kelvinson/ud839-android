package com.example.android.miwok;

import static com.example.android.miwok.R.id.imageResourceId;
import static com.example.android.miwok.R.mipmap.ic_launcher;

/**
 * Created by kelvinson on 6/2/17.
 * Word represents a vocabulary word that the user wants to learn
 * It contains a default translation and a Miwok translation for that word
 */

public class Word {
    //default translation of the word
    private String mDefaultTranslation;

    //Miwok translation of the word
    private String mMiwokTranslation;

    //default value of the ImageResourceID member
    private final int NO_IMAGE_PROVIDED = -1;

    //resource id of the picture
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     *
     * @param defaultTranslation default translation of the word object
     * @param miwokTranslation  miwok translation of the word object
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     *
     * @param defaultTranslation  default translation of the word object
     * @param miwokTranslation  miwok translation of the word object
     * @param imageResourceId the drawable resource ID of the picture
     */
    //the second constructor of Word object with additional imageResourceId as input parameter
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    //get the default translation
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get the miwok translation
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get the resource ID of the picture in type of int
    public int getmResourceID() { return mImageResourceId; }

    //check whether the imageResourceID field is set in the Word object
    public boolean hasImage() { return  mImageResourceId != NO_IMAGE_PROVIDED;}

}
