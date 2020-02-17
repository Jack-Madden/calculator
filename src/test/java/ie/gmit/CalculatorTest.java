package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    int firstNum = 2;
    int secondNum = 2;
    private Calculator myCalculator;

    @BeforeAll
    static void startTest() {
        System.out.println("Starting tests");
    }

    @AfterAll
    static void finishTest() {
        System.out.println("Finished tests");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + testInfo.getDisplayName());
        myCalculator = new Calculator();
        System.out.println();
    }

    @Test
    @DisplayName("testAdd - Testing add method")
    void testAdd() {
        assertEquals(4, myCalculator.add(firstNum, secondNum));
    }

    @Test
    @DisplayName("testSubtract - Testing subtract method")
    void testSubtract() {
        assertEquals(0, myCalculator.subtract(firstNum, secondNum));
    }

    @Test
    @DisplayName("testMultiply - Testing multiply method")
    void testMultiply() {
        assertEquals(4, myCalculator.multiply(firstNum, secondNum));
    }

    @Test
    @DisplayName("testDivide - testing divide method")
    void testDivide() {
        assertEquals(1, myCalculator.divide(firstNum, secondNum));
    }
}
