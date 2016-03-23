package com.company;

import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.print(Integer.toString(number, 7));

    }
}
