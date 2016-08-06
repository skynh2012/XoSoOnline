package com.duyanh.niit.ketquaonline.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.duyanh.niit.ketquaonline.R;


import com.duyanh.niit.ketquaonline.ui.fragment.SoKetQuaFragment;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }

    public void soKetQua_Click(View view) {

        int mYear, mMonth, mDay;

        SoKetQuaFragment soKetQuaFragment = new SoKetQuaFragment();

        Calendar c = Calendar.getInstance();

        mYear = c.get(Calendar.YEAR);

        mMonth = c.get(Calendar.MONTH);

        mDay = c.get(Calendar.DAY_OF_MONTH);

        Bundle bundle = new Bundle();

        bundle.putString("date", mYear + "-" + mMonth + "-" + mDay);

        soKetQuaFragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.lnfragment, soKetQuaFragment);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
