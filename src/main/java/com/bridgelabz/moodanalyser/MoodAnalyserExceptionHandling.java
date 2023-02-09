package com.bridgelabz.moodanalyser;

public class MoodAnalyserExceptionHandling {
    private String message;

    // Default constructor
    public MoodAnalyserExceptionHandling() {
    }

    // Parameterized constructor
    public MoodAnalyserExceptionHandling(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyseException{
        try {
            if (message.length() == 0) {
                throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.EMPTY, "Please enter a valid message");
            } else if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.NULL, "Please enter a valid message");
        }
    }

    public static void main(String[] args) throws MoodAnalyseException {
        MoodAnalyserExceptionHandling moodAnalyser = new MoodAnalyserExceptionHandling();
        System.out.println(moodAnalyser.analyseMood());  // Output: HAPPY
        MoodAnalyserExceptionHandling moodAnalyser1 = new MoodAnalyserExceptionHandling("SAD");

        System.out.println(moodAnalyser1.analyseMood());  // Output: SAD
    }
}

