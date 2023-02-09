import com.bridgelabz.moodanalyser.MoodAnalyseException;
import com.bridgelabz.moodanalyser.MoodAnalyserCase3;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class MoodAnalysisCase3Test {


    @Test
    public void testNullMood() throws MoodAnalyseException {
        try{
            MoodAnalyserCase3 moodAnalyser = new MoodAnalyserCase3("NULL");
            String mood = moodAnalyser.analyseMood();
            System.out.println(mood);
        }catch(MoodAnalyseException e) {
            assertEquals("NULL", e.getMessage());
        }
    }


    @Test
    public void testNullMood() throws MoodAnalyseException {
        try{
            MoodAnalyserCase3 moodAnalyser = new MoodAnalyserCase3("NULL");
            String mood = moodAnalyser.analyseMood();
            System.out.println(mood);
        }catch(MoodAnalyseException e) {
            assertEquals("NULL", e.getMessage());
        }
    }


    @Test
    public void testNullMood() throws MoodAnalyseException {
        try{
            MoodAnalyserCase3 moodAnalyser = new MoodAnalyserCase3("");
            String mood = moodAnalyser.analyseMood();
            System.out.println(mood);
        }catch(MoodAnalyseException e) {
            assertEquals("EMPTY", e.getMessage());
        }
    }

}
