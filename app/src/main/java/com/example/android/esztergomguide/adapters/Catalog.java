package com.example.android.esztergomguide.adapters;

public class Catalog {
    private int mImageResourceId;
    private int mLabel;

    public Catalog(int label, int imageResourceId) {
        mImageResourceId = imageResourceId;
        mLabel = label;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public int getLabel() {
        return mLabel;
    }
}
