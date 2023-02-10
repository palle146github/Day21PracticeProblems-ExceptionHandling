package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Moodtest12 {

    MoodAnalyser moodTest;

    @Before
    public void init(){
        moodTest = new MoodAnalyser();
    }

    @Test
    public void whenGivenMessageShouldReturnHappy(){
        String testString = "I am in Any Mood";
        String result = moodTest.analyseMood(testString);
        Assert.assertEquals("HAPPY",result);
    }
}
