package com.example.assignmentapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class LogOutActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final SharedPref sharedPref;
        sharedPref = new SharedPref(this);


        if(sharedPref.loadNightModeState()){
            setTheme(R.style.darktheme);

        } else setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new LogOutFragment())
                .commit();


    }


    }






