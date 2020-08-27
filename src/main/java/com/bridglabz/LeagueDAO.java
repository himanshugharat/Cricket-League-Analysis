package com.bridglabz;

public class LeagueDAO {
    public double battingStrikeRate;
    public double bowlingStrikeRate;
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
        bowlingStrikeRate = leagueWktsCSV.bowlingStrikeRate;
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
        battingStrikeRate = leagueRunsCSV.strikeRate;
        noOfHundresds = leagueRunsCSV.noOfHundresds;
        noOfFifty = leagueRunsCSV.noOfFifty;
        noOfFours = leagueRunsCSV.noOfFours;
        noOfSixs = leagueRunsCSV.noOfSixs;

    }

    public double getBattingStrikeRate() {
        return battingStrikeRate;
    }

    public double getBowlingStrikeRate() {
        return bowlingStrikeRate;
    }

    public int getFoursWikts() {
        return foursWikts;
    }

    public String getName() {
        return name;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public int getNoOfInnings() {
        return noOfInnings;
    }

    public int getNoOfRuns() {
        return noOfRuns;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public double getNoOfBallFaced() {
        return noOfBallFaced;
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

    public int getNoOfHundresds() {
        return noOfHundresds;
    }

    public int getNoOfFifty() {
        return noOfFifty;
    }

    public int getNoOfFours() {
        return noOfFours;
    }

    public int getNoOfSixs() {
        return noOfSixs;
    }

    public double getNoOfOvers() {
        return noOfOvers;
    }

    public int getNoOfWickets() {
        return noOfWickets;
    }

    public String getBbi() {
        return bbi;
    }

    public double getEconomy() {
        return economy;
    }

    public int getFourWikts() {
        return fourWikts;
    }

    public int getFiveWkts() {
        return fiveWkts;
    }
}
