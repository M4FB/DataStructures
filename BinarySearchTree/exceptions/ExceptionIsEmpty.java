package exceptions;

public class ExceptionIsEmpty extends RuntimeException {
    public ExceptionIsEmpty(String message) {
        super(message);
    }

    public ExceptionIsEmpty() {
        super("The structure is empty.");
    }
}