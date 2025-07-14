package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */


    
   /* import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    
    import static org.junit.jupiter.api.Assertions.*;
    
    public class ScientificCalculatorTest {
    
        private Calculator calc;
    
        @BeforeEach
        public void setUp() {
            calc = new Calculator(); // Initialize the calculator before each test
        }
    
        @Test
        public void testAdd() {
            calc.add(5);
            assertEquals(5.0, calc.getDisplayValue(), "Addition should work correctly.");
        }
    
        @Test
        public void testSubtract() {
            calc.add(10);
            calc.subtract(3);
            assertEquals(7.0, calc.getDisplayValue(), "Subtraction should work correctly.");
        }
    
        @Test
        public void testMultiply() {
            calc.add(5);
            calc.multiply(2);
            assertEquals(10.0, calc.getDisplayValue(), "Multiplication should work correctly.");
        }
    
        @Test
        public void testDivide() {
            calc.add(10);
            calc.divide(2);
            assertEquals(5.0, calc.getDisplayValue(), "Division should work correctly.");
        }
    
        @Test
        public void testDivideByZero() {
            calc.add(10);
            calc.divide(0);
            assertTrue(calc.hasError(), "Division by zero should trigger an error.");
        }
    
        @Test
        public void testSquare() {
            calc.add(4);
            calc.square();
            assertEquals(16.0, calc.getDisplayValue(), "Square operation should work correctly.");
        }
    
        @Test
        public void testSqrt() {
            calc.add(16);
            calc.sqrt();
            assertEquals(4.0, calc.getDisplayValue(), "Square root operation should work correctly.");
        }
    
        @Test
        public void testSqrtOfNegativeNumber() {
            calc.add(-4);
            calc.sqrt();
            assertTrue(calc.hasError(), "Square root of a negative number should trigger an error.");
        }
    
        @Test
        public void testPower() {
            calc.add(2);
            calc.power(3);
            assertEquals(8.0, calc.getDisplayValue(), "Exponentiation should work correctly.");
        }
    
        @Test
        public void testInverse() {
            calc.add(5);
            calc.inverse();
            assertEquals(0.2, calc.getDisplayValue(), "Inverse operation should work correctly.");
        }
    
        @Test
        public void testInverseOfZero() {
            calc.add(0);
            calc.inverse();
            assertTrue(calc.hasError(), "Inverse of zero should trigger an error.");
        }
    
        @Test
        public void testInvertSign() {
            calc.add(5);
            calc.invertSign();
            assertEquals(-5.0, calc.getDisplayValue(), "Sign inversion should work correctly.");
        }
    
        @Test
        public void testMemoryStore() {
            calc.add(5);
            calc.memoryStore();
            calc.memoryRecall();
            assertEquals(5.0, calc.getDisplayValue(), "Memory Store and Recall should work correctly.");
        }
    
        @Test
        public void testMemoryClear() {
            calc.add(5);
            calc.memoryStore();
            calc.memoryClear();
            calc.memoryRecall();
            assertEquals(0.0, calc.getDisplayValue(), "Memory should be cleared successfully.");
        }
    
        @Test
        public void testMemoryAdd() {
            calc.add(5);
            calc.memoryStore();
            calc.add(10);
            calc.memoryAdd();
            calc.memoryRecall();
            assertEquals(15.0, calc.getMemoryValue(), "Memory Add should add the display value to memory.");
        }
    
        @Test
        public void testMemorySubtract() {
            calc.add(5);
            calc.memoryStore();
            calc.add(10);
            calc.memorySubtract();
            calc.memoryRecall();
            assertEquals(5.0, calc.getMemoryValue(), "Memory Subtract should subtract the display value from memory.");
        }
    }
    
    
}


import com.zipcodewilmington.scientificcalculator.Calculator;
*/