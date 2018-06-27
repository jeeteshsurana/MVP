package com.example.win10.mvp.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.win10.mvp.R;

public class FragmentHandler {
    /*    OnlyReplaceFragment-----------------*/
    public static void onlyReplaceFragment(Fragment fragment, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }

    /*    OnlyReplaceFragment with id-----------------*/
    public static void OnlyReplaceFragment(Fragment fragment, int id, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().replace(id, fragment).commit();
    }


    /*    OnlyReplaceFragment With bundle-----------------*/
    public static void OnlyReplaceFragment(Fragment fragment, FragmentManager fragmentManager, Bundle bundle) {
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }

    /*    OnlyReplaceFragment With bundle +id -----------------*/
    public static void OnlyReplaceFragment(Fragment fragment, int id, FragmentManager fragmentManager, Bundle bundle) {
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(id, fragment).commit();
    }

    /*------------------FRAGMENT replace-----------------*/
    public static void replaceFragment(Fragment fragment, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }

    /*------------------FRAGMENT replace with id-----------------*/
    public static void replaceFragment(Fragment fragment, int id, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().replace(id, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }

    /*------------------FRAGMENT replace With Bundle-----------------*/
    public static void replaceFragment(Fragment fragment, FragmentManager fragmentManager, Bundle bundle) {
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }

    /*------------------FRAGMENT replace With Bundle +id -----------------*/
    public static void replaceFragment(Fragment fragment, int id, FragmentManager fragmentManager, Bundle bundle) {
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(id, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }

    /*------------------FRAGMENT ADD-----------------*/
    public static void addFragment(Fragment fragment, Fragment hideFragment, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.getClass().getSimpleName()).hide(hideFragment).commit();
    }

    /*------------------FRAGMENT ADD+id-----------------*/
    public static void addFragment(Fragment fragment, int id, Fragment hideFragment, FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().replace(id, fragment, fragment.getClass().getSimpleName()).hide(hideFragment).commit();
    }

    /*------------------FRAGMENT ADD With Bundle-----------------*/
    public static void addFragment(Fragment fragment, Fragment hideFragment, FragmentManager fragmentManager, Bundle bundle) {
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.getClass().getSimpleName()).hide(hideFragment).commit();
    }

    /*------------------FRAGMENT ADD With Bundle+id-----------------*/
    public static void addFragment(Fragment fragment, int id, Fragment hideFragment, FragmentManager fragmentManager, Bundle bundle) {
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(id, fragment, fragment.getClass().getSimpleName()).hide(hideFragment).commit();
    }
}
