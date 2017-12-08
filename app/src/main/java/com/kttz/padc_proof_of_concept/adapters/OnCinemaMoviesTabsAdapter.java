package com.kttz.padc_proof_of_concept.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.kttz.padc_proof_of_concept.fragments.MostPopularMovieFragment;
import com.kttz.padc_proof_of_concept.fragments.OnCinemaMoviesFragment;
import com.kttz.padc_proof_of_concept.fragments.UpcomingFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingbing on 11/10/2017 AD.
 */

public class OnCinemaMoviesTabsAdapter extends FragmentStatePagerAdapter {


    int mNumOfTabs;

    public OnCinemaMoviesTabsAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        mNumOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                OnCinemaMoviesFragment nowOnCinemaMoviesFragment = new OnCinemaMoviesFragment();
                return nowOnCinemaMoviesFragment;
            case 1:
                UpcomingFragment upcomingMoviesFragment = new UpcomingFragment();
                return upcomingMoviesFragment;
            case 2:
                MostPopularMovieFragment mostPopularMoviesFragment = new MostPopularMovieFragment();
                return mostPopularMoviesFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
