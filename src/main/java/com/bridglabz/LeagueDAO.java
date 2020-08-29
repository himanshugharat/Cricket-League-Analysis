package com.bridglabz;

public class LeagueDAO {
    public double battingStrikeRate;
    public double bowlingStrikeRate;
    public int foursWickets;
    public String name;
    public int noOfMatches;
    public int noOfInnings;
    public int noOfRuns;
    public int highestScore;
    public double noOfBallFaced;
    public double battingAverageScore;
    public double bowlingAverageScore;
    public double strikeRate;
    public int noOfHundreds;
    public int noOfFifty;
    public int noOfFours;
    public int noOfSix;
    public double noOfOvers;
    public int noOfWickets;
    public String bbi;
    public double economy;
    public int fourWickets;
    public int fiveWickets;

    public LeagueDAO(LeagueRunsCSV leagueRunsCSV) {
        name = leagueRunsCSV.name;
        noOfMatches = leagueRunsCSV.noOfMatches;
        noOfInnings = leagueRunsCSV.noOfInnings;
        noOfRuns = leagueRunsCSV.noOfRuns;
        highestScore = leagueRunsCSV.highestScore;
        noOfBallFaced = leagueRunsCSV.noOfBallFaced;
        battingAverageScore = leagueRunsCSV.battingAverageScore;
        strikeRate = leagueRunsCSV.strikeRate;
        noOfHundreds = leagueRunsCSV.noOfHundresds;
        noOfFifty = leagueRunsCSV.noOfFifty;
        noOfFours = leagueRunsCSV.noOfFours;
        noOfSix = leagueRunsCSV.noOfSixs;
    }

    public LeagueDAO(LeagueWktsCSV leagueWktsCSV) {
        name = leagueWktsCSV.name;
        noOfMatches = leagueWktsCSV.noOfMatches;
        noOfInnings = leagueWktsCSV.noOfInnings;
        noOfOvers = leagueWktsCSV.noOfOvers;
        noOfWickets = leagueWktsCSV.noOfWickets;
        bbi = leagueWktsCSV.bbi;
        economy = leagueWktsCSV.economy;
        fiveWickets = leagueWktsCSV.fiveWkts;
        fourWickets = leagueWktsCSV.foursWikts;
        bowlingAverageScore = leagueWktsCSV.bowlingAverageScore;
        noOfRuns = leagueWktsCSV.noOfRuns;
        bowlingStrikeRate = leagueWktsCSV.bowlingStrikeRate;
    }

    public LeagueDAO(LeagueDAO leagueWicketsCSV, LeagueDAO leagueRunsCSV) {
        name = leagueWicketsCSV.name;
        noOfMatches = leagueWicketsCSV.noOfMatches;
        noOfInnings = leagueWicketsCSV.noOfInnings;
        noOfOvers = leagueWicketsCSV.noOfOvers;
        noOfWickets = leagueWicketsCSV.noOfWickets;
        bbi = leagueWicketsCSV.bbi;
        economy = leagueWicketsCSV.economy;
        fiveWickets = leagueWicketsCSV.fiveWickets;
        fourWickets = leagueWicketsCSV.foursWickets;
        bowlingAverageScore = leagueWicketsCSV.bowlingAverageScore;
        noOfRuns = leagueWicketsCSV.noOfRuns;
        name = leagueRunsCSV.name;
        noOfMatches = leagueRunsCSV.noOfMatches;
        noOfInnings = leagueRunsCSV.noOfInnings;
        noOfRuns = leagueRunsCSV.noOfRuns;
        highestScore = leagueRunsCSV.highestScore;
        noOfBallFaced = leagueRunsCSV.noOfBallFaced;
        battingAverageScore = leagueRunsCSV.battingAverageScore;
        battingStrikeRate = leagueRunsCSV.strikeRate;
        noOfHundreds = leagueRunsCSV.noOfHundreds;
        noOfFifty = leagueRunsCSV.noOfFifty;
        noOfFours = leagueRunsCSV.noOfFours;
        noOfSix = leagueRunsCSV.noOfSix;
    }

    public int getFoursWickets() {
        return foursWickets;
    }

    public int getNoOfRuns() {
        return noOfRuns;
    }

    public double getBattingAverageScore() {
        return battingAverageScore;
    }

    public double getBowlingAverageScore() {
        return bowlingAverageScore;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public int getNoOfHundreds() {
        return noOfHundreds;
    }

    public int getNoOfFours() {
        return noOfFours;
    }

    public int getNoOfWickets() {
        return noOfWickets;
    }

    public double getEconomy() {
        return economy;
    }

    public int getFiveWickets() {
        return fiveWickets;
    }
}
