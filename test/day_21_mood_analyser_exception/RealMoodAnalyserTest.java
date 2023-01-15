package day_21_mood_analyser_exception;

import org.junit.Assert;
import org.junit.Test;


public class RealMoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        RealMoodAnalyser analyser = new RealMoodAnalyser();
        String mood = analyser.analyseMood("This is sad message");
        Assert.assertEquals("SAD",mood);
    }
}