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
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBattingAverageScore()).reversed();
                break;
            case "STRIKE_RATE":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getStrikeRate()).reversed();
                break;
            case "SIX_FOUR":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getNoOfRuns())
                        .thenComparing(l -> l.getNoOfFours()).reversed();
                break;
            case "SIX_FOUR_SR":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getNoOfRuns())
                        .thenComparing(l -> l.getNoOfFours())
                        .thenComparing(l -> l.getStrikeRate()).reversed();
                break;
            case "AVG_STRIKE_RATE":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBattingAverageScore())
                        .thenComparing(l -> l.getStrikeRate()).reversed();
                break;
            case "RUN_AVG":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBattingAverageScore())
                        .thenComparing(l -> l.getStrikeRate())
                        .thenComparing(l -> l.getNoOfRuns()).reversed();
                break;
            case "BOWLING_AVG":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBowlingAverageScore()).reversed();
                break;
            case "BOWLING_Strike_RATES":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBowlingAverageScore()).reversed();
                break;
            case "BOWLING_ECO":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getEconomy()).reversed();
                break;
            case "BOWLING_SR_4W_5W":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getStrikeRate())
                        .thenComparing(l -> l.getFoursWikts())
                        .thenComparing(l -> l.getFiveWkts()).reversed();
                break;
            case "BOWLING_SR_AVG":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getStrikeRate())
                        .thenComparing(l -> l.getBowlingAverageScore()).reversed();
                break;
            case "BOWLING_WKTS_AVG":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getNoOfRuns()).thenComparing(l -> l.getBowlingAverageScore()).reversed();
                break;
            case "SIX_AVG":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBattingAverageScore()).thenComparing(l -> l.getNoOfHundresds()).reversed();
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
                comparator = Comparator.comparing((LeagueDAO l) -> l.getNoOfRuns())
                        .thenComparing(l -> l.getBowlingAverageScore()).reversed();
                break;
            case "ALL_ROUNDER":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getNoOfRuns())
                        .thenComparing(l -> l.getNoOfWickets()).reversed();
                break;
            case "AVG":
                comparator = Comparator.comparing((LeagueDAO l) -> l.getBowlingAverageScore())
                        .thenComparing(l -> l.getBattingAverageScore()).reversed();
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
