package com.bridglabz;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class LeagueAnalyserTest {
    private final String RUNS_SHEET = ".\\src\\test\\resources\\IPL2019FactsheetMostRuns.csv";
    private final String WKTS_SHEET = ".\\src\\test\\resources\\IPL2019FactsheetMostWkts.csv";

    @Test
    public void givenFile_ifBattingCSVCorrect_returnNoOfEntries() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        Assert.assertEquals(100, map.size());
    }

    @Test
    public void givenFile_ifBowlingCSVCorrect_returnNoOfEntries() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, RUNS_SHEET);
        Assert.assertEquals(100, map.size());
    }

    @Test
    public void givenFile_SortWithRespectToAverage_ReturnHighestBattingAvg() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("AVG", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("Harpreet Brar", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);
    }

    @Test
    public void givenFile_SortWithRespectToStrikeRate_ReturnHighestStrikeRate() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("STRIKE_RATE", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("Ishant Sharma", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectToSixAndFour_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("SIX_FOUR", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("David Warner ", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectToSixFourAndStrikeRate_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("SIX_FOUR_SR", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("David Warner ", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectAverageAndStrikeRate_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("AVG_STRIKE_RATE", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("MS Dhoni", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectAverageAndRuns_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("RUN_AVG", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("MS Dhoni", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlingAverage_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, WKTS_SHEET);
        String sortedData = DataSorting.sortData("BOWLING_AVG", map);
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Krishnappa Gowtham", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlingStrikeRates_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, WKTS_SHEET);
        String sortedData = DataSorting.sortData("BOWLING_Strike_RATES", map);
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Krishnappa Gowtham", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlerBestEconomy_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, WKTS_SHEET);
        String sortedData = DataSorting.sortData("BOWLING_ECO", map);
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Ben Cutting", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlerStrikeRate_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, WKTS_SHEET);
        String sortedData = DataSorting.sortData("BOWLING_SR_4W_5W", map);
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Alzarri Joseph", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlerStrikeRateAndAverage_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, WKTS_SHEET);
        String sortedData = DataSorting.sortData("BOWLING_SR_AVG", map);
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Yusuf Pathan", leagueRunsCSVS[leagueRunsCSVS.length - 1].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlerWithMaxWktsAndAverage_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.WKTS, WKTS_SHEET);
        String sortedData = DataSorting.sortData("BOWLING_WKTS_AVG", map);
        LeagueWktsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueWktsCSV[].class);
        Assert.assertEquals("Deepak Chahar", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectBowlerAndBattingAverage_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueLoader leagueLoader = new LeagueLoader();
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map<String, LeagueDAO> map = leagueLoader.getListData(RUNS_SHEET, WKTS_SHEET);
        String sortedData = DataSorting.sortedData(map, "AVG_BATTING_BOWLING");
        LeagueDAO[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueDAO[].class);
        Assert.assertEquals("Mayank Markande", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectToAllRounder_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueLoader leagueLoader = new LeagueLoader();
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map<String, LeagueDAO> map = leagueLoader.getListData(RUNS_SHEET, WKTS_SHEET);
        String sortedData = DataSorting.sortedData(map, "ALL_ROUNDER");
        LeagueDAO[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueDAO[].class);
        Assert.assertEquals("Mayank Markande", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectAverageAndMostSixs_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map map = leagueAnalyser.loadData(Player.RUNS, RUNS_SHEET);
        String sortedData = DataSorting.sortData("SIX_AVG", map);
        LeagueRunsCSV[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueRunsCSV[].class);
        Assert.assertEquals("MS Dhoni", leagueRunsCSVS[0].name);
    }

    @Test
    public void givenFile_SortWithRespectAverageAndNOCentury_ReturnHighestPlayerName() throws LeagueAnalyserException {
        LeagueLoader leagueLoader = new LeagueLoader();
        LeagueAnalyser leagueAnalyser = new LeagueAnalyser();
        Map<String, LeagueDAO> map = leagueLoader.getListData(RUNS_SHEET, WKTS_SHEET);
        String sortedData = DataSorting.sortedData(map, "AVG");
        LeagueDAO[] leagueRunsCSVS = new Gson().fromJson(sortedData, LeagueDAO[].class);
        Assert.assertEquals("Mayank Markande", leagueRunsCSVS[0].name);
    }
}
