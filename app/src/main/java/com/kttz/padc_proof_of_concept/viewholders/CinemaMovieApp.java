package com.kttz.padc_proof_of_concept.viewholders;

import android.app.Application;

import com.kttz.padc_proof_of_concept.data.models.MovieModel;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class CinemaMovieApp extends Application {
    public static final String LOG_TAG = "MovieApp";

    @Override
    public void onCreate() {
        super.onCreate();
        MovieModel.getObjInstance().StartLoadingMovies();
    }
}
