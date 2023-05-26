//** B201202554 */
//** ELMAS İBRAHİMAĞA*/
//** SWE202 SOFTWARE VERIFICATION AND VALIDATION */
//*  HOMEWORK 1  */
//    */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
        "10, 2, 5",
        "10, 4, 2.5",
        "12.5, 5, 2.5",
        "10, 2.5, 4",
        "12.5, 2.5, 5"
    })
    void testDivision(double dividend, double divisor, double expected) {
        double actualResult = Calculator.divide(dividend, divisor);
        assertEquals(expected, actualResult);
    }

       @param a
       @param b
       @param expectedValue

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> Calculator.divide(12.5, 0),
            "IllegalArgumentException expected."
        );
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(2.5, Calculator.divide(12.5, 5));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5));
    }

    @Test
    void testDivision5() {
        assertEquals(5, Calculator.divide(12.5, 2.5));
    }
}
