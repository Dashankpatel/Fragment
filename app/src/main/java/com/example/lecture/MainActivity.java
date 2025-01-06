package com.example.lecture;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String TAG = "==-==";

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d(TAG, "onCreate: ");

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
        list.add(new ForthFragment());

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("First");
        nameList.add("Second");
        nameList.add("Third");
        nameList.add("Forth");

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),list,nameList);
        viewPager.setAdapter(myAdapter);

        tabLayout.setupWithViewPager(viewPager);

//        FirstFragment firstFragment = new FirstFragment();
//        SecondFragment secondFragment = new SecondFragment();

//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fragmentContainer, firstFragment)
//                .add(R.id.fragmentContainer1,secondFragment)
//                .commit();
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragmentContainer,new FirstFragment())
//                .commit();

//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                Log.d(TAG, "onTabSelected: " + tab.getText().toString());
//
//                if(tab.getPosition() == 0)
//                {
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragmentContainer,new FirstFragment())
//                            .commit();
//                }else if(tab.getPosition() == 1)
//                {
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragmentContainer,new SecondFragment())
//                            .commit();
//                }else if(tab.getPosition() == 2)
//                {
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragmentContainer,new ThirdFragment())
//                            .commit();
//                }
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                Log.d(TAG, "onTabUnselected: " + tab.getText().toString());
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                Log.d(TAG, "onTabReselected: " + tab.getText().toString());
//            }
//        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

}