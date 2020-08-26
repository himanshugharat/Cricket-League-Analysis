package com.bridglabz;

public class LeagueDAO {
    public int foursWikts;
    public String name;
    public int noOfMatches;
    public int noOfInnings;
    public int noOfRuns;
    public int highestScore;
    public double noOfBallFaced;
    public double battingAverageScore;
    public double bowlingAverageScore;
    public double strikeRate;
    public int noOfHundresds;
    public int noOfFifty;
    public int noOfFours;
    public int noOfSixs;
    public double noOfOvers;
    public int noOfWickets;
    public String bbi;
    public double economy;
    public int fourWikts;
    public int fiveWkts;

    public LeagueDAO(LeagueRunsCSV leagueRunsCSV) {
        name = leagueRunsCSV.name;
        noOfMatches = leagueRunsCSV.noOfMatches;
        noOfInnings = leagueRunsCSV.noOfInnings;
        noOfRuns = leagueRunsCSV.noOfRuns;
        highestScore = leagueRunsCSV.highestScore;
        noOfBallFaced = leagueRunsCSV.noOfBallFaced;
        battingAverageScore = leagueRunsCSV.battingAverageScore;
        strikeRate = leagueRunsCSV.strikeRate;
        noOfHundresds = leagueRunsCSV.noOfHundresds;
        noOfFifty = leagueRunsCSV.noOfFifty;
        noOfFours = leagueRunsCSV.noOfFours;
        noOfSixs = leagueRunsCSV.noOfSixs;
    }

    public LeagueDAO(LeagueWktsCSV leagueWktsCSV) {
        name = leagueWktsCSV.name;
        noOfMatches = leagueWktsCSV.noOfMatches;
        noOfInnings = leagueWktsCSV.noOfInnings;
        noOfOvers = leagueWktsCSV.noOfOvers;
        noOfWickets = leagueWktsCSV.noOfWickets;
        bbi = leagueWktsCSV.bbi;
        economy = leagueWktsCSV.economy;
        fiveWkts = leagueWktsCSV.fiveWkts;
        fourWikts = leagueWktsCSV.foursWikts;
        bowlingAverageScore = leagueWktsCSV.bowlingAverageScore;
        noOfRuns = leagueWktsCSV.noOfRuns;
    }

    public LeagueDAO(LeagueDAO leagueWktsCSV, LeagueDAO leagueRunsCSV) {
        name = leagueWktsCSV.name;
        noOfMatches = leagueWktsCSV.noOfMatches;
        noOfInnings = leagueWktsCSV.noOfInnings;
        noOfOvers = leagueWktsCSV.noOfOvers;
        noOfWickets = leagueWktsCSV.noOfWickets;
        bbi = leagueWktsCSV.bbi;
        economy = leagueWktsCSV.economy;
        fiveWkts = leagueWktsCSV.fiveWkts;
        fourWikts = leagueWktsCSV.foursWikts;
        bowlingAverageScore = leagueWktsCSV.bowlingAverageScore;
        noOfRuns = leagueWktsCSV.noOfRuns;
        name = leagueRunsCSV.name;
        noOfMatches = leagueRunsCSV.noOfMatches;
        noOfInnings = leagueRunsCSV.noOfInnings;
        noOfRuns = leagueRunsCSV.noOfRuns;
        highestScore = leagueRunsCSV.highestScore;
        noOfBallFaced = leagueRunsCSV.noOfBallFaced;
        battingAverageScore = leagueRunsCSV.battingAverageScore;
        strikeRate = leagueRunsCSV.strikeRate;
        noOfHundresds = leagueRunsCSV.noOfHundresds;
        noOfFifty = leagueRunsCSV.noOfFifty;
        noOfFours = leagueRunsCSV.noOfFours;
        noOfSixs = leagueRunsCSV.noOfSixs;

    }
}
