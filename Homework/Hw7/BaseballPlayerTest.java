package Homework.Hw7;

public class BaseballPlayerTest {
    public static void main(String[] args) {
        BaseballPlayer alex = new BaseballPlayer("Alex Rivera", 100, 400, 120, 80);
        BaseballPlayer sam = new BaseballPlayer("Sam Carter", 50, 180, 45, 20);
        BaseballPlayer jamie = new BaseballPlayer("Jamie Lee", 0, 0, 0, 0);

        printStats(alex);
        printStats(sam);
        printStats(jamie);
    }

    // Prints a player's stats and the two computed values
    public static void printStats(BaseballPlayer player) {
        System.out.println("Player: " + player.getName());
        System.out.println("Games: " + player.getGames()
                + ", At bats: " + player.getAtBats()
                + ", Hits: " + player.getHits()
                + ", Runs: " + player.getRuns());
        System.out.printf("Batting average: %.3f%n", player.battingAverage());
        System.out.printf("Runs per game: %.2f%n", player.runsPerGame());
        System.out.println();
    }
}
