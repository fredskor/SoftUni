package com.company;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        double b = console.nextFloat();
        float c = console.nextFloat();

        System.out.printf("|%1$-10s|", Integer.toHexString(a));
        System.out.printf(String.format("0%1$8s|", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.printf("%10.2f|", b);
        System.out.printf("%-10.3f|", c);

    }
}
