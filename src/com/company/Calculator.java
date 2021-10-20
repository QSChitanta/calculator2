package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public String retrieveUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter formula");
        return sc.nextLine();

    }

    public void calculate() {
        String input = retrieveUserInput();
        while (!input.equals("")) {
            String result = parseInput(input);
            System.out.println(result);
            input = retrieveUserInput();
        }
    }

    public void calculateOperators(List<String> terms) {
        calculateDotOperators(terms);
        calculateLineOperators(terms);
    }

    public void calculateDotOperators(List<String> terms) {

        for (int i = 1; i < terms.size(); i++) {
            String value1 = terms.get(i - 1);
            String value2 = terms.get(i);

            if (hasDotOperator(value2)) {
                int result = MathOperators.calculate(value1, value2);

                terms.remove(i);
                String stringResult = Integer.toString(result);
                terms.set(i - 1, stringResult);

                checkAndAddOperators(terms);
            }

        }
    }

    public void calculateLineOperators(List<String> terms) {
        for (int i = 1; i < terms.size(); i++) {
            String value1 = terms.get(i - 1);
            String value2 = terms.get(i);

            if (hasLineOperator(value2)) {
                int result = MathOperators.calculate(value1, value2);

                terms.remove(i);
                String stringResult = Integer.toString(result);
                terms.set(i - 1, stringResult);

                checkAndAddOperators(terms);
            }
        }
    }

    private String parseInput(String input) {
        List<String> terms = getMatcher(input);

        checkAndAddOperators(terms);
        calculateOperators(terms);
        return terms.get(0);
    }

    public List<String> getMatcher(String input) {
        Matcher matcher = Pattern.compile("\\d+|[-+*/]\\d+").matcher(input);

        List<String> terms = new ArrayList<>();
        while (matcher.find()) {
            terms.add(matcher.group(0));
        }
        return terms;

    }

    public void checkAndAddOperators(List<String> terms) {
        if (!terms.isEmpty()) {

            for (int i = 0; i < terms.size(); i++) {
                String termElement = terms.get(i);

                if (!hasOperator(termElement)) {
                    String newFirstElement = "+" + termElement;
                    terms.set(i, newFirstElement);
                }
            }
        }
    }

    public boolean hasOperator(String term) {
        return term.startsWith("-") || term.startsWith("+") || term.startsWith("*") || term.startsWith("/");
    }

    public boolean hasDotOperator(String value) {
        return (value.startsWith("*") || value.startsWith("/"));
    }

    public boolean hasLineOperator(String value) {
        return (value.startsWith("+") || value.startsWith("-"));
    }
}