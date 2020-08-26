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
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "STRIKE_RATE":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "SIX_FOUR":
                comparator = Comparator.comparing(ipl -> ipl.noOfSixs + ipl.noOfFours);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "SIX_FOUR_SR":
                comparator = Comparator.comparing(ipl -> ipl.noOfSixs + ipl.noOfFours + ipl.strikeRate);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "AVG_STRIKE_RATE":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore + ipl.strikeRate);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "RUN_AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore + ipl.strikeRate + ipl.noOfRuns);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "BOWLING_AVG":
                comparator = Comparator.comparing(ipl -> ipl.bowlingAverageScore);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "BOWLING_Strike_RATES":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "BOWLING_ECO":
                comparator = Comparator.comparing(ipl -> ipl.economy);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "BOWLING_SR_4W_5W":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate + ipl.fourWikts + ipl.fiveWkts);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "BOWLING_SR_AVG":
                comparator = Comparator.comparing(ipl -> ipl.strikeRate + ipl.bowlingAverageScore);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "BOWLING_WKTS_AVG":
                comparator = Comparator.comparing(ipl -> ipl.noOfRuns + ipl.bowlingAverageScore);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "SIX_AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore + ipl.noOfHundresds);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
        }
        Collections.sort(leagueList, comparator);
        String sortedJsonData = new Gson().toJson(leagueList);
        return sortedJsonData;
    }

    public String sortedData(Map<String, LeagueDAO> map, String parameter) {
        switch (parameter) {
            case "AVG_BATTING_BOWLING":
                comparator = Comparator.comparing(ipl -> ipl.noOfRuns + ipl.bowlingAverageScore);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "ALL_ROUNDER":
                comparator = Comparator.comparing(ipl -> ipl.noOfRuns + ipl.noOfWickets);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
            case "AVG":
                comparator = Comparator.comparing(ipl -> ipl.battingAverageScore);
                leagueList = map.values().stream().collect(Collectors.toList());
                break;
        }
        Collections.sort(leagueList, comparator);
        String sortedJsonData = new Gson().toJson(leagueList);
        return sortedJsonData;
    }

    public enum Player {
        RUNS, WKTS
    }
}
