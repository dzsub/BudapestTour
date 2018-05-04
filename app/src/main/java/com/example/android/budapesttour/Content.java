package com.example.android.budapesttour;

/**
 * Created by dzsub on 2018.05.03..
 */

public class Content {

    private String mName;
    private String mAddress;
    private int mPicture = NO_PICTURE_PROVIDED;
    static final String NO_ADDRESS_PROVIDED = null;
    static final int NO_PICTURE_PROVIDED = -1;


    public Content(String name, int picture) {
        mName = name;
        mPicture = picture;
    }

    public Content(String name, String address) {
        mName = name;
        mAddress = address;

    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmPicture(){
        return mPicture;
    }

    public boolean hasAddress() {
        return mAddress != NO_ADDRESS_PROVIDED;
    }

    public boolean hasPicture() {
        return mPicture != NO_PICTURE_PROVIDED;
    }

}
