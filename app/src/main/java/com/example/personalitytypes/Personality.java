package com.example.personalitytypes;

class Personality {
    private String personalityName;
    private int coverPhoto;
    private String coverDescription;
    private int detailPhoto;
    private String detailDescription;

    String getPersonalityName() {
        return personalityName;
    }

    void setPersonalityName(String personalityName) {
        this.personalityName = personalityName;
    }

    int getCoverPhoto() {
        return coverPhoto;
    }

    void setCoverPhoto(int coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    String getCoverDescription() {
        return coverDescription;
    }

    void setCoverDescription(String coverDescription) {
        this.coverDescription = coverDescription;
    }

    int getDetailPhoto() {
        return detailPhoto;
    }

    void setDetailPhoto(int detailPhoto) {
        this.detailPhoto = detailPhoto;
    }

    String getDetailDescription() {
        return detailDescription;
    }

    void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }
}
