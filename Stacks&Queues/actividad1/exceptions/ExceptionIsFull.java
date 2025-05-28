package exceptions;

public class ExceptionIsFull extends RuntimeException {
    public ExceptionIsFull(String message) {
        super(message);
    }
}
