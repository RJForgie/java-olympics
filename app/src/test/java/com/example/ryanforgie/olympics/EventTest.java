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
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Athlete athlete5;
    Team team1;
    Team team2;


    @Before
    public void before() {
        event1 = new Event (2, Sport.VOLLEYBALL);

        goldMedal = new Medal(MedalType.GOLD);
        athlete1 = new Athlete("Ryan", 6, Country.FRANCE, Sport.VOLLEYBALL);
        athlete2 = new Athlete("Joe", 8, Country.FRANCE, Sport.VOLLEYBALL);
        athlete3 = new Athlete("Bill", 7, Country.NORWAY, Sport.VOLLEYBALL);
        athlete4 = new Athlete("Ted", 7, Country.FRANCE, Sport.RUGBY);
        athlete5 = new Athlete("Bjorn", 9, Country.NORWAY, Sport.VOLLEYBALL);

        team1 = new Team(Country.FRANCE, Sport.VOLLEYBALL);
        team2 = new Team(Country.NORWAY, Sport.VOLLEYBALL);


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
    public void testWinner() {
        team1.addAthlete((athlete1));
        team1.addAthlete((athlete2));
        team2.addAthlete((athlete3));
        team2.addAthlete(athlete5);
        assertEquals();
    }

}