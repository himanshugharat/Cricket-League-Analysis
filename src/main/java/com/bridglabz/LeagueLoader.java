package com.bridglabz;

import customcsv.util.CSVBuilderException;
import customcsv.util.ICSVBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.StreamSupport;

public class LeagueLoader {
    Map<String, LeagueDAO> map = new HashMap<>();

    public Map<String, LeagueDAO> loadLeagueData(String csvfilePath, Player player) throws LeagueAnalyserException {
        if (player.equals(Player.RUNS)) {
            return this.loadLeagueData(csvfilePath, LeagueRunsCSV.class);
        } else if (player.equals(Player.WKTS)) {
            return this.loadLeagueData(csvfilePath, LeagueWktsCSV.class);
        }
        return null;
    }

    private <E> Map<String, LeagueDAO> loadLeagueData(String csvFilePath, Class<E> LeagueCSV) throws LeagueAnalyserException {
        try {
            Reader reader = Files.newBufferedReader(Path.of(csvFilePath));
            ICSVBuilder csvBuilder = CSVBuilderFactory.createCSVBuilder();
            Iterator<E> csvFileIterator = csvBuilder.getCSVFileIterator(reader, LeagueCSV);
            Iterable<E> leagueCSVIterable = () -> csvFileIterator;
            if (LeagueCSV.getName().equals("com.bridglabz.LeagueRunsCSV"))
                StreamSupport.stream(leagueCSVIterable.spliterator(), false)
                        .map(LeagueRunsCSV.class::cast)
                        .forEach(csvPlayer -> map.put(csvPlayer.name, new LeagueDAO(csvPlayer)));
            else if (LeagueCSV.getName().equals("com.bridglabz.LeagueWktsCSV")) {
                StreamSupport.stream(leagueCSVIterable.spliterator(), false)
                        .map(LeagueWktsCSV.class::cast)
                        .forEach(csvPlayer -> map.put(csvPlayer.name, new LeagueDAO(csvPlayer)));
            }
            return map;
        } catch (IOException e) {
            throw new LeagueAnalyserException(e.getMessage(), LeagueAnalyserException.ExceptionType.FILE_PROBLEM);
        } catch (CSVBuilderException e) {
            throw new LeagueAnalyserException(e.getMessage(), e.type.name());
        }
    }

    public Map<String, LeagueDAO> getListData(String battingCsvPAth, String bowlingCsvFile) throws LeagueAnalyserException {
        Map<String, LeagueDAO> runsMap = loadLeagueData(battingCsvPAth, LeagueRunsCSV.class);
        Map<String, LeagueDAO> wktsMap = loadLeagueData(bowlingCsvFile, LeagueWktsCSV.class);
        Map<String, LeagueDAO> CombineMap = new HashMap<>();
        for (String battingPlayers : runsMap.keySet()) {
            for (String bowlingPlayers : wktsMap.keySet()) {
                if (new ArrayList<>(runsMap.values()).equals(new ArrayList<>(wktsMap.values()))) {
                    if (runsMap.get(battingPlayers).noOfHundreds == 0 && wktsMap.get(bowlingPlayers).noOfFifty == 0) {
                        CombineMap.put(runsMap.get(battingPlayers).name, new LeagueDAO(runsMap.get(battingPlayers), wktsMap.get(bowlingPlayers)));
                    }
                }
            }
        }
        return CombineMap;
    }
}


