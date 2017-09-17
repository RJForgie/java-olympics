package com.example.ryanforgie.olympics;

import com.example.ryanforgie.olympics.Competitors.Competitor;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by ryanforgie on 15/09/2017.
 */

public class Event implements Winnable{

    private ArrayList<Competitor> participants;
    private ArrayList<Medal> eventMedals;
    private Sport sport;
    private int competitorLimit;

    public Event(int competitorLimit, Sport sport) {
        this.sport = sport;
        this.competitorLimit = competitorLimit;
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
        if ((competitor.getSport() == this.getSport()) && (participants.size() < competitorLimit)){
            participants.add(competitor);
        }
    }


    public void awardGold(Competitor competitor){
        Medal gold = this.getMedalByType(MedalType.GOLD);
        competitor.getHaul().add(gold);
        eventMedals.remove(gold);
    }

    public void awardSilver(Competitor competitor){
        Medal silver = this.getMedalByType(MedalType.SILVER);
        competitor.getHaul().add(silver);
        eventMedals.remove(silver);
    }

    public void awardBronze(Competitor competitor){
        Medal bronze = this.getMedalByType(MedalType.BRONZE);
        competitor.getHaul().add(bronze);
        eventMedals.remove(bronze);
    }

    public Medal getMedalByType(MedalType type){
        Medal retreivedMedal = null;
        for (Medal medal: eventMedals){
            if(medal.getMedalType() == type){
                retreivedMedal = medal;
            }
        }

        return retreivedMedal;
    }

    public void play() {
        Collections.sort(participants, Competitor.Compskill);
        Competitor goldWinner = participants.get(0);
        Competitor silverWinner = participants.get(1);
        Competitor bronzeWinner = participants.get(2);
        this.awardGold(goldWinner);
        this.awardSilver(silverWinner);
        this.awardBronze(bronzeWinner);
    }

}

//    no longer needed
// public int play(){
//        Competitor goldWinner = null;
//        Competitor silverWinner = null;
//        Competitor bronzeWinner = null;
//        int goldScore = 0;
//        int silverScore = 0;
//        int bronzeScore = 0;
//        for (Competitor competitor: participants) {
//            if (competitor.getSkill() > goldScore) {
//                goldWinner = competitor;
//                goldScore = competitor.getSkill();
//            } else if ((competitor.getSkill() < goldScore) && (competitor.getSkill() > silverScore)) {
//                silverWinner = competitor;
//                silverScore = competitor.getSkill();
//            }
//               else if ((competitor.getSkill() < silverScore) && (competitor.getSkill() > bronzeScore)) {
//                    bronzeWinner = competitor;
//                    bronzeScore = competitor.getSkill();
//                }
//            }
//
//
//        return silverScore;
//    }
