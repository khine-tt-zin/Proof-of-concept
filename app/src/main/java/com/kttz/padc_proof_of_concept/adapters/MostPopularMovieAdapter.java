package com.kttz.padc_proof_of_concept.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.kttz.padc_proof_of_concept.R;
import com.kttz.padc_proof_of_concept.data.vo.MovieVO;
import com.kttz.padc_proof_of_concept.viewholders.MostPopularMovieViewHolder;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class MostPopularMovieAdapter extends BaseRecyclerAdapter <MostPopularMovieViewHolder,MovieVO> {

    public MostPopularMovieAdapter(Context context) {
        super(context);
    }

    @Override
    public MostPopularMovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_movie_list, parent, false);
        return new MostPopularMovieViewHolder(view);
    }
    @Override
    public void onBindViewHolder(MostPopularMovieViewHolder holder, int position) {
        holder.setData(mData.get(position));
    }
}
