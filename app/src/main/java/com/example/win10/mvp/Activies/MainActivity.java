package com.example.win10.mvp.Activies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.win10.mvp.Fragments.Login;
import com.example.win10.mvp.R;
import com.example.win10.mvp.Utils.FragmentHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentHandler.onlyReplaceFragment(new Login(),getSupportFragmentManager());
    }

}

