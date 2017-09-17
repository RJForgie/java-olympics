package com.example.ryanforgie.olympics.Competitors;

import com.example.ryanforgie.olympics.Medal;
import com.example.ryanforgie.olympics.Sport;

import java.util.ArrayList;
import java.util.Comparator;

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

    public abstract int getSkill();

    public static Comparator<Competitor> Compskill = new Comparator<Competitor>() {

        public int compare(Competitor comp1, Competitor comp2) {

            int skillno1 = comp1.getSkill();
            int skillno2 = comp2.getSkill();
            return skillno2 - skillno1;
        }

    };



}
