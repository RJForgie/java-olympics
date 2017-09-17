package com.example.ryanforgie.olympics.Competitors;

import com.example.ryanforgie.olympics.Sport;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public class Team extends Competitor {

    private ArrayList<Athlete> members;
    private int skill;


    public Team(Country country, Sport sport) {
        super(country, sport);
        members = new ArrayList<>();
        skill = 0;
    }

    public ArrayList<Athlete> getMembers() {
        return members;
    }

    public int getSkill() {
        return skill;
    }

    public void addAthlete(Athlete athlete) {
        if ((athlete.getCountry() == this.getCountry()) && (athlete.getSport() == this.getSport())) {
            members.add(athlete);
            skill += athlete.getSkill();
        }
    }

    public void removeAthlete(Athlete athlete) {
        members.remove(athlete);
        skill -= athlete.getSkill();
    }






}
