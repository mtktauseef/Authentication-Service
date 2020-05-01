package com.ecommerce.authenticationservice.payload;

/*
 * @Author Tauseef, Prashant, Rainy, Tarun
 * created on 4/16/2020
 */
public class Response {
    private long id;
    private String text;
    private long voteCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
    }

}