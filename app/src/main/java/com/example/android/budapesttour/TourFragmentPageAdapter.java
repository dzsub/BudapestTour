package com.example.android.budapesttour;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dzsub on 2018.05.01..
 */

public class TourFragmentPageAdapter extends FragmentPagerAdapter {

    public TourFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new AttractionsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new CasinosFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
