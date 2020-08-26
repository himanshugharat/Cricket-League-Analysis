package com.bridglabz;

import com.opencsv.bean.CsvBindByName;

public class LeagueWktsCSV {
    @CsvBindByName(column = "PLAYER")
    public String name;
    @CsvBindByName(column = "Mat")
    public String noOfMatches;
    @CsvBindByName(column = "Inns")
    public String noOfInnings;
    @CsvBindByName(column = "Ov")
    public String noOfOvers;
    @CsvBindByName(column = "Runs")
    public String noOfRuns;
    @CsvBindByName(column = "Wkts")
    public String noOfWickets;
    @CsvBindByName(column = "BBI")
    public String bbi;
    @CsvBindByName(column = "Avg")
    public String averageScore;
    @CsvBindByName(column = "Econ")
    public String economy;
    @CsvBindByName(column = "SR")
    public String strikeRate;
    @CsvBindByName(column = "4w")
    public String foursWikts;
    @CsvBindByName(column = "5w")
    public String fiveWkts;
}
