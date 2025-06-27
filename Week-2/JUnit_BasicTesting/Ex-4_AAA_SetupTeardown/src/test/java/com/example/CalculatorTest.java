package test.java.com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    // Setup Method: Runs before each test
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup: Calculator initialized.");
    }

    // Teardown Method: Runs after each test
    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown: Calculator cleaned up.");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 5;
        int b = 7;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(12, result);
    }
}
