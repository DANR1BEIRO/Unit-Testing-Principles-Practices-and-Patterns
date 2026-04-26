package Chapter03_The_anatomy_of_a_unit_test;

import Chapter03_The_anatomy_of_a_unit_test.exception.DivideByZeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Calculator Class")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Sum: Should return 30 when adding 10 and 20")
    void sum_shouldPerformSum_WhenNumbersAreValid() {

        double result = calculator.sum(10, 20);

        assertEquals(30, result);
    }

    @Test
    @DisplayName("Subtraction: Should return a positive result when the first number is greater")
    void subtraction_shouldReturnPositiveResult_whenFirstNumberIsGreater() {

        double result = calculator.subtraction(20, 10);

        assertEquals(10, result);
    }

    @Test
    @DisplayName("Subtraction: Should return a negative result when the second number is greater")
    void subtraction_shouldReturnNegativeResult_whenSecondNumberIsGreater() {

        double result = calculator.subtraction(10, 20);

        assertEquals(-10, result);
    }

    @ParameterizedTest
    @CsvSource({
            "10, -15, 25",
            "-10, -10, 0",
            "-15, 10, -25"
    })
    @DisplayName("Subtraction: Should handle negative numbers correctly")
    void subtraction_shouldReturnCorrectValue_whenSubtractingNegativeNumbers(double first, double second, double expected) {

        double result = calculator.subtraction(first, second);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    @DisplayName("Subtraction: Should maintain precision using a delta for small decimal values")
    void subtraction_shouldMaintainPrecision_whenWorkingWithSmallDecimalValues() {

        double result = calculator.subtraction(0.3, 0.2);

        assertEquals(0.1, result, 0.0001);
    }

    @ParameterizedTest(name = "Multiplication of {0} times {1} should be {2}")
    @CsvSource({
            "0, 10, 0",
            "10, 0, 0"})
    @DisplayName("Multiplication: Should return zero when any operand is zero")
    void multiplication_shouldReturnZero_whenMultiplyingByZero(double first, double second, double expected) {

        double result = calculator.multiplication(first, second);

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "Multiplication of {0} times {1} should be {2}")
    @CsvSource({
            "-10, -10, 100",
            "-5, -5, 25"})
    @DisplayName("Multiplication: Should return positive result when both numbers are negative")
    void multiplication_shouldReturnPositiveResult_whenBothNumbersAreNegative(double first, double second, double expected) {

        double result = calculator.multiplication(first, second);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Multiplication: Should maintain decimal precision using a delta")
    void multiplication_shouldMaintainPrecision_whenWorkingWithSmallDecimalNumbers() {

        double result = calculator.multiplication(0.1, 0.2);

        assertEquals(0.02, result, 0.0001);
    }

    @Test
    @DisplayName("Multiplication: Should return Infinity when the result exceeds Double.MAX_VALUE")
    void multiplication_shouldReturnInfinity_whenValueExceedsDoubleMax() {

        double result = calculator.multiplication(Double.MAX_VALUE, 2);

        assertTrue(Double.isInfinite(result));
    }

    @ParameterizedTest
    @CsvSource({
            "10.0, 0",
            "5.5, 0",
            "-1.0, 0"
    })
    @DisplayName("Should throw an exception when second digit is zero")
    void division_shouldThrowException_whenDividedByZero(double first, double second) {

        assertThrows(DivideByZeroException.class,
                () -> calculator.division(first, second));

    }
}