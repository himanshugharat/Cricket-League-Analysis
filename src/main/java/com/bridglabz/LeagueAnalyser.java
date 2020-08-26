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
                comparator = Comparator.comparing(ipl -> ipl.averageScore);
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
                comparator = Comparator.comparing(ipl -> ipl.averageScore + ipl.strikeRate);
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
