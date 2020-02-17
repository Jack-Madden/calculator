package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

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
    @DisplayName("testConstructor - Checking Constructor is initialized")
    void testConstructor() {
        assertEquals(2, myCalculator.getFirstNum());
        assertEquals(2, myCalculator.getSecondNum());
    }

    @Test
    @DisplayName("testAdd - Testing add method")
    void testAdd() {
        assertEquals(4, myCalculator.add(myCalculator.getFirstNum(), myCalculator.getSecondNum()));
    }

}
