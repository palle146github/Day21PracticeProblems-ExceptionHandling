package com.bridgelabz.moodanalysis;

public class MoodAalyserRefactor {
    private String message;

    public MoodAalyserRefactor(){}

    public MoodAalyserRefactor(String message) {
        this.message = message;
    }

    public String analyseMood(){
        if( message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else{
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAalyserRefactor mar = new MoodAalyserRefactor("I am in Sad Mood");
        System.out.println(" Result " + mar.analyseMood());
        MoodAalyserRefactor mar1 = new MoodAalyserRefactor("I am in Happy Mood");
        System.out.println(" Result " + mar1.analyseMood());
    }
}
