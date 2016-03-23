package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double f1Part1 = ((a*a + b*b) / (a*a - b*b));
        double f1Part2 = (a + b + c)/ Math.sqrt(c);
        double f1 = Math.pow(f1Part1, f1Part2);

        double f2Part1 = (a*a + b*b - c*c*c);
        double f2Part2 = (a - b);
        double f2 = Math.pow(f2Part1, f2Part2);

        double average1 = (a + b + c) / 3;
        double average2 = (f1 + f2) / 2;

        double diff = average1 - average2;
        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", f1, f2, Math.abs(diff));


    }
}
