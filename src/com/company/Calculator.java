package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private String retrieveUserInput() {
        System.out.println("Enter formula" + "\n");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void calculate() {
        String input = retrieveUserInput();
        parseInput(input);
    }

    public void seperator(List<String> terms){

        for (int i = 1; i < terms.size(); i++) {
            String value1 = terms.get(i-1); //=> "+10"
            String value2 = terms.get(i);// = "+50"

            char operator = value2.charAt(0);
            Integer intValue1 = Integer.parseInt( value1.substring(1));
            Integer intValue2 = Integer.parseInt(value2.substring(1));
        }
    }
    private void parseInput(String input) {
        List<String> terms = getMatcher(input);

        checkOperator(terms);

        // TOODÖ
        // rufe hier "checkOperator" mit den Terms auf

                        // Dann machen wir weiter
                        // Die Liste durchgehen
                        //   1. Durchlauf ß alle Mal und Geteilt yeichen berechnen
                        //   2. Durchlauf den Rest ( pölus und Minus)

                        //  Solve(leftValue, rightValue)   // 10 operator 5
                        //      Hole operator des rechten wertes
                        //      Rufe einen der OpartorßFunktionen auf


    }

    public List<String> getMatcher(String input) {
        Matcher matcher = Pattern.compile("\\d+|[-+*/]\\d+").matcher(input);

        List<String> terms = new ArrayList<>();
        while (matcher.find()) {
            terms.add(matcher.group(0));
        }
        return terms;

    }

    public void checkOperator(List<String> terms){
        if(!terms.isEmpty()){

            String firstElement = terms.get(0);

            if(!hasOperator(firstElement)){
                String newFirstElement = "+" + firstElement;
                terms.set(0, newFirstElement);
            }
        }
    }

    public boolean hasOperator(String term){
        return term.startsWith("-") || term.startsWith("+");
    }
}
