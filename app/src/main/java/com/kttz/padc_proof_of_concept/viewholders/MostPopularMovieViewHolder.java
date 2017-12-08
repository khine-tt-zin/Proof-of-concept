package com.kttz.padc_proof_of_concept.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kttz.padc_proof_of_concept.R;
import com.kttz.padc_proof_of_concept.data.vo.MovieVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class MostPopularMovieViewHolder extends BaseViewHolder<MovieVO> {
    @BindView(R.id.iv_hero)
    ImageView ivMovieCover;

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.tv_movie_type)
    TextView tvMovieType;

    public MostPopularMovieViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(MovieVO data) {

        tvMovieName.setText(data.getTitle());
    }

    @Override
    public void onClick(View view) {

    }
}
