package Homework.Hw7;

public class BaseballPlayer {
    // Instance variables
    private String name;
    private int games;     // number of games played
    private int atBats;    // number of times at bat
    private int hits;      // number of hits
    private int runs;      // number of runs scored

    // Constructor that sets all the properties
    public BaseballPlayer(String name, int games, int atBats, int hits, int runs) {
        this.name = name;
        this.games = games;
        this.atBats = atBats;
        this.hits = hits;
        this.runs = runs;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGames() {
        return games;
    }

    public int getAtBats() {
        return atBats;
    }

    public int getHits() {
        return hits;
    }

    public int getRuns() {
        return runs;
    }

    /**
     * Computes and returns the batting average (hits per at bat).
     * If the player has no at bats yet, it returns 0.0 to avoid dividing by zero.
     */
    public double battingAverage() {
        if (atBats == 0) {
            return 0.0;
        }
        return (double) hits / atBats;   // (double) makes this a decimal division
    }

    /**
     * Computes and returns the number of runs scored per game.
     * If the player has not played any games yet, it returns 0.0 to avoid dividing by zero.
     */
    public double runsPerGame() {
        if (games == 0) {
            return 0.0;
        }
        return (double) runs / games;
    }
}
