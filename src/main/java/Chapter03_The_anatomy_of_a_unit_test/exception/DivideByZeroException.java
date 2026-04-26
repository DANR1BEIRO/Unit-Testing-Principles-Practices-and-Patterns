package Chapter03_The_anatomy_of_a_unit_test.exception;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
