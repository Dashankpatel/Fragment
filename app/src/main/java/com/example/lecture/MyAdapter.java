package com.example.lecture;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentPagerAdapter {

    ArrayList<String> nameList;
    ArrayList<Fragment> list;
    public MyAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> list,ArrayList<String> nameList) {
        super(fm);
        this.list = list;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nameList.get(position);
    }
}
