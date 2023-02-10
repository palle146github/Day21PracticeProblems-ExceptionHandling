package com.bridgelabz.moodanalysis;

public class MoodAnalysisException extends Throwable{

    String message;

    ExceptionType type;

    enum ExceptionType { NULL, EMPTY }

    public MoodAnalysisException(  ExceptionType type , String message){
        this.type = type;
        this.message = message;
    }





}
