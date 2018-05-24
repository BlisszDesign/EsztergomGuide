package com.example.android.esztergomguide.adapters;

public class Info {
    private int mImageResourceId;
    private int mInfo;

    public Info (int imageResourceId, int info) {
        mImageResourceId = imageResourceId;
        mInfo = info;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public int getInfo() {
        return mInfo;
    }
}
