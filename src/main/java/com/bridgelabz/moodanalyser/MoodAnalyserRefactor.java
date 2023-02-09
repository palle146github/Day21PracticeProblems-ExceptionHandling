package com.bridgelabz.moodanalyser;

public class MoodAnalyserRefactor {
    private String message;

    public MoodAnalyserRefactor() {
    }

    public MoodAnalyserRefactor(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("I am in Sad Mood");
        System.out.println(moodAnalyser.analyseMood());
    }
}
