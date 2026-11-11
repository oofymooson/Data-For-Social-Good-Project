# Data-For-Social-Good-Project
# NBA Data Analysis Project

**By Mason Bieler and Matthew Byun**

## User Story

As a basketball fan, I want to know which NBA teams are most likely to reach the NBA Finals based on their win-loss records and which teams have won the most championships.

## Dataset

Our dataset contains information about 30 NBA teams, including:

- **teams.txt:** Names of all 30 NBA teams.
- **wins.txt:** Number of wins for each team.
- **loss.txt:** Number of losses for each team.
- **championships.txt:** Total championships won by each team.

The data is stored in four one-dimensional arrays using Java's FileReader methods.

## UML Diagram

**UserStory**

| Fields | Type |
|---|---|
| teams | String[] |
| wins | int[] |
| losses | int[] |
| championships | int[] |

| Constructors and Methods | Return Type |
|---|---|
| UserStory() | Constructor |
| UserStory(String[] teams, int[] wins, int[] losses, int[] championships) | Constructor |
| mostChampionships() | String |
| bestRecord() | String |
| toString() | String |

## Description

Our program analyzes NBA team statistics using Java, 1D arrays, loops, and conditional statements.

The program answers two questions:

**Question 1: What team has the most championships?**

The Boston Celtics have the most championships with 18.

**Question 2: What team is most likely to reach the NBA Finals based on its record?**

The Oklahoma City Thunder have the best record in our dataset with 64 wins and 18 losses.

This program helps basketball fans compare NBA teams using historical championships and win-loss ratios. The Finals prediction is based only on team records though.