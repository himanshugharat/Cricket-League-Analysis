package com.bridglabz;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

public class LeagueAnalyser {
    Map<String, LeagueDAO> map = new HashMap();
    Comparator<LeagueDAO> comparator = null;
    List<LeagueDAO> leagueList = null;

    public int loadData(Player player, String csvFilePath) throws LeagueAnalyserException {
        map = new LeagueLoader().loadLeagueData(csvFilePath, player);
        return map.size();
    }

    public String sortData(String parameter) {

        switch (parameter) {
            case "AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore);

                break;
            case "STRIKE_RATE":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate);

                break;
            case "SIX_FOUR":
                comparator = Comparator.comparing(ipl -> ipl.noOfSixs + ipl.noOfFours);
                break;
            case "SIX_FOUR_SR":
                comparator = Comparator.comparing(ipl -> ipl.noOfSixs + ipl.noOfFours + ipl.strikeRate);
                break;
            case "AVG_STRIKE_RATE":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore + ipl.strikeRate);
                break;
            case "RUN_AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore + ipl.strikeRate + ipl.noOfRuns);
                break;
            case "BOWLING_AVG":
                comparator = Comparator.comparing(ipl -> ipl.bowlingAverageScore);
                break;
            case "BOWLING_Strike_RATES":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate);
                break;
            case "BOWLING_ECO":
                comparator = Comparator.comparing(ipl -> ipl.economy);
                break;
            case "BOWLING_SR_4W_5W":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate + ipl.fourWikts + ipl.fiveWkts);
                break;
            case "BOWLING_SR_AVG":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate + ipl.bowlingAverageScore);
                break;
            case "BOWLING_WKTS_AVG":
                comparator = Comparator.comparing(ipl -> ipl.noOfRuns + ipl.bowlingAverageScore);
                break;
            case "SIX_AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore + ipl.noOfHundresds);
                break;
        }
        leagueList = map.values().stream().collect(Collectors.toList());
        Collections.sort(leagueList, comparator);
        String sortedJsonData = new Gson().toJson(leagueList);
        return sortedJsonData;
    }

    public String sortedData(Map<String, LeagueDAO> map, String parameter) {
        switch (parameter) {
            case "AVG_BATTING_BOWLING":
                comparator = Comparator.comparing(ipl -> ipl.noOfRuns + ipl.bowlingAverageScore);
                break;
            case "ALL_ROUNDER":
                comparator = Comparator.comparing(ipl -> ipl.noOfRuns);
                break;
            case "AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore);
                break;
        }
        leagueList = map.values().stream().collect(Collectors.toList());
        Collections.sort(leagueList, comparator);
        String sortedJsonData = new Gson().toJson(leagueList);
        return sortedJsonData;
    }

    public enum Player {
        RUNS, WKTS
    }
}
