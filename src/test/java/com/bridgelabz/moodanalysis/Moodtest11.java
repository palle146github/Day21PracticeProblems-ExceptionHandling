package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Moodtest11 {

    MoodAnalyser moodTesst;

    @Before
    public void init(){
        moodTesst = new MoodAnalyser();
    }

    @Test
    public void whenMessageGivenShouldReturnsad(){
        String testString= "I am in Sad Mood";
        String result = moodTesst.analyseMood(testString);
        Assert.assertEquals("SAD",result);

    }
}
