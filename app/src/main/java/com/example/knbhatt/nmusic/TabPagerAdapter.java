package com.example.knbhatt.nmusic;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class TabPagerAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[]{"tab1","tab2","tab3","tab4"};
   Integer tabnumber=4;

    public TabPagerAdapter(FragmentManager fm){

        super(fm);
    }

    public CharSequence getPageTitle(int position)
    {

        return tabarray[position];
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 one = new Tab1();
                return one;
            case 1:
                Tab2 two = new Tab2();
                return two;
            case 2:
                Tab3 three = new Tab3();
                return three;
            case 3:
                Tab4 four = new Tab4();
                return four;
        }
                return null;

    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
