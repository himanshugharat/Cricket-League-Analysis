package com.bridglabz;

import java.util.HashMap;
import java.util.Map;

public class LeagueAnalyser {
    Map<String, LeagueDAO> leagueDAOMap = new HashMap<>();

    public Map<String, LeagueDAO> loadData(Player player, String csvFilePath) throws LeagueAnalyserException {
        leagueDAOMap = new LeagueLoader().loadLeagueData(csvFilePath, player);
        return leagueDAOMap;
    }
}
