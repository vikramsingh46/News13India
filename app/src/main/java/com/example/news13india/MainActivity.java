package com.example.news13india;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome, mscience, mtechnology, mentertainment, msports, mhealth;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api = "d27f714deb4945f1bfd34b9c7cb08ac8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.recyler_home_fragment);
        mscience=findViewById(R.id.recyler_science_fragment);
        mtechnology=findViewById(R.id.recyler_technology_fragment);
        mentertainment=findViewById(R.id.recyler_enterainment_fragment);
        msports=findViewById(R.id.recyler_sports_fragment);
        mhealth=findViewById(R.id.recyler_health_fragment);


        ViewPager viewPager =findViewById(R.id.view_pagerfragment);
        tabLayout=findViewById(R.id.tab_layout);


        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));







    }
}