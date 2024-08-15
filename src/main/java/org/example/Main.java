package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Java is cool!");

        // two variables a and b
        int a1 = 10;
        int b2 = 5;
        int sum = a1 + b2;

        System.out.println("Sum: " +sum);

        // Step 1: Arithmetic Operations with int values
        int x = 15;
        int y = 4;

        // Arithmetic operations
        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        int division = x / y;

        // Print results for int values
        System.out.println("Arithmetic operations with int values:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        // Step 2: Relational Operators with int values
        System.out.println("\nRelational operations with int values:");
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));

        // Step 3: Arithmetic Operations with float and double values
        float a = 15.5f;
        float b = 4.2f;
        double p = 15.5;
        double q = 4.2;

        // Arithmetic operations with float
        float floatAddition = a + b;
        float floatSubtraction = a - b;
        float floatMultiplication = a * b;
        float floatDivision = a / b;

        // Print results for float values
        System.out.println("\nArithmetic operations with float values:");
        System.out.println("Addition: " + floatAddition);
        System.out.println("Subtraction: " + floatSubtraction);
        System.out.println("Multiplication: " + floatMultiplication);
        System.out.println("Division: " + floatDivision);

        // Arithmetic operations with double
        double doubleAddition = p + q;
        double doubleSubtraction = p - q;
        double doubleMultiplication = p * q;
        double doubleDivision = p / q;

        // Print results for double values
        System.out.println("\nArithmetic operations with double values:");
        System.out.println("Addition: " + doubleAddition);
        System.out.println("Subtraction: " + doubleSubtraction);
        System.out.println("Multiplication: " + doubleMultiplication);
        System.out.println("Division: " + doubleDivision);

        // Step 4: Relational Operators with float and double values
        System.out.println("\nRelational operations with float values:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        System.out.println("\nRelational operations with double values:");
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p == q: " + (p == q));
        }
    }