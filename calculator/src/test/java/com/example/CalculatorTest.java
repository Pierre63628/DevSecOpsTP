package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-5, calculator.add(-2, -3));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(-4, calculator.subtract(-2, 2));
        assertEquals(1, calculator.subtract(-2, -3));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(6, calculator.multiply(-2, -3));
    }
    
    @Test
    public void testDivide() {
        assertEquals(0.5, calculator.divide(1, 2), 0.0001);
        assertEquals(-1.0, calculator.divide(-2, 2), 0.0001);
        assertEquals(0.6666, calculator.divide(2, 3), 0.0001);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(1, 0);
    }
}
