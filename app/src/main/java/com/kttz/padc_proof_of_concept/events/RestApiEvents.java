package com.kttz.padc_proof_of_concept.events;

import com.kttz.padc_proof_of_concept.data.vo.MovieVO;

import java.util.List;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class RestApiEvents {
    public static class EmptyResponseEvent {

    }

    public static class ErrorInvokingAPIEvent {


        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    public static class MovieDataLoadedEvent {

        private int loadedPageIndex;
        private List<MovieVO> loadedMovies;

        public MovieDataLoadedEvent(int loadedPageIndex, List<MovieVO> loadedMovies) {
            this.loadedPageIndex = loadedPageIndex;
            this.loadedMovies = loadedMovies;
        }

        public int getLoadedPageIndex() {
            return loadedPageIndex;
        }

        public List<MovieVO> getLoadedMovies() {
            return loadedMovies;
        }
    }
}
