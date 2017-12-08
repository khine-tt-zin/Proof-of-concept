package com.kttz.padc_proof_of_concept.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kttz.padc_proof_of_concept.R;
import com.kttz.padc_proof_of_concept.adapters.MostPopularMovieAdapter;
import com.kttz.padc_proof_of_concept.events.RestApiEvents;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class MostPopularMovieFragment extends Fragment {

    @BindView(R.id.rv_most_popular_movie)
    RecyclerView rvMostPopularMovie;

    private MostPopularMovieAdapter mMostPopularMoviesAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMostPopularMoviesAdapter = new MostPopularMovieAdapter(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mostpopular, container, false);
        ButterKnife.bind(this, view);

        rvMostPopularMovie.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        rvMostPopularMovie.setAdapter(mMostPopularMoviesAdapter);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewsDataLoaded(RestApiEvents.MovieDataLoadedEvent event) {
        mMostPopularMoviesAdapter.setNewData(event.getLoadedMovies());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onErrorInvokingAPI(RestApiEvents.ErrorInvokingAPIEvent event) {
        Snackbar.make(rvMostPopularMovie, event.getErrorMsg(), Snackbar.LENGTH_INDEFINITE).show();
    }
}
