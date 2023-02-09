import com.bridgelabz.moodanalyser.MoodAnalyserExceptionHandling;
import org.junit.Test;
import org.junit.Before;

public class MoodAnalyserExceptionTest {

    @Test
    public void testSadMood() {
        MoodAnalyserExceptionHandling moodAnalyser = new MoodAnalyserExceptionHandling("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void testHappyMood() {
        MoodAnalyserExceptionHandling moodAnalyser = new MoodAnalyserExceptionHandling("I am feeling happy today!");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }

    @Test
    public void testNullMood() {
        MoodAnalyserExceptionHandling moodAnalyser = new MoodAnalyserExceptionHandling("NULL");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }
}
