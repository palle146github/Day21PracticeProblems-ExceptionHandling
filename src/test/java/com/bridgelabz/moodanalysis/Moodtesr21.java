package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Test;

public class Moodtesr21 {

    @Test
    public void whenGivenNullMoodShouldReturnHappy() throws Exception {
        try{
            MoodException mar = new MoodException("");
            String mood = mar.analyseMood();
        }catch (Exception e){
        Assert.assertEquals("HAPPY", e.getMessage());}

    }
}
