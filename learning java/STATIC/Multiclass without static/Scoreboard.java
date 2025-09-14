// File: Scoreboard.java
public class Scoreboard {
    private int totalRuns = 0;

    public void addRuns(int runs) {
        this.totalRuns += runs;
        System.out.println("Total Team Runs: " + this.totalRuns);
    }

    public int getTotalRuns() {
        return this.totalRuns;
    }
}