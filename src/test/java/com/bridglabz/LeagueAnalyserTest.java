package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class LeagueAnalyserTest {
    private final String RUNS_SHEET=".\\src\\test\\resources\\IPL2019FactsheetMostRuns.csv";
    private final String WKTS_SHEET=".\\src\\test\\resources\\IPL2019FactsheetMostRuns.csv";

    @Test
    public void givenFile_ifCorrect_returnNoOfEntries() throws LeagueAnalyserException{
        LeagueAnalyser leagueAnalyser=new LeagueAnalyser();
        int records=leagueAnalyser.loadData(LeagueAnalyser.Player.RUNS,RUNS_SHEET);
        Assert.assertEquals(100,records);
    }
}
