package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Moodtest31 {

    @Test
    public void whenGivenNullMoodShouldShouldThrowMoodAnalysisException() throws MoodAnalysisException {
        try {
            MoodAnalysisFinal maf = new MoodAnalysisFinal("null");
            String mood = maf.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("null", e.message);
            throw new RuntimeException(e);
        }
    }
}
