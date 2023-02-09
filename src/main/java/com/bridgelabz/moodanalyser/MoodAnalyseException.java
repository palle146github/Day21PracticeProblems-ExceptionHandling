package com.bridgelabz.moodanalyser;

class MoodAnalyseException extends Exception {
    enum ExceptionType {NULL, EMPTY}

    ExceptionType type;

    public MoodAnalyseException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

