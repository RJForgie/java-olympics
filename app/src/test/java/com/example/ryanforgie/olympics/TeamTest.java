package com.example.ryanforgie.olympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 15/09/2017.
 */
public class TeamTest {

    Team team1;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;

    @Before
    public void before() {
        team1= new Team (Country.GREAT_BRITAIN, Sport.RUGBY);
        athlete1 = new Athlete("Ryan", 6, Country.GREAT_BRITAIN, Sport.RUGBY);
        athlete2 = new Athlete("Bobby", 8, Country.GREAT_BRITAIN, Sport.RUGBY);
        athlete3 = new Athlete("Jimmy", 8, Country.GREAT_BRITAIN, Sport.TRIATHALON);
        athlete4 = new Athlete("Ricky", 4, Country.FRANCE, Sport.RUGBY);
    }

    @Test
    public void testTeamCountry() {
        assertEquals(Country.GREAT_BRITAIN, team1.getCountry());
    }

    @Test
    public void testTeamSport() {
        assertEquals(Sport.RUGBY, team1.getSport());
    }

    @Test
    public void testAddAthleteToTeam() {
        team1.addAthlete(athlete1);
        assertEquals(1, team1.getMembers().size());
    }

    @Test
    public void testCantAddAthleteWithWrongCountry(){
        team1.addAthlete(athlete4);
        assertEquals(0, team1.getMembers().size());
    }

    @Test
    public void testCantAddAthleteWithWrongSport(){
        team1.addAthlete(athlete3);
        assertEquals(0, team1.getMembers().size());
    }




}