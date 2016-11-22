package com.brainacad.studyproject.data.domain;

/**
 * Created by Alexander on 11/20/2016.
 */
public class Ad {

    private int id;
    private int userIdAdGot;
    private String shortDescription;
    private String fullDescription;
    private AdType adType;

    public int getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public AdType getAdType() {
        return adType;
    }

    public int getUserIdAdGot() {
        return userIdAdGot;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public void setAdType(AdType adType) {
        this.adType = adType;
    }

    public void setUserIdAdGot(int userIdAdGot) {
        this.userIdAdGot = userIdAdGot;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", userIdAdGot=" + userIdAdGot +
                ", shortDescription='" + shortDescription + '\'' +
                ", fullDescription='" + fullDescription + '\'' +
                ", adType=" + adType +
                '}';
    }
}
