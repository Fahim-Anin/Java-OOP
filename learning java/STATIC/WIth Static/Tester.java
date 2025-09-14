public class Tester{
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.six();
        p1.six();
        p2.four();

        System.out.println(Player.teamrun); // gives only final output as 16
    }
}