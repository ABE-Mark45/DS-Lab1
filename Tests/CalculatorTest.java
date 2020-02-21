package calc.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calc.Classes.CalculatorApp;

class CalculatorTest {

	@Test
    public void test()
    {
        CalculatorApp myCalc = new CalculatorApp();
        
        
        assertEquals(myCalc.add(1, 2), 1 + 2);
        assertEquals(myCalc.add(-2, 10), -2 + 10);
        assertEquals(myCalc.add(0, 40), 0 + 40);
        
        assertEquals(myCalc.divide(1,  2), 1/2.0f);
        assertEquals(myCalc.divide(5,  3), 5/3.0f);
        assertEquals(myCalc.divide(-8,  2), -8/2.0f);
        
        assertThrows(RuntimeException.class, () -> {
        	myCalc.divide(2, 0);
        });
        
    }

}