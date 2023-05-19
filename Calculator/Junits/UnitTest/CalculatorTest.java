package UnitTest;


import CalcPackage.Calculator;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(13, 7);
        assertEquals(20, result);
    }
    
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(6, 2);
        assertEquals(4, result);
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 2);
        assertEquals(10, result);
    }
    
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 5);
        assertEquals(2, result);
        
        try {
            calculator.divide(10, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
