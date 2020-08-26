package com.bridglabz;

public class LeagueDAO {
    public String name;
    public int noOfMatches;
    public int noOfInnings;
    public int noOfRuns;
    public int highestScore;
    public double noOfBallFaced;
    public double averageScore;
    public double strikeRate;
    public int noOfHundresds;
    public int noOfFifty;
    public int noOfFours;
    public int noOfSixs;
    public String noOfOvers;
    public String noOfWickets;
    public String bbi;
    public String economy;
    public String fourWikts;
    public String fiveWkts;

    public LeagueDAO(LeagueRunsCSV leagueRunsCSV) {
        name = leagueRunsCSV.name;
        noOfMatches = leagueRunsCSV.noOfMatches;
        noOfInnings = leagueRunsCSV.noOfInnings;
        noOfRuns = leagueRunsCSV.noOfRuns;
        highestScore = leagueRunsCSV.highestScore;
        noOfBallFaced = leagueRunsCSV.noOfBallFaced;
        averageScore = leagueRunsCSV.averageScore;
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
    }
}
