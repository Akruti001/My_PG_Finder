package com.mymindakash.my_pg_finder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mymindakash.my_pg_finder.R;

/**
 * Created by Vikram on 12/3/2016.
 */

public class User_Login_Form extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.user_login_form,container,false);
    }
}
