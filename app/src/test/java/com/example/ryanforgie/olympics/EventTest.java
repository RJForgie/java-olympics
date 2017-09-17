package com.example.ryanforgie.olympics;

import com.example.ryanforgie.olympics.Competitors.Athlete;
import com.example.ryanforgie.olympics.Competitors.Country;
import com.example.ryanforgie.olympics.Competitors.Team;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 15/09/2017.
 */
public class EventTest {

    Event event1;

    Medal goldMedal;
    Medal silverMedal;
    Medal bronzeMedal;

    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Athlete athlete5;
    Athlete athlete6;
    Athlete athlete7;

    Team team1;
    Team team2;
    Team team3;


    @Before
    public void before() {
        event1 = new Event (2, Sport.VOLLEYBALL);

        goldMedal = new Medal(MedalType.GOLD);
        silverMedal = new Medal(MedalType.SILVER);
        bronzeMedal = new Medal(MedalType.BRONZE);

        athlete1 = new Athlete("Ryan", 6, Country.FRANCE, Sport.VOLLEYBALL);
        athlete2 = new Athlete("Joe", 8, Country.FRANCE, Sport.VOLLEYBALL);
        athlete3 = new Athlete("Bill", 7, Country.NORWAY, Sport.VOLLEYBALL);
        athlete4 = new Athlete("Ted", 7, Country.FRANCE, Sport.RUGBY);
        athlete5 = new Athlete("Bjorn", 9, Country.NORWAY, Sport.VOLLEYBALL);
        athlete6 = new Athlete("Jonas", 4, Country.PORTUGAL, Sport.VOLLEYBALL);
        athlete7 = new Athlete("Greg", 3, Country.PORTUGAL, Sport.VOLLEYBALL);


        team1 = new Team(Country.FRANCE, Sport.VOLLEYBALL);
        team2 = new Team(Country.NORWAY, Sport.VOLLEYBALL);
        team3 = new Team(Country.PORTUGAL, Sport.VOLLEYBALL);


    }

    @Test
    public void testEventHasSport() {
        assertEquals(Sport.VOLLEYBALL, event1.getSport());
    }

    @Test
    public void testEventStartsWithNoAthletes() {
        assertEquals(0, event1.getParticipants().size());
    }

    @Test
    public void testEventStartsWithThreeMedals() {
        assertEquals(3, event1.getEventMedals().size());
    }

    @Test
    public void testEventStartsWithGoldMedal() {
        assertEquals(goldMedal.getMedalType(), event1.getEventMedals().get(0).getMedalType());
    }

    @Test
    public void testAddToParticipants() {
        event1.addToParticipants(athlete1);
        assertEquals(1, event1.getParticipants().size());
    }

    @Test
    public void testParticipantsCorrectSport() {
        event1.addToParticipants(athlete4);
        assertEquals(0, event1.getParticipants().size());
    }

    @Test
    public void testAwardMedal(){
        event1.addToParticipants(athlete1);
        event1.addToParticipants(athlete2);
        event1.addToParticipants(athlete3);
        event1.awardGold(athlete1);
        event1.awardSilver(athlete2);
        event1.awardBronze(athlete3);
        assertEquals(goldMedal.getMedalType(), athlete1.getHaul().get(0).getMedalType());
        assertEquals(silverMedal.getMedalType(), athlete2.getHaul().get(0).getMedalType());
        assertEquals(bronzeMedal.getMedalType(), athlete3.getHaul().get(0).getMedalType());
    }


    @Test
    public void testPlaySortsParticipantsbySkill() {
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete2);
        // team total 14
        team2.addAthlete(athlete3);
        team2.addAthlete(athlete5);
        // team total 16
        team3.addAthlete(athlete6);
        team3.addAthlete(athlete7);
        //team total 7
        event1.addToParticipants(team1);
        event1.addToParticipants(team2);
        event1.addToParticipants(team3);
        event1.play();
        assertEquals(Country.NORWAY, event1.getParticipants().get(0).getCountry() );
        assertEquals(Country.FRANCE, event1.getParticipants().get(1).getCountry() );
        assertEquals(Country.PORTUGAL, event1.getParticipants().get(2).getCountry() );

    }


    @Test
    public void testParticipantsGetCorrectMedal() {
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete2);
        team2.addAthlete(athlete3);
        team2.addAthlete(athlete5);
        team3.addAthlete(athlete6);
        team3.addAthlete(athlete7);
        event1.addToParticipants(team1);
        event1.addToParticipants(team2);
        event1.addToParticipants(team3);
        event1.play();
        assertEquals(goldMedal.getMedalType(), team2.getHaul().get(0).getMedalType());
        assertEquals(silverMedal.getMedalType(), team1.getHaul().get(0).getMedalType());
        assertEquals(bronzeMedal.getMedalType(), team3.getHaul().get(0).getMedalType());
    }

    @Test
    public void testCompetitorLimitCantBeExceeded() {
        Event event2 =new Event(2, Sport.VOLLEYBALL);
        event2.addToParticipants(athlete1);
        event2.addToParticipants(athlete2);
        event2.addToParticipants(athlete3);
        assertEquals(2, event2.getParticipants().size());
    }

}