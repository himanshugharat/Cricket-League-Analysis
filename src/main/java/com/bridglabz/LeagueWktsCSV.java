package com.bridglabz;

import com.opencsv.bean.CsvBindByName;

public class LeagueWktsCSV {
    @CsvBindByName(column = "PLAYER")
    public String name;
    @CsvBindByName(column = "Mat")
    public int noOfMatches;
    @CsvBindByName(column = "Inns")
    public int noOfInnings;
    @CsvBindByName(column = "Ov")
    public double noOfOvers;
    @CsvBindByName(column = "Runs")
    public int noOfRuns;
    @CsvBindByName(column = "Wkts")
    public int noOfWickets;
    @CsvBindByName(column = "BBI")
    public String bbi;
    @CsvBindByName(column = "Avg")
    public double bowlingAverageScore;
    @CsvBindByName(column = "Econ")
    public double economy;
    @CsvBindByName(column = "SR")
    public double bowlingStrikeRate;
    @CsvBindByName(column = "4w")
    public int foursWikts;
    @CsvBindByName(column = "5w")
    public int fiveWkts;
}
