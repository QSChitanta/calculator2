package com.company;

public class MathOperators {

    public static int calculate(String value1, String value2){
        if(value2.startsWith("*")){
            int number1 = Integer.parseInt(value1.substring(1));
            int number2 = Integer.parseInt(value2.substring(1));

            return multiplication(number1, number2);
        }
        if(value2.startsWith("/")){
            int number1 = Integer.parseInt(value1.substring(1));
            int number2 = Integer.parseInt(value2.substring(1));

            return division(number1, number2);
        }
        if(value2.startsWith("+")){
            int number1 = Integer.parseInt(value1.substring(1));
            int number2 = Integer.parseInt(value2.substring(1));

            return addition(number1, number2);
        }
        if(value2.startsWith("-")){
            int number1 = Integer.parseInt(value1.substring(1));
            int number2 = Integer.parseInt(value2.substring(1));

            return subtraction(number1, number2);
        }
        return 0;
    }

    public static int addition(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiplication(int value1, int value2) {
        return value1 * value2;
    }

    public static int division(int value1, int value2) {
        return value1 / value2;
    }
}
