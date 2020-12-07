package advanced.collections;

public class NoSuchBookException extends Exception {

    public NoSuchBookException() {
        super("The book does not exist");
    }


}
