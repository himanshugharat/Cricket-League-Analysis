package com.bridglabz;

import com.opencsv.bean.CsvBindByName;

public class LeagueDAO {
    public String name;
    public String noOfMatches;
    public String noOfInnings;
    public String noOfRuns;
    public String highestScore;
    public String noOfBallFaced;
    public String averageScore;
    public String strikeRate;
    public String noOfHundresds;
    public String noOfFifty;
    public String noOfFours;
    public String noOfSixs;
    public String noOfOvers;
    public String noOfWickets;
    public String bbi;
    public String economy;
    public String fourWikts;
    public String fiveWkts;

    public LeagueDAO(LeagueRunsCSV leagueRunsCSV) {
        name= leagueRunsCSV.name;
        noOfMatches=leagueRunsCSV.noOfMatches;
        noOfInnings=leagueRunsCSV.noOfInnings;
        noOfRuns=leagueRunsCSV.noOfRuns;
        highestScore=leagueRunsCSV.highestScore;
        noOfBallFaced= leagueRunsCSV.noOfBallFaced;
        averageScore=leagueRunsCSV.averageScore;
        strikeRate=leagueRunsCSV.strikeRate;
        noOfHundresds=leagueRunsCSV.noOfHundresds;
        noOfFifty=leagueRunsCSV.noOfFifty;
        noOfFours=leagueRunsCSV.noOfFours;
        noOfSixs=leagueRunsCSV.noOfSixs;
    }

    public LeagueDAO(LeagueWktsCSV leagueWktsCSV) {
        name=leagueWktsCSV.name;
        noOfMatches=leagueWktsCSV.noOfMatches;
        noOfInnings=leagueWktsCSV.noOfInnings;
        noOfOvers=leagueWktsCSV.noOfOvers;
        noOfWickets=leagueWktsCSV.noOfWickets;
        bbi=leagueWktsCSV.bbi;
        economy=leagueWktsCSV.economy;
        fiveWkts=leagueWktsCSV.fiveWkts;
        fourWikts=leagueWktsCSV.foursWikts;
    }
}
