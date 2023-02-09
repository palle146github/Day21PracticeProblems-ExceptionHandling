package com.bridgelabz.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("I am in Sad Mood"));  // Output: HAPPY
        System.out.println(moodAnalyser.analyseMood("I am feeling happy today!"));  // Output: SAD
    }
}

