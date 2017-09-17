package com.example.ryanforgie.olympics.Competitors;

import com.example.ryanforgie.olympics.Sport;

import java.util.Comparator;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public class Athlete extends Competitor {

    private String name;
    private int skill;

    public Athlete(String name, int skill, Country country, Sport sport) {
        super(country, sport);
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }




}
