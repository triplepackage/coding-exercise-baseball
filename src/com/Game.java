package com;

import java.util.ArrayList;

public class Game {
    private ArrayList<Inning> innings;
    private ArrayList<Player> players;

    public ArrayList<Inning> getInnings() {
        return innings;
    }

    public void setInnings(ArrayList<Inning> innings) {
        this.innings = innings;
    }

    public int getRunsHome(){
        int sum = 0;
        for(Inning inning: innings)
        {
            sum += inning.getBottomRuns();
        }
        return sum;
    }

    public int getRunsAway(){
        int sum = 0;
        for(Inning inning: innings)
        {
            sum += inning.getTopRuns();
        }
        return sum;
    }
}
