package day_21_mood_analyser_exception;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class RealMoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        RealMoodAnalyser analyser = new RealMoodAnalyser();
        String mood = analyser.analyseMood("This is sad message");
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
    public void givenNull_Should_ThrowException() {
        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter proper mood", e.getMessage());
        }
    }
}