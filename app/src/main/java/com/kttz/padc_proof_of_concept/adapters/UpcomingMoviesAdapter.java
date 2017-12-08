package com.kttz.padc_proof_of_concept.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kttz.padc_proof_of_concept.R;
import com.kttz.padc_proof_of_concept.viewholders.UpcomingMoviesViewHolder;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class UpcomingMoviesAdapter extends RecyclerView.Adapter<UpcomingMoviesViewHolder> {    private LayoutInflater layoutInflater;

    public UpcomingMoviesAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public UpcomingMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.view_movie_list, parent, false);
        return new UpcomingMoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UpcomingMoviesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
