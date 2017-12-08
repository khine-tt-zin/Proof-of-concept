package com.kttz.padc_proof_of_concept.network;

import com.kttz.padc_proof_of_concept.network.responses.GetPopularMoviesResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public interface MoviesApi {
    @FormUrlEncoded
    @POST("v1/getPopularMovies.php")
    Call<GetPopularMoviesResponse> loadPopularMovies(
            @Field("access_token") String accessToken,
            @Field("page") int pageIndex);
}
