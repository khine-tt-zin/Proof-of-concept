package com.kttz.padc_proof_of_concept.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kttz.padc_proof_of_concept.R;
import com.kttz.padc_proof_of_concept.adapters.OnCinemaMoviesAdapter;
import com.kttz.padc_proof_of_concept.adapters.UpcomingMoviesAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bingbing on 11/10/2017 AD.
 */

public class UpcomingFragment extends Fragment {

    @BindView(R.id.rv_upcoming_movie)
    RecyclerView rvUpcomingMovies;


    private UpcomingMoviesAdapter mUpcomingMoviesAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUpcomingMoviesAdapter = new UpcomingMoviesAdapter(getContext());
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);
        ButterKnife.bind(this, view);

        rvUpcomingMovies.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvUpcomingMovies.setAdapter(mUpcomingMoviesAdapter);

        return view;
    }
}
