package com.kttz.padc_proof_of_concept.data.models;

import com.kttz.padc_proof_of_concept.data.vo.MovieVO;
import com.kttz.padc_proof_of_concept.events.RestApiEvents;
import com.kttz.padc_proof_of_concept.network.MovieDataAgentImpl;
import com.kttz.padc_proof_of_concept.utils.AppConstants;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class MovieModel {
    private static MovieModel objInstance;

    private List<MovieVO> mMovies;
    private int mmPageIndex = 1;

    private MovieModel() {
        EventBus.getDefault().register(this);
        mMovies = new ArrayList<>();
    }

    public static MovieModel getObjInstance() {
        if (objInstance == null) {
            objInstance = new MovieModel();
        }
        return objInstance;
    }

    public void StartLoadingMovies() {
        MovieDataAgentImpl.getObjInstance().loadMovies(AppConstants.ACCESS_TOKEN, mmPageIndex);
    }

    @Subscribe
    public void onMovieDataLoaded(RestApiEvents.MovieDataLoadedEvent event) {
        mMovies.addAll(event.getLoadedMovies());
        mmPageIndex = event.getLoadedPageIndex() + 1;
    }
}
