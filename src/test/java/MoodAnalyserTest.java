import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyseException;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

    public class MoodAnalyserTest {

        MoodAnalyser moodAnalyser;


        @Before
        public void init(){
            moodAnalyser = new MoodAnalyser();
        }


        @Test
        public void testSadMood() {
            String message = "I am in Sad Mood";
            String mood = moodAnalyser.analyseMood(message);
            assertEquals("SAD", mood);
        }

        @Test
        public void testHappyMood() {
            String message = "I am feeling happy today!";
            String mood = moodAnalyser.analyseMood(message);
            assertEquals("HAPPY", mood);
        }
    }
