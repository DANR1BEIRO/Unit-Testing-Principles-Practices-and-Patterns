package Chapter03_The_anatomy_of_a_unit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// should[Comportamento]When[Condição]
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Using the AAA pattern
     * The AAA pattern advocates for splitting each test into three parts: arrange, act, and
     * assert. (This pattern is sometimes also called the 3A pattern).
     * <p>
     * The AAA pattern provides a simple, uniform structure for all tests in the suite. This
     * uniformity is one of the biggest advantages of this pattern: once you get used to it, you
     * can easily read and understand any test. That, in turn, reduces maintenance costs for
     * your entire test suite.
     * <p>
     * The structure is as follows:
     * - In the arrange section, you bring the system under test (SUT) and its dependen-
     * cies to a desired state.
     * - In the act section, you call methods on the SUT, pass the prepared dependen-
     * cies, and capture the output value (if any).
     * - In the assert section, you verify the outcome. The outcome may be represented
     * by the return value, the final state of the SUT and its collaborators, or the meth-
     * ods the SUT called on those collaborators.
     */
    @Test
    void sum_shouldPerformSum_WhenNumbersAreValid() {

        // Arrange section
        double first = 10;
        double second = 20;

        // Act section
        double result = calculator.sum(first, second);

        // Assert section
        assertEquals(30, result);
    }

    @Test
    void subtraction_shouldReturnPositiveResult_whenFirstNumberIsGreater() {

        double result = calculator.subtraction(20, 10);

        assertEquals(10, result);
    }

    @Test
    void subtraction_shouldReturnNegativeResult_whenSecondNumberIsGreater(){

        double result = calculator.subtraction(10, 20);

        assertEquals(-10, result);
    }

    @Test
    void subtraction_shouldReturnCorrectValue_whenSubtractingNegativeNumbers(){

        double result = calculator.subtraction(10, -5);

        assertEquals(15, result);
    }

    @Test
    void subtraction_shouldMaintainPrecision_whenWorkingWithSmallDecimalValues(){

        double result = calculator.subtraction(0.3, 0.2);

        assertEquals(0.1, result, 0.01);
    }

    @Test
    void multiply() {

        double result = calculator.multiply(10, 10);

        assertEquals(100, result);
    }
}