package com;

public class PlayerGamePerformance {
    private Player player;
    private Integer atBats;
    private Integer singles;
    private Integer doubles;
    private Integer triples;
    private Integer homeRuns;

    public PlayerGamePerformance(Player player, Integer atBats, Integer singles, Integer doubles, Integer triples, Integer homeRuns){
        this.player = player;
        this.atBats = atBats;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public Integer getSingles() {
        return singles;
    }

    public void setSingles(Integer singles) {
        this.singles = singles;
    }

    public Integer getDoubles() {
        return doubles;
    }

    public void setDoubles(Integer doubles) {
        this.doubles = doubles;
    }

    public Integer getTriples() {
        return triples;
    }

    public void setTriples(Integer triples) {
        this.triples = triples;
    }

    public Integer getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(Integer homeRuns) {
        this.homeRuns = homeRuns;
    }

    public float getGameBattingAverage(){
        return ((float)this.singles + (float)this.doubles + (float)this.triples + (float)this.homeRuns) / (float)this.atBats;
    }

    public float getGameSluggingPercentage(){
        return ((float)this.singles + (float)(this.doubles * 2)  + (float)(this.triples * 3) + (float)(this.homeRuns * 4)) / (float)this.atBats;
    }
}
