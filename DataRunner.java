import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
String[] teams = FileReader.toStringArray("teams.txt");
    int[] wins = FileReader.toIntArray("wins.txt");
    int[] loss = FileReader.toIntArray("Loss.txt");
    int[] championships = FileReader.toIntArray("championships.txt");
  
UserStory nba = new UserStory(teams, wins, loss, championships);
    System.out.println("NBA best teams analysis");
    System.out.println(nba);
    System.out.println();
    System.out.println(nba.findChampionships());
    System.out.println(nba.bestRecord());



    


    
    
    
  }
}

