package com.example.ryanforgie.olympics;

import com.example.ryanforgie.olympics.Competitors.Competitor;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public class Event {

    private ArrayList<Competitor> participants;
    private ArrayList<Medal> eventMedals;
    private Sport sport;

    public Event(int playerlimit, Sport sport) {
        this.sport = sport;
        participants = new ArrayList<>();
        eventMedals = new ArrayList<>();
        this.populateEventWithMedals();
    }


    public ArrayList<Competitor> getParticipants() {
        return participants;
    }

    public ArrayList<Medal> getEventMedals() {
        return eventMedals;
    }

    public Sport getSport() {
        return sport;
    }

    private void addMedal(Medal medal) {
        eventMedals.add(medal);
    }


    private void populateEventWithMedals() {
        Medal goldMedal = new Medal(MedalType.GOLD);
        Medal silverMedal = new Medal(MedalType.SILVER);
        Medal bronzeMedal = new Medal(MedalType.BRONZE);
        this.addMedal(goldMedal);
        this.addMedal(silverMedal);
        this.addMedal(bronzeMedal);
    }

    public void addToParticipants(Competitor competitor) {
        if (competitor.getSport() == this.getSport()){
            participants.add(competitor);
        }
    }


}
