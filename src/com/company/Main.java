package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();

    }
}