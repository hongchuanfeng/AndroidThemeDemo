package com.example.call_aidl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BaseFragment extends Fragment {



    //这里的是我们的重点
    public boolean onKeyDown(int keyCode, KeyEvent event){
        Log.i("Test","----------------onKeyDown-----------");
        return true;
    }

}
