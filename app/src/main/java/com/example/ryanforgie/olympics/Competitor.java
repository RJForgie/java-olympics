package com.example.ryanforgie.olympics;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public abstract class Competitor {

    private Country country;
    private Sport sport;
    private ArrayList<Medal> haul;


    public Competitor(Country country, Sport sport) {
        this.country = country;
        this.sport = sport;
        haul = new ArrayList<>();
    }

    public Country getCountry() {
        return country;
    }

    public Sport getSport() {
        return sport;
    }

    public ArrayList<Medal> getHaul() {
        return haul;
    }
}
