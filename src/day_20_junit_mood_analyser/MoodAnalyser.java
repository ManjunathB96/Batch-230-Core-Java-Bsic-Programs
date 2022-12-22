package day_20_junit_mood_analyser;

public class MoodAnalyser {
    public String analyseMood(String message){
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
