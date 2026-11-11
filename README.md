# Data-For-Social-Good-Project

**By Mason Bieler and Matthew Byun**

## User Story

As a basketball fan, I want to know which NBA teams are most likely to reach the NBA Finals based on their win-loss records and which teams have won the most championships.

## Dataset

Our dataset contains information about 30 NBA teams, including:

- **teams.txt:** Names of all 30 NBA teams.
- **wins.txt:** Number of wins for each team.
- **loss.txt:** Number of losses for each team.
- **championships.txt:** Total championships won by each team.

The data is stored in four 1d arrays.

## UML Diagram

**UserStory**

Variables:
- String[] teams
- int[] wins
- int[] losses
- int[] championships

Methods:
- UserStory()
- UserStory(teams, wins, losses, championships)
- mostChampionships(): String
- bestRecord(): String
- toString(): String

**DataRunner**

- main(String[] args): void
## Description

Our program analyzes NBA team statistics using Java, 1D arrays, loops, and conditional statements.

The program answers two questions:

**Question 1: What team has the most championships?**

The Boston Celtics have the most championships with 18.

**Question 2: What team is most likely to reach the NBA Finals based on its record?**

The Oklahoma City Thunder have the best record in our dataset with 64 wins and 18 losses.

This program helps basketball fans compare NBA teams using historical championships and win-loss ratios. The Finals prediction is based only on team records though.