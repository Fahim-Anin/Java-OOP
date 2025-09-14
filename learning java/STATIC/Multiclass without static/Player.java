// File: Player.java
public class Player {
    public int run = 0;
    private Scoreboard scoreboard; // Each player will have a reference to the SAME scoreboard.

    // Constructor to give the player the shared scoreboard
    public Player(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    public void four() {
        //this.run += 4;
        // The player reports the runs to the shared scoreboard
        System.out.println(scoreboard);
        scoreboard.addRuns(4); //this scoreboard acts like a object
    }

    public void six() {
        //this.run += 6;
        // The player reports the runs to the shared scoreboard
        System.out.println(scoreboard);
        scoreboard.addRuns(6);
    }
}

