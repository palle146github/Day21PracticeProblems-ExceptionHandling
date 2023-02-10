package com.bridgelabz.moodanalysis;
import java.util.*;

public class MoodAnalyser {

    public String analyseMood(String message){
        if( message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else{
            return "HAPPY";
        }
    }


    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood("message");
    }

}
