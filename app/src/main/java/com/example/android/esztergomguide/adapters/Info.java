package com.example.android.esztergomguide.adapters;

public class Info {
    private int mImageResourceId;
    private String mInfo;

    public Info (int imageResourceId, String info) {
        mImageResourceId = imageResourceId;
        mInfo = info;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public String getInfo() {
        return mInfo;
    }
}
