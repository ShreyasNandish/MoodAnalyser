import com.bridgelabz.MoodAnalyser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    static MoodAnalyser moodAnalyser;

    @BeforeAll
    public static void init()
    {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void ShouldReturnSadMood()
    {
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertSame("SAD",result);
    }
}
