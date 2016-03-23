package com.company;

import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String number = console.next();
        int decimal = Integer.valueOf(number, 7);
        System.out.println(decimal);
    }
}