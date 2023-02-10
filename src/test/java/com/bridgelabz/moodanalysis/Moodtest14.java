package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Test;

public class Moodtest14 {

    @Test
    public void whenGivenMessageShouldReturnHappy(){
        MoodAalyserRefactor mar = new MoodAalyserRefactor("I am in Happy Mood");
        String mood = mar.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
