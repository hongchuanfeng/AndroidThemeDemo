package com.example.call_aidl;

import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    ActionBar actionBar;
    Fragment curFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionBar.newTab();
        tab1.setText("新业务Service");

        tab1.setTabListener(new MyTabListener(new LeftFragment()));
        ActionBar.Tab tab2 = actionBar.newTab().setText("盘点Service");
        tab2.setTabListener(new MyTabListener(new RightFragment()));
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
    }

    class MyTabListener implements ActionBar.TabListener{

        private Fragment fragment;
        public MyTabListener (Fragment fragment){
            this.fragment=fragment;
        }


        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            curFragment = fragment;
            ft.replace(R.id.context,fragment);
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
