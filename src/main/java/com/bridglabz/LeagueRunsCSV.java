package com.bridglabz;

import com.opencsv.bean.CsvBindByName;

public class LeagueRunsCSV {
    @CsvBindByName(column = "PLAYER")
    public String name;
    @CsvBindByName(column = "Mat")
    public int noOfMatches;
    @CsvBindByName(column = "Inns")
    public int noOfInnings;
    @CsvBindByName(column = "Runs")
    public int noOfRuns;
    @CsvBindByName(column = "HS")
    public int highestScore;
    @CsvBindByName(column = "BF")
    public double noOfBallFaced;
    @CsvBindByName(column = "Avg")
    public double battingAverageScore;
    @CsvBindByName(column = "SR")
    public double strikeRate;
    @CsvBindByName(column = "100")
    public int noOfHundresds;
    @CsvBindByName(column = "50")
    public int noOfFifty;
    @CsvBindByName(column = "4s")
    public int noOfFours;
    @CsvBindByName(column = "6s")
    public int noOfSixs;
}
