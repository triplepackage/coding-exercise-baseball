package com;

/**
 * Created by admin on 9/17/19.
 */
public class Inning {
    private int topRuns;
    private int bottomRuns;
    private int inningNumber;

    public Inning(int inningNumber, int topRuns, int bottomRuns){
        this.inningNumber = inningNumber;
        this.topRuns = topRuns;
        this.bottomRuns = bottomRuns;
    }

    public int getTopRuns() {
        return topRuns;
    }

    public void setTopRuns(int topRuns) {
        this.topRuns = topRuns;
    }

    public int getBottomRuns() {
        return bottomRuns;
    }

    public void setBottomRuns(int bottomRuns) {
        this.bottomRuns = bottomRuns;
    }

    public int getInningNumber() {
        return inningNumber;
    }

    public void setInningNumber(int inningNumber) {
        this.inningNumber = inningNumber;
    }
}
