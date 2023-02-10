package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Moodtest13 {

    @Test
    public void whenGivenMessageShouldReturnSad(){
        MoodAalyserRefactor mar = new MoodAalyserRefactor("I am in Sad Mood");
        String mood = mar.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
}
