package com.bridglabz;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class LeagueAnalyserTest {
    private final String RUNS_SHEET = ".\\src\\test\\resources\\IPL2019FactsheetMostRuns.csv";
    private final String WKTS_SHEET = ".\\src\\test\\resources\\IPL2019FactsheetMostWkts.csv";

    @Test
    public void givenFile_ifBattingCSVCorrect_returnNoOfEntries() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        int records = leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        Assert.assertEquals(100, records);
    }

    @Test
    public void givenFile_ifBowlingCSVCorrect_returnNoOfEntries() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        int records = leagueAnalyser.loadData(LeagueAnalyser.Player.WKTS, RUNS_SHEET);
        Assert.assertEquals(100, records);
    }

    @Test
    public void givenFile_SortWithRespectToAverage_ReturnHighestBattingAvg() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        String sortedData = leagueAnalyser.sortData("AVG");
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("MS Dhoni", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }

    @Test
    public void givenFile_SortWithRespectToStrikeRate_ReturnHighestStrikeRate() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        String sortedData = leagueAnalyser.sortData("STRIKE_RATE");
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("Ishant Sharma", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }

    @Test
    public void givenFile_SortWithRespectToSixAndFour_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        String sortedData = leagueAnalyser.sortData("SIX_FOUR");
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("Andre Russell", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }

    @Test
    public void givenFile_SortWithRespectToSixFourAndStrikeRate_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        String sortedData = leagueAnalyser.sortData("SIX_FOUR_SR");
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("Ishant Sharma", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }

    @Test
    public void givenFile_SortWithRespectAverageAndStrikeRate_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        String sortedData = leagueAnalyser.sortData("AVG_STRIKE_RATE");
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("Ishant Sharma", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }

    @Test
    public void givenFile_SortWithRespectAverageAndRuns_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS, RUNS_SHEET);
        String sortedData = leagueAnalyser.sortData("RUN_AVG");
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("David Warner ", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }

    @Test
    public void givenFile_SortWithRespectBowlingAverage_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        leagueAnalyser.loadData(LeagueAnalyser.Player.WKTS, WKTS_SHEET);
        String sortedData = leagueAnalyser.sortData("BOWLING_AVG");
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Krishnappa Gowtham", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);

    }
}
