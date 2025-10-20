package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator(); // Create instance
        int result = calculator.add(2 , 3);        // Call the function
        assertEquals(6, result);                  // Check result
    }
}
