package com.kttz.padc_proof_of_concept.events;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public class TapsNewEvent {
    private String newsId;

    public TapsNewEvent(String newsId) {
        this.newsId = newsId;
    }

    public String getNewsId() {
        return newsId;
    }
}
