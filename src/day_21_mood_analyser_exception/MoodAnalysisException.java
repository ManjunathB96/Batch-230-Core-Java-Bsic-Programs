package day_21_mood_analyser_exception;

public class MoodAnalysisException extends Exception {
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY

    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}