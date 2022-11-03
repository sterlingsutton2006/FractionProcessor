package io.github.sterlingsutton2006;

import java.util.Scanner;

class FractionRunner {

    public static void main(String[] args) {
        int numerator;
        int denominator;
        Fraction fractionOne;
        Fraction fractionTwo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        numerator = scanner.nextInt();
        System.out.print("Enter a denominator: ");
        denominator = scanner.nextInt();

        fractionOne = new Fraction(numerator, denominator);

        System.out.print("Enter another numerator: ");
        numerator = scanner.nextInt();
        System.out.print("Enter another denominator: ");
        denominator = scanner.nextInt();

        fractionTwo = new Fraction(numerator, denominator);

        System.out.println("Fraction 1 value: " + fractionOne.getValue());
        System.out.println("Fraction 2 value: " + fractionTwo.getValue());

        System.out.println("Unsimplified fraction 1: " + fractionOne);
        System.out.println("Unsimplified fraction 2: " + fractionTwo);

        fractionOne.reduce();
        fractionTwo.reduce();

        if (fractionOne.compareTo(fractionTwo) == 0) {
            System.out.println(fractionOne + " is equivalent to " + fractionTwo);
        }
        else if (fractionOne.compareTo(fractionTwo) == 1) {
            System.out.println(fractionOne + " is bigger than " + fractionTwo);
        }
        else {
            System.out.println(fractionOne + " is smaller than " + fractionTwo);
        }


    }
}