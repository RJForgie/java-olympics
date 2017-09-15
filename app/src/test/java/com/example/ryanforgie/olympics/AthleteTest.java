package com.example.ryanforgie.olympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 15/09/2017.
 */
public class AthleteTest {

    Athlete athlete1;

    @Before
    public void before() {
        athlete1 = new Athlete("Ryan", 6, Country.GREAT_BRITAIN, Sport.TRIATHALON);
    }

    @Test
    public void testAthleteHasName() {
        assertEquals("Ryan", athlete1.getName());
    }

    @Test
    public void testAthleteHasSkill() {
        assertEquals(6, athlete1.getSkill());
    }

    @Test
    public void testSuperAttributes() {
        assertEquals(Country.GREAT_BRITAIN, athlete1.getCountry());
        assertEquals(Sport.TRIATHALON, athlete1.getSport());
    }

}