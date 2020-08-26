package com.bridglabz;

import com.opencsv.bean.CsvBindByName;

public class LeagueRunsCSV {
    @CsvBindByName(column = "PLAYER")
    public String name;
    @CsvBindByName(column = "Mat")
    public String noOfMatches;
    @CsvBindByName(column = "Inns")
    public String noOfInnings;
    @CsvBindByName(column = "Runs")
    public String noOfRuns;
    @CsvBindByName(column = "HS")
    public String highestScore;
    @CsvBindByName(column = "BF")
    public String noOfBallFaced;
    @CsvBindByName(column = "Avg")
    public String averageScore;
    @CsvBindByName(column = "SR")
    public String strikeRate;
    @CsvBindByName(column = "100")
    public String noOfHundresds;
    @CsvBindByName(column = "50")
    public String noOfFifty;
    @CsvBindByName(column = "4s")
    public String noOfFours;
    @CsvBindByName(column = "6s")
    public String noOfSixs;
}
