package com.mrz.bannerview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * @author Mrz
 * @date 2018/10/5 23:00
 */
public class BannerAdapter extends FragmentStatePagerAdapter {

    private List<BannerFragment> mFragments;

    public BannerAdapter(List<BannerFragment> fragments, FragmentManager fm) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

}
