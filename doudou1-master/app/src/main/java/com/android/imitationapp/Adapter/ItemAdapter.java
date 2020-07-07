package com.android.imitationapp.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ItemAdapter extends FragmentPagerAdapter {
    private List<Fragment>fragmentList;

    public ItemAdapter(FragmentManager fm,List<Fragment>mFragmentList) {
        super(fm);
        this.fragmentList=mFragmentList;
    }



    @Override
    public Fragment getItem(int position) {
return fragmentList.get(position);


    }

    @Override
    public int getCount() {
        return 0;
    }
}
