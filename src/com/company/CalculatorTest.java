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
        Assert.assertTrue(b);

        b = calculator.hasOperator("-42");
        Assert.assertTrue(b);

        b = calculator.hasOperator("7");
        Assert.assertFalse(b);

        b = calculator.hasOperator("*4");
        Assert.assertTrue(b);

        b = calculator.hasOperator("/2");
        Assert.assertTrue(b);
    }

    @Test
    public void checkOperator() {
        List<String> testList = new ArrayList<>();
        testList.add("10");
        calculator.checkAndAddOperators(testList);

        Assert.assertEquals("+10", testList.get(0));
    }

    @Test
    public void calculateDotOperators() {
        List<String> testList = new ArrayList<>();
        testList.add("+10");
        testList.add("+3");
        testList.add("*5");

        calculator.calculateDotOperators(testList);

        Assert.assertEquals("+10",testList.get(0));
        Assert.assertEquals("+15",testList.get(1));


    }

    @Test
    public void calculateLineOperators() {
        List<String> testList = new ArrayList<>();
        testList.add("+10");
        testList.add("+3");
        testList.add("*5");

        calculator.calculateLineOperators(testList);

        Assert.assertEquals("+13",testList.get(0));
        Assert.assertEquals("*5",testList.get(1));


    }

    @Test
    public void calculateOperators() {
        List<String> testList = new ArrayList<>();
        testList.add("+10");
        testList.add("+3");
        testList.add("*5");

        calculator.calculateOperators(testList);

        Assert.assertEquals("+25",testList.get(0));
        Assert.assertEquals(1 ,testList.size());
    }
}