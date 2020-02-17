package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator myCalculator;

    @BeforeEach
    void init() {
        myCalculator = new Calculator();
    }

    @Test
    @DisplayName("testAdd - Testing add method")
    void testAdd() {
        //myCalculator = new Calculator();
        assertEquals(4, myCalculator.add(2, 2));
    }

    @Test
    @DisplayName("testSubtract - Testing subtract method")
    void testSubtract() {
        //myCalculator = new Calculator();
        assertEquals(0, myCalculator.subtract(2, 2));
    }

    @Test
    @DisplayName("testMultiply - Testing multiply method")
    void testMultiply() {
        //myCalculator = new Calculator();
        assertEquals(4, myCalculator.multiply(2, 2));
    }

    @Test
    @DisplayName("testDivide - testing divide method")
    void testDivide() {
        //myCalculator = new Calculator();
        assertEquals(1, myCalculator.divide(2, 2));
    }
}
