package com.example.personalitytypes;

public class Personality {
    private String personalityName;
    private int coverPhoto;
    private String coverDescription;
    private int detailPhoto;
    private String detailDescription;

    public String getPersonalityName() {
        return personalityName;
    }

    public void setPersonalityName(String personalityName) {
        this.personalityName = personalityName;
    }

    public int getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(int coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getCoverDescription() {
        return coverDescription;
    }

    public void setCoverDescription(String coverDescription) {
        this.coverDescription = coverDescription;
    }

    public int getDetailPhoto() {
        return detailPhoto;
    }

    public void setDetailPhoto(int detailPhoto) {
        this.detailPhoto = detailPhoto;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }
}
