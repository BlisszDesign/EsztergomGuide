package com.example.android.esztergomguide.activities;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;

import com.example.android.esztergomguide.R;
import com.example.android.esztergomguide.fragments.AccomondationsFragment;
import com.example.android.esztergomguide.fragments.HistoryFragment;
import com.example.android.esztergomguide.fragments.MonumentsFragment;
import com.example.android.esztergomguide.fragments.RestaurantsFragment;
import com.example.android.esztergomguide.fragments.ThingsFragment;


public class MainActivity2 extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    FragmentManager fragmentManager;
    Fragment myFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);

        mDrawerLayout = findViewById(R.id.drawer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menu);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayShowTitleEnabled(false);
        actionbar.setHomeAsUpIndicator(R.drawable.menu);
        NavigationView navigationView = findViewById(R.id.nav_view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HistoryFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_history);
        }

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();
                        myFragment = null;
                        Class fragmentClass;
                        switch (menuItem.getItemId()) {
                            case R.id.nav_monuments:
                                fragmentClass = MonumentsFragment.class;
                                break;
                            case R.id.nav_accomodations:
                                fragmentClass = AccomondationsFragment.class;
                                break;
                            case R.id.nav_restaurants:
                                fragmentClass = RestaurantsFragment.class;
                                break;
                            case R.id.nav_things:
                                fragmentClass = ThingsFragment.class;
                                break;
                            default:
                                fragmentClass = HistoryFragment.class;

                        }
                        try {
                            myFragment = (Fragment) fragmentClass.newInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        // Insert the fragment by replacing any existing fragment
                        fragmentManager = getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, myFragment ).commit();

                        // Highlight the selected item has been done by NavigationView
                        menuItem.setChecked(true);
                        // Close the navigation drawer
                        mDrawerLayout.closeDrawers();

                        return true;
                    }
                });

    }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
