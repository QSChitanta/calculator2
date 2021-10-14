package com.company;

import org.junit.Assert;
import org.junit.Test;


public class MathOperatorsTest {

    @Test
    public void testAddition() {
        int addition = MathOperators.addition(2, 5);
        Assert.assertEquals(7,addition);
    }

    @Test
    public void subtraction() {
        int subtraction = MathOperators.subtraction(10,5);
        Assert.assertEquals(5,subtraction);
    }

    @Test
    public void multiplication() {
        int multiplication = MathOperators.multiplication(2,4);
        Assert.assertEquals(8,multiplication);
    }

    @Test
    public void division() {
        int division = MathOperators.division(37,17);
        Assert.assertEquals(2,division);
    }
}