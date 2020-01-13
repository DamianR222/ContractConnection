package com.roberts222.damian.contractconnection;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {

    private static int mNumOfTabs = 3;

    PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        mNumOfTabs = getCount();
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new myContractsFragment();
            case 1:
                return new myServicesFragment();
            case 2:
                return new mySavedFragment();
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }

    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}