package com.kttz.padc_proof_of_concept.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kttz.padc_proof_of_concept.R;
import com.kttz.padc_proof_of_concept.viewholders.OnCinemaMovieViewHolder;

/**
 * Created by bingbing on 11/9/2017 AD.
 */

public class OnCinemaMoviesAdapter extends RecyclerView.Adapter<OnCinemaMovieViewHolder> {
    private LayoutInflater mlayoutinflater;


    public OnCinemaMoviesAdapter(Context context) {

        mlayoutinflater = LayoutInflater.from(context);

    }


    @Override
    public OnCinemaMovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mlayoutinflater.inflate(R.layout.view_movie_list, parent, false);
        return new OnCinemaMovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OnCinemaMovieViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 5;
    }
}
