package com.example.ryanforgie.olympics;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public class Team extends Competitor {

    private ArrayList<Athlete> members;
    private int teamskill;


    public Team(Country country, Sport sport) {
        super(country, sport);
        members = new ArrayList<>();
        teamskill = 0;
    }


    public ArrayList<Athlete> getMembers() {
        return members;
    }

    public int getTeamskill() {
        return teamskill;
    }

    public void addAthlete(Athlete athlete) {
        if ((athlete.getCountry() == this.getCountry()) && (athlete.getSport() == this.getSport()))
        members.add(athlete);
        teamskill += athlete.getSkill();
    }




}
