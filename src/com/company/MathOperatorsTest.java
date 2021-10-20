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

    @Test
    public void calculate_Addition() {
       int result = MathOperators.calculate("+5", "+1");
       Assert.assertEquals(6,result);
    }

    @Test
    public void calculate_Subtraction() {
        int result = MathOperators.calculate("+10","-5");
        Assert.assertEquals(5,result);
    }

    @Test
    public void calculate_Multiplication() {
        int result = MathOperators.calculate("+10","*2");
        Assert.assertEquals(20,result);
    }

    @Test
    public void calculate_Division() {
        int result = MathOperators.calculate("+10","/2");
        Assert.assertEquals(5,result);
    }
}
