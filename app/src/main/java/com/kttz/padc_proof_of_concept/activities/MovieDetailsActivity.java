package com.kttz.padc_proof_of_concept.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.kttz.padc_proof_of_concept.R;

/**
 * Created by bingbing on 12/13/2017 AD.
 */

public class MovieDetailsActivity extends AppCompatActivity {

    public static Intent newIntent(Context context){
        Intent intent=new Intent(context,MovieDetailsActivity.class);
        return intent;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
       AppBarLayout appBarLayout= (AppBarLayout) findViewById(R.id.appbar1);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        ViewPager vpHero= (ViewPager) findViewById(R.id.vp_hero);
//        RevisionImagesAdapter revisionImagesAdapter = new RevisionImagesAdapter(getApplicationContext());
//        vpHero.setAdapter(revisionImagesAdapter);


    }
}
