import java.util.Scanner;

public class UserStory {
private String[] teams;
  private int[] wins;
  private int[] loss;
  private int[] championships;
  private double[] winRatio;
  private Team[] teamData;

  public UserStory(String[] teams, int[] wins, int[] loss, int[] championships) {
    this.teams = teams;
    this.wins = wins;
    this.loss = loss;
    this.championships = championships;
    teamData();
  }
   public void teamData() {
teamData = new Team[teams.length];
     winRatio = new double[teams.length];
     
   
    for(int i = 0; i < teams.length; i++) {
      teamData[i] = new Team(teams[i], wins[i], loss[i], championships[i]);
      winRatio[i] = (double) wins[i] / (wins[i] + loss[i]);
    }
   }

public String findChampionships() {
  int highest = championships[0];
  int index = 0;
  for(int i = 1; i < championships.length; i++) {
    if (championships[i] > highest) {
      highest = championships[i];
      index = i;
    }
  }
  return teams[index] + "has the most championships with " + highest + " championships.";
}

public String bestRecord() {
int best = 0;
  for(int i = 1; i < winRatio.length; i++) {
if (winRatio[i] > winRatio[best]) {
  best = i;
}
  }
  return teams[best] + " has the best record with " + wins[best] + " wins and " + loss[best] + " losses.";
  
}
  
public String toString() {
return "There are " + teams.length + "NBA teams in the dataset.";
  
}
 
  }
  


