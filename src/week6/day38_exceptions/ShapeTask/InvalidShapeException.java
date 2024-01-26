package week6.day38_exceptions.ShapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException() {
    }

    public InvalidShapeException(String message) {
        super(message);
    }
}
