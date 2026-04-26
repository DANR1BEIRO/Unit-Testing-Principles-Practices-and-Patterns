package Chapter03_The_anatomy_of_a_unit_test;

import Chapter03_The_anatomy_of_a_unit_test.exception.DivideByZeroException;

public class Calculator {

    public double sum(double first, double second) {
        return first + second;
    }

    public double subtraction(double first, double second) {
        return first - second;
    }

    public double multiplication(double first, double second) {
        return first * second;
    }

    public double division(double first, double second) {
        if (second == 0) {
            throw new DivideByZeroException("Can't divide by zero");
        }
        return first / second;


    }
}
