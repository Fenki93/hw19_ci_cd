package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathFunctionsTest {

    MathFunction mathFunction = new MathFunction();

    @Test
    void testPlus() {
        assertEquals(5, mathFunction.plus(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, mathFunction.plus(-2, 1), "-2 + 1 should equal -1");
        assertEquals(0, mathFunction.plus(0, 0), "0 + 0 should equal 0");
        assertNotEquals(0, mathFunction.plus(1, 0), "1 + 0 should equal 1");
    }

    @Test
    void testMinus() {
        assertEquals(1, mathFunction.minus(3, 2), "3 - 2 should equal 1");
        assertEquals(-3, mathFunction.minus(-2, 1), "-2 - 1 should equal -3");
        assertEquals(0, mathFunction.minus(0, 0), "0 - 0 should equal 0");
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathFunction.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-2, mathFunction.multiply(-2, 1), "-2 * 1 should equal -2");
        assertEquals(0, mathFunction.multiply(0, 3), "0 * 3 should equal 0");
    }
}