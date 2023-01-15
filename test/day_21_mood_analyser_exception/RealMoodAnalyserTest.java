package day_21_mood_analyser_exception;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class RealMoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is sad message");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException {
        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is Happy message");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNull_ShouldReturnHappy() throws MoodAnalysisException {
        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
        String mood = moodAnalyser.analyseMood(String.valueOf(0));
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_Should_ThrowException() {
        RealMoodAnalyser realMoodAnalyser = new RealMoodAnalyser(null);
        try {
            realMoodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenEmptyMood_Should_ThrowException() {
        RealMoodAnalyser realMoodAnalyser = new RealMoodAnalyser("");
        try {
            realMoodAnalyser.analyseMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}