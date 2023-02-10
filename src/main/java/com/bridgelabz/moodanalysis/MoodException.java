package com.bridgelabz.moodanalysis;

public class MoodException {

    private String message;

    public MoodException(String message) {
        this.message = message;
    }

    public String analyseMood() throws Exception {
        try{
            if (message == null || message.length() == 0) {
                throw new Exception("HAPPY");
            } else if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (Exception e){
           throw new Exception(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        MoodException mar = new MoodException("I am in Sad Mood");
        System.out.println(mar.analyseMood());
        MoodException mar1 = new MoodException("I am in Happy Mood");
        System.out.println(mar1.analyseMood());
        try{
            MoodException mar2 = new MoodException("");
            mar2.analyseMood();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
