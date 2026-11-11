import java.util.Scanner;


public class DataRunner {
  public static void main(String[] args) {

    /*
     * Reads NBA data from text files
     */
    String[] teams = FileReader.toStringArray("teams.txt");
    int[] wins = FileReader.toIntArray("wins.txt");
int[] losses = FileReader.toIntArray("loss.txt");
    int[] championships = FileReader.toIntArray("championships.txt");

    /*
     * Creates a UserStory object
     */
    UserStory nba = new UserStory(teams, wins, losses, championships);

    /*
     * Prints the results
     */
    System.out.println(nba);
    System.out.println("Question 1: " + nba.mostChampionships());
    System.out.println("Question 2: " + nba.bestRecord());

  }
}
