package com.example.android.esztergomguide.adapters;

public class Catalog {
    private int mImageResourceId;
    private String mLabel;

    public Catalog(String label, int imageResourceId) {
        mImageResourceId = imageResourceId;
        mLabel = label;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public String getLabel() {
        return mLabel;
    }
}
