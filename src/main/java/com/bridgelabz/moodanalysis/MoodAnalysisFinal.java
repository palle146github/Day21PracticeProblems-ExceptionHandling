package com.bridgelabz.moodanalysis;

public class MoodAnalysisFinal {
    private String message;

    public MoodAnalysisFinal(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == "NULL") {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "NULL");
            } else if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "EMPTY");
            } else if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalysisException e) {
            throw new MoodAnalysisException(e.type,e.message);
        }
    }


    public static void main(String[] args) throws MoodAnalysisException {
        try {
            MoodAnalysisFinal maf = new MoodAnalysisFinal("");
            System.out.println(maf.analyseMood());
        }catch( MoodAnalysisException e){
            System.out.println("Type  :  " + e.type + " Message  :  " + e.message);
        }
    }
}
