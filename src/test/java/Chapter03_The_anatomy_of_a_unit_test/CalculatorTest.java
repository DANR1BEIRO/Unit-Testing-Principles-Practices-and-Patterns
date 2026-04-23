package Chapter03_The_anatomy_of_a_unit_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
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
    void sum_of_two_numbers() {

        // Arrange section
        double first = 10;
        double second = 20;
        Calculator calculator = new Calculator();

        // Act section
        double result = calculator.sum(first, second);

        // Assert section
        assertEquals(30, result);
    }
}