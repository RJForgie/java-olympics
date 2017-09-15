package com.example.ryanforgie.olympics;

/**
 * Created by ryanforgie on 15/09/2017.
 */

public class Medal {

    private MedalType medalType;


    public Medal(MedalType medalType) {
        this.medalType = medalType;
    }

    public MedalType getMedalType() {
        return medalType;
    }
}
