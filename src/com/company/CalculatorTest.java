package com.company;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void getMatcher() {

        List<String> calculatorMatcher = calculator.getMatcher("10+2*4/2-3");

        Assert.assertEquals("10",calculatorMatcher.get(0));
        Assert.assertEquals("+2",calculatorMatcher.get(1));
        Assert.assertEquals("*4",calculatorMatcher.get(2));
        Assert.assertEquals("/2",calculatorMatcher.get(3));
        Assert.assertEquals("-3",calculatorMatcher.get(4));
    }

    @Test
    public void hasOperatorTest() {
        boolean b = calculator.hasOperator("+19");
        Assert.assertEquals(true, b);

        b = calculator.hasOperator("-42");
        Assert.assertEquals(true, b);

        b = calculator.hasOperator("007");
        Assert.assertEquals(false, b);
    }

    @Test
    public void checkOperator() {
        List<String> testList = new ArrayList<>();
        testList.add("10");
        calculator.checkOperator(testList);

        Assert.assertEquals("+10", testList.get(0));
    }
}