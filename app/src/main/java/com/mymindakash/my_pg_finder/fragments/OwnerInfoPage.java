package com.mymindakash.my_pg_finder.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.mymindakash.my_pg_finder.R;

/**
 * Created by Akruti on 12/6/2016.
 */


   // import com.mymindakash.my_pg_finder.fragments.User_Login_Form;
    //import com.mymindakash.my_pg_finder.fragments.User_Register_Form;

     public class OwnerInfoPage extends AppCompatActivity implements ActionBar.TabListener {
        private ViewPager viewPager;
        private OwnerAdapter ownerAdapter;
        private ActionBar actionBar;

        // Tab titles
        private String[] tabs = {"Register", "Login"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.user__info__page);

            viewPager = (ViewPager) findViewById(R.id.pager);
            actionBar = getSupportActionBar();
            ownerAdapter = new OwnerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(ownerAdapter);
            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    actionBar.setSelectedNavigationItem(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
            actionBar.setHomeButtonEnabled(false);
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            // Adding Tabs
            for (String tab_name : tabs) {
                actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener(this));

            }
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }


     }


    class OwnerAdapter extends FragmentPagerAdapter {

        public OwnerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if (position == 0) {
                fragment = new User_Register_Form();
            } else if (position == 1) {
                fragment = new User_Login_Form();

            }
            return fragment;
        }

        @Override
        public int getCount() {
            // get item count - equal to number of tabs
            return 2;
        }

    }

