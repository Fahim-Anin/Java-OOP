// File: Tester.java
public class Tester {
    public static void main(String[] args) {
        // 1. Create ONE shared scoreboard for the entire game.
        Scoreboard gameScoreboard = new Scoreboard();

        // 2. Create players and give EACH of them the SAME scoreboard.
        Player p1 = new Player(gameScoreboard);
        Player p2 = new Player(gameScoreboard);

        // 3. Now, when players score, they update the one shared scoreboard.
        p1.four();  // Output: Total Team Runs: 4
        p2.six();   // Output: Total Team Runs: 10
        p1.four();  // Output: Total Team Runs: 14

        System.out.println("\nFinal score on the board is: " + gameScoreboard.getTotalRuns());
        // Output: Final score on the board is: 14
    }
}
