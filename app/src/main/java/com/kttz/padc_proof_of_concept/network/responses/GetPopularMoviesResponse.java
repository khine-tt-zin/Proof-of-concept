package com.kttz.padc_proof_of_concept.network.responses;

import com.google.gson.annotations.SerializedName;
import com.kttz.padc_proof_of_concept.data.vo.MovieVO;

import java.util.List;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class GetPopularMoviesResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private int page;

    @SerializedName("popular-movies")
    private List<MovieVO> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public int getPage() {
        return page;
    }

    public List<MovieVO> getPopularMovies() {
        return popularMovies;
    }
}
