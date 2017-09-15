package com.example.ryanforgie.olympics;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public abstract class Competitor {

    private Country country;
    private Sport sport;
    private int goldCount;
    private int silverCount;
    private int bronzeCount;


    public Competitor(Country country, Sport sport) {
        this.country = country;
        this.sport = sport;
        goldCount = 0;
        silverCount = 0;
        bronzeCount = 0;
    }

    public Country getCountry() {
        return country;
    }

    public Sport getSport() {
        return sport;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public int getSilverCount() {
        return silverCount;
    }

    public int getBronzeCount() {
        return bronzeCount;
    }
}
