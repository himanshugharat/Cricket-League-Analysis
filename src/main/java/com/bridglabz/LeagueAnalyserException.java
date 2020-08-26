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

    public LeagueAnalyserException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }

    public enum ExceptionType {
        FILE_PROBLEM, NO_DATA, INVALID_PLAYER_TYPE
    }
}