import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyseException;
import com.bridgelabz.moodanalyser.MoodAnalyserRefactor;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserRefacorTest {

    @Test
    public void testSadMood() {
        MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void testHappyMood() {
        MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("I am feeling happy today!");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }
}
