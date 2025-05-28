package exceptions;

public class ItemNotFound extends Exception {
    public ItemNotFound(String message) {
        super(message);
    }

    public ItemNotFound() {
        super("El item no se encontro");
    }
}