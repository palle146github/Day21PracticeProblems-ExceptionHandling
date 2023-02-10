package com.bridgelabz.moodanalysis;

import org.junit.Assert;
import org.junit.Test;

public class Moodtest32 {

    @Test
    public void whenGivenEmptyShouldThrowMoodAnalysisException() throws MoodAnalysisException {
        try {
            MoodAnalysisFinal maf = new MoodAnalysisFinal("");
            String mood = maf.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("EMPTY", e.message);
            throw new RuntimeException(e);
        }
    }
}
