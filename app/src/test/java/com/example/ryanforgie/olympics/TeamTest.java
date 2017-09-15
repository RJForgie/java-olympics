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
    public void testTeamSkillStartsZero() {
        assertEquals(0, team1.getSkill());
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

    @Test
    public void testTeamSkill() {
        team1.addAthlete(athlete1);
        team1.addAthlete((athlete2));
        assertEquals(14, team1.getSkill());
    }

    @Test
    public void testRemoveAthlete() {
        team1.addAthlete(athlete1);
        team1.removeAthlete((athlete1));
        assertEquals(0, team1.getMembers().size());
    }

    @Test
    public void testTeamSkillUpdatesWhenAthleteRemoved(){
        team1.addAthlete(athlete1);
        team1.addAthlete((athlete2));
        team1.removeAthlete((athlete2));
        assertEquals(6, team1.getSkill());
    }




}