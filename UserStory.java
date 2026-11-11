import java.util.Scanner;


public class UserStory {

  private String[] teams;
  private int[] wins;
  private int[] losses;
  private int[] championships;

  /*
   * No-argument constructor
   */
  public UserStory() {
    teams = new String[0];
    wins = new int[0];
    losses = new int[0];
    championships = new int[0];
  }

  /*
   * Parameterized constructor
   * Precondition: All arrays have the same length
   * Postcondition: Stores the NBA data
   */
  public UserStory(String[] teams, int[] wins, int[] losses, int[] championships) {
    this.teams = teams;
    this.wins = wins;
    this.losses = losses;
    this.championships = championships;
  }

  /*
   * Finds the team with the most championships
   * Precondition: Arrays are not empty
   * Postcondition: Returns the team with the most championships
   */
  public String mostChampionships() {
    int max = 0;

    for (int i = 1; i < championships.length; i++) {
      if (championships[i] > championships[max]) {
        max = i;
      }
    }

    return teams[max] + " has the most championships with " + championships[max];
  }

  /*
   * Finds the team with the best record
   * Precondition: Each team has played at least one game
   * Postcondition: Returns the team with the best record
   */
  public String bestRecord() {
    int best = 0;

    for (int i = 1; i < wins.length; i++) {
      double rate = (double) wins[i] / (wins[i] + losses[i]);
      double bestRate = (double) wins[best] / (wins[best] + losses[best]);

      if (rate > bestRate) {
        best = i;
      }
    }

    return teams[best] + " has the best record with " + wins[best] + " wins and " + losses[best] + " losses";
  }

  /*
   * Returns general information about the dataset
   */
  public String toString() {
    return "There are " + teams.length + " NBA teams in the dataset.";
  }
}
