import com.bridgelabz.MoodAnalyser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {

    @Test
    public void ShouldReturnSadMood()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        Assertions.assertSame("SAD",result);
    }

    @Test
    public void ShouldReturnHappyMood()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String result = moodAnalyser.analyseMood();
        Assertions.assertSame("HAPPY",result);
    }
}
