package com.bridglabz;

public class LeagueAnalyserException extends Exception {
    ExceptionType type;

    public LeagueAnalyserException(String message, String name) {
        super(message);
        this.type = ExceptionType.valueOf(name);
    }

    public LeagueAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        FILE_PROBLEM
    }
}
