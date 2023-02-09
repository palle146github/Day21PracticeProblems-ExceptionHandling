package com.bridgelabz.moodanalyser;

public class MoodAnalyserCase3 {
    private String message;

    public MoodAnalyserCase3() {
    }

    public MoodAnalyserCase3(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyseException {
        try {
            if (message == null) {
                throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.NULL, "NULL");
            } else if (message.length() == 0) {
                throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.EMPTY, "EMPTY");
            } else if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalyseException e) {
            throw e;
        }
    }

    public static void main(String[] args) throws MoodAnalyseException {
        MoodAnalyserCase3 moodAnalyser = new MoodAnalyserCase3();
        System.out.println(moodAnalyser.analyseMood());  // Output: HAPPY
        MoodAnalyserCase3 moodAnalyser1 = new MoodAnalyserCase3("Hello World");
        System.out.println(moodAnalyser1.analyseMood());  // Output: SAD
    }
}